/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.CidadeDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.CidadeModelo;

/**
 *
 * @author Bruno
 */
public class CidadeControle {

    List<CidadeModelo> listaCidades;
    CidadeModelo cidade;

    public CidadeControle() {
        listaCidades = new ArrayList<>();
    }

    public List<CidadeModelo> criaListCidades(String id) {
        
        CidadeDAO dao = new CidadeDAO();
        return dao.listaTodosCidades(id);
        
    }

}
