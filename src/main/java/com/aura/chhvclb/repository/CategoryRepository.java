package com.aura.chhvclb.repository;

import com.aura.chhvclb.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByIdAndActiveIsTrue(long id);
    Category findByCategoryNameAndActiveIsTrue(String name);
    List<Category> findByActiveTrue();
}
