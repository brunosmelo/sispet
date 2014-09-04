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
import modelo.CidadeModelo;

/**
 *
 * @author Bruno
 */
public class CidadeDAO {

    List<CidadeModelo> listaCidades;
    CidadeModelo cidade;
    Instrucao ins;

    public CidadeDAO() {
        listaCidades = new ArrayList<>();
        ins = new Instrucao();
    }

    public List<CidadeModelo> listaTodosCidades(String id) {
        
        String sql = "select * from cidades where id_estado=" + id;
        final List<CidadeModelo> cidades = new ArrayList<CidadeModelo>();

        try {

            ins.executePreparedQuery(sql, new QueryMapper<CidadeModelo>() {

                @Override
                public List<CidadeModelo> mapping(ResultSet rset) throws SQLException {
                    while (rset.next()) {
                        CidadeModelo cidade = new CidadeModelo();
                        cidade.setCodigo(rset.getInt("id_cidade"));
                        cidade.setNome(rset.getString("nome_cidade"));
                        cidade.setId_estado(rset.getInt("id_estado"));

                        cidades.add(cidade);
                    }
                    return cidades;
                }

            });
        } catch (SQLException e) {
        }

        return cidades;

    }

}
