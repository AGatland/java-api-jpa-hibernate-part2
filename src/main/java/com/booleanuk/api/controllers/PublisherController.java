package com.booleanuk.api.controllers;

import com.booleanuk.api.model.Publisher;
import com.booleanuk.api.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("publishers")
public class PublisherController {
    @Autowired
    PublisherRepository repository;

    @GetMapping
    public List<Publisher> getAll() {
        return this.repository.findAll();
    }
}