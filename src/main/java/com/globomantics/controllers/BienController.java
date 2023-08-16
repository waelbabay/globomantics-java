package com.globomantics.controllers;

import com.globomantics.models.Bien;
import com.globomantics.repositories.BienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/biens")
public class BienController {
    @Autowired
    private BienRepository bienRepository;

    @GetMapping
    public List<Bien> Get() throws InterruptedException {
        return bienRepository.findAll();

    }
}
