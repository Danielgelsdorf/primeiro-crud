package br.com.daniel.MeuSite.controller;

import br.com.daniel.MeuSite.model.Livro;
import br.com.daniel.MeuSite.service.LivroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class LivroRestController {
    @Autowired
    public LivroService service;
    @GetMapping
    public ArrayList<Livro> buscarTodos(){
        return service.buscarTodos();
    }
}
