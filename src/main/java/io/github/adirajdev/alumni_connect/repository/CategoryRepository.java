package io.github.adirajdev.alumni_connect.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.adirajdev.alumni_connect.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
    boolean existsByCategory(String category);

    Optional<Category> findByCategory(String category);
}
