/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static control.ConexaoBD.con;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.ModelAvaliacaoAntropometrica;
import model.ModelPaciente;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author misael
 */
public class ControlAvaliaçãoAntropometrica {

    ConexaoBD conectar = new ConexaoBD();
    ModelAvaliacaoAntropometrica modAva = new ModelAvaliacaoAntropometrica();

    //Calculo Do IMC - Indice De Massa Corporal
    public void CalculoIMC(ModelAvaliacaoAntropometrica modAva) {
        modAva.setImc((modAva.getMassaCorporal() / (modAva.getEstatura() * modAva.getEstatura())));
        if (modAva.getImc() < 18.5) {
            modAva.setResultImc(String.valueOf(modAva.getImc()) + ": (Abaixo do Peso)");
        }
        if (modAva.getImc() > 18.6 && modAva.getImc() < 24.9) {
            modAva.setResultImc(String.valueOf(modAva.getImc()) + " : (Peso Ideal)");
        }
        if (modAva.getImc() > 25.0 && modAva.getImc() < 29.9) {
            modAva.setResultImc(String.valueOf(modAva.getImc()) + " : (Levemente a Cima do Peso)");
        }
        if (modAva.getImc() > 30.0 && modAva.getImc() < 34.9) {
            modAva.setResultImc(String.valueOf(modAva.getImc()) + " : (Obesidade Grau 1)");
        }
        if (modAva.getImc() > 35.0 && modAva.getImc() < 39.9) {
            modAva.setResultImc(String.valueOf(modAva.getImc()) + " : (Obesidade Grau 2 (Severa))");
        } else {
            modAva.setResultImc(String.valueOf(modAva.getImc()) + " : (Obesidade Grau 3 (Mórbita))");
        }
    }
    //Calculo Do RCQ - Relação entre Cintura e Quadril

