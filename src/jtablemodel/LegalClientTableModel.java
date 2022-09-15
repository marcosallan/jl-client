// Cliente

package jtablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import models.LegalClient;

public class LegalClientTableModel extends AbstractTableModel {
    private List<LegalClient> legalClient = null;
    private final String[] columns = {"Id", "Nome Fantasia", "Razão Social", "CNPJ", "Celular", "Telefone", "E-Mail", "Logradouro", "Bairro", "N° Estabelecimento"};

    public LegalClientTableModel() {
        this.legalClient = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return legalClient.size();
    }
    
    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return legalClient.get(rowIndex).getId();
            case 1:
                return legalClient.get(rowIndex).getSocialName();
            case 2:
                return legalClient.get(rowIndex).getName();
            case 3:
                return legalClient.get(rowIndex).getSocialId();
            case 4:
                return legalClient.get(rowIndex).getContact().getCellPhone();
            case 5:
                return legalClient.get(rowIndex).getContact().getTelephone();
            case 6:
                return legalClient.get(rowIndex).getContact().getEmail();
            case 7:
                return legalClient.get(rowIndex).getAdress().getPlace();
            case 8:
                return legalClient.get(rowIndex).getAdress().getNeighborhood();
            case 9:
                return legalClient.get(rowIndex).getAdress().getNumber();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public void addRow(LegalClient legalClient) {
        this.legalClient.add(legalClient);
        this.fireTableDataChanged(); // Atualiza Table Model
    }
}
