package com.company;

import com.company.Factory.connectionFactory;
import com.company.model.receitas;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
	    receitas rec1 = new receitas("mercado", "2021-04-10", "frutas");
	    rec1.statusReceita();

        Connection rec2 = new connectionFactory().getConexao();
    }
}
