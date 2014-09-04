/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Bruno
 */
public class UsuarioModelo {
    private int codigo;
    private String nome;
    private String login;
    private String senha;
    private int ativo;
    private int nivel;
    private int telefone;
    private int celular;
    private String endereco;
    private String bairro;
    private int numero;

    @Override
    public String toString() {
        return "UsuarioModelo{" + "codigo=" + codigo + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", ativo=" + ativo + ", nivel=" + nivel + ", telefone=" + telefone + ", celular=" + celular + ", endereco=" + endereco + ", bairro=" + bairro + ", numero=" + numero + ", complemento=" + complemento + ", id_cidade=" + id_cidade + '}';
    }
    private String complemento;
    private int id_cidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getId_cidade() {
        return id_cidade;
    }

    
}
