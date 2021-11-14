/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Usuario;
import View.CadastroUser;
import View.UserCadastrados;
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emy
 */
public class UsuarioController {

    private CadastroUser view;
    private UserCadastrados tabela;

    public UsuarioController(CadastroUser view) {
        this.view = view;
    }

    public UsuarioController(UserCadastrados tabela) {
        this.tabela = tabela;
    }

    public void salvaUsuario() {

        String campo_usuario = view.getjTextFielUser().getText();
        String campo_senha = view.getjPasswordFieldSenha().getText();

        Usuario usuario = new Usuario(campo_usuario, campo_senha);

        try {

            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuariodao = new UsuarioDAO(conexao);
            usuariodao.insert(usuario);

            JOptionPane.showMessageDialog(null, "Usuário Cadastrado!");

        } catch (SQLException ex) {
            Logger.getLogger(CadastroUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    


}
