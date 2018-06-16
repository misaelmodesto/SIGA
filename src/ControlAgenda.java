
import control.ConexaoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author misael
 */
public class ControlAgenda {
        ConexaoBD conectar = new ConexaoBD();
    
    public void preencherPaciente(){
        ConexaoBD.Conectar();
        conectar.executaSQL("select * from CadastroDePacientes order by nome_Pac ");
            try {
                conectar.rs.first();
                
            } catch (SQLException ex) {
                Logger.getLogger(ControlAgenda.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
