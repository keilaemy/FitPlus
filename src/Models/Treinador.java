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
public class Treinador {
    
       private String nomeTreinador;
       private String dataNascimentoTreinador;
       private String cpfTreinador;
       private String emailTreinador;
       private String telefoneTreinador;
       private String especialidadeTreinador;

    public Treinador(String nomeTreinador, String dataNascimentoTreinador, String cpfTreinador, String emailTreinador, String telefoneTreinador, String especialidadeTreinador) {
        this.nomeTreinador = nomeTreinador;
        this.dataNascimentoTreinador = dataNascimentoTreinador;
        this.cpfTreinador = cpfTreinador;
        this.emailTreinador = emailTreinador;
        this.telefoneTreinador = telefoneTreinador;
        this.especialidadeTreinador = especialidadeTreinador;
    }

    public Treinador() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getNomeTreinador() {
        return nomeTreinador;
    }

    public void setNomeTreinador(String nomeTreinador) {
        this.nomeTreinador = nomeTreinador;
    }

    public String getDataNascimentoTreinador() {
        return dataNascimentoTreinador;
    }

    public void setDataNascimentoTreinador(String dataNascimentoTreinador) {
        this.dataNascimentoTreinador = dataNascimentoTreinador;
    }

    public String getCpfTreinador() {
        return cpfTreinador;
    }

    public void setCpfTreinador(String cpfTreinador) {
        this.cpfTreinador = cpfTreinador;
    }

    public String getEmailTreinador() {
        return emailTreinador;
    }

    public void setEmailTreinador(String emailTreinador) {
        this.emailTreinador = emailTreinador;
    }

    public String getTelefoneTreinador() {
        return telefoneTreinador;
    }

    public void setTelefoneTreinador(String telefoneTreinador) {
        this.telefoneTreinador = telefoneTreinador;
    }

    public String getEspecialidadeTreinador() {
        return especialidadeTreinador;
    }

    public void setEspecialidadeTreinador(String especialidadeTreinador) {
        this.especialidadeTreinador = especialidadeTreinador;
    }

}
