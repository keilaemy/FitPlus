/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Models.Treinador;
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
public class TreinadorDAO {
    
    private final Connection connection;
    
     public TreinadorDAO(Connection connection) {
        this.connection = connection;
    }
     
    public void insert(Treinador treinador) throws SQLException{
    
        String sql = "insert into treinador(nomeTreinador, dataNascimentoTreinador, cpfTreinador, emailTreinador, telefoneTreinador, especialidadeTreinador) values(?,?,?,?,?,?)";

        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, treinador.getNomeTreinador());
        statement.setString(2, treinador.getDataNascimentoTreinador());
        statement.setString(3, treinador.getCpfTreinador());
        statement.setString(4, treinador.getEmailTreinador());
        statement.setString(5, treinador.getTelefoneTreinador());
        statement.setString(6, treinador.getEspecialidadeTreinador());
        
        statement.execute();

        connection.close();
    }
    
    public void remover(Treinador treinador) throws SQLException{
    
    String sql = "delete from treinador where cpfTreinador=?";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, treinador.getCpfTreinador());
    statement.execute();
    }
    
    public List<Treinador> listar() {
    
        List<Treinador> treinadoresLista = new ArrayList<>();
        ResultSet resultSet = null;
        
        
        
        try {
            
            String sql = "select * from treinador";
            PreparedStatement statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                
                Treinador treinador = new Treinador();
                treinador.setNomeTreinador(resultSet.getString("nometreinador"));
                treinador.setDataNascimentoTreinador(resultSet.getString("datanascimentotreinador"));
                treinador.setCpfTreinador(resultSet.getString("cpftreinador"));
                treinador.setEmailTreinador(resultSet.getString("emailtreinador"));
                treinador.setTelefoneTreinador(resultSet.getString("telefonetreinador"));
                treinador.setEspecialidadeTreinador(resultSet.getString("especialidadetreinador"));
                
                treinadoresLista.add(treinador);
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TreinadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return treinadoresLista;
    }
    
}
