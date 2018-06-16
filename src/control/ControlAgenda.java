/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelAgenda;
import model.ModelPaciente;

/**
 *
 * @author misael
 */
public class ControlAgenda {

    ModelAgenda modAg = new ModelAgenda();
    ConexaoBD conectar = new ConexaoBD();
    ConexaoBD conectarPac = new ConexaoBD();
    ConexaoBD conectarEsp = new ConexaoBD();
    ConexaoBD desconectar = new ConexaoBD();
    int codPac;

    public void BuscarPac(ModelAgenda mod) {
        ConexaoBD.Conectar();
        conectarPac.executaSQL("select id_Paci, telefone_ag, celular_ag from CadastroDePacientes where cpf_Paci like '%" + modAg.getPesquisa() + "%'");
        try {
            conectarPac.rs.first();
            codPac = conectar.rs.getInt("");
            modAg.setNomePac(conectar.rs.getString("id_Paci"));
            modAg.setTelefone(conectar.rs.getString("telefone_ag"));
            modAg.setCelular(conectar.rs.getString("celular_ag"));
        } catch (SQLException ex) {
            Logger.getLogger(ControlAgenda.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Paciente não cadastrado");
        }

    }

    public ModelAgenda BuscarPaciente(ModelAgenda mod) throws SQLException {
        ConexaoBD.Conectar();
        conectar.executaSQL("select nome_Paci, telefone_Pac, celular from CadastroDePacientes where cpf_Paci like '%" + modAg.getPesquisa() + "%'");
        try {
            conectar.rs.first();
            mod.setNomePac(conectar.rs.getString("nome_Paci"));
            mod.setTelefone(conectar.rs.getString("telefone_Pac"));
            mod.setCelular(conectar.rs.getString("celular"));
            conectar.Desconecta();
        } catch (SQLException ex) {
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "CPF não Cadastrado");
        }
        return mod;

    }

    public ModelPaciente BuscarPaciente(String teste) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
