package com.project.spbt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spbt.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
