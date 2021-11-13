package com.company.utils;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableModel extends AbstractTableModel {

    private List<TestPaciente> lista = new ArrayList<TestPaciente>();


    protected String[] columnNames = new String[] {"DNI", "Practica", "Valor Critico"};
    protected Class[] columnClasses = new Class[] {String.class, String.class, String.class};

    public String getColumnName(int col) {
        return columnNames[col];
    }
    public Class getColumnClass(int col){
        return columnClasses[col];
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: return lista.get(rowIndex).getDni();
            case 1: return lista.get(rowIndex).getPractica();
            case 2: return lista.get(rowIndex).getValor_critico();
            default: return null;
        }
    }
    public int add(String dni, String practica, String valor_critico){
        lista.add(new TestPaciente(dni, practica, valor_critico));
        return lista.size() -1;
    }
}
