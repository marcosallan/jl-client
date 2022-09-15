package view;

import control.Control;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import jtablemodel.RentToIndividualTableModel;
import jtablemodel.RentToLegalTableModel;
import models.Driver;
import models.IndividualClient;
import models.LegalClient;
import models.RentToIndividual;
import models.RentToLegal;
import models.Vehicle;
import models.VehicleStatusEnum;
import control.Operation;
import emailservice.EmailService;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import models.PaymentWayEnum;
import org.apache.commons.mail.EmailException;

public class MainWindow extends javax.swing.JFrame {
    Control control = null;
    RentToIndividualTableModel rentIndividualTableModel = new RentToIndividualTableModel();
    RentToLegalTableModel rentLegalTableModel = new RentToLegalTableModel();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm:ss");
    DefaultTableCellRenderer centerRenderer;
    EmailService emailService = null;
    
    
    
    public MainWindow() throws IOException, Exception {
        initComponents();
        centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        control = new Control();
        updateVehicleComboBox();
        jTableModelRent.setModel(rentIndividualTableModel);
        buttonGroupRentClient.add(jRadioButtonRentToIndividual);
        buttonGroupRentClient.add(jRadioButtonRentToLegal);
        jRadioButtonRentToIndividual.setSelected(true);
        listRent();
    }
    
    public MainWindow(Control control) throws IOException, Exception {
        initComponents();
        centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        this.control = control;
        updateVehicleComboBox();
        jTableModelRent.setModel(rentIndividualTableModel);
        buttonGroupRentClient.add(jRadioButtonRentToIndividual);
        buttonGroupRentClient.add(jRadioButtonRentToLegal);
        jRadioButtonRentToIndividual.setSelected(true);
        listRent();
    }
    
