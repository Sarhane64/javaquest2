package org.wildcodeschool.mysecondproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.mysecondproject.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
