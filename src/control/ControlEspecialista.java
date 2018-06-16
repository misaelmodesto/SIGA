package control;

/**
 *
 * @author misael
 */
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelEspecialista;
import model.ModelPaciente;

public class ControlEspecialista {

    ConexaoBD conectar = new ConexaoBD();
    ModelEspecialista modEs = new ModelEspecialista();
    private StringBuilder sql;

    public void Salvar(ModelEspecialista modEs) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ConexaoBD.Conectar();
        try {

            //Gerando uma Hash de senha
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algorithm.digest(modEs.getSenha().getBytes("UTF-8"));

            //Salvando a Hash em uma String
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            String senha = hexString.toString();

            PreparedStatement pst = ConexaoBD.con.prepareStatement("insert into especialista(cpf_Esp,nome_Esp,sobrenome_Esp,nasc_Esp,rua_Esp,numero_Esp,bairro_Esp,cidade_Esp,uf_Esp,cep_Esp,tel_Esp,cel_Esp,usuario_Esp,senha_Esp,email_Esp, perfil_Esp)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            // PreparedStatement pst = ConexaoBD.con.prepareStatement("insert into especialista(cpf_Esp,nome_Esp,sobrenome_Esp,nasc_Esp,rua_Esp,numero_Esp,bairro_Esp,cidade_Esp,uf_Esp,cep_Esp,tel_Esp,cel_Esp,usuario_Esp,senha_Esp,email_Esp, perfil_Esp)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, modEs.getCpf());
            pst.setString(2, modEs.getNome());
            pst.setString(3, modEs.getSobrrenome());
            pst.setString(4, modEs.getNascimento());
            pst.setString(5, modEs.getRua());
            pst.setInt(6, modEs.getNumero_rua());
            pst.setString(7, modEs.getBairro());
            pst.setString(8, modEs.getCidade());
            pst.setString(9, modEs.getUf());
            pst.setString(10, modEs.getCep());
            pst.setString(11, modEs.getTelefone());
            pst.setString(12, modEs.getCelular());
            pst.setString(13, modEs.getUsuario());
            pst.setString(14, senha);
            //pst.setString(14, modEs.getSenha());
            pst.setString(15, modEs.getEmail());
            pst.setString(16, modEs.getPerfil());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "CPF já Cadastrado" + ex);
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ModelEspecialista BuscarEspecialista(ModelEspecialista mod) {
        conectar.executaSQL("select * from especialista where cpf_Esp like '%" + mod.getPesquisa() + "%'");
        try {
            conectar.rs.first();
            mod.setCpf(conectar.rs.getString("cpf_Esp"));
            mod.setNome(conectar.rs.getString("nome_Esp"));
            mod.setSobrrenome(conectar.rs.getString("sobrenome_Esp"));
            mod.setNascimento(conectar.rs.getString("nasc_Esp"));
            mod.setRua(conectar.rs.getString("rua_Esp"));
            mod.setNumero_rua(conectar.rs.getInt("numero_Esp"));
            mod.setBairro(conectar.rs.getString("bairro_Esp"));
            mod.setCidade(conectar.rs.getString("cidade_Esp"));
            mod.setUf(conectar.rs.getString("uf_Esp"));
            mod.setCep(conectar.rs.getString("cep_Esp"));
            mod.setTelefone(conectar.rs.getString("tel_Esp"));
            mod.setCelular(conectar.rs.getString("cel_Esp"));
            mod.setId(conectar.rs.getInt("id_Esp"));
            mod.setUsuario(conectar.rs.getString("usuario_Esp"));
            mod.setSenha(conectar.rs.getString("senha_Esp"));
            mod.setEmail(conectar.rs.getString("email_Esp"));
            mod.setPerfil(conectar.rs.getString("perfil_ESp"));

        } catch (SQLException ex) {
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "CPF não Cadastrado");
        }
        return mod;

    }

    public void editar(ModelEspecialista modEs) {

        sql = new StringBuilder(); //para alterar ou modificar o conteúdo interno, sem que necessariamente um novo objeto seja criado.
        sql.append("UPDATE especialista ");
        sql.append("SET cpf_Esp = ?,nome_Esp = ?,sobrenome_Esp = ?,nasc_Esp = ?,rua_Esp = ?,numero_Esp = ?,bairro_Esp = ?,cidade_Esp = ?,uf_Esp = ?,cep_Esp = ?,tel_Esp = ?,cel_Esp = ?,usuario_Esp = ?,senha_Esp = ?,email_Esp = ?, perfil_Esp = ?");
        sql.append("WHERE id_Esp =? ");
        System.out.println(sql.toString());

        ConexaoBD.Conectar();
        try {

            //Gerando uma Hash de senha
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algorithm.digest(modEs.getSenha().getBytes("UTF-8"));

            //Salvando a Hash em uma String
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            String senha = hexString.toString();

            PreparedStatement pst = ConexaoBD.con.prepareStatement(sql.toString());
            // PreparedStatement pst = ConexaoBD.con.prepareStatement("update especialista set cpf_Esp = ?,nome_Esp = ?,sobrenome_Esp = ?,nasc_Esp = ?,rua_Esp = ?,numero_Esp = ?,bairro_Esp = ?,cidade_Esp = ?,uf_Esp = ?,cep_Esp = ?,tel_Esp = ?,cel_Esp = ?,usuario_Esp = ?,senha_Esp = ?,email_Esp = ?, perfil_Esp = ? where id_Esp =?");
            pst.setString(1, modEs.getCpf());
            pst.setString(2, modEs.getNome());
            pst.setString(3, modEs.getSobrrenome());
            pst.setString(4, modEs.getNascimento());
            pst.setString(5, modEs.getRua());
            pst.setInt(6, modEs.getNumero_rua());
            pst.setString(7, modEs.getBairro());
            pst.setString(8, modEs.getCidade());
            pst.setString(9, modEs.getUf());
            pst.setString(10, modEs.getCep());
            pst.setString(11, modEs.getTelefone());
            pst.setString(12, modEs.getCelular());
            pst.setString(13, modEs.getUsuario());
            pst.setString(14, senha);
            //pst.setString(14, modEs.getSenha());
            pst.setString(15, modEs.getEmail());
            pst.setString(16, modEs.getPerfil());
            pst.setInt(17, modEs.getId());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Dados " + ex);

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ControlEspecialista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ControlEspecialista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excluir(ModelEspecialista mod) {
        ConexaoBD.Conectar();
        try {
            PreparedStatement pst = ConexaoBD.con.prepareStatement("delete from especialista where id_Esp =? ");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Sucesso ao deletar Dados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Dafos");
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
