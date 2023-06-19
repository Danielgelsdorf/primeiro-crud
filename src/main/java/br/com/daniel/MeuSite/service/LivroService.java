package br.com.daniel.MeuSite.service;


import br.com.daniel.MeuSite.model.Livro;
import jakarta.servlet.AsyncListener;

import java.util.ArrayList;

public interface LivroService {
    public void cadastrarNovo(Livro l);
    public ArrayList<Livro> buscarTodos();
    public void deletarLivro(int id);
    public Livro buscarId(int id);
    public void atualizarDados(Livro l);
}

