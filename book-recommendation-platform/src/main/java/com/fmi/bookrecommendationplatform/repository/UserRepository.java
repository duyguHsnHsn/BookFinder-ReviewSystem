package com.fmi.bookrecommendationplatform.repository;

import com.fmi.bookrecommendationplatform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods specific to User
}
