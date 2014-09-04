/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Bruno
 */
public class ClienteModelo {

    private int codigo;
    private String nome;
    private String cpf;
    private String cep;
    private String endereco;
    private String bairro;
    private int n_endereco;
    private String complemento;
    private String telefone;
    private String celular;
    private int id_animal;
    private int id_cidade;
    private int id_usuario;
    private String dt_cadastro;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        if (this.nome == null) {
            this.nome = ""; //
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        if (this.cpf == null) {
            this.cpf = ""; //
        }

        return cpf;
    }

    public void setCpf(String cpf) {
        cpf = cpf.replaceAll("\\D*", ""); // troca tudo que não for dígito ( \D ) por vazio.  
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        if (this.endereco == null) {
            this.endereco = ""; //
        }

        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        if (this.bairro == null) {
            this.bairro = ""; //
        }

        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getN_endereco() {
//MELHORAR
        return n_endereco;
    }

    public void setN_endereco(int n_endereco) {
        this.n_endereco = n_endereco;
    }

    public String getComplemento() {
        if (this.complemento == null) {
            this.complemento = ""; //
        }

        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        if (this.telefone == null) {
            this.telefone = ""; //
        }

        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        if (this.celular == null) {
            this.celular = ""; //
        }

        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public int getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    

    @Override
    public String toString() {
        return "ClienteModelo{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", cep=" + cep + ", endereco=" + endereco + ", bairro=" + bairro + ", n_endereco=" + n_endereco + ", complemento=" + complemento + ", telefone=" + telefone + ", celular=" + celular + ", id_animal=" + id_animal + ", id_cidade=" + id_cidade + ", id_usuario=" + id_usuario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.codigo;
        hash = 73 * hash + Objects.hashCode(this.nome);
        hash = 73 * hash + Objects.hashCode(this.cpf);
        hash = 73 * hash + Objects.hashCode(this.cep);
        hash = 73 * hash + Objects.hashCode(this.endereco);
        hash = 73 * hash + Objects.hashCode(this.bairro);
        hash = 73 * hash + this.n_endereco;
        hash = 73 * hash + Objects.hashCode(this.complemento);
        hash = 73 * hash + Objects.hashCode(this.telefone);
        hash = 73 * hash + Objects.hashCode(this.celular);
        hash = 73 * hash + this.id_animal;
        hash = 73 * hash + this.id_cidade;
        hash = 73 * hash + this.id_usuario;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClienteModelo other = (ClienteModelo) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (this.n_endereco != other.n_endereco) {
            return false;
        }
        if (!Objects.equals(this.complemento, other.complemento)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (this.id_animal != other.id_animal) {
            return false;
        }
        if (this.id_cidade != other.id_cidade) {
            return false;
        }
        if (this.id_usuario != other.id_usuario) {
            return false;
        }
        return true;
    }

    public String getDt_cadastro() {
        return dt_cadastro;
    }

    public void setDt_cadastro(String dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }

}
