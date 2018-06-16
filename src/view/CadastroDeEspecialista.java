package view;

/**
 *
 * @author misael
 */
import control.ConexaoBD;
import control.ControlEspecialista;
import model.ModelEspecialista;
import java.awt.event.*;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.ModelPaciente;

public class CadastroDeEspecialista extends javax.swing.JFrame {

    ModelEspecialista modEsp = new ModelEspecialista();
    ControlEspecialista controlEsp = new ControlEspecialista();
    ConexaoBD conectar = new ConexaoBD();

    public CadastroDeEspecialista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelNomeCad = new javax.swing.JLabel();
        jLabelSobrenomeCad = new javax.swing.JLabel();
        jLabelCPFCad = new javax.swing.JLabel();
        jLabelNascimentoCad = new javax.swing.JLabel();
        jTextFieldNomeCad = new javax.swing.JTextField();
        jTextFieldSobrenomeCad = new javax.swing.JTextField();
        jTextFieldNomeRuaCad = new javax.swing.JTextField();
        jLabelNomeRuaCad = new javax.swing.JLabel();
        jLabelNumero1 = new javax.swing.JLabel();
        jTextFieldNumeroCad = new javax.swing.JTextField();
        jLabelBairro1 = new javax.swing.JLabel();
        jTextFieldBairroCad = new javax.swing.JTextField();
        jLabelCidade1 = new javax.swing.JLabel();
        jLabelUF1 = new javax.swing.JLabel();
        jComboBoxUFCad = new javax.swing.JComboBox<>();
        jLabelTelefone1 = new javax.swing.JLabel();
        jLabelCelular1 = new javax.swing.JLabel();
        jFormattedTextFieldDataCad = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCepCad = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelCad = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCelCad = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldCpfCad = new javax.swing.JFormattedTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvarCad = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxPerfil = new javax.swing.JComboBox<>();
        jTextFieldCidadeCad = new javax.swing.JTextField();
        jPasswordFieldSenhaConf = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelSobrenome = new javax.swing.JLabel();
        jTextFieldSobrenomeBusc = new javax.swing.JTextField();
        jTextFieldNomeBusc = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();
        jLabelEndereço = new javax.swing.JLabel();
        jTextFieldEndereçoBusc = new javax.swing.JTextField();
        jFormattedTextFieldCpfBusc = new javax.swing.JFormattedTextField();
        jTextFieldNumeroBusc = new javax.swing.JTextField();
        jComboBoxUFBusc = new javax.swing.JComboBox<>();
        jLabelNumero = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelUF = new javax.swing.JLabel();
        jTextFieldBairroBusc = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jFormattedTextFieldCepBusc = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldTelBusc = new javax.swing.JFormattedTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jFormattedTextFieldCelBusc = new javax.swing.JFormattedTextField();
        jLabelCelular = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonBuscarBusc = new javax.swing.JButton();
        jButtonEditarBusc = new javax.swing.JButton();
        jButtonExcluirBusc = new javax.swing.JButton();
        jButtonSalvarBusc = new javax.swing.JButton();
        jButtonCancelarBusc = new javax.swing.JButton();
        jTextFieldUsuarioBusc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordFieldSenhaBusc = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEmailBusc = new javax.swing.JTextField();
        jComboBoxPerfilBusc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCidadeBusc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jFormattedTextFieldDataBusc = new javax.swing.JFormattedTextField();
        jLabelNascimentoCad1 = new javax.swing.JLabel();
        jPasswordFieldSenhaConf1 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomeCad.setText("Nome:");

        jLabelSobrenomeCad.setText("Sobrenome:");

        jLabelCPFCad.setText("CPF:");

        jLabelNascimentoCad.setText("Nscimento:");

