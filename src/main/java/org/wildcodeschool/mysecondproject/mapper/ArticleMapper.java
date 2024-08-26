package org.wildcodeschool.mysecondproject.mapper;

import org.springframework.stereotype.Component;
import org.wildcodeschool.mysecondproject.dto.ArticleDTO;
import org.wildcodeschool.mysecondproject.dto.AuthorDTO;
import org.wildcodeschool.mysecondproject.model.Article;
import org.wildcodeschool.mysecondproject.model.Image;
import org.wildcodeschool.mysecondproject.repository.CategoryRepository;
import org.wildcodeschool.mysecondproject.repository.ImageRepository;

import java.util.stream.Collectors;

@Component
public class ArticleMapper {
    private final CategoryRepository categoryRepository;
    private final ImageRepository imageRepository;

    public ArticleMapper(CategoryRepository categoryRepository, ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
        this.categoryRepository = categoryRepository;
    }

    public ArticleDTO convertToDTO(Article article) {
        ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setId(article.getId());
        articleDTO.setTitle(article.getTitle());
        articleDTO.setContent(article.getContent());
        articleDTO.setUpdatedAt(article.getUpdatedAt());

        if(article.getCategory() != null) {
            articleDTO.setCategoryId(article.getCategory().getId());
            articleDTO.setCategoryName(article.getCategory().getName());
        }

        if (article.getImages() != null) {
            articleDTO.setImageUrls(article.getImages().stream().map(Image::getUrl).collect(Collectors.toList()));
        }

        if (article.getArticleAuthors() != null) {
            articleDTO.setAuthors(article.getArticleAuthors().stream()
                    .filter(articleAuthor -> articleAuthor.getAuthor() != null)
                    .map(articleAuthor -> {
                        AuthorDTO authorDTO = new AuthorDTO();
                        authorDTO.setId(articleAuthor.getAuthor().getId());
                        authorDTO.setFirstName(articleAuthor.getAuthor().getFirstname());
                        authorDTO.setLastName(articleAuthor.getAuthor().getLastname());
                        return authorDTO;
                    })
                    .collect(Collectors.toList()));
        }

        return articleDTO;
    }
}
