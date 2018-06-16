package view;

import control.ConexaoBD;
import control.ControlPaciente;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;



    
/**
 *
 * @author Misael
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();
    CadastroDeEspecialista tela = new CadastroDeEspecialista();
    CadastroDePaciente telax = new CadastroDePaciente();
    Consulta telay = new Consulta();
    public TelaPrincipal(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.Conectar();
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jInternalFrameBem_Vindo = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabelCadastros = new javax.swing.JLabel();
        jButtonCadEspecialistas = new javax.swing.JButton();
        jButtonCadPacientes = new javax.swing.JButton();
        jLabelAgenda = new javax.swing.JLabel();
        jButtonAvaliaãoAntropometrica = new javax.swing.JButton();
        jButtonAgenda = new javax.swing.JButton();
        jLabelFundoInterno = new javax.swing.JLabel();
        jLabelGerenciamntoDe = new javax.swing.JLabel();
        jButtonFecharBem_Vindo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadEspecialistas = new javax.swing.JMenuItem();
        jMenuItemCadPacientes = new javax.swing.JMenuItem();
        jMenuItemAgenda = new javax.swing.JMenuItem();
        jMenuAvaliações = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemFerBem_Vindo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalFrameBem_Vindo.setTitle("Bem - Vindo");
        jInternalFrameBem_Vindo.setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabelCadastros.setText("Cadastros de:");
        jPanel1.add(jLabelCadastros);
        jLabelCadastros.setBounds(10, 20, 80, 14);

        jButtonCadEspecialistas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadMedicos.png"))); // NOI18N
        jButtonCadEspecialistas.setToolTipText("Especialistas");
        jButtonCadEspecialistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadEspecialistasActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadEspecialistas);
        jButtonCadEspecialistas.setBounds(10, 40, 100, 90);

        jButtonCadPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadPacientess.png"))); // NOI18N
        jButtonCadPacientes.setToolTipText("Pacientes");
        jButtonCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPacientesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadPacientes);
        jButtonCadPacientes.setBounds(120, 40, 100, 90);

        jLabelAgenda.setText("Agenda");
        jPanel1.add(jLabelAgenda);
        jLabelAgenda.setBounds(10, 140, 50, 14);

        jButtonAvaliaãoAntropometrica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exame-iloveimg-resized-iloveimg-resized.png"))); // NOI18N
        jButtonAvaliaãoAntropometrica.setText("Avaliação");
        jButtonAvaliaãoAntropometrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvaliaãoAntropometricaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAvaliaãoAntropometrica);
        jButtonAvaliaãoAntropometrica.setBounds(230, 40, 100, 90);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda.png"))); // NOI18N
        jButtonAgenda.setToolTipText("Agenda");
        jButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgenda);
        jButtonAgenda.setBounds(10, 160, 100, 90);

        jLabelFundoInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jPanel1.add(jLabelFundoInterno);
        jLabelFundoInterno.setBounds(0, 0, 670, 260);

        jLabelGerenciamntoDe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelGerenciamntoDe.setText("Gerenciamento de:");

        jButtonFecharBem_Vindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonFecharBem_Vindo.setToolTipText("Fechar Tela de Bem - Vindo");
        jButtonFecharBem_Vindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBem_VindoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameBem_VindoLayout = new javax.swing.GroupLayout(jInternalFrameBem_Vindo.getContentPane());
        jInternalFrameBem_Vindo.getContentPane().setLayout(jInternalFrameBem_VindoLayout);
        jInternalFrameBem_VindoLayout.setHorizontalGroup(
            jInternalFrameBem_VindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jInternalFrameBem_VindoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGerenciamntoDe, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 433, Short.MAX_VALUE)
                .addComponent(jButtonFecharBem_Vindo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrameBem_VindoLayout.setVerticalGroup(
            jInternalFrameBem_VindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameBem_VindoLayout.createSequentialGroup()
                .addGroup(jInternalFrameBem_VindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameBem_VindoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelGerenciamntoDe, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrameBem_VindoLayout.createSequentialGroup()
                        .addComponent(jButtonFecharBem_Vindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jInternalFrameBem_Vindo);
        jInternalFrameBem_Vindo.setBounds(10, 30, 680, 340);

        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 380, 60, 14);

        jLabelUsuario.setText("jLabel2");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(70, 380, 250, 14);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoPrincipal.png"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 700, 410);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadEspecialistas.setText("Especialistas");
        jMenuItemCadEspecialistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadEspecialistasActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadEspecialistas);

        jMenuItemCadPacientes.setText("Pacientes");
        jMenuItemCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPacientesActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadPacientes);

        jMenuItemAgenda.setText("Agenda");
        jMenuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemAgenda);

        jMenuBar1.add(jMenuCadastros);

        jMenuAvaliações.setText("Avaliações");

        jMenuItem1.setText("Avaliação Antropometrica");
        jMenuItem1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jMenuItem1ComponentRemoved(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAvaliações.add(jMenuItem1);

        jMenuItem5.setText("Avaliação Coronariano");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuAvaliações.add(jMenuItem5);

        jMenuBar1.add(jMenuAvaliações);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemFerBem_Vindo.setText("Tela Bem-Vindo");
        jMenuItemFerBem_Vindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFerBem_VindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemFerBem_Vindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenu1.setText("Relatorios");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Pacientes Cadastrados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Especialistas Cadastrados");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Avaliações");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(714, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharBem_VindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBem_VindoActionPerformed
        jInternalFrameBem_Vindo.dispose();
    }//GEN-LAST:event_jButtonFecharBem_VindoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemFerBem_VindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFerBem_VindoActionPerformed
        jInternalFrameBem_Vindo.setVisible(true);

    }//GEN-LAST:event_jMenuItemFerBem_VindoActionPerformed

    private void jMenuItemCadEspecialistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadEspecialistasActionPerformed
        try {
            conecta.executaSQL("select * from especialista where usuario_Esp = '" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("perfil_Esp").equals("Administrador")) {
                
                if(tela==null){
                    tela =  new CadastroDeEspecialista();
                    tela.setVisible(true);
                }else{
                    tela.setVisible(true);
                }
                //CadastroDeEspecialista tela = new CadastroDeEspecialista();
                //tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuario não possui permissão para acessar especialista. \n Consulte o Administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuario não possui permissão para acessar especialista. \n Consulte o Administrador do sistema" + ex);

        }

    }//GEN-LAST:event_jMenuItemCadEspecialistasActionPerformed

    private void jButtonCadEspecialistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadEspecialistasActionPerformed
        try {
            conecta.executaSQL("select * from especialista where usuario_Esp = '" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("perfil_Esp").equals("Administrador")) {
                
                if(tela==null){
                    tela =  new CadastroDeEspecialista();
                    tela.setVisible(true);
                }else{
                    tela.setVisible(true);
                }
               // CadastroDeEspecialista tela = new CadastroDeEspecialista();
                //tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuario não possui permissão para acessar especialista. \n Consulte o Administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuario não possui permissão para acessar especialista. \n Consulte o Administrador do sistema" + ex);

        }


    }//GEN-LAST:event_jButtonCadEspecialistasActionPerformed

    private void jButtonCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacientesActionPerformed
        if(telax==null){
                    telax =  new CadastroDePaciente();
                    telax.setVisible(true);
                }else{
                    telax.setVisible(true);
                }
        //CadastroDePaciente tela = new CadastroDePaciente();
        //jInternalFrameBem_Vindo.dispose();
        //tela.setVisible(true);
    }//GEN-LAST:event_jButtonCadPacientesActionPerformed

    private void jMenuItemCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPacientesActionPerformed
        if(telax==null){
                    telax =  new CadastroDePaciente();
                    telax.setVisible(true);
                }else{
                    telax.setVisible(true);
                }
        //CadastroDePaciente tela = new CadastroDePaciente();
        //jInternalFrameBem_Vindo.dispose();
        //tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadPacientesActionPerformed

    private void jButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaActionPerformed
        Consulta agenda = new Consulta();
        jInternalFrameBem_Vindo.dispose();
        agenda.setVisible(true);
    }//GEN-LAST:event_jButtonAgendaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         if(telay==null){
                    telay =  new Consulta();
                    telay.setVisible(true);
                }else{
                    telax.setVisible(true);
                }
        //Avaliacao tela = new Avaliacao();
        //jInternalFrameBem_Vindo.dispose();
       //tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonAvaliaãoAntropometricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvaliaãoAntropometricaActionPerformed
        Avaliacao tela = new Avaliacao();
        jInternalFrameBem_Vindo.dispose();
        tela.setVisible(true);

    }//GEN-LAST:event_jButtonAvaliaãoAntropometricaActionPerformed

    private void jMenuItem1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jMenuItem1ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ComponentRemoved

    private void jMenuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendaActionPerformed
        // TODO add your handling code here:
                Consulta agenda = new Consulta();
        jInternalFrameBem_Vindo.dispose();
        agenda.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgendaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
            ConexaoBD.Conectar();
      try {
            Statement stm = ConexaoBD.con.createStatement();
            String query = "SELECT cpf_Paci, nome_Paci, sobrenome_Paci, telefone_pac, celular from CadastroDePacientes";
            ResultSet rs = stm.executeQuery(query); 
            
            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            
            String JasperPrint = JasperFillManager.fillReportToFile("./relatorios/ListarPaciente.jasper", null, jrRS);
            JasperViewer viewer = new JasperViewer(JasperPrint, false, false);
            viewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            viewer.setTitle("Pacientes Cadastrados");
            viewer.toFront();
            viewer.setVisible(true);
             } catch (SQLException | JRException ex) {
                 JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatorio!\nErro:" +ex);
        }
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
           ConexaoBD.Conectar();
      try {
            Statement stm = ConexaoBD.con.createStatement();
            String query = "select cpf_Esp, nome_Esp, sobrenome_Esp, cel_Esp, email_Esp from especialista";
            ResultSet rs = stm.executeQuery(query); 
            
            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            
            String JasperPrint = JasperFillManager.fillReportToFile("./relatorios/ListarEspecialista.jasper", null, jrRS);
            JasperViewer viewer = new JasperViewer(JasperPrint, false, false);
            viewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            viewer.setTitle("Especiaalistas Cadastrados");
            viewer.toFront();
            viewer.setVisible(true);
             } catch (SQLException | JRException ex) {
                 JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatorio!\nErro:" +ex);
        }
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        ResultadoAntropometrico resultado = new ResultadoAntropometrico();
        jInternalFrameBem_Vindo.dispose();
        resultado.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        IndiceCoronariano tela = new IndiceCoronariano();
        jInternalFrameBem_Vindo.dispose();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonAvaliaãoAntropometrica;
    private javax.swing.JButton jButtonCadEspecialistas;
    private javax.swing.JButton jButtonCadPacientes;
    private javax.swing.JButton jButtonFecharBem_Vindo;
    private javax.swing.JInternalFrame jInternalFrameBem_Vindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelCadastros;
    private javax.swing.JLabel jLabelFundoInterno;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelGerenciamntoDe;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAvaliações;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemAgenda;
    private javax.swing.JMenuItem jMenuItemCadEspecialistas;
    private javax.swing.JMenuItem jMenuItemCadPacientes;
    private javax.swing.JMenuItem jMenuItemFerBem_Vindo;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
