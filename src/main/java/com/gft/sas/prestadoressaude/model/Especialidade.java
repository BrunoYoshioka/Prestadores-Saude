package com.gft.sas.prestadoressaude.model;

import java.io.Serializable;

public class Especialidade implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private Prestador prestador;

    public Especialidade(){
    }

    public Especialidade(Integer id, String nome, Prestador prestador){
        this.id = id;
        this.nome = nome;
        this.prestador = prestador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }
}
