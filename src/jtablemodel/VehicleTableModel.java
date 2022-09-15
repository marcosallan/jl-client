// Cliente

package jtablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import models.Vehicle;

public class VehicleTableModel extends AbstractTableModel {
    private List<Vehicle> vehicleData = null;
    private final String[] columns = {"Id", "Placa", "Modelo", "Id do Modelo", "Categoria", "Kilometragem", "Status"};

    public VehicleTableModel() {
        this.vehicleData = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return vehicleData.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return vehicleData.get(rowIndex).getId();
            case 1:
                return vehicleData.get(rowIndex).getVehiclePlate();
            case 2:
                return vehicleData.get(rowIndex).getModel().getDescription();
            case 3:
                return vehicleData.get(rowIndex).getModel().getId();
            case 4:
                return vehicleData.get(rowIndex).getCategory().getDescription();
            case 5:
                return String.format("%.2f", vehicleData.get(rowIndex).getLastMileage());
            case 6:
                return vehicleData.get(rowIndex).getVehicleStatus().getVehicleStatus();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public void addRow(Vehicle vehicle) {
        this.vehicleData.add(vehicle);
        this.fireTableDataChanged(); // Atualiza Table Model
    }
}
