package net.lavedrine.homestock.item.controller;

import net.lavedrine.homestock.item.dto.ItemDtoMapper;
import net.lavedrine.homestock.item.dto.ItemInDto;
import net.lavedrine.homestock.item.dto.ItemOutDto;
import net.lavedrine.homestock.item.service.ItemService;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static net.lavedrine.homestock.item.command.CreateItemCommand.createNewItemCommand;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @PostMapping("/{categoryId}/create")
    public void create(@PathVariable Integer categoryId,
                       @RequestBody @NonNull ItemInDto itemInDto) {
        service.create(createNewItemCommand(
                categoryId,
                itemInDto.name(),
                itemInDto.description(),
                itemInDto.quantity(),
                itemInDto.percentageQuantity(),
                itemInDto.stockLimit()));
    }

    @GetMapping("/{categoryId}")
    public List<ItemOutDto> getAllItemsForCategory(@PathVariable Integer categoryId) {
        return service
                .getAllForCategory(categoryId)
                .stream()
                .map(ItemDtoMapper::toOutDto)
                .toList();
    }

    @PostMapping("/{itemId}/adjust")
    public void adjustQuantity(@PathVariable Integer itemId, @RequestBody Integer quantity) {
        service.adjustQuantity(itemId, quantity);
    }
}
