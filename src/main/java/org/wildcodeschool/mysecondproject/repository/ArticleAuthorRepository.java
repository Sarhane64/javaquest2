package org.wildcodeschool.mysecondproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.mysecondproject.model.ArticleAuthor;


public interface ArticleAuthorRepository extends JpaRepository <ArticleAuthor,Long> {
}
