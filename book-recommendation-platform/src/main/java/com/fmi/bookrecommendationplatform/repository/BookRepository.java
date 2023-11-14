package com.fmi.bookrecommendationplatform.repository;

import com.fmi.bookrecommendationplatform.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
    // Custom query methods can be defined here
}
