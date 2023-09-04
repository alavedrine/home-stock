package net.lavedrine.homestock.service;

import net.lavedrine.homestock.domain.Category;
import net.lavedrine.homestock.dto.category.CategoryDtoMapper;
import net.lavedrine.homestock.dto.category.CategoryInDto;
import net.lavedrine.homestock.exception.CategoryNotFoundException;
import net.lavedrine.homestock.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void insert(Integer homeId, CategoryInDto categoryInDto) {
        repository.insert(homeId, CategoryDtoMapper.toCommand(categoryInDto));
    }

    @Transactional(readOnly = true)
    public Category findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> CategoryNotFoundException.categoryIdNotFoundException(id));
    }

    @Transactional(readOnly = true)
    public Set<Category> getAll(Integer homeId) {
        return repository.getAll(homeId);
    }

    @Transactional
    public void delete(Integer homeId, Integer categoryId) {
        repository.delete(homeId, categoryId);
    }
}
