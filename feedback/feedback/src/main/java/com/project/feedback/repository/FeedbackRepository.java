package com.project.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.feedback.model.User;

@Repository
public interface FeedbackRepository extends JpaRepository<User, Long>{

}
