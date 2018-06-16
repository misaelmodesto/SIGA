package view;

/**
 *
 * @author misael
 */
import control.ConexaoBD;
import control.ControlPaciente;
import model.ModelPaciente;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static org.eclipse.persistence.expressions.ExpressionMath.mod;

public class CadastroDePaciente extends javax.swing.JFrame {

    ModelPaciente modPac = new ModelPaciente();
    ControlPaciente controlpac = new ControlPaciente();
    ConexaoBD conectar = new ConexaoBD();

    
    BufferedImage imagem;
    File arquivo;
    String caminho;
    public CadastroDePaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanePac = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanelCadPacientes = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelSobrenome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelNascimento = new javax.swing.JLabel();
        jTextFieldNomePac = new javax.swing.JTextField();
        jTextFieldSobrenomePac = new javax.swing.JTextField();
        jTextFieldNomeRuaPac = new javax.swing.JTextField();
        jLabelNomeRua = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumeroPac = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairroPac = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jLabelUF = new javax.swing.JLabel();
        jComboBoxUFPac = new javax.swing.JComboBox<>();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jFormattedTextFieldDataPac = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCepPac = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelPac = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCelPac = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldCpfPac = new javax.swing.JFormattedTextField();
        jButtonCancelarPac = new javax.swing.JButton();
        jButtonSalvarPac = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabel_img = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanelCadPacientes1 = new javax.swing.JPanel();
        jLabelNome1 = new javax.swing.JLabel();
        jLabelSobrenome1 = new javax.swing.JLabel();
        jLabelCPF1 = new javax.swing.JLabel();
        jLabelNascimento1 = new javax.swing.JLabel();
        jTextFieldNomeBusc = new javax.swing.JTextField();
        jTextFieldSobrenomeBusc = new javax.swing.JTextField();
        jTextFieldNomeRuaBusc = new javax.swing.JTextField();
        jLabelNomeRua1 = new javax.swing.JLabel();
        jLabelNumero1 = new javax.swing.JLabel();
        jTextFieldNumeroBusc = new javax.swing.JTextField();
        jLabelBairro1 = new javax.swing.JLabel();
        jTextFieldBairroBusc = new javax.swing.JTextField();
        jLabelCidade1 = new javax.swing.JLabel();
        jLabelUF1 = new javax.swing.JLabel();
        jComboBoxUFBusc = new javax.swing.JComboBox<>();
        jLabelTelefone1 = new javax.swing.JLabel();
        jLabelCelular1 = new javax.swing.JLabel();
        jFormattedTextFieldDataBusc = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCepBusc = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelBusc = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCelBusc = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldCpfBusc = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jButtonSalvarBusc = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEditarBusc = new javax.swing.JButton();
        jButtonExcluirBusc = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldCidadeBusc = new javax.swing.JTextField();
        jLabel_imgBusca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelCadPacientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCadPacientes.setLayout(null);

        jLabelNome.setText("Nome:");
        jPanelCadPacientes.add(jLabelNome);
        jLabelNome.setBounds(230, 20, 31, 14);

        jLabelSobrenome.setText("Sobrenome:");
        jPanelCadPacientes.add(jLabelSobrenome);
        jLabelSobrenome.setBounds(450, 20, 58, 14);

        jLabelCPF.setText("CPF:");
        jPanelCadPacientes.add(jLabelCPF);
        jLabelCPF.setBounds(230, 80, 23, 14);

        jLabelNascimento.setText("Nascimento:");
        jPanelCadPacientes.add(jLabelNascimento);
        jLabelNascimento.setBounds(380, 80, 90, 14);

