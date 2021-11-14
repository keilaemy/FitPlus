/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Alunos;
import View.AlunosCadastrados;
import View.CadastroAlunos;
import dao.AlunosDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Emy
 */
public class AlunosController {
    
    private CadastroAlunos view;
    private AlunosCadastrados tabela;

    public AlunosController(AlunosCadastrados tabela) {
        this.tabela = tabela;
    }
    

    public AlunosController(CadastroAlunos view) {
        this.view = view;
    }
    
    public void salvaAluno(){
        
       String campo_nome = view.getjTextFieldNome().getText();
        String campo_dataNasc = view.getjTextFieldDataNasc().getText();
        String campo_cpf = view.getjTextFieldCPF().getText();
        String campo_email = view.getjTextFieldEmail().getText();
        String campo_telefone = view.getjTextFieldTel().getText();
        String campo_plano = view.getjComboBoxPlano().getSelectedItem().toString();
        String campo_dataInicio = view.getjTextFieldDtaInicio().getText();
        
        Alunos alunos = new Alunos(campo_nome, campo_dataNasc, campo_cpf, campo_email, campo_telefone, campo_plano, campo_dataInicio);
        
        try {
            Connection conexao = new Conexao().getConnection();
            AlunosDAO alunosdao = new AlunosDAO(conexao);
            alunosdao.insert(alunos);
            
            JOptionPane.showMessageDialog(null, "Aluno Cadastrado!");
                   
        } catch (SQLException ex) {
            Logger.getLogger(AlunosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
