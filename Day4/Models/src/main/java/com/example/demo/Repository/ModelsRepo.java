package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Models;

public interface ModelsRepo extends JpaRepository<Models, Integer> {

}
