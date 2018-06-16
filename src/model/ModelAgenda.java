package model;

import java.util.Date;

/**
 *
 * @author misael
 */
public class ModelAgenda {

    private int id_ad;
    private String nomePac;
    private String nome_Esp;
    private String turno;
    private Date data;
    private String avaliacao;
    private String status;
    private String pesquisa;
    private String telefone;
    private String celular;

    public int getId_ad() {
        return id_ad;
    }

    public void setId_ad(int id_ad) {
        this.id_ad = id_ad;
    }

    public String getNomePac() {
        return nomePac;
    }

    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    public String getNome_Esp() {
        return nome_Esp;
    }

    public void setNome_Esp(String nome_Esp) {
        this.nome_Esp = nome_Esp;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
