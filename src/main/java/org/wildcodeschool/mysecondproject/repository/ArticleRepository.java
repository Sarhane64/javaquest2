package org.wildcodeschool.mysecondproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.wildcodeschool.mysecondproject.model.Article;

import java.util.List;


public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findByTitle(String title);

    @Query("select a from Article a ORDER BY a.createdAt DESC")
    List<Article> findByOrder();

}
