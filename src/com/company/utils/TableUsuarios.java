package com.company.utils;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableUsuarios extends AbstractTableModel {

    class Usuario {
        private String dni;
        private String nombre;

        public Usuario(String dni, String nombre){
            this.dni = dni;
            this.nombre = nombre;
        }

        public String getDni() {
            return this.dni;
        }
        public String getNombre() {
            return this.nombre;
        }
    }

    private List<Usuario> usuarios = new ArrayList<Usuario>();

    protected String[] columnNames = new String[] {"DNI", "Nombre"};
    protected Class[] columnClasses = new Class[] {String.class, String.class};

    public String getColumnName(int col) {
        return columnNames[col];
    }
    public Class getColumnClass(int col){
        return columnClasses[col];
    }

    public int getRowCount() {
        return usuarios.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: return usuarios.get(rowIndex).getDni();
            case 1: return usuarios.get(rowIndex).getNombre();
            default: return null;
        }
    }
    public int add(String dni, String nombre){
        usuarios.add(new Usuario(dni, nombre));
        return usuarios.size() -1;
    }



}
