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
public class ComboCidadeModelo extends AbstractListModel<Object> implements ComboBoxModel<Object> {
        private List<CidadeModelo> listaCidades;
    private CidadeModelo selectedCidade;
    private final static int FIRSTINDEX = 0;

    public ComboCidadeModelo() {
        this.listaCidades = new ArrayList<CidadeModelo>();
    }

    public ComboCidadeModelo(List<CidadeModelo> listaCidades) {
        this();
        this.listaCidades.addAll(listaCidades);
        if (getSize() > 0) {
            setSelectedItem(this.listaCidades.get(FIRSTINDEX));
        }
    }

    @Override
    public Object getElementAt(int index) {
        return listaCidades.get(index);
    }

    @Override
    public int getSize() {
        return listaCidades.size();
    }

    @Override
    public Object getSelectedItem() {
        return selectedCidade;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedCidade = (CidadeModelo) anItem;
    }

    public void addCidade(CidadeModelo cidade) {
        listaCidades.add(cidade);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(listaCidades.get(getSize() - 1));
    }

    public void addListCidade(List<CidadeModelo> cidades) {
        int primeiraLinha = getSize();
        listaCidades.addAll(cidades);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha + cidades.size());
        setSelectedItem(listaCidades.get(getSize() - 1));
    }

    public void removeCidade() {
        listaCidades.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(listaCidades.get(FIRSTINDEX));
    }

    public void clear() {
        listaCidades.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }

    
}
