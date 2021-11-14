/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Emy
 */
public class Alunos {
       private String nomeAluno;
       private String dataNascimentoAluno;
       private String cpfAluno;
       private String emailAluno;
       private String telefoneAluno;
       private String planoAluno;
       private String dataInicioAluno;

    public Alunos(String nomeAluno, String dataNascimentoAluno, String cpfAluno, String emailAluno, String telefoneAluno, String planoAluno, String dataInicioAluno) {
        this.nomeAluno = nomeAluno;
        this.dataNascimentoAluno = dataNascimentoAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
        this.telefoneAluno = telefoneAluno;
        this.planoAluno = planoAluno;
        this.dataInicioAluno = dataInicioAluno;
    }

    public Alunos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getDataNascimentoAluno() {
        return dataNascimentoAluno;
    }

    public void setDataNascimentoAluno(String dataNascimentoAluno) {
        this.dataNascimentoAluno = dataNascimentoAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

    public String getPlanoAluno() {
        return planoAluno;
    }

    public void setPlanoAluno(String planoAluno) {
        this.planoAluno = planoAluno;
    }

    public String getDataInicioAluno() {
        return dataInicioAluno;
    }

    public void setDataInicioAluno(String dataInicioAluno) {
        this.dataInicioAluno = dataInicioAluno;
    }

    
       
       
}
