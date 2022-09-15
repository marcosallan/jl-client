// Cliente

package jtablemodel;

import models.Brand;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class BrandTableModel extends AbstractTableModel {
    private List<Brand> brandData = null;
    private final String[] columns = {"Id", "Nome da Marca"};
    
    public BrandTableModel() {
        this.brandData = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return brandData.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return brandData.get(rowIndex).getId();
            case 1:
                return brandData.get(rowIndex).getName();
            case 2:
                return brandData.get(rowIndex).getIconPath();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public void addRow(Brand brand) {
        this.brandData.add(brand);
        this.fireTableDataChanged(); // Atualiza Table Model
    }
}