    public MainWindow(Control control, java.awt.event.ActionEvent evt) throws Exception {
        initComponents();
        centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        this.control = control;
        updateVehicleComboBox();
        jTableModelRent.setModel(rentIndividualTableModel);
        buttonGroupRentClient.add(jRadioButtonRentToIndividual);
        buttonGroupRentClient.add(jRadioButtonRentToLegal);
        jRadioButtonRentToIndividual.setSelected(true);
        jRadioButtonRentToIndividualActionPerformed(evt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRentClient = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModelRent = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabelRentExpectedFinishDate = new javax.swing.JLabel();
        jFormattedTextFieldExpectedFinishDate = new javax.swing.JFormattedTextField();
        jLabelRentSocialId = new javax.swing.JLabel();
        jFormattedTextFieldClientSocialID = new javax.swing.JFormattedTextField();
        jLabelRentCNHDriver = new javax.swing.JLabel();
        jFormattedTextFieldDriverCNH = new javax.swing.JFormattedTextField();
        jLabelVehicleToRent = new javax.swing.JLabel();
        jComboBoxRentVehicle = new javax.swing.JComboBox<>();
        jLabelPaymentWay = new javax.swing.JLabel();
        jComboBoxPaymentWay = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonRentToIndividual = new javax.swing.JRadioButton();
        jRadioButtonRentToLegal = new javax.swing.JRadioButton();
        jButtonFinishRent = new javax.swing.JButton();
        jButtonIncludeRent = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuOptions = new javax.swing.JMenu();
        jMenuItemCRUD = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JL Rent a Car");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/view/icons/car3.png")).getImage());
        setResizable(false);

        jTableModelRent.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableModelRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableModelRent);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabelRentExpectedFinishDate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelRentExpectedFinishDate.setText("Prazo da Locação:");
        jPanel2.add(jLabelRentExpectedFinishDate);

        try {
            jFormattedTextFieldExpectedFinishDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldExpectedFinishDate.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jFormattedTextFieldExpectedFinishDate.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel2.add(jFormattedTextFieldExpectedFinishDate);

        jLabelRentSocialId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelRentSocialId.setText("CPF do Cliente:");
        jPanel2.add(jLabelRentSocialId);

        try {
            jFormattedTextFieldClientSocialID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldClientSocialID.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jFormattedTextFieldClientSocialID.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel2.add(jFormattedTextFieldClientSocialID);

        jLabelRentCNHDriver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelRentCNHDriver.setText("CNH do Motorista:");
        jPanel2.add(jLabelRentCNHDriver);

        try {
            jFormattedTextFieldDriverCNH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDriverCNH.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jFormattedTextFieldDriverCNH.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel2.add(jFormattedTextFieldDriverCNH);

        jLabelVehicleToRent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelVehicleToRent.setText("Veículo para Locação:");
        jPanel2.add(jLabelVehicleToRent);

        jComboBoxRentVehicle.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBoxRentVehicle.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel2.add(jComboBoxRentVehicle);

        jLabelPaymentWay.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPaymentWay.setText("Forma de Pagamento:");
        jPanel2.add(jLabelPaymentWay);

        jComboBoxPaymentWay.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBoxPaymentWay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credito", "Debito" }));
        jComboBoxPaymentWay.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel2.add(jComboBoxPaymentWay);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/jl.png"))); // NOI18N

        jRadioButtonRentToIndividual.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButtonRentToIndividual.setText("Locação para Pessoa Física");
        jRadioButtonRentToIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRentToIndividualActionPerformed(evt);
            }
        });

        jRadioButtonRentToLegal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButtonRentToLegal.setText("Locação para Pessoa Jurídica");
        jRadioButtonRentToLegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRentToLegalActionPerformed(evt);
            }
        });

        jButtonFinishRent.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonFinishRent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/key.png"))); // NOI18N
        jButtonFinishRent.setText("  Finalizar Locação");
        jButtonFinishRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinishRentActionPerformed(evt);
            }
        });

        jButtonIncludeRent.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonIncludeRent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/play-button.png"))); // NOI18N
        jButtonIncludeRent.setText("  Efetuar Locação");
        jButtonIncludeRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncludeRentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButtonIncludeRent)
                        .addGap(48, 48, 48)
                        .addComponent(jButtonFinishRent))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonRentToLegal)
                            .addComponent(jRadioButtonRentToIndividual))))
                .addContainerGap(392, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jRadioButtonRentToIndividual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonRentToLegal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonIncludeRent)
                            .addComponent(jButtonFinishRent))
                        .addGap(70, 70, 70)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuOptions.setText("Opções");
        jMenuOptions.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItemCRUD.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItemCRUD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/database.png"))); // NOI18N
        jMenuItemCRUD.setText("CRUD...");
        jMenuItemCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCRUDActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuItemCRUD);

        jMenuItemExit.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/logout.png"))); // NOI18N
        jMenuItemExit.setText("Sair");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuItemExit);

        jMenuBar.add(jMenuOptions);

        jMenu2.setText("Ajuda");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItemAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/user.png"))); // NOI18N
        jMenuItemAbout.setText("Termo de Uso");
        jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAbout);

        jMenuBar.add(jMenu2);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCRUDActionPerformed
        RegisterWindow registerWindow;
        try {
            registerWindow = new RegisterWindow(control, evt);
            registerWindow.setVisible(true);
        }
        catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jMenuItemCRUDActionPerformed

    private void jButtonIncludeRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncludeRentActionPerformed
        try {
            Date startDate = sdf.parse(sdf.format(new Date()));
            Vehicle vehicle = (Vehicle) jComboBoxRentVehicle.getSelectedItem();
            String expectedFinishStr = jFormattedTextFieldExpectedFinishDate.getText().trim();
            Date expectedFinish = sdf.parse(expectedFinishStr + " " + sdf3.format(startDate));
            String socialId = jFormattedTextFieldClientSocialID.getText().trim();
            String driverCNH = jFormattedTextFieldDriverCNH.getText().trim();
            PaymentWayEnum payment = PaymentWayEnum.valueOf(jComboBoxPaymentWay.getSelectedItem().toString().toUpperCase());
            
            boolean boolDate = "/ /".equals(expectedFinishStr) || startDate.getTime() > expectedFinish.getTime();
            boolDate = boolDate || sdf2.format(startDate).equals(sdf2.format(expectedFinish));
            boolean boolDriverCNH = driverCNH.length() != 11;
            String alert = boolDate ? "Data inválida !" : "CNH inválida !";
            
            switch(String.valueOf(boolDate || boolDriverCNH)) {
                case "true":
                    JOptionPane.showMessageDialog(rootPane, alert);
                    break;
                case "false":
                    boolean bool = true;
                    Driver driver = new Driver();
                    driver.setCnh(driverCNH);
                    Driver driverObject = new Driver();
                    String[] driverStr = control.receiveFromServer(new Driver(), Operation.READ);
                    for (String objectStr : driverStr) {
                        if (objectStr.isEmpty()) {
                            break;
                        }
                        driverObject.mount(objectStr);
                        if (driver.getCnh().equals(driverObject.getCnh())) {
                            bool = false;
                            driver.mount(objectStr);
                            break;
                        }
                    }
                    if (bool) {
                        JOptionPane.showMessageDialog(rootPane, "Motorista não cadastrado !");
                        break;
                    }
                    if (jRadioButtonRentToIndividual.isSelected()) {
                        boolean boolSocialId = socialId.length() != 11;
                        switch(String.valueOf(boolSocialId)) {
                            case "true":
                                JOptionPane.showMessageDialog(rootPane, "CPF inválido !");
                                break;
                            case "false":
                                bool = true;
                                String socialIdFormat = socialId.substring(0, 3) + ".";
                                socialIdFormat += socialId.substring(3, 6) + ".";
                                socialIdFormat += socialId.substring(6, 9) + "-";
                                socialIdFormat += socialId.substring(9);
                                
                                IndividualClient individualObject = new IndividualClient();
                                IndividualClient individual = new IndividualClient();
                                individual.setSocialId(socialIdFormat);
                                
                                String[] vectIndividualClient = control.receiveFromServer(new IndividualClient(), Operation.READ);
                                for (String objectStr : vectIndividualClient) {
                                    if (objectStr.isEmpty()) {
                                        break;
                                    }
                                    individualObject.mount(objectStr);
                                    if (individual.getSocialId().equals(individualObject.getSocialId())) {
                                        bool = false;
                                        individual.mount(objectStr);
                                        break;
                                    }
                                }
                                jRadioButtonRentToIndividualActionPerformed(evt);
                                if (bool) {
                                    JOptionPane.showMessageDialog(rootPane, "Cliente não cadastrado !");
                                    break;
                                }
                                RentToIndividual rent = new RentToIndividual(startDate, expectedFinish, payment, vehicle, individual, driver);
                                rent.setFinishDate(rent.getExpectedFinishDate());
                                control.includeData(rent, Operation.INCLUDE);
                                vehicle.setVehicleStatus(VehicleStatusEnum.INDISPONIVEL);
                                control.updateData(vehicle, Operation.UPDATE);
                                updateVehicleComboBox();
                                listRent();
                                JOptionPane.showMessageDialog(rootPane, "Locação efetuada !");
                                String[] datasToEmail = {jTableModelRent.getValueAt(rentIndividualTableModel.getRowCount() - 1, 0).toString(),
                                                         vehicle.getModel().getDescription() + " - " + vehicle.getCategory().getDescription(),
                                                         sdf.format(startDate), sdf.format(expectedFinish), String.valueOf(rent.getExpectedRentValue())};
                                emailService = new EmailService();
                                emailService.sendStartRentMsg(individual.getContact().getEmail(), datasToEmail);
                                break;
                        }
                    }
                    else {
                        boolean boolSocialId = socialId.length() != 14;
                        switch(String.valueOf(boolSocialId)) {
                            case "true":
                                JOptionPane.showMessageDialog(rootPane, "CNPJ inválido !");
                                break;
                            case "false":
                                bool = true;
                                String socialIdFormat = socialId.substring(0, 2) + ".";
                                socialIdFormat += socialId.substring(2, 5) + ".";
                                socialIdFormat += socialId.substring(5, 8) + "/";
                                socialIdFormat += socialId.substring(8, 12) + "-";
                                socialIdFormat += socialId.substring(12);
                                
                                LegalClient legalObject = new LegalClient();
                                LegalClient legal = new LegalClient();
                                legal.setSocialId(socialIdFormat);
                                
                                String[] vectLegalClient = control.receiveFromServer(new LegalClient(), Operation.READ);
                                for (String objectStr : vectLegalClient) {
                                    if (objectStr.isEmpty()) {
                                        break;
                                    }
                                    legalObject.mount(objectStr);
                                    if (legal.getSocialId().equals(legalObject.getSocialId())) {
                                        bool = false;
                                        legal.mount(objectStr);
                                        break;
                                    }
                                }
                                jRadioButtonRentToLegalActionPerformed(evt);
                                if (bool) {
                                    JOptionPane.showMessageDialog(rootPane, "Cliente não cadastrado !");
                                    break;
                                }
                                
                                RentToLegal rent = new RentToLegal(startDate, expectedFinish, payment, vehicle, legal, driver);
                                rent.setFinishDate(rent.getExpectedFinishDate());
                                control.includeData(rent, Operation.INCLUDE);
                                vehicle.setVehicleStatus(VehicleStatusEnum.INDISPONIVEL);
                                control.updateData(vehicle, Operation.UPDATE);
                                updateVehicleComboBox();
                                listRent();
                                JOptionPane.showMessageDialog(rootPane, "Locação efetuada !");
                                String[] datasToEmail = {jTableModelRent.getValueAt(rentLegalTableModel.getRowCount() - 1, 0).toString(),
                                                         vehicle.getModel().getDescription() + " - " + vehicle.getCategory().getDescription(),
                                                         sdf.format(startDate), sdf.format(expectedFinish), String.valueOf(rent.getExpectedRentValue())};
                                emailService = new EmailService();
                                emailService.sendStartRentMsg(legal.getContact().getEmail(), datasToEmail);
                                break;
                        }
                    }
                    break;
            }
            
        }
        catch (EmailException ee) {
            JOptionPane.showMessageDialog(rootPane, "O E-mail deste cliente está irregular !");
        }
        catch(IllegalStateException ise) {
            throw ise;
        }
        catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(rootPane, "Não há veículo disponível para locação !");
        }
        catch (ParseException e) {
            JOptionPane.showMessageDialog(rootPane, "Data inválida !");
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonIncludeRentActionPerformed
    
    private void listRent() throws IOException, Exception {
        try {
            if (jRadioButtonRentToIndividual.isSelected()) {
                rentIndividualTableModel = new RentToIndividualTableModel();
                jTableModelRent.setModel(rentIndividualTableModel);
                ((DefaultTableCellRenderer) jTableModelRent.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
                
                int[] size = {1, 45, 45, 45, 1, 1, 1, 85, 50, 1};
                
                for (int i = 0; i < rentIndividualTableModel.getColumnCount(); i++) {
                    jTableModelRent.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    jTableModelRent.getColumnModel().getColumn(i).setMinWidth(1);
                    jTableModelRent.getColumnModel().getColumn(i).setPreferredWidth(size[i]);
                }
                
                String[] vectStr = control.receiveFromServer(new RentToIndividual(), Operation.READ);
                for (String str : vectStr) {
                    if (str.isEmpty()) {
                        break;
                    }
                    RentToIndividual rent = new RentToIndividual();
                    rent.mount(str);
                    rentIndividualTableModel.addRow(rent);
                }
            }
            else {
                rentLegalTableModel = new RentToLegalTableModel();
                jTableModelRent.setModel(rentLegalTableModel);
                ((DefaultTableCellRenderer) jTableModelRent.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
                
                int[] size = {1, 45, 45, 45, 1, 1, 1, 85, 50, 1};
                
                for (int i = 0; i < rentIndividualTableModel.getColumnCount(); i++) {
                    jTableModelRent.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    jTableModelRent.getColumnModel().getColumn(i).setMinWidth(1);
                    jTableModelRent.getColumnModel().getColumn(i).setPreferredWidth(size[i]);
                }
                
                String[] vecStr = control.receiveFromServer(new RentToLegal(), Operation.READ);
                for (String str : vecStr) {
                    if (str.isEmpty()) {
                        break;
                    }
                    RentToLegal rent = new RentToLegal();
                    rent.mount(str);
                    rentLegalTableModel.addRow(rent);
                }
            }
            
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
    }
    
    private void clearFieldsRent() {
        jFormattedTextFieldExpectedFinishDate.setText(null);
        jFormattedTextFieldClientSocialID.setText(null);
        jFormattedTextFieldDriverCNH.setText(null);
    }
    
    private void jRadioButtonRentToIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRentToIndividualActionPerformed
        jLabelRentSocialId.setText("CPF do Cliente:");
        clearFieldsRent();
        try {
            jFormattedTextFieldClientSocialID.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###########")));
            listRent();
        }
        catch (ParseException ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButtonRentToIndividualActionPerformed

    private void jRadioButtonRentToLegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRentToLegalActionPerformed
        jLabelRentSocialId.setText("CNPJ do Cliente:");
        clearFieldsRent();
        try {
            jFormattedTextFieldClientSocialID.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##############")));
            listRent();
        }
        catch (ParseException ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButtonRentToLegalActionPerformed

    private void jButtonFinishRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinishRentActionPerformed
        try {
            int index = jTableModelRent.getSelectedRow();
            boolean boolDate = "-".equals(jTableModelRent.getValueAt(index, 3));
            
            if (boolDate) {
                Date finishDate = sdf.parse(sdf.format(new Date()));
                Vehicle vehicle = new Vehicle();
                String[] vehicleVect = control.receiveFromServer(new Vehicle(), Operation.READ);
                Driver driver = new Driver();
                String[] driverVect = control.receiveFromServer(new Driver(), Operation.READ);
                
                if (jRadioButtonRentToIndividual.isSelected()) {
                    int rentId = Integer.parseInt(rentIndividualTableModel.getValueAt(index, 0).toString());
                    Date startDate = sdf.parse(rentIndividualTableModel.getValueAt(index, 1).toString());
                    Date expectedFinishDate = sdf.parse(rentIndividualTableModel.getValueAt(index, 2).toString());
                    int vehicleId = Integer.parseInt(rentIndividualTableModel.getValueAt(index, 4).toString());
                    int clientId = Integer.parseInt(rentIndividualTableModel.getValueAt(index, 5).toString());
                    int driverId = Integer.parseInt(rentIndividualTableModel.getValueAt(index, 6).toString());
                    PaymentWayEnum payment = PaymentWayEnum.valueOf(rentIndividualTableModel.getValueAt(index, 9).toString().toUpperCase());

                    for (String vehicleStr : vehicleVect) {
                        if (vehicleStr.isEmpty()) {
                            break;
                        }
                        vehicle.mount(vehicleStr);
                        if (vehicle.getId() == vehicleId) {
                            break;
                        }
                    }

                    IndividualClient individual = new IndividualClient();
                    String[] individualVect = control.receiveFromServer(new IndividualClient(), Operation.READ);
                    for (String individualStr : individualVect) {
                        if(individualStr.isEmpty()) {
                            break;
                        }
                        individual.mount(individualStr);
                        if (individual.getId() == clientId) {
                            break;
                        }
                    }

                    for (String driverStr : driverVect) {
                        if (driverStr.isEmpty()) {
                            break;
                        }
                        driver.mount(driverStr);
                        if (driver.getId() == driverId) {
                            break;
                        }
                    }

                    RentToIndividual rentToIndividual = new RentToIndividual(rentId, startDate, expectedFinishDate, payment, vehicle, individual, driver);
                    rentToIndividual.setFinishDate(finishDate);
                    control.updateData(rentToIndividual, Operation.UPDATE);
                    vehicle.setVehicleStatus(VehicleStatusEnum.DISPONIVEL);
                    control.updateData(vehicle, Operation.UPDATE);
                    updateVehicleComboBox();
                    listRent();
                    JOptionPane.showMessageDialog(rootPane, "Locação finalizada !");
                    
                    String[] datasToEmail = {String.valueOf(rentId), vehicle.getModel().getDescription() + " - " + vehicle.getCategory().getDescription(),
                                             sdf.format(startDate), sdf.format(finishDate), String.valueOf(rentToIndividual.getRentValue())};
                    
                    emailService = new EmailService();
                    emailService.sendFinishRentMsg(individual.getContact().getEmail(), datasToEmail);
                }
                else {
                    int rentId = Integer.parseInt(rentLegalTableModel.getValueAt(index, 0).toString());
                    Date startDate = sdf.parse(rentLegalTableModel.getValueAt(index, 1).toString());
                    Date expectedFinishDate = sdf.parse(rentLegalTableModel.getValueAt(index, 2).toString());
                    int vehicleId = Integer.parseInt(rentLegalTableModel.getValueAt(index, 4).toString());
                    int clientId = Integer.parseInt(rentLegalTableModel.getValueAt(index, 5).toString());
                    int driverId = Integer.parseInt(rentLegalTableModel.getValueAt(index, 6).toString());
                    PaymentWayEnum payment = PaymentWayEnum.valueOf(rentLegalTableModel.getValueAt(index, 9).toString().toUpperCase());

                    for (String vehicleStr : vehicleVect) {
                        if (vehicleStr.isEmpty()) {
                            break;
                        }
                        vehicle.mount(vehicleStr);
                        if (vehicle.getId() == vehicleId) {
                            break;
                        }
                    }

                    LegalClient legal = new LegalClient();
                    String[] legalVect = control.receiveFromServer(new LegalClient(), Operation.READ);
                    for (String legalStr : legalVect) {
                        if(legalStr.isEmpty()) {
                            break;
                        }
                        legal.mount(legalStr);
                        if (legal.getId() == clientId) {
                            break;
                        }
                    }

                    for (String driverStr : driverVect) {
                        if (driverStr.isEmpty()) {
                            break;
                        }
                        driver.mount(driverStr);
                        if (driver.getId() == driverId) {
                            break;
                        }
                    }

                    RentToLegal rentToLegal = new RentToLegal(rentId, startDate, expectedFinishDate, payment, vehicle, legal, driver);
                    rentToLegal.setFinishDate(finishDate);
                    control.updateData(rentToLegal, Operation.UPDATE);
                    vehicle.setVehicleStatus(VehicleStatusEnum.DISPONIVEL);
                    control.updateData(vehicle, Operation.UPDATE);
                    updateVehicleComboBox();
                    listRent();
                    JOptionPane.showMessageDialog(rootPane, "Locação finalizada !");
                    
                    String[] datasToEmail = {String.valueOf(rentId), vehicle.getModel().getDescription() + " - " + vehicle.getCategory().getDescription(),
                                             sdf.format(startDate), sdf.format(finishDate), String.valueOf(rentToLegal.getRentValue())};
                    
                    emailService = new EmailService();
                    emailService.sendFinishRentMsg(legal.getContact().getEmail(), datasToEmail);
                }
            }
            if(!boolDate) {
                JOptionPane.showMessageDialog(rootPane, "Esta locação não está em ocorrência !");
            }
        }
        catch (EmailException ee) {
            JOptionPane.showMessageDialog(rootPane, "O E-mail deste cliente está irregular !");
        }
        catch(IllegalStateException ise) {
            throw ise;
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            JOptionPane.showMessageDialog(rootPane, "Nenhum item de locação Selecionado !");
        }
        catch (ParseException | IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonFinishRentActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutActionPerformed
        try {
            URI link = new URI("https://bit.ly/2RlfRcB");
            Desktop.getDesktop().browse(link);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemAboutActionPerformed
    
    private void updateVehicleComboBox() {
        try {
            String[] vectStr = control.receiveFromServer(new Vehicle(), Operation.READ);
            jComboBoxRentVehicle.removeAllItems();
            for (String str : vectStr) {
                if (!str.isEmpty()) {
                    Vehicle vehicle = new Vehicle();
                    vehicle.mount(str);
                    if (vehicle.getVehicleStatus().equals(VehicleStatusEnum.valueOf("DISPONIVEL"))) {
                        jComboBoxRentVehicle.addItem(vehicle);
                    }
                }
            }
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainWindow().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupRentClient;
    private javax.swing.JButton jButtonFinishRent;
    private javax.swing.JButton jButtonIncludeRent;
    private javax.swing.JComboBox<String> jComboBoxPaymentWay;
    private javax.swing.JComboBox<Vehicle> jComboBoxRentVehicle;
    private javax.swing.JFormattedTextField jFormattedTextFieldClientSocialID;
    private javax.swing.JFormattedTextField jFormattedTextFieldDriverCNH;
    private javax.swing.JFormattedTextField jFormattedTextFieldExpectedFinishDate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPaymentWay;
    private javax.swing.JLabel jLabelRentCNHDriver;
    private javax.swing.JLabel jLabelRentExpectedFinishDate;
    private javax.swing.JLabel jLabelRentSocialId;
    private javax.swing.JLabel jLabelVehicleToRent;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemCRUD;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenu jMenuOptions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonRentToIndividual;
    private javax.swing.JRadioButton jRadioButtonRentToLegal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableModelRent;
    // End of variables declaration//GEN-END:variables
}
