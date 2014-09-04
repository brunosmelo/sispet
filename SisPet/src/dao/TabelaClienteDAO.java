/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import fw.Instrucao;
import fw.QueryMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.ClienteModelo;

/**
 *
 * @author Bruno
 */
public class TabelaClienteDAO {

    Instrucao ins;

    public TabelaClienteDAO() {
        ins = new Instrucao();
    }

    public List<ClienteModelo> listaTodosClientes(String nome) {

        final List<ClienteModelo> clientes = new ArrayList<ClienteModelo>();

        try {

            ins.executePreparedQuery("select * from clientes where nome_cliente like '%" + nome + "%'"
                    , new QueryMapper<ClienteModelo>() {

                @Override
                public List<ClienteModelo> mapping(ResultSet rset) throws SQLException {
                    while (rset.next()) {
                        ClienteModelo cliente = new ClienteModelo();
                        cliente.setCodigo(rset.getInt("id_cliente"));
                        cliente.setNome(rset.getString("nome_cliente"));
                        cliente.setCpf(rset.getString("cpf_cliente"));

                        clientes.add(cliente);
                    }
                    return clientes;
                }
            });
        } catch (SQLException e) {
            //MELHORAR
        }
        return clientes;
    }

    public List<ClienteModelo> listaTodosClientes(int cpf) {

        final List<ClienteModelo> clientes = new ArrayList<ClienteModelo>();

        try {

            ins.executePreparedQuery("select * from clientes where cpf_cliente = " + cpf
                    , new QueryMapper<ClienteModelo>() {

                @Override
                public List<ClienteModelo> mapping(ResultSet rset) throws SQLException {
                    while (rset.next()) {
                        ClienteModelo cliente = new ClienteModelo();
                        cliente.setCodigo(rset.getInt("id_cliente"));
                        cliente.setNome(rset.getString("nome_cliente"));
                        cliente.setCpf(rset.getString("cpf_cliente"));

                        clientes.add(cliente);
                    }
                    return clientes;
                }
            });
        } catch (SQLException e) {
        //MELHORAR
        }
        return clientes;
    }

    public List<ClienteModelo> listaTodosClientes() {

        final List<ClienteModelo> clientes = new ArrayList<ClienteModelo>();

        try {

            ins.executePreparedQuery("select * from clientes", new QueryMapper<ClienteModelo>() {

                @Override
                public List<ClienteModelo> mapping(ResultSet rset) throws SQLException {
                    while (rset.next()) {
                        ClienteModelo cliente = new ClienteModelo();
                        cliente.setCodigo(rset.getInt("id_cliente"));
                        cliente.setNome(rset.getString("nome_cliente"));
                        cliente.setCpf(rset.getString("cpf_cliente"));

                        clientes.add(cliente);
                    }
                    return clientes;
                }
            });
        } catch (SQLException e) {
        //MELHORAR
        }
        return clientes;
    }

    
}
