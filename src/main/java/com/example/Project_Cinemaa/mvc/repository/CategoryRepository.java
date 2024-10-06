package com.example.Project_Cinemaa.mvc.repository;

import com.example.Project_Cinemaa.mvc.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
