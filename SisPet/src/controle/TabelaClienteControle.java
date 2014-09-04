/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.TabelaClienteDAO;
import java.util.List;
import modelo.ClienteModelo;
import modelo.TabelaClienteModelo;

/**
 *
 * @author Bruno
 */
public class TabelaClienteControle {

    TabelaClienteDAO dao;
    private TabelaClienteModelo tableModel;

    public TabelaClienteControle() {
        dao = new TabelaClienteDAO();
    }

    public TabelaClienteModelo inicializaTableModel() {
        List<ClienteModelo> clientes = dao.listaTodosClientes();
        tableModel = new TabelaClienteModelo(clientes);
        return tableModel;/*
        frm.getTbPacientes().setModel(tableModel);
        frm.getTbPacientes()
                .getSelectionModel()
                .addListSelectionListener(this);
    */}
}
