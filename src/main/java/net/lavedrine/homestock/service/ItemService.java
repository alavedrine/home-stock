package net.lavedrine.homestock.service;

import net.lavedrine.homestock.command.CreateItemCommand;
import net.lavedrine.homestock.domain.Item;
import net.lavedrine.homestock.repository.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void create(CreateItemCommand command) {
        repository.insert(command);
    }

    @Transactional(readOnly = true)
    public List<Item> getAllForCategory(Integer categoryId) {
        return repository.getAllForCategory(categoryId);
    }

    public void adjustQuantity(Integer itemId, Integer quantity) {
        repository.adjust(itemId, quantity);
    }
}
