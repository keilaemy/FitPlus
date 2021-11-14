/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Emy
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonCadAlunos = new javax.swing.JButton();
        jButtonViAlunos = new javax.swing.JButton();
        jButtonCadTreinadores = new javax.swing.JButton();
        jButtonViTreinadores = new javax.swing.JButton();
        jButtonCadUsuarios = new javax.swing.JButton();
        jButtonViUsuarios = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FIT PLUS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        jButtonCadAlunos.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCadAlunos.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jButtonCadAlunos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/avatar-yellow.png"))); // NOI18N
        jButtonCadAlunos.setText("Cadastrar Alunos");
        jButtonCadAlunos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCadAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadAlunosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 340, 90));

        jButtonViAlunos.setBackground(new java.awt.Color(102, 102, 102));
        jButtonViAlunos.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jButtonViAlunos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/folder-yellow-open-icon.png"))); // NOI18N
        jButtonViAlunos.setText("Alunos Cadastrados");
        jButtonViAlunos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonViAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViAlunosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonViAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 340, 90));

        jButtonCadTreinadores.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCadTreinadores.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jButtonCadTreinadores.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadTreinadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/avatar-blue.png"))); // NOI18N
        jButtonCadTreinadores.setText("Cadastrar Treinadores");
        jButtonCadTreinadores.setAlignmentY(0.0F);
        jButtonCadTreinadores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCadTreinadores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonCadTreinadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadTreinadoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadTreinadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 340, 90));

        jButtonViTreinadores.setBackground(new java.awt.Color(102, 102, 102));
        jButtonViTreinadores.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jButtonViTreinadores.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViTreinadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/folder-blue-open-icon.png"))); // NOI18N
        jButtonViTreinadores.setText("Treinadores Cadastrados");
        jButtonViTreinadores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonViTreinadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViTreinadoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonViTreinadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 340, 90));

        jButtonCadUsuarios.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCadUsuarios.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jButtonCadUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/avatar-red.png"))); // NOI18N
        jButtonCadUsuarios.setText("Cadastrar Usuários");
        jButtonCadUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCadUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 340, 90));

        jButtonViUsuarios.setBackground(new java.awt.Color(102, 102, 102));
        jButtonViUsuarios.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jButtonViUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/folder-red-open-icon.png"))); // NOI18N
        jButtonViUsuarios.setText("Usuários Cadastrados");
        jButtonViUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonViUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonViUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 340, 90));

        jButtonSair.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 600, -1, -1));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/telaPrincipal1.PNG"))); // NOI18N
        jLabelFundo.setAlignmentY(0.0F);
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1122, 638));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonViAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViAlunosActionPerformed
        // TODO add your handling code here:
        AlunosCadastrados telaAlunosCad = new AlunosCadastrados();
        telaAlunosCad.setVisible(true);
    }//GEN-LAST:event_jButtonViAlunosActionPerformed

    private void jButtonCadTreinadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadTreinadoresActionPerformed
        // TODO add your handling code here:
        CadastroTreinadores telaCadTreinadores = new CadastroTreinadores();
        telaCadTreinadores.setVisible(true);
    }//GEN-LAST:event_jButtonCadTreinadoresActionPerformed

    private void jButtonCadAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadAlunosActionPerformed
        // TODO add your handling code here:
        CadastroAlunos telaCadAluno = new CadastroAlunos();
        telaCadAluno.setVisible(true);
    }//GEN-LAST:event_jButtonCadAlunosActionPerformed

    private void jButtonViTreinadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViTreinadoresActionPerformed
        // TODO add your handling code here:
        TreinadoresCadastrados telaTreinadoresCad = new TreinadoresCadastrados();
        telaTreinadoresCad.setVisible(true);
    }//GEN-LAST:event_jButtonViTreinadoresActionPerformed

    private void jButtonViUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViUsuariosActionPerformed
        // TODO add your handling code here:
        UserCadastrados telaUserCad = new UserCadastrados();
        telaUserCad.setVisible(true);
    }//GEN-LAST:event_jButtonViUsuariosActionPerformed

    private void jButtonCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadUsuariosActionPerformed
        // TODO add your handling code here:
        CadastroUser telaCadUser = new CadastroUser();
        telaCadUser.setVisible(true);
    }//GEN-LAST:event_jButtonCadUsuariosActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadAlunos;
    private javax.swing.JButton jButtonCadTreinadores;
    private javax.swing.JButton jButtonCadUsuarios;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonViAlunos;
    private javax.swing.JButton jButtonViTreinadores;
    private javax.swing.JButton jButtonViUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundo;
    // End of variables declaration//GEN-END:variables
}