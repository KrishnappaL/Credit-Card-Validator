package com.example.demo;


import org.springframework.data.repository.CrudRepository;

public interface CardDAO extends CrudRepository<Card, Integer> {

}