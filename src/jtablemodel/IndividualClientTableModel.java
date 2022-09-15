// Cliente

package jtablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import models.IndividualClient;

public class IndividualClientTableModel extends AbstractTableModel {
    private List<IndividualClient> individualClient = null;
    private final String[] columns = {"Id", "Nome", "Idade", "CPF", "Celular", "Telefone", "E-Mail", "Logradouro", "Bairro", "N° Residência", "Sexo"};

    public IndividualClientTableModel() {
        this.individualClient = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return individualClient.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return individualClient.get(rowIndex).getId();
            case 1:
                return individualClient.get(rowIndex).getName();
            case 2:
                return individualClient.get(rowIndex).getAge();
            case 3:
                return individualClient.get(rowIndex).getSocialId();
            case 4:
                return individualClient.get(rowIndex).getContact().getCellPhone();
            case 5:
                return individualClient.get(rowIndex).getContact().getTelephone();
            case 6:
                return individualClient.get(rowIndex).getContact().getEmail();
            case 7:
                return individualClient.get(rowIndex).getAdress().getPlace();
            case 8:
                return individualClient.get(rowIndex).getAdress().getNeighborhood();
            case 9:
                return individualClient.get(rowIndex).getAdress().getNumber();
            case 10:
                return individualClient.get(rowIndex).getGender().getGender();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public void addRow(IndividualClient individualClient) {
        this.individualClient.add(individualClient);
        this.fireTableDataChanged(); // Atualiza Table Model
    }
}
