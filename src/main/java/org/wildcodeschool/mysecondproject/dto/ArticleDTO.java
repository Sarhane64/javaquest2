package org.wildcodeschool.mysecondproject.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.time.LocalDateTime;
import java.util.List;

public class ArticleDTO {
    private Long id;

    @NotBlank(message = "Le titre ne doit pas être vide")
    @Size(min = 2, max = 50, message = "Le titre doit contenir entre 2 et 50 caractères")
    private String title;

    @NotBlank(message = "Le contenu ne doit pas être vide")
    @Size(min = 10, message = "Le contenu doit contenir au moins 10 caractères")
    private String content;

    private LocalDateTime updatedAt;

    @NotNull(message = "L'ID de la catégorie ne doit pas être nul")
    @Positive(message = "L'ID de la catégorie doit être un nombre positif")
    private Long categoryId;


    private String categoryName;

    @NotEmpty(message = "La liste des images ne doit pas être vide")
    private List<String> imageUrls;

    @NotEmpty(message = "La liste des auteurs ne doit pas être vide")
    private List<@Valid AuthorDTO> Authors;

    public List<AuthorDTO> getAuthors() {
        return Authors;
    }

    public void setAuthors(List<AuthorDTO> authors) {
        Authors = authors;
    }

    public List<String> getArticleAuthors() {
        return ArticleAuthors;
    }

    public void setArticleAuthors(List<String> articleAuthors) {
        ArticleAuthors = articleAuthors;
    }

    private List<String> ArticleAuthors;


    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public Long getId() {
        return id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
