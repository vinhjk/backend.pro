package com.codegym.demo23.service.Impl;


import com.codegym.demo23.repository.ObjectRepository;
import com.codegym.demo23.service.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ObjectServiceImpl implements ObjectService {
    @Autowired
    private ObjectRepository objectRepository;
    @Override
    public List<Object> findAll() {
        return objectRepository.findAll();
    }

    @Override
    public Optional<Object> findById(Long id) {
        return objectRepository.findById(id);
    }

    @Override
    public void save(Object object) {
        objectRepository.save(object);
    }

    @Override
    public void remove(Long id) {
        objectRepository.deleteById(id);
    }
}
