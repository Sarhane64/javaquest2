package org.wildcodeschool.mysecondproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.mysecondproject.model.Category;

public interface CategoryRepository extends JpaRepository <Category, Long> {
}
