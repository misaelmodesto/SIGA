package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author misael
 */
public class ConexaoBD {

    Statement stm;
    public ResultSet rs;

    public static Connection con = null;

    public static void Conectar() {

        try {
            //Class Mysql
            Class.forName("com.mysql.jdbc.Driver");

            //Conexão MySql
            //Alterar Usuario e Senha
            con = DriverManager.getConnection("jdbc:mysql://localhost/siga", "root", "Mirivaldo@777");

            System.out.println("Conectado.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }

    }

    public void Desconecta() {
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel desconectar do banco");
        }
    }

    public void executaSQL(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro executa sql:\n" + ex.getMessage());
        }

    }

    public static class Conectar {

        public Conectar() {
        }
    }

}
