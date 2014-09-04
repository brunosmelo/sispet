/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bruno
 */
public class TabelaClienteModelo extends AbstractTableModel{
    
    
    private List<ClienteModelo> clientes;
    private List<String> colunas;
    
    public TabelaClienteModelo(List<ClienteModelo> cliente) {
     this.clientes = cliente;
     this.colunas =  Arrays.asList( "Id", "Nome","CPF" );
    }

    
    
    
    public List<ClienteModelo> getClientes() {
        return clientes;
    }

    public void setPacientes(List<ClienteModelo> clientes) {
        this.clientes = clientes;
    }
    
    
    
    
    
    
    
        @Override
    public String getColumnName(int column) {
        return colunas.get(column);
    }
    
    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        ClienteModelo cliente = clientes.get(rowIndex);
        switch(columnIndex) {
            case 0: return cliente.getCodigo();
            case 1: return cliente.getNome();
            case 2: return cliente.getCpf();
        }
        return null;
        
    }
    
    
    
    

    
    

    
}
