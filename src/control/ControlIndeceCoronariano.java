/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelIndiceCoronariano;

/**
 *
 * @author misae
 */
public class ControlIndeceCoronariano {
    ConexaoBD conectar = new ConexaoBD();
    ModelIndiceCoronariano modInt = new ModelIndiceCoronariano();
    private StringBuilder sql;
    
     public void Salvar(ModelIndiceCoronariano modAva) {
        ConexaoBD.Conectar();
        try {
            try (PreparedStatement pst = ConexaoBD.con.prepareStatement("insert into indicecoronariano(idade_Cor, hereditariedade_Cor, peso_Cor, fumo_Cor, exercicio_Cor, colesterol_Cor, presaoart_Cor, sexo_Cor, soma_Cor) values(?,?,?,?,?,?,?,?,?)")) {
                System.out.println("Dados Inseridos antes: " +modInt.getIdade());
                pst.setInt(1, modInt.getIdade());
 
                System.out.println("Dados Inseridos: " +modInt.getIdade());
                pst.setInt(2, modInt.getHereditariedade());
                pst.setInt(3, modInt.getPeso());
                pst.setInt(4, modInt.getFumo());
                pst.setInt(5, modInt.getExercicio());
                pst.setInt(6, modInt.getColesterol());
                pst.setInt(7, modInt.getPresaoart());
                pst.setInt(8, modInt.getSexo());
                pst.setInt(9, modInt.getSoma());
                pst.execute();
                      }
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Ao Salvar Avaliaçaõ" + ex);
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
