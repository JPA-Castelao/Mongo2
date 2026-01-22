package org.example.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "presidente")
public class Presidente {
    @Id
    private String id;
    private String nome;
    private String idade;
    private String partido;


    public Presidente() {
    }

    public Presidente(String nome, String idade, String partido) {
        this.nome = nome;
        this.idade = idade;
        this.partido = partido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
}
