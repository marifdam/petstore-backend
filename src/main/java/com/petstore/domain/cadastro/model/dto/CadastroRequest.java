package com.petstore.domain.cadastro.model.dto;

import com.petstore.domain.cadastro.model.Endereco;
import com.petstore.domain.cadastro.model.Perfil;

public class CadastroRequest {
    private Integer id;
    private String nome;
    private Perfil perfil;
    private Endereco endereco;

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

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
