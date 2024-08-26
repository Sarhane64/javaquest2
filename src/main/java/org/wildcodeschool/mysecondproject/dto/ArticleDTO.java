package org.wildcodeschool.mysecondproject.dto;

import java.time.LocalDateTime;
import java.util.List;

public class ArticleDTO {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime updatedAt;
    private Long categoryId;
    private String categoryName;
    private List<String> imageUrls;
    private List<AuthorDTO> Authors;

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
