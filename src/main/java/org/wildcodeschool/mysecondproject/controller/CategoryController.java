package org.wildcodeschool.mysecondproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wildcodeschool.mysecondproject.dto.ArticleDTO;
import org.wildcodeschool.mysecondproject.dto.CategoryDTO;
import org.wildcodeschool.mysecondproject.model.Category;
import org.wildcodeschool.mysecondproject.repository.ArticleRepository;
import org.wildcodeschool.mysecondproject.repository.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    ResponseEntity<List<CategoryDTO>> getAllCategories() {
        List<Category> category = categoryRepository.findAll();
        if(category.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        List<CategoryDTO> categoryDTOs = category.stream().map(this::convertToDTO).collect(Collectors.toList());
        return ResponseEntity.ok(categoryDTOs);
    }
    @PostMapping
    ResponseEntity<CategoryDTO> createCategory(@RequestBody Category category) {
        Category savedCategory = categoryRepository.save(category);
        return ResponseEntity.status(201).body(convertToDTO(savedCategory));    }

    private CategoryDTO convertToDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setArticles(category.getArticles().stream().map(article -> {
            ArticleDTO articleDTO = new ArticleDTO();
            articleDTO.setId(article.getId());
            articleDTO.setTitle(article.getTitle());
            articleDTO.setContent(article.getContent());
            articleDTO.setUpdatedAt(article.getUpdatedAt());
            articleDTO.setCategoryName(article.getCategory().getName());
            return articleDTO;
        }).collect(Collectors.toList()));
        return categoryDTO;
    }
}
