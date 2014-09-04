/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import fw.Instrucao;
import fw.QueryMapper;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ClienteModelo;

/**
 *
 * @author Bruno
 */
public class ClienteDAO {

    Instrucao ins;
    public static final int cNavPrimeiro = 0;
    public static final int cNavAnterior = 1;
    public static final int cNavProximo = 2;
    public static final int cNavUltimo = 3;

    public ClienteDAO() {
        ins = new Instrucao();
    }

    public void inserir(ClienteModelo cliente) {

        final String sql = "insert into clientes (nome_cliente, cpf_cliente,cep_cliente,"
                + "endereco_cliente, bairro_cliente, n_endereco_cliente, c_endereco_cliente,"
                + "tel_cliente, cel_cliente, id_cidade, dt_cadastro, id_usuario) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            ins.beginTransaction();

            long id;
            id = ins.executePreparedUpdateAndReturnGeneratedKeys(ins.getConnectionFromContext()
                    ,sql
                    ,cliente.getNome()
                    ,cliente.getCpf()
                    ,cliente.getCep()
                    ,cliente.getEndereco()
                    ,cliente.getBairro()
                    ,cliente.getN_endereco()
                    ,cliente.getComplemento()
                    ,cliente.getTelefone()
                    ,cliente.getCelular()
                    ,cliente.getId_cidade()
                    ,cliente.getDt_cadastro()
                    ,cliente.getId_usuario()
            );
            
            ins.endTransaction();

            cliente.setCodigo((int) id);

        } catch (SQLException ex) {
            //MELHORAR
            ins.rollbackTransaction();
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Atualizar(ClienteModelo cliente) {

        final String sql = "update clientes set nome_cliente = ? , cpf_cliente = ?  where id_cliente = ? ";

        try {
            ins.beginTransaction();

            ins.executePreparedUpdate(ins.getConnectionFromContext(), sql, cliente.getNome(), cliente.getCpf(), cliente.getCodigo()
            );

            ins.endTransaction();

        } catch (SQLException ex) {
            //MELHORAR .. 
            ins.rollbackTransaction();
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Excluir(ClienteModelo cliente) {

        final String sql = "delete from clientes where id_cliente = ? ";

        try {
            ins.beginTransaction();

            ins.executePreparedUpdate(ins.getConnectionFromContext(), sql, cliente.getCodigo()
            );

            ins.endTransaction();

        } catch (SQLException ex) {
            //MELHORAR .. 
            ins.rollbackTransaction();
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
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
                        cliente.setCep(rset.getString("cep_cliente"));
                        cliente.setEndereco(rset.getString("endereco_cliente"));
                        cliente.setBairro(rset.getString("bairro_cliente"));
                        cliente.setN_endereco(rset.getInt("n_endereco_cliente"));
                        cliente.setComplemento(rset.getString("c_endereco_cliente"));
                        cliente.setTelefone(rset.getString("tel_cliente"));
                        cliente.setCelular(rset.getString("cel_cliente"));

                        clientes.add(cliente);
                    }
                    return clientes;
                }

            });
        } catch (SQLException e) {
        }

        return clientes;

    }

    public List<ClienteModelo> listaTodosClientes(String sql, boolean pegaTudo) {

        final List<ClienteModelo> clientes = new ArrayList<ClienteModelo>();

        try {

            ins.executePreparedQuery(sql, new QueryMapper<ClienteModelo>() {

                @Override
                public List<ClienteModelo> mapping(ResultSet rset) throws SQLException {

                    while (rset.next()) {
                        ClienteModelo cliente = new ClienteModelo();

                        if (!pegaTudo) {
                            cliente.setCodigo(rset.getInt("cod"));
                        } else {
                            cliente.setCodigo(rset.getInt("id_cliente"));
                            cliente.setNome(rset.getString("nome_cliente"));
                            cliente.setCpf(rset.getString("cpf_cliente"));
                            cliente.setCep(rset.getString("cep_cliente"));
                            cliente.setEndereco(rset.getString("endereco_cliente"));
                            cliente.setBairro(rset.getString("bairro_cliente"));
                            cliente.setN_endereco(rset.getInt("n_endereco_cliente"));
                            cliente.setComplemento(rset.getString("c_endereco_cliente"));
                            cliente.setTelefone(rset.getString("tel_cliente"));
                            cliente.setCelular(rset.getString("cel_cliente"));
                            cliente.setDt_cadastro(rset.getString("dt_cadastro"));
                            cliente.setId_usuario(rset.getInt("id_usuario"));
                        }
                        clientes.add(cliente);

                    }
                    return clientes;
                }

            });
        } catch (SQLException e) {

        }

        return clientes;

    }

    public int PegaCodigoPelaNavegacao(int iOpcao, int iCodigoAtual) {
        int CodigoEncontrado;
        ClienteModelo cli;

        try {
            List<ClienteModelo> clientes = listaTodosClientes(SQLNavegacao(iOpcao, iCodigoAtual), false);

            cli = clientes.get(0);
            CodigoEncontrado = cli.getCodigo();
        } catch (HeadlessException e) {
            return 0;
        }
        return CodigoEncontrado;
    }

    /*
     public List<ClienteModelo> RecuperaObjts(String cidade) {
     Connection cnx = FactoryConnection.GeraConexao();
     List<CidadeModel> cid = new ArrayList<CidadeModel>();
     try {
     Statement objSTM = cnx.createStatement();
     objSTM.executeQuery("select * from cidade where nomecid like'%" + cidade + "%'");
     ResultSet objResultSet = objSTM.getResultSet();

     while (objResultSet.next()) {
     CidadeModel c = new CidadeModel();

     c.setCodigo(objResultSet.getInt("codcid"));
     c.setNome(objResultSet.getString("nomecid"));
     c.setEstado(objResultSet.getString("estadocid"));
     c.setCEP(objResultSet.getString("cepcid"));

     cid.add(c);

     }
     objResultSet.close();
     objSTM.close();
     cnx.close();

     } catch (SQLException erro) {
     JOptionPane.showMessageDialog(null, "Erro ao recuperar objeto: " + erro.getMessage());
     }
     return cid;
     }
     */
    public ClienteModelo RecuperaObjtCodigo(Integer cliente) {

        ClienteModelo cli;
        String sql = "select * from clientes where id_cliente = " + cliente;

        List<ClienteModelo> clientes = listaTodosClientes(sql, true);

        cli = clientes.get(0);

        return cli;
    }

    private static String SQLNavegacao(int iOpcao, int iCodigoAtual) {
        String sql = "";
        switch (iOpcao) {
            case cNavPrimeiro:
                sql = "select min(id_cliente) as cod from clientes";
                break;
            case cNavAnterior:
                sql = "select max(id_cliente) as cod from clientes where id_cliente <" + String.valueOf(iCodigoAtual);
                break;
            case cNavProximo:
                sql = "select min(id_cliente) as cod from clientes where id_cliente >" + String.valueOf(iCodigoAtual);
                break;
            case cNavUltimo:
                sql = "select max(id_cliente) as cod from clientes";
                break;

        }
        return sql;
    }

}
