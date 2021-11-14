/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Models.Alunos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emy
 */
public class AlunosDAO {

    private final Connection connection;

    public AlunosDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Alunos alunos) throws SQLException {

        String sql = "insert into alunos(nomeAluno, dataNascimentoAluno, cpfAluno, emailAluno, telefoneAluno, planoAluno, dataInicioAluno) values(?,?,?,?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, alunos.getNomeAluno());
        statement.setString(2, alunos.getDataNascimentoAluno());
        statement.setString(3, alunos.getCpfAluno());
        statement.setString(4, alunos.getEmailAluno());
        statement.setString(5, alunos.getTelefoneAluno());
        statement.setString(6, alunos.getPlanoAluno());
        statement.setString(7, alunos.getDataInicioAluno());

        statement.execute();

        connection.close();
    }
    
    public void remover(Alunos alunos) throws SQLException {
    
        String sql = "delete from alunos where cpfaluno=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, alunos.getCpfAluno());
        statement.execute();
    }

    public List<Alunos> listar() {

        List<Alunos> alunosLista = new ArrayList<>();
        ResultSet resultSet = null;

        try {

            String sql = "select * from alunos";
            PreparedStatement statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Alunos alunos = new Alunos();
                alunos.setNomeAluno(resultSet.getString("nomealuno"));
                alunos.setDataNascimentoAluno(resultSet.getString("datanascimentoaluno"));
                alunos.setCpfAluno(resultSet.getString("cpfaluno"));
                alunos.setEmailAluno(resultSet.getString("emailaluno"));
                alunos.setTelefoneAluno(resultSet.getString("telefonealuno"));
                alunos.setPlanoAluno(resultSet.getString("planoaluno"));
                alunos.setDataInicioAluno(resultSet.getString("datainicioaluno"));
                
                alunosLista.add(alunos);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alunosLista;
    }

}
