package com.gft.sas.prestadoressaude.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
public class Prestador implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    // usar set, pois set é um conjunto de strings e não aceita repetição
    @ElementCollection
    @CollectionTable(name="ESPECIALIDADE")
    private Set<String> especialidades = new HashSet<>();

    public Prestador(){
    }

    public Prestador(Integer id, String nome){
        super();
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Set<String> especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prestador prestador = (Prestador) o;
        return id.equals(prestador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
