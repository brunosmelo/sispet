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
import modelo.EstadoModelo;

/**
 *
 * @author Bruno
 */
public class EstadoDAO {

    List<EstadoModelo> listaEstados;
    EstadoModelo estado;
    Instrucao ins;

    public EstadoDAO() {
        listaEstados = new ArrayList<>();
        ins = new Instrucao();
    }

    public List<EstadoModelo> listaTodosEstados() {

        final List<EstadoModelo> estados = new ArrayList<EstadoModelo>();

        try {

            ins.executePreparedQuery("select * from estados", new QueryMapper<EstadoModelo>() {

                @Override
                public List<EstadoModelo> mapping(ResultSet rset) throws SQLException {
                    while (rset.next()) {
                        EstadoModelo estado = new EstadoModelo();
                        estado.setCodigo(rset.getInt("id_estado"));
                        estado.setNome(rset.getString("nome_estado"));
                        estado.setSigla(rset.getString("sigla_estado"));

                        estados.add(estado);
                    }
                    return estados;
                }

            });
        } catch (SQLException e) {
        }

        return estados;

    }

}
