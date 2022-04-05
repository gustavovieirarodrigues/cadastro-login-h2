package br.com.lipstick.AgendaDeObjetivos.model;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private Credenciais credenciais;

    private String nome;
    private Integer idade;

    public Usuario(String nome, Integer idade){
        super();
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
}
