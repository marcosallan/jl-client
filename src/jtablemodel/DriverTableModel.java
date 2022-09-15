// Cliente

package jtablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import models.Driver;

public class DriverTableModel extends AbstractTableModel {
    private List<Driver> driverData = null;
    private final String[] columns = {"Id", "Nome", "Sexo", "CPF", "CNH"};

    public DriverTableModel() {
        this.driverData = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return driverData.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return driverData.get(rowIndex).getId();
            case 1:
                return driverData.get(rowIndex).getName();
            case 2:
                return driverData.get(rowIndex).getGender().getGender();
            case 3:
                return driverData.get(rowIndex).getCpf();
            case 4:
                return driverData.get(rowIndex).getCnh();
            case 5:
                return driverData.get(rowIndex).getCnhPath();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public void addRow(Driver driver) {
        this.driverData.add(driver);
        this.fireTableDataChanged(); // Atualiza Table Model
    }
}
