package com.petstore.domain.cadastro.model.dto;

public class CadastroResponse extends CadastroRequest {
    private Integer id;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