        jTextFieldNomePac.setEnabled(false);
        jTextFieldNomePac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePacActionPerformed(evt);
            }
        });
        jPanelCadPacientes.add(jTextFieldNomePac);
        jTextFieldNomePac.setBounds(230, 40, 208, 20);

        jTextFieldSobrenomePac.setEnabled(false);
        jPanelCadPacientes.add(jTextFieldSobrenomePac);
        jTextFieldSobrenomePac.setBounds(450, 40, 230, 20);

        jTextFieldNomeRuaPac.setEnabled(false);
        jPanelCadPacientes.add(jTextFieldNomeRuaPac);
        jTextFieldNomeRuaPac.setBounds(490, 100, 190, 20);

        jLabelNomeRua.setText(" Rua:");
        jPanelCadPacientes.add(jLabelNomeRua);
        jLabelNomeRua.setBounds(490, 80, 26, 14);

        jLabelNumero.setText("Nª");
        jPanelCadPacientes.add(jLabelNumero);
        jLabelNumero.setBounds(230, 140, 12, 14);

        jTextFieldNumeroPac.setEnabled(false);
        jTextFieldNumeroPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroPacActionPerformed(evt);
            }
        });
        jPanelCadPacientes.add(jTextFieldNumeroPac);
        jTextFieldNumeroPac.setBounds(230, 160, 52, 20);

        jLabelBairro.setText("Bairro:");
        jPanelCadPacientes.add(jLabelBairro);
        jLabelBairro.setBounds(500, 140, 32, 14);

        jTextFieldBairroPac.setEnabled(false);
        jPanelCadPacientes.add(jTextFieldBairroPac);
        jTextFieldBairroPac.setBounds(500, 160, 180, 20);

        jLabelCidade.setText("Cidade:");
        jPanelCadPacientes.add(jLabelCidade);
        jLabelCidade.setBounds(290, 140, 37, 14);

        jLabelUF.setText("UF:");
        jPanelCadPacientes.add(jLabelUF);
        jLabelUF.setBounds(430, 140, 40, 14);

        jComboBoxUFPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jComboBoxUFPac.setEnabled(false);
        jPanelCadPacientes.add(jComboBoxUFPac);
        jComboBoxUFPac.setBounds(430, 160, 40, 20);

        jLabelTelefone.setText("Telefone:");
        jPanelCadPacientes.add(jLabelTelefone);
        jLabelTelefone.setBounds(340, 200, 46, 14);

        jLabelCelular.setText("Celular:");
        jPanelCadPacientes.add(jLabelCelular);
        jLabelCelular.setBounds(500, 200, 37, 14);

        try {
            jFormattedTextFieldDataPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldDataPac.setEnabled(false);
        jPanelCadPacientes.add(jFormattedTextFieldDataPac);
        jFormattedTextFieldDataPac.setBounds(380, 100, 96, 20);

        try {
            jFormattedTextFieldCepPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCepPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCepPac.setToolTipText("");
        jFormattedTextFieldCepPac.setEnabled(false);
        jPanelCadPacientes.add(jFormattedTextFieldCepPac);
        jFormattedTextFieldCepPac.setBounds(230, 220, 98, 20);

        try {
            jFormattedTextFieldTelPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldTelPac.setEnabled(false);
        jPanelCadPacientes.add(jFormattedTextFieldTelPac);
        jFormattedTextFieldTelPac.setBounds(340, 220, 143, 20);

        try {
            jFormattedTextFieldCelPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCelPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCelPac.setEnabled(false);
        jPanelCadPacientes.add(jFormattedTextFieldCelPac);
        jFormattedTextFieldCelPac.setBounds(490, 220, 143, 20);
        jPanelCadPacientes.add(jSeparator1);
        jSeparator1.setBounds(30, 270, 640, 10);

        jLabel1.setText("CEP:");
        jPanelCadPacientes.add(jLabel1);
        jLabel1.setBounds(230, 200, 23, 14);

        try {
            jFormattedTextFieldCpfPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpfPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCpfPac.setEnabled(false);
        jPanelCadPacientes.add(jFormattedTextFieldCpfPac);
        jFormattedTextFieldCpfPac.setBounds(230, 100, 141, 20);

        jButtonCancelarPac.setText("Cancelar");
        jButtonCancelarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarPacActionPerformed(evt);
            }
        });
        jPanelCadPacientes.add(jButtonCancelarPac);
        jButtonCancelarPac.setBounds(590, 290, 90, 23);

        jButtonSalvarPac.setText("Salvar");
        jButtonSalvarPac.setEnabled(false);
        jButtonSalvarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarPacActionPerformed(evt);
            }
        });
        jPanelCadPacientes.add(jButtonSalvarPac);
        jButtonSalvarPac.setBounds(500, 290, 81, 23);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelCadPacientes.add(jButtonNovo);
        jButtonNovo.setBounds(410, 290, 81, 23);

        jTextFieldCidade.setEnabled(false);
        jPanelCadPacientes.add(jTextFieldCidade);
        jTextFieldCidade.setBounds(290, 160, 130, 20);
        jPanelCadPacientes.add(jLabel_img);
        jLabel_img.setBounds(20, 30, 180, 170);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelCadPacientes.add(jButton1);
        jButton1.setBounds(20, 210, 70, 23);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPanePac.addTab("Cadastrar", jPanel2);

        jPanelCadPacientes1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCadPacientes1.setLayout(null);

        jLabelNome1.setText("Nome:");
        jPanelCadPacientes1.add(jLabelNome1);
        jLabelNome1.setBounds(230, 30, 31, 14);

        jLabelSobrenome1.setText("Sobrenome:");
        jPanelCadPacientes1.add(jLabelSobrenome1);
        jLabelSobrenome1.setBounds(460, 30, 58, 14);

        jLabelCPF1.setText("CPF:");
        jPanelCadPacientes1.add(jLabelCPF1);
        jLabelCPF1.setBounds(230, 90, 23, 14);

        jLabelNascimento1.setText("Nscimento:");
        jPanelCadPacientes1.add(jLabelNascimento1);
        jLabelNascimento1.setBounds(390, 90, 53, 20);

        jTextFieldNomeBusc.setEnabled(false);
        jTextFieldNomeBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeBuscActionPerformed(evt);
            }
        });
        jPanelCadPacientes1.add(jTextFieldNomeBusc);
        jTextFieldNomeBusc.setBounds(230, 50, 208, 20);

        jTextFieldSobrenomeBusc.setEnabled(false);
        jPanelCadPacientes1.add(jTextFieldSobrenomeBusc);
        jTextFieldSobrenomeBusc.setBounds(460, 50, 210, 20);

        jTextFieldNomeRuaBusc.setEnabled(false);
        jPanelCadPacientes1.add(jTextFieldNomeRuaBusc);
        jTextFieldNomeRuaBusc.setBounds(500, 110, 170, 20);

        jLabelNomeRua1.setText(" Rua:");
        jPanelCadPacientes1.add(jLabelNomeRua1);
        jLabelNomeRua1.setBounds(500, 90, 26, 14);

        jLabelNumero1.setText("Nª");
        jPanelCadPacientes1.add(jLabelNumero1);
        jLabelNumero1.setBounds(230, 150, 12, 14);

        jTextFieldNumeroBusc.setEnabled(false);
        jTextFieldNumeroBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroBuscActionPerformed(evt);
            }
        });
        jPanelCadPacientes1.add(jTextFieldNumeroBusc);
        jTextFieldNumeroBusc.setBounds(230, 170, 52, 20);

        jLabelBairro1.setText("Bairro:");
        jPanelCadPacientes1.add(jLabelBairro1);
        jLabelBairro1.setBounds(500, 150, 50, 14);

        jTextFieldBairroBusc.setEnabled(false);
        jTextFieldBairroBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroBuscActionPerformed(evt);
            }
        });
        jPanelCadPacientes1.add(jTextFieldBairroBusc);
        jTextFieldBairroBusc.setBounds(500, 170, 170, 20);

        jLabelCidade1.setText("Cidade:");
        jPanelCadPacientes1.add(jLabelCidade1);
        jLabelCidade1.setBounds(290, 150, 37, 14);

        jLabelUF1.setText("UF");
        jPanelCadPacientes1.add(jLabelUF1);
        jLabelUF1.setBounds(430, 150, 13, 14);

        jComboBoxUFBusc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BA" }));
        jComboBoxUFBusc.setEnabled(false);
        jComboBoxUFBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUFBuscActionPerformed(evt);
            }
        });
        jPanelCadPacientes1.add(jComboBoxUFBusc);
        jComboBoxUFBusc.setBounds(430, 170, 38, 20);

        jLabelTelefone1.setText("Telefone:");
        jPanelCadPacientes1.add(jLabelTelefone1);
        jLabelTelefone1.setBounds(340, 210, 46, 14);

        jLabelCelular1.setText("Celular:");
        jPanelCadPacientes1.add(jLabelCelular1);
        jLabelCelular1.setBounds(500, 210, 37, 14);

        try {
            jFormattedTextFieldDataBusc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataBusc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldDataBusc.setEnabled(false);
        jPanelCadPacientes1.add(jFormattedTextFieldDataBusc);
        jFormattedTextFieldDataBusc.setBounds(390, 110, 96, 20);

        try {
            jFormattedTextFieldCepBusc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCepBusc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCepBusc.setToolTipText("");
        jFormattedTextFieldCepBusc.setEnabled(false);
        jPanelCadPacientes1.add(jFormattedTextFieldCepBusc);
        jFormattedTextFieldCepBusc.setBounds(230, 230, 98, 20);

        try {
            jFormattedTextFieldTelBusc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelBusc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldTelBusc.setEnabled(false);
        jPanelCadPacientes1.add(jFormattedTextFieldTelBusc);
        jFormattedTextFieldTelBusc.setBounds(340, 230, 143, 20);

        try {
            jFormattedTextFieldCelBusc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCelBusc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCelBusc.setEnabled(false);
        jPanelCadPacientes1.add(jFormattedTextFieldCelBusc);
        jFormattedTextFieldCelBusc.setBounds(500, 230, 150, 20);

        jLabel2.setText("CEP:");
        jPanelCadPacientes1.add(jLabel2);
        jLabel2.setBounds(230, 210, 23, 20);

        try {
            jFormattedTextFieldCpfBusc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpfBusc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelCadPacientes1.add(jFormattedTextFieldCpfBusc);
        jFormattedTextFieldCpfBusc.setBounds(230, 110, 141, 20);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelCadPacientes1.add(jButton2);
        jButton2.setBounds(580, 300, 90, 23);

        jButtonSalvarBusc.setText("Salvar");
        jButtonSalvarBusc.setEnabled(false);
        jButtonSalvarBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarBuscActionPerformed(evt);
            }
        });
        jPanelCadPacientes1.add(jButtonSalvarBusc);
        jButtonSalvarBusc.setBounds(490, 300, 81, 23);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanelCadPacientes1.add(jButtonBuscar);
        jButtonBuscar.setBounds(220, 300, 80, 23);

        jButtonEditarBusc.setText("Editar");
        jButtonEditarBusc.setEnabled(false);
        jButtonEditarBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarBuscActionPerformed(evt);
            }
        });
        jPanelCadPacientes1.add(jButtonEditarBusc);
        jButtonEditarBusc.setBounds(310, 300, 80, 23);

        jButtonExcluirBusc.setText("Excluir");
        jButtonExcluirBusc.setEnabled(false);
        jButtonExcluirBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirBuscActionPerformed(evt);
            }
        });
        jPanelCadPacientes1.add(jButtonExcluirBusc);
        jButtonExcluirBusc.setBounds(400, 300, 80, 23);
        jPanelCadPacientes1.add(jSeparator3);
        jSeparator3.setBounds(30, 270, 640, 10);

        jLabel3.setText("ID:");
        jPanelCadPacientes1.add(jLabel3);
        jLabel3.setBounds(20, 210, 15, 30);

        jTextFieldID.setEnabled(false);
        jPanelCadPacientes1.add(jTextFieldID);
        jTextFieldID.setBounds(50, 210, 50, 20);

        jTextFieldCidadeBusc.setEnabled(false);
        jPanelCadPacientes1.add(jTextFieldCidadeBusc);
        jTextFieldCidadeBusc.setBounds(290, 170, 130, 20);
        jPanelCadPacientes1.add(jLabel_imgBusca);
        jLabel_imgBusca.setBounds(20, 30, 180, 170);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadPacientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadPacientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPanePac.addTab("Buscar", jPanel3);

        getContentPane().add(jTabbedPanePac);
        jTabbedPanePac.setBounds(0, 0, 730, 450);

        setSize(new java.awt.Dimension(738, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeBuscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeBuscActionPerformed

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
        } else if (jTextFieldNomeRuaBusc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome da rua para continuar");
            jTextFieldNomeRuaBusc.requestFocus();
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
        } else {

            /* 
        modPac.setId(Integer.parseInt(jTextFieldID.getText()));
        modPac.setCpf(jFormattedTextFieldCpfBusc.getText());
        
        modPac.setNome(jTextFieldNomeBusc.getText());
        modPac.setSobrrenome(jTextFieldSobrenomeBusc.getText());

        modPac.setNascimento(jFormattedTextFieldDataBusc.getText());
        modPac.setRua(jTextFieldNomeRuaBusc.getText());
        modPac.setNumero_rua(Integer.parseInt(jTextFieldNumeroBusc.getText()));
        modPac.setBairro(jTextFieldBairroBusc.getText());
        modPac.setCidade(jTextFieldCidadeBusc.getText());
        modPac.setUf((String) jComboBoxUFBusc.getSelectedItem());
        modPac.setCep(jFormattedTextFieldCepBusc.getText());
        modPac.setTelefone(jFormattedTextFieldTelBusc.getText());
        modPac.setCelular(jFormattedTextFieldCelBusc.getText());
        try {
            controlpac.editar(modPac);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDePaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSalvarBuscActionPerformed
    
        }*/
            modPac.setId(Integer.parseInt(jTextFieldID.getText())); // esse deve ser primeiro no botão salvar edição 
            modPac.setCpf(jFormattedTextFieldCpfBusc.getText());
            modPac.setNome(jTextFieldNomeBusc.getText());
            modPac.setSobrrenome(jTextFieldSobrenomeBusc.getText());
            modPac.setNascimento(jFormattedTextFieldDataBusc.getText());
            modPac.setRua(jTextFieldNomeRuaBusc.getText());
            modPac.setNumero_rua(Integer.parseInt(jTextFieldNumeroBusc.getText()));
            modPac.setBairro(jTextFieldBairroBusc.getText());
            modPac.setCidade(jTextFieldCidadeBusc.getText());
            modPac.setUf((String) jComboBoxUFBusc.getSelectedItem());
            modPac.setCep(jFormattedTextFieldCepBusc.getText());
            modPac.setTelefone(jFormattedTextFieldTelBusc.getText());
            modPac.setCelular(jFormattedTextFieldCelBusc.getText());
            try {
                controlpac.editar(modPac);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroDePaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void jButtonEditarBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarBuscActionPerformed

        jTextFieldNomeBusc.setEnabled(true);
        jTextFieldSobrenomeBusc.setEnabled(true);
        jTextFieldNumeroBusc.setEnabled(true);
        jTextFieldNomeRuaBusc.setEnabled(true);
        jTextFieldBairroBusc.setEnabled(true);
        jTextFieldCidadeBusc.setEnabled(true);
        jComboBoxUFBusc.setEnabled(true);
        jFormattedTextFieldCelBusc.setEnabled(true);
        jFormattedTextFieldCepBusc.setEnabled(true);
        jFormattedTextFieldDataBusc.setEnabled(true);
        jFormattedTextFieldTelBusc.setEnabled(true);
        jButtonSalvarBusc.setEnabled(true);


    }//GEN-LAST:event_jButtonEditarBuscActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        modPac.setPesquisa(jFormattedTextFieldCpfBusc.getText());
        ModelPaciente controlPac = controlpac.BuscarPaciente(modPac);

        jTextFieldNomeBusc.setText(controlPac.getNome());
        jTextFieldSobrenomeBusc.setText(controlPac.getSobrrenome());
        jFormattedTextFieldCpfBusc.setText(controlPac.getCpf());
        jFormattedTextFieldDataBusc.setText(controlPac.getNascimento());
        jTextFieldNomeRuaBusc.setText(controlPac.getRua());
        jTextFieldNumeroBusc.setText(String.valueOf(controlPac.getNumero_rua()));
        jTextFieldBairroBusc.setText(controlPac.getBairro());
        jTextFieldCidadeBusc.setText(controlPac.getCidade());
        jComboBoxUFBusc.setSelectedItem(controlPac.getUf());
        jFormattedTextFieldCepBusc.setText(controlPac.getCep());
        jFormattedTextFieldTelBusc.setText(controlPac.getTelefone());
        jFormattedTextFieldCelBusc.setText(controlPac.getCelular());
        jTextFieldID.setText(String.valueOf(modPac.getId()));
        
        
        if (controlPac.getImagem() != null) {
            try {
                imagem = controlpac.setImagemDimensao(controlPac.getImagem(), jLabel_img.getWidth(), jLabel_img.getHeight());
            } catch (IOException ex) {
                Logger.getLogger(CadastroDePaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
                    jLabel_imgBusca.setIcon(new ImageIcon(imagem));
                } else {
                    jLabel_imgBusca.setIcon(null);
                }
        jButtonEditarBusc.setEnabled(true);

        jButtonExcluirBusc.setEnabled(true);


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonExcluirBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirBuscActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realizar a exclusão");
        if (resposta == JOptionPane.YES_OPTION) {
            modPac.setId(Integer.parseInt(jTextFieldID.getText()));
            controlpac.excluir(modPac);

            //Limpando Campo Apos Excluir
            jTextFieldID.setText("");
            jTextFieldNomeBusc.setText("");
            jTextFieldSobrenomeBusc.setText("");
            jTextFieldNumeroBusc.setText("");
            jTextFieldNomeRuaBusc.setText("");
            jTextFieldBairroBusc.setText("");
            jTextFieldCidadeBusc.setText("");
            jFormattedTextFieldCelBusc.setText("");
            jFormattedTextFieldCepBusc.setText("");
            jFormattedTextFieldDataBusc.setText("");
            jFormattedTextFieldTelBusc.setText("");
            jFormattedTextFieldCpfBusc.setText("");

            //Desativando Campos apos Excluir
            jTextFieldNomeBusc.setEnabled(false);
            jTextFieldSobrenomeBusc.setEnabled(false);
            jTextFieldNumeroBusc.setEnabled(false);
            jTextFieldNomeRuaBusc.setEnabled(false);
            jTextFieldBairroBusc.setEnabled(false);
            jTextFieldCidadeBusc.setEnabled(false);
            jComboBoxUFBusc.setEnabled(false);
            jFormattedTextFieldCelBusc.setEnabled(false);
            jFormattedTextFieldCepBusc.setEnabled(false);
            jFormattedTextFieldDataBusc.setEnabled(false);
            jFormattedTextFieldTelBusc.setEnabled(false);
            jFormattedTextFieldCpfBusc.setEnabled(false);
            jFormattedTextFieldCpfBusc.setEnabled(true);
            jButtonEditarBusc.setEnabled(false);
            jButtonExcluirBusc.setEnabled(false);

        }
    }//GEN-LAST:event_jButtonExcluirBuscActionPerformed

    private void jComboBoxUFBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUFBuscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUFBuscActionPerformed

    private void jTextFieldBairroBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroBuscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroBuscActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Limpando Campo 
        jTextFieldNomeBusc.setText("");
        jTextFieldSobrenomeBusc.setText("");
        jTextFieldNumeroBusc.setText("");
        jTextFieldNomeRuaBusc.setText("");
        jTextFieldBairroBusc.setText("");
        jTextFieldCidadeBusc.setText("");
        jFormattedTextFieldCelBusc.setText("");
        jFormattedTextFieldCepBusc.setText("");
        jFormattedTextFieldDataBusc.setText("");
        jFormattedTextFieldTelBusc.setText("");
        jFormattedTextFieldCpfBusc.setText("");
        jTextFieldID.setText("");

        //Desativando Campos 
        jTextFieldNomeBusc.setEnabled(false);
        jTextFieldSobrenomeBusc.setEnabled(false);
        jTextFieldNumeroBusc.setEnabled(false);
        jTextFieldNomeRuaBusc.setEnabled(false);
        jTextFieldBairroBusc.setEnabled(false);
        jTextFieldCidadeBusc.setEnabled(false);
        jComboBoxUFBusc.setEnabled(false);
        jFormattedTextFieldCelBusc.setEnabled(false);
        jFormattedTextFieldCepBusc.setEnabled(false);
        jFormattedTextFieldDataBusc.setEnabled(false);
        jFormattedTextFieldTelBusc.setEnabled(false);
        jFormattedTextFieldCpfBusc.setEnabled(false);
        jButtonSalvarPac.setEnabled(false);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed

        jTextFieldNomePac.setEnabled(true);
        jTextFieldSobrenomePac.setEnabled(true);
        jTextFieldNumeroPac.setEnabled(true);
        jTextFieldNomeRuaPac.setEnabled(true);
        jTextFieldBairroPac.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jComboBoxUFPac.setEnabled(true);
        jFormattedTextFieldCelPac.setEnabled(true);
        jFormattedTextFieldCepPac.setEnabled(true);
        jFormattedTextFieldDataPac.setEnabled(true);
        jFormattedTextFieldTelPac.setEnabled(true);
        jFormattedTextFieldCpfPac.setEnabled(true);
        jButtonSalvarPac.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarPacActionPerformed
        if (jTextFieldNomePac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome para continuar");
            jTextFieldNomePac.requestFocus();
        } else if (jTextFieldSobrenomePac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o sobrenome para continuar");
            jTextFieldSobrenomePac.requestFocus();
        } else if (jFormattedTextFieldCpfPac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CPF para continuar");
            jFormattedTextFieldCpfPac.requestFocus();
        } else if (jFormattedTextFieldDataPac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a data de nascimento para continuar");
            jFormattedTextFieldDataPac.requestFocus();
        } else if (jTextFieldNomeRuaPac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome da rua para continuar");
            jTextFieldNomeRuaPac.requestFocus();
        } else if (jTextFieldCidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Cidade para continuar");
            jTextFieldCidade.requestFocus();
        } else if (jTextFieldNumeroPac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o numero para continuar");
            jTextFieldNumeroPac.requestFocus();
        } else if (jTextFieldBairroPac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o bairro para continuar");
            jTextFieldBairroPac.requestFocus();
        } else if (jFormattedTextFieldCepPac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CEP para continuar");
            jFormattedTextFieldCepPac.requestFocus();
        }

        modPac.setNome(jTextFieldNomePac.getText());
        modPac.setSobrrenome(jTextFieldSobrenomePac.getText());
        modPac.setCpf(jFormattedTextFieldCpfPac.getText());
        modPac.setNascimento(jFormattedTextFieldDataPac.getText());
        modPac.setRua(jTextFieldNomeRuaPac.getText());
        modPac.setNumero_rua(Integer.parseInt(jTextFieldNumeroPac.getText()));
        modPac.setBairro(jTextFieldBairroPac.getText());
        modPac.setCidade(jTextFieldCidade.getText());
        modPac.setUf((String) jComboBoxUFPac.getSelectedItem());
        modPac.setCep(jFormattedTextFieldCepPac.getText());
        modPac.setTelefone(jFormattedTextFieldTelPac.getText());
        modPac.setCelular(jFormattedTextFieldCelPac.getText());
        modPac.setImagem(caminho);
        controlpac.Salvar(modPac);

        //Limpando Campo Apos Salvar
        jTextFieldNomePac.setText("");
        jTextFieldSobrenomePac.setText("");
        jTextFieldNumeroPac.setText("");
        jTextFieldNomeRuaPac.setText("");
        jTextFieldBairroPac.setText("");
        jTextFieldCidade.setText("");
        jFormattedTextFieldCelPac.setText("");
        jFormattedTextFieldCepPac.setText("");
        jFormattedTextFieldDataPac.setText("");
        jFormattedTextFieldTelPac.setText("");
        jFormattedTextFieldCpfPac.setText("");

        //Desativando Campos apos salvar e editar
        jTextFieldNomePac.setEnabled(false);
        jTextFieldSobrenomePac.setEnabled(false);
        jTextFieldNumeroPac.setEnabled(false);
        jTextFieldNomeRuaPac.setEnabled(false);
        jTextFieldBairroPac.setEnabled(false);
        jTextFieldCidade.setEnabled(false);
        jComboBoxUFPac.setEnabled(false);
        jFormattedTextFieldCelPac.setEnabled(false);
        jFormattedTextFieldCepPac.setEnabled(false);
        jFormattedTextFieldDataPac.setEnabled(false);
        jFormattedTextFieldTelPac.setEnabled(false);
        jFormattedTextFieldCpfPac.setEnabled(false);
        jButtonSalvarPac.setEnabled(false);

    }//GEN-LAST:event_jButtonSalvarPacActionPerformed

    private void jButtonCancelarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarPacActionPerformed
        //Limpando Campo
        jTextFieldNomePac.setText("");
        jTextFieldSobrenomePac.setText("");
        jTextFieldNumeroPac.setText("");
        jTextFieldNomeRuaPac.setText("");
        jTextFieldBairroPac.setText("");
        jTextFieldCidade.setText("");
        jFormattedTextFieldCelPac.setText("");
        jFormattedTextFieldCepPac.setText("");
        jFormattedTextFieldDataPac.setText("");
        jFormattedTextFieldTelPac.setText("");
        jFormattedTextFieldCpfPac.setText("");

        //Desativando Campos
        jTextFieldNomePac.setEnabled(false);
        jTextFieldSobrenomePac.setEnabled(false);
        jTextFieldNumeroPac.setEnabled(false);
        jTextFieldNomeRuaPac.setEnabled(false);
        jTextFieldBairroPac.setEnabled(false);
        jTextFieldCidade.setEnabled(false);
        jComboBoxUFPac.setEnabled(false);
        jFormattedTextFieldCelPac.setEnabled(false);
        jFormattedTextFieldCepPac.setEnabled(false);
        jFormattedTextFieldDataPac.setEnabled(false);
        jFormattedTextFieldTelPac.setEnabled(false);
        jFormattedTextFieldCpfPac.setEnabled(false);
        jButtonSalvarPac.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarPacActionPerformed

    private void jTextFieldNumeroPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroPacActionPerformed

    private void jTextFieldNomePacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomePacActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(this);

        if (res == JFileChooser.APPROVE_OPTION) {
            arquivo = fc.getSelectedFile();
            caminho = arquivo.getPath();
            
            try {
                imagem = controlpac.setImagemDimensao(arquivo.getAbsolutePath(), jLabel_img.getWidth(), jLabel_img.getHeight());

                jLabel_img.setIcon(new ImageIcon(imagem));
                  
            } catch (Exception ex) {
                // System.out.println(ex.printStackTrace().toString());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Você nao selecionou nenhum arquivo.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDePaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelarPac;
    private javax.swing.JButton jButtonEditarBusc;
    private javax.swing.JButton jButtonExcluirBusc;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvarBusc;
    private javax.swing.JButton jButtonSalvarPac;
    private javax.swing.JComboBox<String> jComboBoxUFBusc;
    private javax.swing.JComboBox<String> jComboBoxUFPac;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelBusc;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelPac;
    private javax.swing.JFormattedTextField jFormattedTextFieldCepBusc;
    private javax.swing.JFormattedTextField jFormattedTextFieldCepPac;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfBusc;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfPac;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataBusc;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataPac;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelBusc;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelPac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelBairro1;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCPF1;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCelular1;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCidade1;
    private javax.swing.JLabel jLabelNascimento;
    private javax.swing.JLabel jLabelNascimento1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelNomeRua;
    private javax.swing.JLabel jLabelNomeRua1;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelNumero1;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JLabel jLabelSobrenome1;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTelefone1;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JLabel jLabelUF1;
    private javax.swing.JLabel jLabel_img;
    private javax.swing.JLabel jLabel_imgBusca;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCadPacientes;
    private javax.swing.JPanel jPanelCadPacientes1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPanePac;
    private javax.swing.JTextField jTextFieldBairroBusc;
    private javax.swing.JTextField jTextFieldBairroPac;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCidadeBusc;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNomeBusc;
    private javax.swing.JTextField jTextFieldNomePac;
    private javax.swing.JTextField jTextFieldNomeRuaBusc;
    private javax.swing.JTextField jTextFieldNomeRuaPac;
    private javax.swing.JTextField jTextFieldNumeroBusc;
    private javax.swing.JTextField jTextFieldNumeroPac;
    private javax.swing.JTextField jTextFieldSobrenomeBusc;
    private javax.swing.JTextField jTextFieldSobrenomePac;
    // End of variables declaration//GEN-END:variables
}
