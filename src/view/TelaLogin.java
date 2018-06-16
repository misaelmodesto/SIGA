package view;

import control.ConexaoBD;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.JFormattedTextField;
import model.ModelEspecialista;

/**
 *
 * @author Misael
 */
public class TelaLogin extends javax.swing.JFrame {

    ConexaoBD conectar = new ConexaoBD();
     private StringBuilder sql;

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        ConexaoBD.Conectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEntrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelLogoLogin = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(150, 240, 73, 31);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(250, 240, 73, 31);

        jLabelUsuario.setText("Usuario");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(90, 160, 70, 17);

        jLabelSenha.setText("Senha");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(90, 200, 60, 17);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(150, 150, 170, 30);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(150, 190, 170, 30);

        jLabelLogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Tela de Login.png"))); // NOI18N
        getContentPane().add(jLabelLogoLogin);
        jLabelLogoLogin.setBounds(-30, 0, 450, 300);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundotelaLogin.png"))); // NOI18N
        jLabelFundoLogin.setToolTipText("");
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 420, 300);

        setSize(new java.awt.Dimension(429, 331));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed

        if (jTextFieldUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Usuario para continuar");
            jTextFieldUsuario.requestFocus();
        } else if (jPasswordFieldSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Senha para continuar");
            jPasswordFieldSenha.requestFocus();
        } else {

            try {
                
               //Gerando uma Hash de senha
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algorithm.digest(jPasswordFieldSenha.getText().getBytes("UTF-8"));
            
            //Salvando a Hash em uma String 
                
             StringBuilder hexString = new StringBuilder();
            for(byte b : messageDigest){
                hexString .append(String.format("%02X",0xFF & b));
             }
            String senha = hexString .toString();

                
                conectar.executaSQL("select * from especialista where usuario_Esp = '" + jTextFieldUsuario.getText() + "'");
                conectar.rs.first();
                if (conectar.rs.getString("senha_Esp").equals(senha)) {
                 //if (conectar.rs.getString("senha_Esp").equals(jPasswordFieldSenha.getText())) {
                    TelaPrincipal tela = new TelaPrincipal(jTextFieldUsuario.getText());
                    tela.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Senha ou Usuario Invalido");
                    jTextFieldUsuario.requestFocus();
                }

            } catch (SQLException ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Senha ou Usuario Invalido");
            } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_jButtonEntrarActionPerformed
    }

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelLogoLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
