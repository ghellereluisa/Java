package com.company.model;


public class receitas {
    private int id;
    private String origem;
    private String data;
    private String descricao;

    public receitas(String og, String dt, String desc){
        origem = og;
        data = dt;
        descricao = desc;
    }

    public void statusReceita (){
        System.out.println(this.origem);
        System.out.println(this.data);
        System.out.println(this.descricao);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