        jTextFieldNomeCad.setEnabled(false);
        jTextFieldNomeCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCadActionPerformed(evt);
            }
        });

        jTextFieldSobrenomeCad.setEnabled(false);

        jTextFieldNomeRuaCad.setEnabled(false);

        jLabelNomeRuaCad.setText(" Rua:");

        jLabelNumero1.setText("Nª");

        jTextFieldNumeroCad.setEnabled(false);
        jTextFieldNumeroCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroCadActionPerformed(evt);
            }
        });

        jLabelBairro1.setText("Bairro:");

        jTextFieldBairroCad.setEnabled(false);

        jLabelCidade1.setText("Cidade:");

        jLabelUF1.setText("UF");

        jComboBoxUFCad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jComboBoxUFCad.setEnabled(false);

        jLabelTelefone1.setText("Telefone:");

        jLabelCelular1.setText("Celular:");

        try {
            jFormattedTextFieldDataCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataCad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldDataCad.setEnabled(false);

        try {
            jFormattedTextFieldCepCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCepCad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCepCad.setToolTipText("");
        jFormattedTextFieldCepCad.setEnabled(false);

        try {
            jFormattedTextFieldTelCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelCad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldTelCad.setEnabled(false);

        try {
            jFormattedTextFieldCelCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCelCad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCelCad.setEnabled(false);

        jLabel2.setText("CEP:");

        try {
            jFormattedTextFieldCpfCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpfCad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCpfCad.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvarCad.setText("Salvar");
        jButtonSalvarCad.setEnabled(false);
        jButtonSalvarCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarCadActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("Usuario:");

        jTextFieldUsuario.setEnabled(false);

        jLabel4.setText("Senha");

        jPasswordFieldSenha.setEnabled(false);

        jLabel5.setText("E-mail:");

        jTextFieldEmail.setEnabled(false);

        jLabel9.setText("Perfil:");

        jComboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador", "Usuario" }));
        jComboBoxPerfil.setEnabled(false);

        jTextFieldCidadeCad.setEnabled(false);

        jPasswordFieldSenhaConf.setEnabled(false);

        jLabel12.setText("Confirmar Senha");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelNomeCad)
                        .addGap(196, 196, 196)
                        .addComponent(jLabelSobrenomeCad)
                        .addGap(180, 180, 180)
                        .addComponent(jLabelCPFCad))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jTextFieldSobrenomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jFormattedTextFieldCpfCad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelNascimentoCad)
                        .addGap(45, 45, 45)
                        .addComponent(jLabelNomeRuaCad)
                        .addGap(228, 228, 228)
                        .addComponent(jLabelNumero1)
                        .addGap(53, 53, 53)
                        .addComponent(jLabelCidade1)
                        .addGap(82, 82, 82)
                        .addComponent(jLabelUF1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jTextFieldNomeRuaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jTextFieldNumeroCad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxUFCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelBairro1)
                        .addGap(197, 197, 197)
                        .addComponent(jLabel2)
                        .addGap(79, 79, 79)
                        .addComponent(jLabelTelefone1)
                        .addGap(86, 86, 86)
                        .addComponent(jLabelCelular1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldBairroCad, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jFormattedTextFieldCepCad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jFormattedTextFieldTelCad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jFormattedTextFieldCelCad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordFieldSenhaConf, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(99, 99, 99))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(jButtonSalvarCad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeCad)
                            .addComponent(jLabelSobrenomeCad)
                            .addComponent(jLabelCPFCad))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSobrenomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCpfCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNascimentoCad)
                            .addComponent(jLabelNomeRuaCad)
                            .addComponent(jLabelNumero1)
                            .addComponent(jLabelCidade1)
                            .addComponent(jLabelUF1))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeRuaCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldNumeroCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldCidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxUFCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBairro1)
                            .addComponent(jLabel2)
                            .addComponent(jLabelTelefone1)
                            .addComponent(jLabelCelular1))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBairroCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCepCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldTelCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCelCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldSenhaConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvarCad)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabelNome.setText("Nome:");
        jPanel3.add(jLabelNome);
        jLabelNome.setBounds(20, 50, 44, 16);

        jLabelSobrenome.setText("Sobrenome:");
        jPanel3.add(jLabelSobrenome);
        jLabelSobrenome.setBounds(280, 50, 80, 20);

        jTextFieldSobrenomeBusc.setEnabled(false);
        jPanel3.add(jTextFieldSobrenomeBusc);
        jTextFieldSobrenomeBusc.setBounds(280, 70, 240, 28);

        jTextFieldNomeBusc.setEnabled(false);
        jPanel3.add(jTextFieldNomeBusc);
        jTextFieldNomeBusc.setBounds(20, 70, 240, 28);

        jLabelCPF.setText("CPF:");
        jPanel3.add(jLabelCPF);
        jLabelCPF.setBounds(540, 50, 30, 16);

        jLabelEndereço.setText("Rua:");
        jPanel3.add(jLabelEndereço);
        jLabelEndereço.setBounds(20, 110, 28, 20);

        jTextFieldEndereçoBusc.setEnabled(false);
        jPanel3.add(jTextFieldEndereçoBusc);
        jTextFieldEndereçoBusc.setBounds(20, 130, 211, 28);

        try {
            jFormattedTextFieldCpfBusc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpfBusc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(jFormattedTextFieldCpfBusc);
        jFormattedTextFieldCpfBusc.setBounds(540, 70, 141, 28);

        jTextFieldNumeroBusc.setEnabled(false);
        jTextFieldNumeroBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroBuscActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldNumeroBusc);
        jTextFieldNumeroBusc.setBounds(240, 130, 52, 28);

        jComboBoxUFBusc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jComboBoxUFBusc.setEnabled(false);
        jPanel3.add(jComboBoxUFBusc);
        jComboBoxUFBusc.setBounds(640, 130, 59, 28);

        jLabelNumero.setText("Nª");
        jPanel3.add(jLabelNumero);
        jLabelNumero.setBounds(240, 110, 17, 16);

        jLabelCidade.setText("Cidade:");
        jPanel3.add(jLabelCidade);
        jLabelCidade.setBounds(520, 110, 48, 16);

        jLabelUF.setText("UF:");
        jPanel3.add(jLabelUF);
        jLabelUF.setBounds(640, 110, 21, 16);

        jTextFieldBairroBusc.setEnabled(false);
        jPanel3.add(jTextFieldBairroBusc);
        jTextFieldBairroBusc.setBounds(300, 130, 210, 28);

        jLabelBairro.setText("Bairro:");
        jPanel3.add(jLabelBairro);
        jLabelBairro.setBounds(300, 110, 43, 16);

        try {
            jFormattedTextFieldCepBusc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCepBusc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCepBusc.setToolTipText("");
        jFormattedTextFieldCepBusc.setEnabled(false);
        jPanel3.add(jFormattedTextFieldCepBusc);
        jFormattedTextFieldCepBusc.setBounds(150, 190, 98, 28);

        jLabel1.setText("CEP:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(150, 170, 31, 16);

        try {
            jFormattedTextFieldTelBusc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelBusc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldTelBusc.setEnabled(false);
        jPanel3.add(jFormattedTextFieldTelBusc);
        jFormattedTextFieldTelBusc.setBounds(270, 190, 143, 28);

        jLabelTelefone.setText("Telefone:");
        jPanel3.add(jLabelTelefone);
        jLabelTelefone.setBounds(270, 170, 64, 16);

        try {
            jFormattedTextFieldCelBusc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCelBusc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCelBusc.setEnabled(false);
        jPanel3.add(jFormattedTextFieldCelBusc);
        jFormattedTextFieldCelBusc.setBounds(420, 190, 143, 28);

        jLabelCelular.setText("Celular:");
        jPanel3.add(jLabelCelular);
        jLabelCelular.setBounds(420, 170, 50, 16);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(30, 390, 640, 10);

        jButtonBuscarBusc.setText("Buscar");
        jButtonBuscarBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarBuscActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonBuscarBusc);
        jButtonBuscarBusc.setBounds(190, 360, 80, 28);

        jButtonEditarBusc.setText("Editar");
        jButtonEditarBusc.setEnabled(false);
        jButtonEditarBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarBuscActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEditarBusc);
        jButtonEditarBusc.setBounds(280, 360, 80, 28);

        jButtonExcluirBusc.setText("Excluir");
        jButtonExcluirBusc.setEnabled(false);
        jButtonExcluirBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirBuscActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonExcluirBusc);
        jButtonExcluirBusc.setBounds(370, 360, 80, 28);

        jButtonSalvarBusc.setText("Salvar");
        jButtonSalvarBusc.setEnabled(false);
        jButtonSalvarBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarBuscActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSalvarBusc);
        jButtonSalvarBusc.setBounds(460, 360, 81, 28);

        jButtonCancelarBusc.setText("Cancelar");
        jPanel3.add(jButtonCancelarBusc);
        jButtonCancelarBusc.setBounds(550, 360, 80, 28);

        jTextFieldUsuarioBusc.setEnabled(false);
        jPanel3.add(jTextFieldUsuarioBusc);
        jTextFieldUsuarioBusc.setBounds(130, 250, 150, 28);

        jLabel6.setText("Usuario:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(160, 230, 53, 16);

        jLabel7.setText("Senha");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(350, 230, 47, 16);

        jPasswordFieldSenhaBusc.setEnabled(false);
        jPanel3.add(jPasswordFieldSenhaBusc);
        jPasswordFieldSenhaBusc.setBounds(300, 250, 160, 28);

        jLabel8.setText("E-mail");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(340, 280, 46, 16);

        jTextFieldEmailBusc.setEnabled(false);
        jPanel3.add(jTextFieldEmailBusc);
        jTextFieldEmailBusc.setBounds(270, 300, 210, 28);

        jComboBoxPerfilBusc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador", "Usuario" }));
        jComboBoxPerfilBusc.setEnabled(false);
        jPanel3.add(jComboBoxPerfilBusc);
        jComboBoxPerfilBusc.setBounds(570, 190, 126, 28);

        jLabel10.setText("Perfil:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(570, 170, 39, 16);

        jTextFieldCidadeBusc.setEnabled(false);
        jPanel3.add(jTextFieldCidadeBusc);
        jTextFieldCidadeBusc.setBounds(520, 130, 110, 28);

        jLabel11.setText("ID:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 6, 20, 40);

        jTextFieldID.setEnabled(false);
        jPanel3.add(jTextFieldID);
        jTextFieldID.setBounds(50, 10, 60, 28);

        try {
            jFormattedTextFieldDataBusc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataBusc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldDataBusc.setEnabled(false);
        jPanel3.add(jFormattedTextFieldDataBusc);
        jFormattedTextFieldDataBusc.setBounds(30, 190, 100, 28);

        jLabelNascimentoCad1.setText("Nscimento:");
        jPanel3.add(jLabelNascimentoCad1);
        jLabelNascimentoCad1.setBounds(30, 170, 75, 16);

        jPasswordFieldSenhaConf1.setEnabled(false);
        jPanel3.add(jPasswordFieldSenhaConf1);
        jPasswordFieldSenhaConf1.setBounds(470, 250, 160, 28);

        jLabel13.setText("Confirmar Senha");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(500, 230, 109, 16);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Buscar", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(-10, 0, 770, 490);

        setSize(new java.awt.Dimension(758, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroBuscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroBuscActionPerformed

    private void jButtonSalvarBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarBuscActionPerformed
        if (jTextFieldNomeBusc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome para continuar");
            jTextFieldNomeBusc.requestFocus();
        } else if (jTextFieldSobrenomeBusc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o sobrenome para continuar");
            jTextFieldSobrenomeBusc.requestFocus();
        } else if (jFormattedTextFieldCpfBusc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CPF para continuar");
            jFormattedTextFieldCpfBusc.requestFocus();
        } else if (jFormattedTextFieldDataBusc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a data de nascimento para continuar");
            jFormattedTextFieldDataBusc.requestFocus();
        } else if (jTextFieldEndereçoBusc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome da rua para continuar");
            jTextFieldEndereçoBusc.requestFocus();
        } else if (jTextFieldCidadeBusc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Cidade para continuar");
            jTextFieldCidadeBusc.requestFocus();
        } else if (jTextFieldNumeroBusc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o numero para continuar");
            jTextFieldNumeroBusc.requestFocus();
        } else if (jTextFieldBairroBusc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o bairro para continuar");
            jTextFieldBairroBusc.requestFocus();
        } else if (jFormattedTextFieldCepBusc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CEP para continuar");
            jFormattedTextFieldCepBusc.requestFocus();
        } else if (jComboBoxPerfilBusc.getSelectedItem() == "Selecione") {
            JOptionPane.showMessageDialog(null, "Selecione o Perfil");
            jComboBoxPerfilBusc.requestFocus();
        } else if (jTextFieldUsuarioBusc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Usuario");
            jTextFieldUsuarioBusc.requestFocus();
        } else if (jPasswordFieldSenhaBusc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Senha");
            jPasswordFieldSenhaBusc.requestFocus();
        } else if (jPasswordFieldSenhaConf1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Senha");
            jPasswordFieldSenhaConf1.requestFocus();
        } else {

            if (jPasswordFieldSenha.getText().equals(jPasswordFieldSenhaConf.getText())) {
                modEsp.setNome(jTextFieldNomeBusc.getText());
                modEsp.setSobrrenome(jTextFieldSobrenomeBusc.getText());
                modEsp.setCpf(jFormattedTextFieldCpfBusc.getText());
                modEsp.setRua(jTextFieldEndereçoBusc.getText());
                modEsp.setNascimento(jFormattedTextFieldDataBusc.getText());
                modEsp.setNumero_rua(Integer.parseInt(jTextFieldNumeroBusc.getText()));
                modEsp.setBairro(jTextFieldBairroBusc.getText());
                modEsp.setPerfil((String) jComboBoxPerfilBusc.getSelectedItem());
                modEsp.setCidade(jTextFieldCidadeBusc.getText());
                modEsp.setUf((String) jComboBoxUFBusc.getSelectedItem());
                modEsp.setCep(jFormattedTextFieldCepBusc.getText());
                modEsp.setTelefone(jFormattedTextFieldTelBusc.getText());
                modEsp.setCelular(jFormattedTextFieldCelBusc.getText());
                modEsp.setUsuario(jTextFieldUsuarioBusc.getText());
                modEsp.setSenha(jPasswordFieldSenhaBusc.getText());
                modEsp.setEmail(jTextFieldEmailBusc.getText());
                controlEsp.editar(modEsp);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Senhas Não Correspondem");
            }
    }//GEN-LAST:event_jButtonSalvarBuscActionPerformed
    }
    private void jTextFieldNomeCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCadActionPerformed

    private void jTextFieldNumeroCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroCadActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldNomeCad.setEnabled(true);
        jTextFieldSobrenomeCad.setEnabled(true);
        jTextFieldNumeroCad.setEnabled(true);
        jTextFieldNomeRuaCad.setEnabled(true);
        jTextFieldBairroCad.setEnabled(true);
        jTextFieldCidadeCad.setEnabled(true);
        jComboBoxUFCad.setEnabled(true);
        jFormattedTextFieldCelCad.setEnabled(true);
        jFormattedTextFieldCepCad.setEnabled(true);
        jFormattedTextFieldDataCad.setEnabled(true);
        jFormattedTextFieldTelCad.setEnabled(true);
        jFormattedTextFieldCpfCad.setEnabled(true);
        jTextFieldUsuario.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jComboBoxPerfil.setEnabled(true);
        jButtonSalvarCad.setEnabled(true);
        jPasswordFieldSenhaConf.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed
    private void jButtonSalvarCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarCadActionPerformed
        if (jTextFieldNomeCad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome para continuar");
            jTextFieldNomeCad.requestFocus();
        } else if (jTextFieldSobrenomeCad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o sobrenome para continuar");
            jTextFieldSobrenomeCad.requestFocus();
        } else if (jFormattedTextFieldCpfCad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CPF para continuar");
            jFormattedTextFieldCpfCad.requestFocus();
        } else if (jFormattedTextFieldDataCad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a data de nascimento para continuar");
            jFormattedTextFieldDataCad.requestFocus();
        } else if (jTextFieldNomeRuaCad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome da rua para continuar");
            jTextFieldNomeRuaCad.requestFocus();
        } else if (jTextFieldCidadeCad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Cidade para continuar");
            jTextFieldCidadeCad.requestFocus();
        } else if (jTextFieldNumeroCad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o numero para continuar");
            jTextFieldNumeroCad.requestFocus();
        } else if (jTextFieldBairroCad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o bairro para continuar");
            jTextFieldBairroCad.requestFocus();
        } else if (jFormattedTextFieldCepCad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CEP para continuar");
            jFormattedTextFieldCepCad.requestFocus();
        } else if (jComboBoxPerfil.getSelectedItem() == "Selecione") {
            JOptionPane.showMessageDialog(null, "Selecione o Perfil");
            jComboBoxPerfil.requestFocus();
        } else if (jTextFieldUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Usuario");
            jTextFieldUsuario.requestFocus();
        } else if (jPasswordFieldSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Senha");
            jPasswordFieldSenha.requestFocus();
        } else if (jPasswordFieldSenhaConf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Senha");
            jPasswordFieldSenhaConf.requestFocus();
        } else {

            if (jPasswordFieldSenha.getText().equals(jPasswordFieldSenhaConf.getText())) {

                try {
                    modEsp.setNome(jTextFieldNomeCad.getText());
                    modEsp.setSobrrenome(jTextFieldSobrenomeCad.getText());
                    modEsp.setCpf(jFormattedTextFieldCpfCad.getText());
                    modEsp.setRua(jTextFieldNomeRuaCad.getText());
                    modEsp.setNascimento(jFormattedTextFieldDataCad.getText());
                    modEsp.setNumero_rua(Integer.parseInt(jTextFieldNumeroCad.getText()));
                    modEsp.setBairro(jTextFieldBairroCad.getText());
                    modEsp.setPerfil((String) jComboBoxPerfil.getSelectedItem());
                    modEsp.setCidade(jTextFieldCidadeCad.getText());
                    modEsp.setUf((String) jComboBoxUFCad.getSelectedItem());
                    modEsp.setCep(jFormattedTextFieldCepCad.getText());
                    modEsp.setTelefone(jFormattedTextFieldTelCad.getText());
                    modEsp.setCelular(jFormattedTextFieldCelCad.getText());
                    modEsp.setUsuario(jTextFieldUsuario.getText());
                    modEsp.setSenha(jPasswordFieldSenha.getText());
                    modEsp.setEmail(jTextFieldEmail.getText());
                    controlEsp.Salvar(modEsp);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(CadastroDeEspecialista.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(CadastroDeEspecialista.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Senhas Não Correspondem");
            }
    }//GEN-LAST:event_jButtonSalvarCadActionPerformed
    }
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNomeCad.setEnabled(!true);
        jTextFieldSobrenomeCad.setEnabled(!true);
        jTextFieldNumeroCad.setEnabled(!true);
        jTextFieldNomeRuaCad.setEnabled(!true);
        jTextFieldBairroCad.setEnabled(!true);
        jTextFieldCidadeCad.setEnabled(!true);
        jComboBoxUFCad.setEnabled(!true);
        jFormattedTextFieldCelCad.setEnabled(!true);
        jFormattedTextFieldCepCad.setEnabled(!true);
        jFormattedTextFieldDataCad.setEnabled(!true);
        jFormattedTextFieldTelCad.setEnabled(!true);
        jFormattedTextFieldCpfCad.setEnabled(!true);
        jTextFieldUsuario.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jTextFieldEmail.setEnabled(!true);
        jComboBoxPerfil.setEnabled(!true);
        jButtonSalvarCad.setEnabled(!true);
        int DISPOSE_ON_CLOSE1 = JFrame.DISPOSE_ON_CLOSE;
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBuscarBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarBuscActionPerformed
        modEsp.setPesquisa(jFormattedTextFieldCpfBusc.getText());
        ModelEspecialista controlEsp = this.controlEsp.BuscarEspecialista(modEsp);

        jTextFieldNomeBusc.setText(controlEsp.getNome());
        jTextFieldSobrenomeBusc.setText(controlEsp.getSobrrenome());
        jFormattedTextFieldCpfBusc.setText(controlEsp.getCpf());
        jTextFieldEndereçoBusc.setText(controlEsp.getRua());
        jTextFieldNumeroBusc.setText(String.valueOf(controlEsp.getNumero_rua()));
        jTextFieldBairroBusc.setText(controlEsp.getBairro());
        jTextFieldCidadeBusc.setText(controlEsp.getCidade());
        jComboBoxUFBusc.setSelectedItem(controlEsp.getUf());
        jFormattedTextFieldCepBusc.setText(controlEsp.getCep());
        jFormattedTextFieldTelBusc.setText(controlEsp.getTelefone());
        jFormattedTextFieldCelBusc.setText(controlEsp.getCelular());
        jTextFieldID.setText(String.valueOf(modEsp.getId()));
        jTextFieldUsuarioBusc.setText(controlEsp.getUsuario());
        jPasswordFieldSenhaBusc.setText(controlEsp.getSenha());
        jPasswordFieldSenhaConf1.setText(controlEsp.getSenha());
        jTextFieldEmailBusc.setText(controlEsp.getEmail());
        jComboBoxPerfil.setSelectedItem(controlEsp.getPerfil());
        jFormattedTextFieldDataBusc.setText(controlEsp.getNascimento());
        jButtonEditarBusc.setEnabled(true);

        jButtonExcluirBusc.setEnabled(true);
    }//GEN-LAST:event_jButtonBuscarBuscActionPerformed

    private void jButtonEditarBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarBuscActionPerformed
        jTextFieldNomeBusc.setEnabled(true);
        jTextFieldSobrenomeBusc.setEnabled(true);
        jTextFieldNumeroBusc.setEnabled(true);
        jTextFieldEndereçoBusc.setEnabled(true);
        jTextFieldBairroBusc.setEnabled(true);
        jTextFieldCidadeBusc.setEnabled(true);
        jComboBoxUFBusc.setEnabled(true);
        jFormattedTextFieldCelBusc.setEnabled(true);
        jFormattedTextFieldCepBusc.setEnabled(true);
        jFormattedTextFieldDataBusc.setEnabled(true);
        jFormattedTextFieldTelBusc.setEnabled(true);
        jButtonSalvarBusc.setEnabled(true);
        jComboBoxPerfilBusc.setEnabled(true);
        jTextFieldUsuarioBusc.setEnabled(true);
        jPasswordFieldSenhaBusc.setEnabled(true);
        jPasswordFieldSenhaConf1.setEnabled(true);
        jTextFieldEmailBusc.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarBuscActionPerformed

    private void jButtonExcluirBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirBuscActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realizar a exclusão");
        if (resposta == JOptionPane.YES_OPTION) {
            modEsp.setId(Integer.parseInt(jTextFieldID.getText()));
            controlEsp.excluir(modEsp);
    }//GEN-LAST:event_jButtonExcluirBuscActionPerformed

        /**
         * @param args the command line arguments
         */
        //public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CadastroDeEspecialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEspecialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEspecialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEspecialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeEspecialista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarBusc;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCancelarBusc;
    private javax.swing.JButton jButtonEditarBusc;
    private javax.swing.JButton jButtonExcluirBusc;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvarBusc;
    private javax.swing.JButton jButtonSalvarCad;
    private javax.swing.JComboBox<String> jComboBoxPerfil;
    private javax.swing.JComboBox<String> jComboBoxPerfilBusc;
    private javax.swing.JComboBox<String> jComboBoxUFBusc;
    private javax.swing.JComboBox<String> jComboBoxUFCad;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelBusc;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelCad;
    private javax.swing.JFormattedTextField jFormattedTextFieldCepBusc;
    private javax.swing.JFormattedTextField jFormattedTextFieldCepCad;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfBusc;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfCad;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataBusc;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCad;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelBusc;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelCad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelBairro1;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCPFCad;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCelular1;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCidade1;
    private javax.swing.JLabel jLabelEndereço;
    private javax.swing.JLabel jLabelNascimentoCad;
    private javax.swing.JLabel jLabelNascimentoCad1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeCad;
    private javax.swing.JLabel jLabelNomeRuaCad;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelNumero1;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JLabel jLabelSobrenomeCad;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTelefone1;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JLabel jLabelUF1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JPasswordField jPasswordFieldSenhaBusc;
    private javax.swing.JPasswordField jPasswordFieldSenhaConf;
    private javax.swing.JPasswordField jPasswordFieldSenhaConf1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldBairroBusc;
    private javax.swing.JTextField jTextFieldBairroCad;
    private javax.swing.JTextField jTextFieldCidadeBusc;
    private javax.swing.JTextField jTextFieldCidadeCad;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmailBusc;
    private javax.swing.JTextField jTextFieldEndereçoBusc;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNomeBusc;
    private javax.swing.JTextField jTextFieldNomeCad;
    private javax.swing.JTextField jTextFieldNomeRuaCad;
    private javax.swing.JTextField jTextFieldNumeroBusc;
    private javax.swing.JTextField jTextFieldNumeroCad;
    private javax.swing.JTextField jTextFieldSobrenomeBusc;
    private javax.swing.JTextField jTextFieldSobrenomeCad;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jTextFieldUsuarioBusc;
    // End of variables declaration//GEN-END:variables
}