    public void CalculoRcq(ModelAvaliacaoAntropometrica modAva) {
        modAva.setRcq((modAva.getCintura() / modAva.getQuadril()));
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() < 29 && modAva.getRcq() < 0.83) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " : Baixo Risco");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 30 && modAva.getIdade() < 39 && modAva.getRcq() < 0.84) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Baixo Risco");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 40 && modAva.getIdade() < 49 && modAva.getRcq() < 0.88) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Baixo Risco");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 50 && modAva.getIdade() < 59 && modAva.getRcq() < 0.90) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Baixo Risco");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 59 && modAva.getRcq() < 0.91) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Baixo Risco");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() < 29 && modAva.getRcq() > 0.83 && modAva.getRcq() < 0.88) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Moderado");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 30 && modAva.getIdade() < 39 && modAva.getRcq() > 0.84 && modAva.getRcq() < 0.91) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Moderado");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 40 && modAva.getIdade() < 49 && modAva.getRcq() > 0.88 && modAva.getRcq() < 0.95) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Moderado");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 50 && modAva.getIdade() < 59 && modAva.getRcq() > 0.90 && modAva.getRcq() > 0.96) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Moderado");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 59 && modAva.getRcq() > 0.91 && modAva.getRcq() < 0.98) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Moderado");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() < 29 && modAva.getRcq() > 0.89 && modAva.getRcq() < 0.94) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Alto");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 30 && modAva.getIdade() < 39 && modAva.getRcq() > 0.92 && modAva.getRcq() < 0.96) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Alto");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 40 && modAva.getIdade() < 49 && modAva.getRcq() > 0.96 && modAva.getRcq() < 1.00) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Alto");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 50 && modAva.getIdade() < 59 && modAva.getRcq() > 0.97 && modAva.getRcq() < 1.02) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Alto");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 59 && modAva.getRcq() > 0.99 && modAva.getRcq() < 1.03) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Alto");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() < 29 && modAva.getRcq() > 0.94) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Muito Alto");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 30 && modAva.getIdade() < 39 && modAva.getRcq() > 0.96) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Muito Alto");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 40 && modAva.getIdade() < 49 && modAva.getRcq() > 1.00) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Muito Alto");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 50 && modAva.getIdade() < 59 && modAva.getRcq() > 1.02) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Muito Alto");
        }
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() > 59 && modAva.getRcq() > 0.99 && modAva.getRcq() > 1.03) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Muito Alto");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() < 29 && modAva.getRcq() < 0.71) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Baixo Risco");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 30 && modAva.getIdade() < 39 && modAva.getRcq() < 0.72) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Baixo Risco");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 40 && modAva.getIdade() < 49 && modAva.getRcq() < 0.73) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Baixo Risco");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 50 && modAva.getIdade() < 59 && modAva.getRcq() < 0.74) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Baixo Risco");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 59 && modAva.getRcq() < 0.76) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Baixo Risco");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() < 29 && modAva.getRcq() > 071 && modAva.getRcq() < 0.77) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Moderado");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 30 && modAva.getIdade() < 39 && modAva.getRcq() > 0.72 && modAva.getRcq() < 0.78) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Moderado");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 40 && modAva.getIdade() < 49 && modAva.getRcq() > 0.73 && modAva.getRcq() < 0.79) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Moderado");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 50 && modAva.getIdade() < 59 && modAva.getRcq() > 0.74 && modAva.getRcq() > 0.81) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Moderado");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 59 && modAva.getRcq() > 0.76 && modAva.getRcq() < 0.83) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Moderado");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() < 29 && modAva.getRcq() > 0.78 && modAva.getRcq() < 0.82) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Alto");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 30 && modAva.getIdade() < 39 && modAva.getRcq() > 0.79 && modAva.getRcq() < 0.84) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Alto");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 40 && modAva.getIdade() < 49 && modAva.getRcq() > 0.80 && modAva.getRcq() < 0.87) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Alto");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 50 && modAva.getIdade() < 59 && modAva.getRcq() > 0.82 && modAva.getRcq() < 0.88) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Alto");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 59 && modAva.getRcq() > 0.84 && modAva.getRcq() < 0.90) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Alto");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() < 29 && modAva.getRcq() > 0.82) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Muito Alto");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 30 && modAva.getIdade() < 39 && modAva.getRcq() > 0.84) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Muito Alto");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 40 && modAva.getIdade() < 49 && modAva.getRcq() > 0.87) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Muito Alto");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 50 && modAva.getIdade() < 59 && modAva.getRcq() > 0.88) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Muito Alto");
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() > 59 && modAva.getRcq() > 0.99 && modAva.getRcq() > 0.90) {
            modAva.setResultRcq(String.valueOf(modAva.getRcq()) + " :Risco Muito Alto");
        }
    }

    //Calculo 17 a 27 Anos
    public void ProtocoloGuedes(ModelAvaliacaoAntropometrica modAva) {
        double log;
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() >= 17 && modAva.getIdade() <= 27) {
            log = (Math.log10(modAva.getTriceps() + modAva.getSupraIliaca() + modAva.getAbdomen()));
            modAva.setDensidadeCorpora(1.1714 - 0.0671 * log);
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() >= 17 && modAva.getIdade() <= 27) {
            log = (Math.log10(modAva.getCoxaMedial() + modAva.getSupraIliaca() + modAva.getSubescapular()));
            modAva.setDensidadeCorpora(1.1665 - 0.0706 * log);
        }

    }
    //calculo 18 a 66 Anos

    public void ProtocoloPetroski(ModelAvaliacaoAntropometrica modAva) {
        if ("Masculino".equals(modAva.getGenero()) && modAva.getIdade() >= 18 && modAva.getIdade() <= 66) {
            modAva.setPercentualGordura(1.10726863 - 0.00081201 * (modAva.getSubescapular() + modAva.getTriceps() + modAva.getSupraIliaca() + modAva.getPanturilhaMedial()) + 0.00000212 * (modAva.getSubescapular() + modAva.getTriceps() + modAva.getSupraIliaca() + modAva.getPanturilhaMedial()) - 0.00041761 * modAva.getIdade());
        }
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() >= 18 && modAva.getIdade() <= 66) {
            double log = (modAva.getAxilarMedio() + modAva.getSupraIliaca() + modAva.getCoxaMedial() + modAva.getPanturilhaMedial());
            modAva.setPercentualGordura(1.19547130 - 0.07513508 * log - 0.00041072 * modAva.getIdade());
        }
    }
    //Calculo 18 a 61 Anos 7 Dobras Cutanes

    public void ProtocoloJacksonEPollock(ModelAvaliacaoAntropometrica modAva) {
        if (modAva.getIdade() >= 18 && modAva.getIdade() <= 61) {
            modAva.setDensidadeCorpora(1.101 - (0.0004115 * modAva.getSomatorio()) + (0.00000069 * (modAva.getSomatorio() * modAva.getSomatorio())) - (0.00022631 * modAva.getIdade()) - (0.0059239 * modAva.getAbdomen()) + (0.0190632 * modAva.getAntebraco()));
        }

    }
    // Mulheres 18 a 55 Anos

    public void ProtocoloJacksonPollockEWard(ModelAvaliacaoAntropometrica modAva) {
        if ("Feminino".equals(modAva.getGenero()) && modAva.getIdade() >= 18 && modAva.getIdade() <= 55) {
            modAva.setDensidadeCorpora(1.0994921 - (0.000929 * (modAva.getSomatorioTricep() + modAva.getSomatorioCoxa() + modAva.getSomatorioSupraIliaca())) + (0.0000023 * (modAva.getSomatorioTricep() + modAva.getSomatorioCoxa() + modAva.getSomatorioSupraIliaca()) * (modAva.getSomatorioTricep() + modAva.getSomatorioCoxa() + modAva.getSomatorioSupraIliaca())) - (0.0001392 * modAva.getIdade()));

        }
    }

    public void ProtocoloSeri(ModelAvaliacaoAntropometrica modAva) {
        double result = (4.95 / modAva.getDensidadeCorpora());
        result = ((result - 4.50) * 100);
    }

    public void MassaCorporalGorda(ModelAvaliacaoAntropometrica modAva) {
        modAva.setMassaCorporal((modAva.getMassaCorporal() * modAva.getPercentualGordura()) / 100);
    }

    public void MassaCorporalmagra(ModelAvaliacaoAntropometrica modAva) {
        modAva.setPesoCorporalMagra((modAva.getMassaCorporal() * modAva.getDensidadeCorpora()) / 100);
    }

    public void MassaOssea(ModelAvaliacaoAntropometrica modAva) {
        modAva.setPesoOsseo(modAva.getEstatura() * modAva.getEstatura() * (modAva.getPunho() / 100) * (modAva.getFemu() / 100) * 400);
    }

    public void MassaMuscular(ModelAvaliacaoAntropometrica modAva) {
        modAva.setPesoOsseo(modAva.getMassaCorporal() - modAva.getPesoCorporalGordo() + modAva.getPesoOsseo());
    }

    public void Salvar(ModelAvaliacaoAntropometrica modAva) {
        ConexaoBD.Conectar();
        try {
            try (PreparedStatement pst = ConexaoBD.con.prepareStatement("insert into avaliacaoAntropometrica(subescapular_Avali, triceps_Avali, bicepes_Avali,peitoral_Avali, axilarMedio_Avali, supraIliaca_Avali, abdominalVertical_Avali, coxaSuperior_Avali, coxaMedial_Avali, panturilhaMedial_Avali, antebraco_Avali, bracoRelaxado_Avali, bracoContraido_Avali, ombro_Avali, torax_Avali, cintura_Avali, abdomen_Avali, quadril_Avali, perna_Avali, massaCorporal_Avali, biestiloideRadial_Avali, BiepicondiloFemural_Avali, genero_Avali, etinia_Avali, idade_Avali, estatura_Avali, idPac_Avali,data_Avali,result_IMC,result_RCQ, result_MassaCorporalGorda,result_MassaCorporalmagra,result_MassaMuscular,result_MassaOssea) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)")) {
                pst.setDouble(1, modAva.getSubescapular());
                pst.setDouble(2, modAva.getTriceps());
                pst.setDouble(3, modAva.getBicepes());
                pst.setDouble(4, modAva.getPeitoral());
                pst.setDouble(5, modAva.getAxilarMedio());
                pst.setDouble(6, modAva.getSupraIliaca());
                pst.setDouble(7, modAva.getAbdominalVertical());
                pst.setDouble(8, modAva.getCoxaSuperior());
                pst.setDouble(9, modAva.getCoxaMedial());
                pst.setDouble(10, modAva.getPanturilhaMedial());
                pst.setDouble(11, modAva.getAntebraco());
                pst.setDouble(12, modAva.getBracoRelaxado());
                pst.setDouble(13, modAva.getBracoContraido());
                pst.setDouble(14, modAva.getOmbro());
                pst.setDouble(15, modAva.getTorax());
                pst.setDouble(16, modAva.getCintura());
                pst.setDouble(17, modAva.getAbdomen());
                pst.setDouble(18, modAva.getQuadril());
                pst.setDouble(19, modAva.getPerna());
                pst.setDouble(20, modAva.getMassaCorporal());
                pst.setDouble(21, modAva.getBiestiloideRadial());
                pst.setDouble(22, modAva.getBiepicondiloFemural());
                pst.setString(23, modAva.getGenero());
                pst.setString(24, modAva.getEtinia());
                pst.setInt(25, modAva.getIdade());
                pst.setDouble(26, modAva.getEstatura());
                pst.setInt(27, modAva.getId());
                pst.setString(28, modAva.getData());
                pst.setString(29, modAva.getResultImc());
                pst.setString(30, modAva.getResultRcq());
                pst.setDouble(31, modAva.getPesoCorporalGordo());
                pst.setDouble(32, modAva.getPesoCorporalMagra());
                pst.setDouble(33, modAva.getPesoMuscular());
                pst.setDouble(34, modAva.getPesoOsseo());

                pst.execute();
            }
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Ao Salvar Avaliaçaõ" + ex);
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ModelAvaliacaoAntropometrica BuscarPaciente(ModelAvaliacaoAntropometrica modAva) {
        ConexaoBD.Conectar();
        conectar.executaSQL("select * from CadastroDePacientes where cpf_Paci like '%" + modAva.getPesquisa() + "%'");

        try {
            conectar.rs.first();
            modAva.setId(conectar.rs.getInt("id_Paci"));
            modAva.setNomePac(conectar.rs.getString("nome_Paci"));
            conectar.Desconecta();
        } catch (SQLException ex) {
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "CPF não Cadastrado");
        }
        return modAva;

    }

    //Não está achando o caminho
    //Id está errado
    public void imprimeRelatorio(int id) {

        try {

            ConexaoBD.Conectar();
            Statement stm = ConexaoBD.con.createStatement();
            String query = "SELECT * FROM cadastrodepacientes INNER JOIN avaliacaoantropometrica ON cadastrodepacientes.`id_Paci` = avaliacaoantropometrica.`idPac_Avali`\n"
                    + "WHERE avaliacaoantropometrica.id_Avali";
            ResultSet rs = stm.executeQuery(query);
            String jasperFile = "./relatorios/Antropometrico.jasper";
            int id_Ava = id;
            HashMap parametro = new HashMap();
            parametro.put("id_Avali", id_Ava);
            JasperPrint print = JasperFillManager.fillReport(jasperFile, parametro, con);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            if (print.getPages().size() != 0) {
                viewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
                viewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                viewer.setTitle("Avaliação Antropometrica");
                viewer.toFront();
                viewer.setVisible(true);
            }
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel gerar relatorio" + ex);
        }
    }

}