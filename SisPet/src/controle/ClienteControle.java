/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ClienteDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.ClienteModelo;

/**
 *
 * @author Bruno
 */
public class ClienteControle {

    private ClienteModelo cliente;
    private ClienteDAO dao;

    public ClienteControle() {
        this.cliente = new ClienteModelo();
        this.dao = new ClienteDAO();
    }

    public int Salvar(ArrayList<String> pLista) {
        //pLista.get(0) -> é o código
        
        this.cliente.setNome(pLista.get(1));
        this.cliente.setCpf(pLista.get(2));
        this.cliente.setCep(pLista.get(3).replaceAll("\\D*", "")); // troca tudo que não for dígito ( \D ) por vazio. 
        this.cliente.setEndereco(pLista.get(4));
        this.cliente.setBairro(pLista.get(5));
        this.cliente.setN_endereco(!pLista.get(6).isEmpty()?Integer.parseInt(pLista.get(6)): 0);
        this.cliente.setComplemento(pLista.get(7));
        this.cliente.setTelefone(pLista.get(8).replaceAll("\\D*", ""));
        this.cliente.setCelular(pLista.get(9).replaceAll("\\D*", ""));
        this.cliente.setId_cidade(!pLista.get(10).isEmpty()?Integer.parseInt(pLista.get(10)): 0);
       this.cliente.setId_usuario(Integer.parseInt(pLista.get(11)));
       
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd"); 
        this.cliente.setDt_cadastro(formatador.format(data));
        
        dao.inserir(cliente);

        
        return this.cliente.getCodigo();
    }

    public void Atualizar(ArrayList<String> pLista) {
        this.cliente.setCodigo(Integer.parseInt(pLista.get(0)));
        this.cliente.setNome(pLista.get(1));
        this.cliente.setCpf(pLista.get(2));

        //this.objCidade.setEstado(pLista.get(3));
        dao.Atualizar(cliente);

    }

    public void Excluir(ArrayList<String> pLista) {
        this.cliente.setCodigo(Integer.parseInt(pLista.get(0)));
        dao.Excluir(cliente);
    }

    public List<ClienteModelo> getClientes() {
        return dao.listaTodosClientes();
    }

    public ArrayList<String> RecuperaObjeto(int iCodigo) {
        this.cliente = dao.RecuperaObjtCodigo(iCodigo);

        return ConverterObjetoParaArray();

    }

    public ArrayList<String> RecuperaObjetoNavegacao(int iOpcao, int iCodigo) {
        int CodigoNav = dao.PegaCodigoPelaNavegacao(iOpcao, iCodigo);
        this.cliente = dao.RecuperaObjtCodigo(CodigoNav);
        return ConverterObjetoParaArray();
    }

    private ArrayList<String> ConverterObjetoParaArray() {
        ArrayList<String> vetCampos = new ArrayList<String>();
        vetCampos.add(String.valueOf(this.cliente.getCodigo()));
        vetCampos.add(this.cliente.getNome());
        vetCampos.add(this.cliente.getCpf());
        vetCampos.add(this.cliente.getCep());
        vetCampos.add(this.cliente.getEndereco());
        vetCampos.add(this.cliente.getBairro());
        vetCampos.add(String.valueOf(this.cliente.getN_endereco()));
        vetCampos.add(this.cliente.getComplemento());
        vetCampos.add(this.cliente.getTelefone());
        vetCampos.add(this.cliente.getCelular());
        vetCampos.add(String.valueOf(this.cliente.getId_usuario()));
        vetCampos.add(this.cliente.getDt_cadastro());
        
        return vetCampos;
    }

}
