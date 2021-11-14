/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Models.Usuario;
import View.CadastroUser;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emy
 */
public class UsuarioDAO {

    public final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Usuario usuario) throws SQLException {

        String sql = "insert into usuario(usuario,senha) values(?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());

        statement.execute();

    }
    
    public void remover(Usuario usuario) throws SQLException{
    
        String sql = "delete from usuario where usuario=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getUsuario());
        statement.execute();
    }
    

    public boolean existeUsuario(Usuario usuario) throws SQLException {

        String sql = "select * from usuario where usuario = ? and senha = ? ";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());

        statement.execute();

        ResultSet resultSet = statement.getResultSet();

        return resultSet.next();
    }
    
    public List<Usuario> listar() {

        List<Usuario> usuarios = new ArrayList<>();
        ResultSet resultSet = null;

        try {

            String sql = "select usuario from usuario";
            PreparedStatement statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setUsuario(resultSet.getString("usuario"));
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }
    
    

}
