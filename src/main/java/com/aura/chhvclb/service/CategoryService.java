package com.aura.chhvclb.service;

import com.aura.chhvclb.model.Category;
import com.aura.chhvclb.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category getCategoryByID(Long id) {
        return repository.findByIdAndActiveIsTrue(id);
    }

    public Category getCategoryByName(String name) {
        return repository.findByCategoryNameAndActiveIsTrue(name);
    }

    public List<Category> getActiveList() {
        return repository.findByActiveTrue();
    }

}
