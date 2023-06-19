package br.com.daniel.MeuSite.service;


import br.com.daniel.MeuSite.model.Livro;
import br.com.daniel.MeuSite.repo.LivroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Objects;

@Component
public class LivroServiceImple implements LivroService{
    @Autowired
    private LivroRepo repo;
    @Override
    public void cadastrarNovo(Livro l) {
    repo.save(l);
    }

    @Override
    public ArrayList<Livro> buscarTodos() {
        return (ArrayList<Livro>) repo.findAll();
    }

    @Override
    public void deletarLivro( int id) {
        repo.deleteById(id);
    }

    @Override
    public Livro buscarId(int id) {
        return (Livro) repo.findById(id);
    }

    @Override
    public void atualizarDados(Livro l) {
        Livro l2=new Livro(l);
        repo.save(l2);
    }
}
