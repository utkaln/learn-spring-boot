package com.utkal.learn.springboot.utkallearnspringboot.repositories;

import com.utkal.learn.springboot.utkallearnspringboot.models.Speaker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long>{

}