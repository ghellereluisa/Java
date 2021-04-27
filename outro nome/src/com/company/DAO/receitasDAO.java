package com.company.DAO;

import com.company.Factory.connectionFactory;
import com.company.model.receitas;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class receitasDAO {
    private Connection con;

    public receitasDAO(){
        this.con = new connectionFactory().getConexao();
        PreparedStatement stmt = null;

    }

    public void criarTabela(){
        String sql = "create table if not exists Receita(" +
                "id int not null primary key auto_increment," +
                "origem varchar(30)," +
                "data_ varchar(15)," +
                "descricao text)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.execute();
            stmt.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void inserir(receitas receita){
        String sql = "insert into receita values(?, ?, ?)";

        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, receita.getOrigem());
            stmt.setString(2, receita.getData());
            stmt.setString(3, receita.getDescricao());

            stmt.executeUpdate();
            stmt.close();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
