// Cliente

package jtablemodel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import models.RentToIndividual;

public class RentToIndividualTableModel extends AbstractTableModel {
    SimpleDateFormat sdf;
    private List<RentToIndividual> rentData = null;
    private final String[] columns = {"Id", "Instante da Locação", "Devolução Prevista", "Instante da Devolução", "Id do veículo",
                                      "Id do Cliente", "Id do Motorista", "Pagamento Previsto / Calção [R$]", "Pagamento Final [R$]", "Pagamento"};
    

    public RentToIndividualTableModel() {
        this.rentData = new ArrayList<>();
        sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    }
    
    @Override
    public int getRowCount() {
        return rentData.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            switch(columnIndex) {
                case 0:
                    return rentData.get(rowIndex).getId();
                case 1:
                    return sdf.format(rentData.get(rowIndex).getStartDate());
                case 2:
                    return sdf.format(rentData.get(rowIndex).getExpectedFinishDate());
                case 3:
                    boolean boolDate = rentData.get(rowIndex).getFinishDate().equals(rentData.get(rowIndex).getExpectedFinishDate());
                    if (boolDate) {
                        return "-";
                    }
                    else {
                        return sdf.format(rentData.get(rowIndex).getFinishDate());
                    }
                
                case 4:
                    return rentData.get(rowIndex).getVehicle().getId();
                case 5:
                    return rentData.get(rowIndex).getClient().getId();
                case 6:
                    return rentData.get(rowIndex).getDriver().getId();
                case 7:
                    String expectedRentValue = String.format("%.2f", rentData.get(rowIndex).getExpectedRentValue());
                    expectedRentValue = expectedRentValue.replace(".", ",");
                    return expectedRentValue;
                case 8:
                    boolean boolValue = rentData.get(rowIndex).getFinishDate().equals(rentData.get(rowIndex).getExpectedFinishDate());
                    if (boolValue) {
                        return "-";
                    }
                    else {
                        String rentValue = String.format("%.2f", rentData.get(rowIndex).getRentValue());
                        expectedRentValue = rentValue.replace(".", ",");
                        return expectedRentValue;
                    }
                case 9:
                    return rentData.get(rowIndex).getPayment().getPaymentWay();
                default:
                    return null;
            }
        }
        catch (ParseException ex) {
            Logger.getLogger(RentToIndividualTableModel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public void addRow(RentToIndividual rent) {
        this.rentData.add(rent);
        this.fireTableDataChanged(); // Atualiza Table Model
    }
}
