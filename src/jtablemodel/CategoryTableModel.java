// Cliente

package jtablemodel;

import models.Category;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CategoryTableModel extends AbstractTableModel {
    private List<Category> categoryData = null;
    private final String[] columns = {"Id", "Descrição", "Valor da Locação [R$]"};

    public CategoryTableModel() {
        this.categoryData = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return categoryData.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return categoryData.get(rowIndex).getId();
            case 1:
                return categoryData.get(rowIndex).getDescription();
            case 2:
                return String.format("%.2f", categoryData.get(rowIndex).getRentValue());
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public void addRow(Category category) {
        this.categoryData.add(category);
        this.fireTableDataChanged(); // Atualiza Table Model
    }
}
