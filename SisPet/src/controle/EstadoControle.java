/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.EstadoDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.EstadoModelo;

/**
 *
 * @author Bruno
 */
public class EstadoControle {

    List<EstadoModelo> listaEstados;
    EstadoModelo estado;

    public EstadoControle() {
        listaEstados = new ArrayList<>();
    }

    public List<EstadoModelo> criaListEstados() {
        
        EstadoDAO dao = new EstadoDAO();
        return dao.listaTodosEstados();
        
    }

}
