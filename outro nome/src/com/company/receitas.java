package com.company;


public class receitas {
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
}
