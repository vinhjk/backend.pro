package com.codegym.demo23.service;


import java.util.List;
import java.util.Optional;

public interface ObjectService {
    List<Object> findAll();
    Optional<Object> findById(Long id);
    void save(Object object);
    void remove(Long id);
}
