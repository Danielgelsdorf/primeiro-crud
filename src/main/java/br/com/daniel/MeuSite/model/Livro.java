package br.com.daniel.MeuSite.model;


import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@ToString
@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter private Integer id;
    @Column(name = "nome",nullable = false)
    @Getter  @Setter private String nome;
    @Column(name = "altor",nullable = false,length = 100)
    @Getter  @Setter private String altor;
    @Column(name = "anolancamento",nullable = false)
    @Getter  @Setter private Integer anoLancamento;
    @Column(name = "categoria",nullable = false,length = 30)
    @Getter @Setter private String categoria;

    public Livro(String nome, Integer anoLancamento, String altor, String categoria) {
        this.nome=nome;
        this.altor = altor;
        this.anoLancamento = anoLancamento;
        this.categoria = categoria;
    }


    public Livro(Livro l1) {
        this.id= l1.getId();
        this.nome= l1.getNome();
        this.anoLancamento=l1.getAnoLancamento();
        this.altor=l1.getAltor();
        this.categoria=l1.getCategoria();
    }
}
