/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Treinador;
import View.CadastroTreinadores;
import View.TreinadoresCadastrados;
import dao.Conexao;
import dao.TreinadorDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Emy
 */
public class TreinadorController {

    private CadastroTreinadores view;
    private TreinadoresCadastrados tabela;

    public TreinadorController(CadastroTreinadores view) {
        this.view = view;
    }

    public TreinadorController(TreinadoresCadastrados tabela) {
        this.tabela = tabela;
    }
    
    public void salvaTreinador() {

        String campo_nome = view.getjTextFieldNome().getText();
        String campo_dataNasc = view.getjTextFieldDataNasc().getText();
        String campo_cpf = view.getjTextFieldCPF().getText();
        String campo_email = view.getjTextFieldEmail().getText();
        String campo_telefone = view.getjTextFieldTel().getText();
        String campo_especialidade = view.getjComboBoxEspecialidade().getSelectedItem().toString();
        
        
        Treinador treinador = new Treinador(campo_nome, campo_dataNasc, campo_cpf, campo_email, campo_telefone, campo_especialidade);
        
        try {
            Connection conexao = new Conexao().getConnection();
            TreinadorDAO treinadordao = new TreinadorDAO(conexao);
            treinadordao.insert(treinador);
            
            JOptionPane.showMessageDialog(null, "Treinador Cadastrado!");
        } catch (SQLException ex) {
            Logger.getLogger(TreinadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

}
