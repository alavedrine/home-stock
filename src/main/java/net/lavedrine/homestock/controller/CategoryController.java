package net.lavedrine.homestock.controller;

import net.lavedrine.homestock.dto.category.CategoryDtoMapper;
import net.lavedrine.homestock.dto.category.CategoryInDto;
import net.lavedrine.homestock.dto.category.CategoryOutDto;
import net.lavedrine.homestock.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public void create(@RequestBody CategoryInDto categoryInDto) {
        logger.info("Creating new category {}", categoryInDto);
        service.insert(categoryInDto);
    }

    @GetMapping
    public List<CategoryOutDto> getAll() {
        return service.getAll()
                .stream()
                .map(CategoryDtoMapper::toOutDto)
                .toList();
    }

    @PostMapping("/{categoryId}/delete")
    public void delete(@PathVariable Integer categoryId) {
        service.delete(categoryId);
    }
}
