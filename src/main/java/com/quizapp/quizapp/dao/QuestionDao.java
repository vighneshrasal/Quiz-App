package com.quizapp.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizapp.quizapp.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{

}
