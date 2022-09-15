// Cliente

package jtablemodel;

import models.Model;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableModel extends AbstractTableModel {
    private List<Model> modelData = null;
    private final String[] columns = {"Id", "Descrição", "Ano", "Cor", "Marca"};

    public ModelTableModel() {
        this.modelData = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return modelData.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return modelData.get(rowIndex).getId();
            case 1:
                return modelData.get(rowIndex).getDescription();
            case 2:
                return modelData.get(rowIndex).getYear();
            case 3:
                return modelData.get(rowIndex).getColor();
            case 4:
                return modelData.get(rowIndex).getBrand().getName();
            case 5:
                return modelData.get(rowIndex).getPicturePath();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public void addRow(Model model) {
        this.modelData.add(model);
        this.fireTableDataChanged(); // Atualiza Table Model
    }
}
