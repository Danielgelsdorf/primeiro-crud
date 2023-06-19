package br.com.daniel.MeuSite.repo;

import br.com.daniel.MeuSite.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LivroRepo extends JpaRepository<Livro, Integer> {
Livro findById(int id);

}
