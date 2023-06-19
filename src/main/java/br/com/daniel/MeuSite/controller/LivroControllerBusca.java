package br.com.daniel.MeuSite.controller;

import br.com.daniel.MeuSite.model.Livro;
import br.com.daniel.MeuSite.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/busca")
public class LivroControllerBusca {
    @Autowired
    private LivroService service;

    @GetMapping
    public String buscarTodos(Model m) {
        ArrayList<Livro>todos=service.buscarTodos();
        m.addAttribute("lista",todos);
        return "html/lista";
    }

}
