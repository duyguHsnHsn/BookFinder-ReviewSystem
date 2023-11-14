package com.fmi.bookrecommendationplatform.repository;

import com.fmi.bookrecommendationplatform.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Methods for fetching reviews, filtering by user or book, etc.
}
