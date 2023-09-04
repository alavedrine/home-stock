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
    public void insert(CategoryInDto categoryInDto) {
        repository.insert(CategoryDtoMapper.toCommand(categoryInDto));
    }

    @Transactional(readOnly = true)
    public Category findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> CategoryNotFoundException.categoryIdNotFoundException(id));
    }

    @Transactional(readOnly = true)
    public Set<Category> getAll() {
        return repository.getAll();
    }

    public void delete(Integer categoryId) {
        repository.delete(categoryId);
    }
}
