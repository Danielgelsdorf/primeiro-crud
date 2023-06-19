package br.com.daniel.MeuSite.controller;


import br.com.daniel.MeuSite.model.Livro;
import br.com.daniel.MeuSite.service.LivroService;
import org.apache.el.lang.ELArithmetic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/cadastro")
public class LivroController {
    @Autowired
    private LivroService service;
    @GetMapping("/atualiza")
    public String carregarFormsComDados(int id, Model m){
        Livro livro=service.buscarId(id);
        //System.out.println(l.getAltor());
        m.addAttribute("livro", livro);
        return "html/atualiza";
    }


    @GetMapping
    public String carregarForm()    {
        return "html/formulario";
    }
    @PostMapping
    public String cadastrarDados(Livro l) {
        service.cadastrarNovo(l);
        return "redirect:/busca";
    }
    @PutMapping
    public String atualizarLivro(Livro l){
        service.atualizarDados(l);
        return "redirect:/busca";
    }
    @DeleteMapping
    public String deletandoLivro(int id){
        service.deletarLivro(id);//
        return "redirect:/busca";
    }
}

