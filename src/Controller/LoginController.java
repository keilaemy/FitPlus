/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Usuario;
import View.Login;
import View.MenuPrincipal;
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Emy
 */
public class LoginController {

    private Login view;

    public LoginController(Login view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {

        String campo_user = view.getTextUsuario().getText();
        String campo_senha = view.getTextSenha().getText();

        Usuario usuario = new Usuario(campo_user, campo_senha);

        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuariodao = new UsuarioDAO(conexao);

        boolean autenticacao = usuariodao.existeUsuario(usuario);

        if (autenticacao) {
            MenuPrincipal telamenu = new MenuPrincipal();
            telamenu.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos");
        }

    }

}
