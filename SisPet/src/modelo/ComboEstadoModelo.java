/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Bruno
 */
public class ComboEstadoModelo extends AbstractListModel<Object> implements ComboBoxModel<Object> {

    private List<EstadoModelo> listaEstados;
    private EstadoModelo selectedEstado;
    private final static int FIRSTINDEX = 0;

    public ComboEstadoModelo() {
        this.listaEstados = new ArrayList<EstadoModelo>();
    }

    public ComboEstadoModelo(List<EstadoModelo> listaEstados) {
        this();
        this.listaEstados.addAll(listaEstados);
        if (getSize() > 0) {
            setSelectedItem(this.listaEstados.get(FIRSTINDEX));
        }
    }

    @Override
    public Object getElementAt(int index) {
        return listaEstados.get(index);
    }

    @Override
    public int getSize() {
        return listaEstados.size();
    }

    @Override
    public Object getSelectedItem() {
        return selectedEstado;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedEstado = (EstadoModelo) anItem;
    }

    public void addEstado(EstadoModelo estado) {
        listaEstados.add(estado);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(listaEstados.get(getSize() - 1));
    }
    
    public void addListEstado(List<EstadoModelo> estados) {
        int primeiraLinha = getSize();
        listaEstados.addAll(estados);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha + estados.size());
        setSelectedItem(listaEstados.get(getSize() - 1));
    }

    public void removeEstado() {
        listaEstados.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(listaEstados.get(FIRSTINDEX));
    }

    public void clear() {
        listaEstados.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }

}
