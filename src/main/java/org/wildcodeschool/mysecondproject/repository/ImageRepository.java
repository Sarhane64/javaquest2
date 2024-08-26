package org.wildcodeschool.mysecondproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.mysecondproject.model.Image;

public interface ImageRepository extends JpaRepository <Image, Long> {
}
