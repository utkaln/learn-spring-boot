package com.utkal.learn.springboot.utkallearnspringboot.repositories;

import com.utkal.learn.springboot.utkallearnspringboot.models.Session;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long>{

}