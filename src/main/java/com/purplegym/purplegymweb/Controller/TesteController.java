package com.purplegym.purplegymweb.Controller;

import com.purplegym.purplegymweb.Model.teste;
import com.purplegym.purplegymweb.Repository.testeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("teste")
public class controllerTeste {

    @Autowired
    private testeRepository repository;

    @GetMapping
    public List<teste> getAll(){

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<teste> getById(@PathVariable Long id) {

        return repository.findById(id);
    }

    @PostMapping
    public teste create(@RequestBody teste teste) {

        return repository.save(teste);
    }

    @PutMapping("/{id}")
    public teste update(@PathVariable Long id, @RequestBody teste teste) {

        teste.setId(id);
        return repository.save(teste);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        repository.deleteById(id);
    }

}
