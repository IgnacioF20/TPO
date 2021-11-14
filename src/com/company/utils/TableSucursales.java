package com.company.utils;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableSucursales extends AbstractTableModel {
    class Sucursal{
        private String numero;
        private String dirección;
        private String responsableTecnico;

        public Sucursal(String numero, String dirección, String responsableTecnico){
            this.numero = numero;
            this.dirección = dirección;
            this.responsableTecnico = responsableTecnico;
        }
        public String getNumero() { return this.numero;}
        public String getDirección() {return this.dirección;}
        public String getResponsableTecnico() {return this.responsableTecnico;}
    }

    private List<Sucursal> sucursales = new ArrayList<Sucursal>();

    protected String[] columnNames = new String[] {"numero", "dirección", "responsableTecnico"};
    protected Class[] columnClasses = new Class[] {String.class, String.class, String.class};

    public String getColumnName(int col){ return columnNames[col];}
    public Class getColumnClass(int col){ return columnClasses[col];}

    public int getRowCount() {return sucursales.size();}

    public int getColumnCount() {return this.columnNames.length;}

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: return sucursales.get(rowIndex).getNumero();
            case 1: return sucursales.get(rowIndex).getDirección();
            case 2: return sucursales.get(rowIndex).getResponsableTecnico();
            default: return null;
        }
    }
    public int add(String numero, String dirección, String responsableTecnico){
        sucursales.add(new Sucursal(numero, dirección, responsableTecnico));
        return sucursales.size() -1;
    }
}
