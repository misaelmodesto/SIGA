package control;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import model.ModelPaciente;

/**
 *
 * @author misael
 */
public class ControlPaciente {

    ConexaoBD conectar = new ConexaoBD();
    ModelPaciente modPa = new ModelPaciente();
    ConexaoBD desconectar = new ConexaoBD();
    private StringBuilder sql;

    public void Salvar(ModelPaciente modPa) {
        ConexaoBD.Conectar();
        try {
            PreparedStatement pst = ConexaoBD.con.prepareStatement("insert into CadastroDePacientes(cpf_Paci,nome_Paci,sobrenome_Paci,nacimento_paci,nome_Rua_Pac,numero_Rua_Pac,bairro_Pac,cidade_Pac,uf_Pac,cep_Pac,telefone_Pac,celular,imagem_Pac)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, modPa.getCpf());
            pst.setString(2, modPa.getNome());
            pst.setString(3, modPa.getSobrrenome());
            pst.setString(4, modPa.getNascimento());
            pst.setString(5, modPa.getRua());
            pst.setInt(6, modPa.getNumero_rua());
            pst.setString(7, modPa.getBairro());
            pst.setString(8, modPa.getCidade());
            pst.setString(9, modPa.getUf());
            pst.setString(10, modPa.getCep());
            pst.setString(11, modPa.getTelefone());
            pst.setString(12, modPa.getCelular());
            pst.setString(13, modPa.getImagem());
            pst.execute();
            conectar.Desconecta();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "CPF já Cadastrado");
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ModelPaciente ListarPaciete() {
        ConexaoBD.Conectar();
        conectar.executaSQL("SELECT cpf_Paci, nome_Paci, sobrenome_Paci, telefone_pac, celular from CadastroDePacientes");
        try {
            conectar.rs.first();
            conectar.rs.getString("cpf_Paci");
            conectar.rs.getString("nome_Paci");
            conectar.rs.getString("sobrenome_Paci");
            conectar.rs.getString("telefone_Pac");
            conectar.rs.getString("celular");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher relatorio\n" + ex);
        }
        return ListarPaciete();

    }

    public ModelPaciente BuscarPaciente(ModelPaciente mod) {
        ConexaoBD.Conectar();
        conectar.executaSQL("select * from CadastroDePacientes where cpf_Paci like '%" + mod.getPesquisa() + "%'");
        try {
            conectar.rs.first();
            mod.setCpf(conectar.rs.getString("cpf_Paci"));
            mod.setNome(conectar.rs.getString("nome_Paci"));
            mod.setSobrrenome(conectar.rs.getString("sobrenome_Paci"));
            mod.setNascimento(conectar.rs.getString("nacimento_Paci"));
            mod.setRua(conectar.rs.getString("nome_Rua_Pac"));
            mod.setNumero_rua(conectar.rs.getInt("numero_Rua_Pac"));
            mod.setBairro(conectar.rs.getString("bairro_Pac"));
            mod.setCidade(conectar.rs.getString("cidade_Pac"));
            mod.setUf(conectar.rs.getString("uf_Pac"));
            mod.setCep(conectar.rs.getString("cep_pac"));
            mod.setTelefone(conectar.rs.getString("telefone_Pac"));
            mod.setCelular(conectar.rs.getString("celular"));
            mod.setImagem(conectar.rs.getString("imagem_Pac"));
            mod.setId(conectar.rs.getInt("id_Paci"));
            conectar.Desconecta();
        } catch (SQLException ex) {
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "CPF não Cadastrado");
        }
        return mod;

    }

    public void editar(ModelPaciente modPa) throws SQLException {

        sql = new StringBuilder(); //para alterar ou modificar o conteúdo interno, sem que necessariamente um novo objeto seja criado.
        sql.append("UPDATE CadastroDePacientes ");
        sql.append("SET cpf_Paci = ?, nome_Paci = ?,sobrenome_Paci = ?, nacimento_paci = ?, nome_Rua_Pac = ?, numero_Rua_Pac = ?, bairro_Pac = ?, cidade_Pac = ?, uf_Pac = ?, cep_Pac = ?, telefone_Pac = ?, celular = ? ");
        sql.append("WHERE id_Paci= ? ");
        System.out.println(sql.toString());

        ConexaoBD.Conectar();

        try {
            PreparedStatement pst = ConexaoBD.con.prepareStatement(sql.toString());

            pst.setString(1, modPa.getCpf());
            pst.setString(2, modPa.getNome());
            pst.setString(3, modPa.getSobrrenome());
            pst.setString(4, modPa.getNascimento());
            pst.setString(5, modPa.getRua());
            pst.setInt(6, modPa.getNumero_rua());
            pst.setString(7, modPa.getBairro());
            pst.setString(8, modPa.getCidade());
            pst.setString(9, modPa.getUf());
            pst.setString(10, modPa.getCep());
            pst.setString(11, modPa.getTelefone());
            pst.setString(12, modPa.getCelular());
            pst.setInt(13, modPa.getId());
            pst.executeUpdate();

            int rs = pst.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar o usuario!" + e.getMessage());

        } finally {
            conectar.Desconecta();
            conectar.rs.close();
        }

    }

    public void excluir(ModelPaciente mod) {
        ConexaoBD.Conectar();
        try {
            PreparedStatement pst = ConexaoBD.con.prepareStatement("delete from CadastroDePacientes where id_Paci =? ");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Sucesso ao deletar Dados");
            conectar.Desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Dafos");
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    /*
     * Faz redimensionamento da imagem conforme os parâmetros imgLargura e imgAltura mantendo a proporcionalidade. 
     * Caso a imagem seja menor do que os parâmetros de redimensionamento, a imagem não será redimensionada. 
     *  
     * @param caminhoImg caminho e nome da imagem a ser redimensionada. 
     * @param imgLargura nova largura da imagem após ter sido redimensionada. 
     * @param imgAltura  nova altura da imagem após ter sido redimensionada. 
     *  
     * @return Não há retorno 
     * @throws Exception Erro ao redimensionar imagem 
     ************************************************************************************************************/
    public BufferedImage setImagemDimensao(String caminhoImg, Integer imgLargura, Integer imgAltura) throws IOException {
        Double novaImgLargura = null;
        Double novaImgAltura = null;
        Double imgProporcao = null;
        Graphics2D g2d = null;
        BufferedImage imagem = null, novaImagem = null;

        //--- Obtém a imagem a ser redimensionada ---
        imagem = ImageIO.read(new File(caminhoImg));

        //--- Obtém a largura da imagem ---  
        novaImgLargura = (double) imagem.getWidth();

        //--- Obtám a altura da imagem ---  
        novaImgAltura = (double) imagem.getHeight();

        //--- Verifica se a altura ou largura da imagem recebida é maior do que os ---  
        //--- parâmetros de altura e largura recebidos para o redimensionamento   ---  
        if (novaImgLargura >= imgLargura) {
            imgProporcao = (novaImgAltura / novaImgLargura);//calcula a proporção  
            novaImgLargura = (double) imgLargura;

            //--- altura deve <= ao parâmetro imgAltura e proporcional a largura ---  
            novaImgAltura = (novaImgLargura * imgProporcao);

            //--- se altura for maior do que o parâmetro imgAltura, diminui-se a largura de ---  
            //--- forma que a altura seja igual ao parâmetro imgAltura e proporcional a largura ---  
            while (novaImgAltura > imgAltura) {
                novaImgLargura = (double) (--imgLargura);
                novaImgAltura = (novaImgLargura * imgProporcao);
            }
        } else if (novaImgAltura >= imgAltura) {
            imgProporcao = (novaImgLargura / novaImgAltura);//calcula a proporção  
            novaImgAltura = (double) imgAltura;

            //--- se largura for maior do que o parâmetro imgLargura, diminui-se a altura de ---  
            //--- forma que a largura seja igual ao parâmetro imglargura e proporcional a altura ---  
            while (novaImgLargura > imgLargura) {
                novaImgAltura = (double) (--imgAltura);
                novaImgLargura = (novaImgAltura * imgProporcao);
            }
        }

        novaImagem = new BufferedImage(novaImgLargura.intValue(), novaImgAltura.intValue(), BufferedImage.TYPE_INT_RGB);
        g2d = novaImagem.createGraphics();
        g2d.drawImage(imagem, 0, 0, novaImgLargura.intValue(), novaImgAltura.intValue(), null);

        return novaImagem;
    }

}
