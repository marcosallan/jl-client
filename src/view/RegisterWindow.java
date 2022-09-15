package view;

import models.Brand;
import control.Control;
import control.Operation;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import jtablemodel.BrandTableModel;
import jtablemodel.CategoryTableModel;
import jtablemodel.DriverTableModel;
import jtablemodel.IndividualClientTableModel;
import jtablemodel.LegalClientTableModel;
import jtablemodel.ModelTableModel;
import jtablemodel.VehicleTableModel;
import models.Adress;
import models.Category;
import models.Client;
import models.Contact;
import models.Driver;
import models.GenderEnum;
import models.IndividualClient;
import models.LegalClient;
import models.Model;
import models.Vehicle;
import models.VehicleStatusEnum;

public class RegisterWindow extends javax.swing.JFrame {
    Control control;
    MainWindow mainWindow;
    BrandTableModel brandTableModel = new BrandTableModel();
    CategoryTableModel categoryTableModel = new CategoryTableModel();
    ModelTableModel modelTableModel = new ModelTableModel();
    DriverTableModel driverTableModel = new DriverTableModel();
    VehicleTableModel vehicleTableModel = new VehicleTableModel();
    IndividualClientTableModel individualClientTableModel = new IndividualClientTableModel();
    LegalClientTableModel legalClientTableModel = new LegalClientTableModel();
    SimpleDateFormat sdf;
    DefaultTableCellRenderer centerRenderer;
    
    public RegisterWindow() {
        initComponents();
    }
    
    public RegisterWindow(Control control) {
        initComponents();
        this.control = control;
    }
    
    public RegisterWindow(Control control, java.awt.event.ActionEvent evt) throws Exception {
        initComponents();
        centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        this.control = control;
        this.mainWindow = new MainWindow(control, evt);
        this.sdf = new SimpleDateFormat("dd/MM/yyyy");
        jTextFieldCNHPicture.setEnabled(false);
        jTextFieldBrandIconPath.setEnabled(false);
        jTextFieldModelPicture.setEditable(false);
        buttonGroupClientType.add(jRadioButtonIndividual);
        buttonGroupClientType.add(jRadioButtonLegal);
        jRadioButtonIndividual.setSelected(true);
        jRadioButtonIndividualActionPerformed(evt);
        listBrand();
        listCategory();
        listModel();
        listDriver();
        listVehicle();
        jTableModelBrand.setModel(brandTableModel);
        jTableModelCategory.setModel(categoryTableModel);
        jTableModelModel.setModel(modelTableModel);   
        jTableModelDriver.setModel(driverTableModel);
        jTableModelVehicle.setModel(vehicleTableModel);
        jTableModelClient.setModel(individualClientTableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupClientType = new javax.swing.ButtonGroup();
        jTabbedPaneCRUD = new javax.swing.JTabbedPane();
        jPanelCategory = new javax.swing.JPanel();
        jButtonIncludeCategory = new javax.swing.JButton();
        jButtonUpdateCategory = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableModelCategory = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabelCategoryDescription = new javax.swing.JLabel();
        jTextFieldCategoryDescription = new javax.swing.JTextField();
        jLabelCategoryRentValue = new javax.swing.JLabel();
        jFormattedTextFieldCategoryRentValue = new javax.swing.JFormattedTextField();
        jPanelClient = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableModelClient = new javax.swing.JTable();
        jButtonIncludeClient = new javax.swing.JButton();
        jButtonUpdateClient = new javax.swing.JButton();
        jRadioButtonIndividual = new javax.swing.JRadioButton();
        jRadioButtonLegal = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelClientName = new javax.swing.JLabel();
        jTextFieldClientName = new javax.swing.JTextField();
        jLabelClientSocialID = new javax.swing.JLabel();
        jFormattedTextFieldClientSocialID = new javax.swing.JFormattedTextField();
        jLabelClientSocialName = new javax.swing.JLabel();
        jTextFieldClientSocialName = new javax.swing.JTextField();
        jLabelPlace = new javax.swing.JLabel();
        jTextFieldPlace = new javax.swing.JTextField();
        jLabelNeighborhood = new javax.swing.JLabel();
        jTextFieldNeighborhood = new javax.swing.JTextField();
        jLabelNumber = new javax.swing.JLabel();
        jTextFieldNumber = new javax.swing.JTextField();
        jLabelTelephone = new javax.swing.JLabel();
        jFormattedTextFieldTelephone = new javax.swing.JFormattedTextField();
        jLabelCellphone = new javax.swing.JLabel();
        jFormattedTextFieldCellphone = new javax.swing.JFormattedTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelClientBirthDate = new javax.swing.JLabel();
        jFormattedTextFieldClientBirthDate = new javax.swing.JFormattedTextField();
        jLabelClientGender = new javax.swing.JLabel();
        jComboBoxClientGender = new javax.swing.JComboBox<>();
        jPanelBrand = new javax.swing.JPanel();
        jButtonIncludeBrand = new javax.swing.JButton();
        jButtonUpdateBrand = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModelBrand = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabelBrandName = new javax.swing.JLabel();
        jTextFieldBrandName = new javax.swing.JTextField();
        jLabelBrandIconPath = new javax.swing.JLabel();
        jTextFieldBrandIconPath = new javax.swing.JTextField();
        jButtonSetBrandIcon = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelBrandIcon = new javax.swing.JLabel();
        jPanelModel = new javax.swing.JPanel();
        jButtonIncludeModel = new javax.swing.JButton();
        jButtonUpdateModel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableModelModel = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabelModelName = new javax.swing.JLabel();
        jTextFieldModelDescription = new javax.swing.JTextField();
        jLabelModelPicturePath = new javax.swing.JLabel();
        jTextFieldModelPicture = new javax.swing.JTextField();
        jButtonSetModelPicture = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelModelBrand = new javax.swing.JLabel();
        jComboBoxBrandModel = new javax.swing.JComboBox<>();
        jLabelBrandModelIcon = new javax.swing.JLabel();
        jLabelModelYear = new javax.swing.JLabel();
        jSpinnerYearModel = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelModelColor = new javax.swing.JLabel();
        jTextFieldModelColor = new javax.swing.JTextField();
        jLabelModelPicture = new javax.swing.JLabel();
        jPanelDriver = new javax.swing.JPanel();
        jButtonIncludeDriver = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableModelDriver = new javax.swing.JTable();
        jButtonUpdateDriver = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabelDriverName = new javax.swing.JLabel();
        jTextFieldDriverName = new javax.swing.JTextField();
        jLabelDriverCPF = new javax.swing.JLabel();
        jFormattedTextFieldDriverCPF = new javax.swing.JFormattedTextField();
        jLabelDriverCNH = new javax.swing.JLabel();
        jFormattedTextFieldDriverCNH = new javax.swing.JFormattedTextField();
        jLabelCNHPath = new javax.swing.JLabel();
        jTextFieldCNHPicture = new javax.swing.JTextField();
        jButtonCNHPicture = new javax.swing.JButton();
        jLabelDriverGernder = new javax.swing.JLabel();
        jComboBoxDriverGenre = new javax.swing.JComboBox<>();
        jLabelCNHPicture = new javax.swing.JLabel();
        jPanelVehicle = new javax.swing.JPanel();
        jButtonIncludeVehicle = new javax.swing.JButton();
        jButtonUpdateVehicle = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableModelVehicle = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabelVehicleModel = new javax.swing.JLabel();
        jComboBoxVehicleModel = new javax.swing.JComboBox<>();
        jLabelVehicleCategory = new javax.swing.JLabel();
        jComboBoxVehicleCategory = new javax.swing.JComboBox<>();
        jLabelVehiclePlate = new javax.swing.JLabel();
        jFormattedTextFieldVehiclePlate = new javax.swing.JFormattedTextField();
        jLabelVehicleLastMileage = new javax.swing.JLabel();
        jFormattedTextFieldVehicleLastMileage = new javax.swing.JFormattedTextField();
        jLabelVehicleIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRUD");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/view/icons/car3.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTabbedPaneCRUD.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jButtonIncludeCategory.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonIncludeCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add.png"))); // NOI18N
        jButtonIncludeCategory.setText("  Incluir Categoria");
        jButtonIncludeCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncludeCategoryActionPerformed(evt);
            }
        });

        jButtonUpdateCategory.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonUpdateCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/refresh.png"))); // NOI18N
        jButtonUpdateCategory.setText("  Atualizar Categoria");
        jButtonUpdateCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateCategoryActionPerformed(evt);
            }
        });

        jTableModelCategory.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableModelCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableModelCategory.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableModelCategory);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabelCategoryDescription.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCategoryDescription.setText("Descrição:");
        jPanel2.add(jLabelCategoryDescription);

        jTextFieldCategoryDescription.setColumns(55);
        jPanel2.add(jTextFieldCategoryDescription);

        jLabelCategoryRentValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCategoryRentValue.setText("Valor da locação diária:");
        jPanel2.add(jLabelCategoryRentValue);

        jFormattedTextFieldCategoryRentValue.setColumns(40);
        jFormattedTextFieldCategoryRentValue.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        jFormattedTextFieldCategoryRentValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel2.add(jFormattedTextFieldCategoryRentValue);

        javax.swing.GroupLayout jPanelCategoryLayout = new javax.swing.GroupLayout(jPanelCategory);
        jPanelCategory.setLayout(jPanelCategoryLayout);
        jPanelCategoryLayout.setHorizontalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCategoryLayout.createSequentialGroup()
                .addContainerGap(458, Short.MAX_VALUE)
                .addComponent(jButtonIncludeCategory)
                .addGap(120, 120, 120)
                .addComponent(jButtonUpdateCategory)
                .addGap(441, 441, 441))
            .addComponent(jScrollPane2)
        );
        jPanelCategoryLayout.setVerticalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoryLayout.createSequentialGroup()
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCategoryLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelCategoryLayout.createSequentialGroup()
                        .addGap(268, 478, Short.MAX_VALUE)
                        .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonUpdateCategory)
                            .addComponent(jButtonIncludeCategory))
                        .addGap(81, 81, 81)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneCRUD.addTab("Categoria", jPanelCategory);

        jTableModelClient.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableModelClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTableModelClient);

        jButtonIncludeClient.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonIncludeClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add.png"))); // NOI18N
        jButtonIncludeClient.setText("  Incluir Cliente");
        jButtonIncludeClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncludeClientActionPerformed(evt);
            }
        });

        jButtonUpdateClient.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonUpdateClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/refresh.png"))); // NOI18N
        jButtonUpdateClient.setText("  Atualizar Cliente");
        jButtonUpdateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateClientActionPerformed(evt);
            }
        });

        jRadioButtonIndividual.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButtonIndividual.setText("Pessoa Física");
        jRadioButtonIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonIndividualActionPerformed(evt);
            }
        });

        jRadioButtonLegal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButtonLegal.setText("Pessoa Jurídica");
        jRadioButtonLegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLegalActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabelClientName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelClientName.setText("Nome:");
        jPanel1.add(jLabelClientName);

        jTextFieldClientName.setColumns(40);
        jPanel1.add(jTextFieldClientName);

        jLabelClientSocialID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelClientSocialID.setText("CPF:");
        jPanel1.add(jLabelClientSocialID);

        jFormattedTextFieldClientSocialID.setColumns(40);
        try {
            jFormattedTextFieldClientSocialID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextFieldClientSocialID);

        jLabelClientSocialName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelClientSocialName.setText("Nome Social:");
        jPanel1.add(jLabelClientSocialName);

        jTextFieldClientSocialName.setColumns(40);
        jPanel1.add(jTextFieldClientSocialName);

        jLabelPlace.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPlace.setText("Logradouro:");
        jPanel1.add(jLabelPlace);

        jTextFieldPlace.setColumns(40);
        jPanel1.add(jTextFieldPlace);

        jLabelNeighborhood.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNeighborhood.setText("Bairro:");
        jPanel1.add(jLabelNeighborhood);

        jTextFieldNeighborhood.setColumns(40);
        jPanel1.add(jTextFieldNeighborhood);

        jLabelNumber.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNumber.setText("Número:");
        jPanel1.add(jLabelNumber);

        jTextFieldNumber.setColumns(40);
        jPanel1.add(jTextFieldNumber);

        jLabelTelephone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTelephone.setText("Telefone:");
        jPanel1.add(jLabelTelephone);

        jFormattedTextFieldTelephone.setColumns(40);
        try {
            jFormattedTextFieldTelephone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+## (##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextFieldTelephone);

        jLabelCellphone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCellphone.setText("Celular:");
        jPanel1.add(jLabelCellphone);

        jFormattedTextFieldCellphone.setColumns(40);
        try {
            jFormattedTextFieldCellphone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+## (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextFieldCellphone);

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmail.setText("E-Mail:");
        jPanel1.add(jLabelEmail);

        jTextFieldEmail.setColumns(40);
        jPanel1.add(jTextFieldEmail);

        jLabelClientBirthDate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelClientBirthDate.setText("Nascimento:");
        jPanel1.add(jLabelClientBirthDate);

        jFormattedTextFieldClientBirthDate.setColumns(40);
        try {
            jFormattedTextFieldClientBirthDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextFieldClientBirthDate);

        jLabelClientGender.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelClientGender.setText("Sexo:");
        jPanel1.add(jLabelClientGender);

        jComboBoxClientGender.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBoxClientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jPanel1.add(jComboBoxClientGender);

        javax.swing.GroupLayout jPanelClientLayout = new javax.swing.GroupLayout(jPanelClient);
        jPanelClient.setLayout(jPanelClientLayout);
        jPanelClientLayout.setHorizontalGroup(
            jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
            .addGroup(jPanelClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClientLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jButtonIncludeClient)
                        .addGap(50, 50, 50)
                        .addComponent(jButtonUpdateClient))
                    .addGroup(jPanelClientLayout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addGroup(jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonIndividual)
                            .addComponent(jRadioButtonLegal))))
                .addGap(0, 335, Short.MAX_VALUE))
        );
        jPanelClientLayout.setVerticalGroup(
            jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientLayout.createSequentialGroup()
                .addGroup(jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClientLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jRadioButtonIndividual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonLegal)
                        .addGap(71, 71, 71)
                        .addGroup(jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonIncludeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUpdateClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelClientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneCRUD.addTab("Cliente", jPanelClient);

        jButtonIncludeBrand.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonIncludeBrand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add.png"))); // NOI18N
        jButtonIncludeBrand.setText("  Incluir Marca");
        jButtonIncludeBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncludeBrandActionPerformed(evt);
            }
        });

        jButtonUpdateBrand.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonUpdateBrand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/refresh.png"))); // NOI18N
        jButtonUpdateBrand.setText("  Atualizar Marca");
        jButtonUpdateBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateBrandActionPerformed(evt);
            }
        });

        jTableModelBrand.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableModelBrand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableModelBrand.getTableHeader().setReorderingAllowed(false);
        jTableModelBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModelBrandMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableModelBrand);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabelBrandName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelBrandName.setText("Nome da Marca:");
        jPanel3.add(jLabelBrandName);

        jTextFieldBrandName.setColumns(40);
        jPanel3.add(jTextFieldBrandName);

        jLabelBrandIconPath.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelBrandIconPath.setText("Logo da Marca:");
        jPanel3.add(jLabelBrandIconPath);

        jTextFieldBrandIconPath.setColumns(40);
        jPanel3.add(jTextFieldBrandIconPath);

        jButtonSetBrandIcon.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonSetBrandIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/search.png"))); // NOI18N
        jButtonSetBrandIcon.setText("  Buscar");
        jButtonSetBrandIcon.setPreferredSize(new java.awt.Dimension(326, 35));
        jButtonSetBrandIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetBrandIconActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSetBrandIcon);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelBrandIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabelBrandIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanelBrandLayout = new javax.swing.GroupLayout(jPanelBrand);
        jPanelBrand.setLayout(jPanelBrandLayout);
        jPanelBrandLayout.setHorizontalGroup(
            jPanelBrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanelBrandLayout.createSequentialGroup()
                .addGroup(jPanelBrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBrandLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBrandLayout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(jButtonIncludeBrand)
                        .addGap(117, 117, 117)
                        .addComponent(jButtonUpdateBrand)))
                .addGap(480, 480, Short.MAX_VALUE))
        );
        jPanelBrandLayout.setVerticalGroup(
            jPanelBrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBrandLayout.createSequentialGroup()
                .addGroup(jPanelBrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBrandLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBrandLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)))
                .addGroup(jPanelBrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIncludeBrand)
                    .addComponent(jButtonUpdateBrand))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneCRUD.addTab("Marca", jPanelBrand);

        jButtonIncludeModel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonIncludeModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add.png"))); // NOI18N
        jButtonIncludeModel.setText("  Incluir Modelo");
        jButtonIncludeModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncludeModelActionPerformed(evt);
            }
        });

        jButtonUpdateModel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonUpdateModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/refresh.png"))); // NOI18N
        jButtonUpdateModel.setText("  Atualizar Modelo");
        jButtonUpdateModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateModelActionPerformed(evt);
            }
        });

        jTableModelModel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableModelModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableModelModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModelModelMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableModelModel);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabelModelName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelModelName.setText("Nome do Modelo:");
        jPanel5.add(jLabelModelName);

        jTextFieldModelDescription.setColumns(40);
        jPanel5.add(jTextFieldModelDescription);

        jLabelModelPicturePath.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelModelPicturePath.setText("Imagem do Modelo:");
        jPanel5.add(jLabelModelPicturePath);

        jTextFieldModelPicture.setColumns(40);
        jPanel5.add(jTextFieldModelPicture);

        jButtonSetModelPicture.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonSetModelPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/search.png"))); // NOI18N
        jButtonSetModelPicture.setText("  Buscar");
        jButtonSetModelPicture.setPreferredSize(new java.awt.Dimension(326, 35));
        jButtonSetModelPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetModelPictureActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonSetModelPicture);

        jLabel1.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel5.add(jLabel1);

        jLabelModelBrand.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelModelBrand.setText("Marca do Modelo:");
        jLabelModelBrand.setPreferredSize(new java.awt.Dimension(175, 19));
        jPanel5.add(jLabelModelBrand);

        jComboBoxBrandModel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBoxBrandModel.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxBrandModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBrandModelActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBoxBrandModel);

        jLabelBrandModelIcon.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanel5.add(jLabelBrandModelIcon);

        jLabelModelYear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelModelYear.setText("Ano do Modelo:");
        jLabelModelYear.setPreferredSize(new java.awt.Dimension(300, 19));
        jPanel5.add(jLabelModelYear);

        jSpinnerYearModel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jSpinnerYearModel.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 2019, 1));
        jSpinnerYearModel.setPreferredSize(new java.awt.Dimension(75, 30));
        jPanel5.add(jSpinnerYearModel);

        jSeparator1.setPreferredSize(new java.awt.Dimension(300, 0));
        jPanel5.add(jSeparator1);

        jLabelModelColor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelModelColor.setText("Cor do Modelo:");
        jLabelModelColor.setPreferredSize(new java.awt.Dimension(300, 19));
        jPanel5.add(jLabelModelColor);

        jTextFieldModelColor.setColumns(40);
        jPanel5.add(jTextFieldModelColor);

        javax.swing.GroupLayout jPanelModelLayout = new javax.swing.GroupLayout(jPanelModel);
        jPanelModel.setLayout(jPanelModelLayout);
        jPanelModelLayout.setHorizontalGroup(
            jPanelModelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanelModelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelModelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButtonIncludeModel)
                        .addGap(119, 119, 119)
                        .addComponent(jButtonUpdateModel))
                    .addGroup(jPanelModelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelModelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        jPanelModelLayout.setVerticalGroup(
            jPanelModelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModelLayout.createSequentialGroup()
                .addGroup(jPanelModelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModelLayout.createSequentialGroup()
                        .addContainerGap(142, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanelModelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabelModelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelModelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonIncludeModel)
                            .addComponent(jButtonUpdateModel))
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneCRUD.addTab("Modelo", jPanelModel);

        jButtonIncludeDriver.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonIncludeDriver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add.png"))); // NOI18N
        jButtonIncludeDriver.setText("  Incluir Motorista");
        jButtonIncludeDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncludeDriverActionPerformed(evt);
            }
        });

        jTableModelDriver.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableModelDriver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableModelDriver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModelDriverMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableModelDriver);

        jButtonUpdateDriver.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonUpdateDriver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/refresh.png"))); // NOI18N
        jButtonUpdateDriver.setText("  Atualizar Motorista");
        jButtonUpdateDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateDriverActionPerformed(evt);
            }
        });

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabelDriverName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDriverName.setText("Nome:");
        jPanel6.add(jLabelDriverName);

        jTextFieldDriverName.setColumns(40);
        jPanel6.add(jTextFieldDriverName);

        jLabelDriverCPF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDriverCPF.setText("CPF:");
        jPanel6.add(jLabelDriverCPF);

        jFormattedTextFieldDriverCPF.setColumns(40);
        try {
            jFormattedTextFieldDriverCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel6.add(jFormattedTextFieldDriverCPF);

        jLabelDriverCNH.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDriverCNH.setText("CNH:");
        jPanel6.add(jLabelDriverCNH);

        try {
            jFormattedTextFieldDriverCNH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDriverCNH.setPreferredSize(new java.awt.Dimension(324, 19));
        jPanel6.add(jFormattedTextFieldDriverCNH);

        jLabelCNHPath.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCNHPath.setText("Imagem da CNH:");
        jPanel6.add(jLabelCNHPath);

        jTextFieldCNHPicture.setColumns(40);
        jPanel6.add(jTextFieldCNHPicture);

        jButtonCNHPicture.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonCNHPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/search.png"))); // NOI18N
        jButtonCNHPicture.setText("  Buscar");
        jButtonCNHPicture.setPreferredSize(new java.awt.Dimension(326, 35));
        jButtonCNHPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCNHPictureActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonCNHPicture);

        jLabelDriverGernder.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDriverGernder.setText("Sexo:");
        jPanel6.add(jLabelDriverGernder);

        jComboBoxDriverGenre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBoxDriverGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jPanel6.add(jComboBoxDriverGenre);

        javax.swing.GroupLayout jPanelDriverLayout = new javax.swing.GroupLayout(jPanelDriver);
        jPanelDriver.setLayout(jPanelDriverLayout);
        jPanelDriverLayout.setHorizontalGroup(
            jPanelDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanelDriverLayout.createSequentialGroup()
                .addGroup(jPanelDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDriverLayout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(jButtonIncludeDriver)
                        .addGap(110, 110, 110)
                        .addComponent(jButtonUpdateDriver))
                    .addGroup(jPanelDriverLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabelCNHPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanelDriverLayout.setVerticalGroup(
            jPanelDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDriverLayout.createSequentialGroup()
                .addGroup(jPanelDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDriverLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDriverLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabelCNHPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanelDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdateDriver)
                    .addComponent(jButtonIncludeDriver))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneCRUD.addTab("Motorista", jPanelDriver);

        jButtonIncludeVehicle.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonIncludeVehicle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add.png"))); // NOI18N
        jButtonIncludeVehicle.setText("  Incluir Veículo");
        jButtonIncludeVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncludeVehicleActionPerformed(evt);
            }
        });

        jButtonUpdateVehicle.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonUpdateVehicle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/refresh.png"))); // NOI18N
        jButtonUpdateVehicle.setText("  Atualizar Veículo");
        jButtonUpdateVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateVehicleActionPerformed(evt);
            }
        });

        jTableModelVehicle.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableModelVehicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableModelVehicle);

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        jLabelVehicleModel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelVehicleModel.setText("Modelo:");
        jPanel7.add(jLabelVehicleModel);

        jComboBoxVehicleModel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBoxVehicleModel.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel7.add(jComboBoxVehicleModel);

        jLabelVehicleCategory.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelVehicleCategory.setText("Categoria:");
        jPanel7.add(jLabelVehicleCategory);

        jComboBoxVehicleCategory.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBoxVehicleCategory.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel7.add(jComboBoxVehicleCategory);

        jLabelVehiclePlate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelVehiclePlate.setText("Placa do Veículo:");
        jPanel7.add(jLabelVehiclePlate);

        jFormattedTextFieldVehiclePlate.setColumns(30);
        try {
            jFormattedTextFieldVehiclePlate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldVehiclePlate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jFormattedTextFieldVehiclePlate);

        jLabelVehicleLastMileage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelVehicleLastMileage.setText("Kilometragem atual:");
        jPanel7.add(jLabelVehicleLastMileage);

        jFormattedTextFieldVehicleLastMileage.setColumns(30);
        jFormattedTextFieldVehicleLastMileage.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        jPanel7.add(jFormattedTextFieldVehicleLastMileage);

        jLabelVehicleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/vehicleIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanelVehicleLayout = new javax.swing.GroupLayout(jPanelVehicle);
        jPanelVehicle.setLayout(jPanelVehicleLayout);
        jPanelVehicleLayout.setHorizontalGroup(
            jPanelVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(jPanelVehicleLayout.createSequentialGroup()
                .addGroup(jPanelVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVehicleLayout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(jButtonIncludeVehicle)
                        .addGap(141, 141, 141)
                        .addComponent(jButtonUpdateVehicle))
                    .addGroup(jPanelVehicleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)
                        .addComponent(jLabelVehicleIcon)))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanelVehicleLayout.setVerticalGroup(
            jPanelVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVehicleLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanelVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVehicleIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanelVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIncludeVehicle)
                    .addComponent(jButtonUpdateVehicle))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneCRUD.addTab("Veículo", jPanelVehicle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneCRUD)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneCRUD)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            MainWindow mw = new MainWindow(control);
            mw.setVisible(true);
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowClosed

    private void jButtonIncludeBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncludeBrandActionPerformed
        try {
            String brandName = jTextFieldBrandName.getText().trim();
            String brandIconPath = jTextFieldBrandIconPath.getText().trim();
            String alert = "";
            if (brandName.isEmpty() || brandIconPath.isEmpty()) {
                alert += brandName.isEmpty() ? "Informe o nome da marca !" : "Selecione o logo da marca !";
            }
            switch (String.valueOf(brandName.isEmpty() || brandIconPath.isEmpty())) {
                case "true":
                    JOptionPane.showMessageDialog(jPanelBrand, alert);
                    break;
                case "false":
                    boolean bool = false;
                    Brand brand = new Brand(brandName, brandIconPath);
                    Brand brandObject = new Brand();
                    
                    String[] vectBrand = control.receiveFromServer(new Brand(), Operation.READ);
                    for (String objectStr : vectBrand) {
                        if (objectStr.isEmpty()) {
                            break;
                        }
                        brandObject.mount(objectStr);
                        if (brand.getName().toUpperCase().equals(brandObject.getName().toUpperCase())) {
                            bool = true;
                            JOptionPane.showMessageDialog(jPanelBrand, "Marca já existente !");
                            break;
                        }
                    }
                    if (bool) {
                        break;
                    }
                    
                    control.includeData(brand, Operation.INCLUDE);
                    JOptionPane.showMessageDialog(jPanelBrand, "Marca cadastrada com sucesso");
                    listBrand();
                    break;
            }
            jTextFieldBrandName.setText("");
            jTextFieldBrandIconPath.setText("");
            jTextFieldBrandName.requestFocus();
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonIncludeBrandActionPerformed
    
    private void listBrand() {
        try {
            brandTableModel = new BrandTableModel();
            jTableModelBrand.setModel(brandTableModel);
            ((DefaultTableCellRenderer) jTableModelBrand.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            
            for (int i = 0; i < brandTableModel.getColumnCount(); i++) {
                jTableModelBrand.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
            jComboBoxBrandModel.removeAllItems();
            String[] vectStr = control.receiveFromServer(new Brand(), Operation.READ);
            for (String str : vectStr) {
                if (!str.isEmpty()) {
                    Brand brand = new Brand();
                    brand.mount(str);
                    brandTableModel.addRow(brand);
                    jComboBoxBrandModel.addItem(brand);
                }
            }
            listModel();
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButtonUpdateBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateBrandActionPerformed
        try {
            int index = jTableModelBrand.getSelectedRow();
            int brandId = Integer.parseInt(String.valueOf(brandTableModel.getValueAt(index, 0)));
            String brandName = jTextFieldBrandName.getText().trim();
            String brandIconPath = jTextFieldBrandIconPath.getText().trim();
            String alert = "";
            if (brandName.isEmpty() || brandIconPath.isEmpty()) {
                alert += brandName.isEmpty() ? "Informe o nome da marca !" : "Selecione o logo da marca !";
            }
            switch (String.valueOf(brandName.isEmpty() || brandIconPath.isEmpty())) {
                case "true":
                    JOptionPane.showMessageDialog(jPanelBrand, alert);
                    break;
                case "false":
                    boolean bool = false;
                    Brand updatedBrand = new Brand(brandId, brandName, brandIconPath);
                    Brand brandObject = new Brand();
                    
                    String[] vectBrand = control.receiveFromServer(new Brand(), Operation.READ);
                    for (String objectStr : vectBrand) {
                        if (objectStr.isEmpty()) {
                            break;
                        }
                        brandObject.mount(objectStr);
                        
                        if (updatedBrand.getName().toUpperCase().equals(brandObject.getName().toUpperCase())) {
                            if (updatedBrand.getId() == brandObject.getId()) {
                                break;
                            }
                            bool = true;
                            JOptionPane.showMessageDialog(jPanelBrand, "Já existe uma Marca cadastrada com este nome !");
                            break;
                        }
                    }
                    if (bool) {
                        break;
                    }
                    
                    control.updateData(updatedBrand, Operation.UPDATE);
                    JOptionPane.showMessageDialog(jPanelBrand, "Marca atualizada com sucesso !");
                    listBrand();
                    break;
            }
            jTextFieldBrandName.setText("");
            jTextFieldBrandIconPath.setText("");
            jTextFieldBrandName.requestFocus();
        }
        catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jButtonUpdateBrandActionPerformed

    private void jButtonIncludeCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncludeCategoryActionPerformed
        try {
            String categoryDescription = jTextFieldCategoryDescription.getText().trim();
            String categoryRentValueStr = jFormattedTextFieldCategoryRentValue.getText().trim().replaceAll(",", ".");
            String alert = "";
            if (categoryDescription.isEmpty() || ".".equals(categoryRentValueStr)) {
                alert += categoryDescription.isEmpty() ? "Informe a descrição da categoria !" : "Informe um valor de locação para esta categoria !";
            }
            switch(String.valueOf(categoryDescription.isEmpty() || ".".equals(categoryRentValueStr))) {
                case "true":
                    JOptionPane.showMessageDialog(jPanelCategory, alert);
                    break;
                case "false":
                    boolean bool = false;
                    Category category = new Category(categoryDescription, Double.parseDouble(categoryRentValueStr));
                    Category categoryObject = new Category();

                    String[] vectCategory = control.receiveFromServer(new Category(), Operation.READ);
                    for (String objectStr : vectCategory) {
                        if (objectStr.isEmpty()) {
                            break;
                        }
                        categoryObject.mount(objectStr);
                        if (category.getDescription().toUpperCase().equals(categoryObject.getDescription().toUpperCase())) {
                            bool = true;
                            JOptionPane.showMessageDialog(jPanelCategory, "Categoria já existente !");
                            break;
                        }
                    }
                    if (bool) {
                        break;
                    }
                    
                    control.includeData(category, Operation.INCLUDE);
                    JOptionPane.showMessageDialog(jPanelCategory, "Categoria cadastrada com sucesso");
                    listCategory();
                    break;
            }
            jTextFieldCategoryDescription.setText("");
            jFormattedTextFieldCategoryRentValue.setValue(null);
            jTextFieldCategoryDescription.requestFocus();
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(jPanelCategory, "Valor de locação inválido !");
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonIncludeCategoryActionPerformed
    
    private void listCategory() {
        try {
            categoryTableModel = new CategoryTableModel();
            jTableModelCategory.setModel(categoryTableModel);
            
            ((DefaultTableCellRenderer) jTableModelCategory.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            
            for (int i = 0; i < categoryTableModel.getColumnCount(); i++) {
                jTableModelCategory.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
            
            String[] vectStr = control.receiveFromServer(new Category(), Operation.READ);
            jComboBoxVehicleCategory.removeAllItems();
            for (String str : vectStr) {
                if (!str.isEmpty()) {
                    Category category = new Category();
                    category.mount(str);
                    categoryTableModel.addRow(category);
                    jComboBoxVehicleCategory.addItem(category);
                }
            }
            listVehicle();
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButtonUpdateCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateCategoryActionPerformed
        try {
            int index = jTableModelCategory.getSelectedRow();
            int categoryId = Integer.parseInt(String.valueOf(categoryTableModel.getValueAt(index, 0)));
            String categoryDescription = jTextFieldCategoryDescription.getText().trim();
            String categoryRentValueStr = jFormattedTextFieldCategoryRentValue.getText().trim().replaceAll(",", ".");
            String alert = "";
            if (categoryDescription.isEmpty() || ".".equals(categoryRentValueStr)) {
                alert += categoryDescription.isEmpty() ? "Informe a descrição da categoria !" : "Informe um valor de locação para esta categoria !";
            }
            switch(String.valueOf(categoryDescription.isEmpty() || ".".equals(categoryRentValueStr))) {
                case "true":
                    JOptionPane.showMessageDialog(jPanelCategory, alert);
                    break;
                case "false":
                    boolean bool = false;
                    Category updatedCategory = new Category(categoryId, categoryDescription, Double.parseDouble(categoryRentValueStr));
                    Category categoryObject = new Category();
                    
                    String[] vectCategory = control.receiveFromServer(new Category(), Operation.READ);
                    for (String objectStr : vectCategory) {
                        if (objectStr.isEmpty()) {
                            break;
                        }
                        categoryObject.mount(objectStr);
                        
                        if(updatedCategory.getDescription().toUpperCase().equals(categoryObject.getDescription().toUpperCase())) {
                            if (updatedCategory.getId() == categoryObject.getId()) {
                                break;
                            }
                            bool = true;
                            JOptionPane.showMessageDialog(jPanelCategory, "Há uma categoria cadastrada com este nome !");
                            break;
                        }
                    }
                    if (bool) {
                        break;
                    }
                    
                    control.updateData(updatedCategory, Operation.UPDATE);
                    JOptionPane.showMessageDialog(jPanelCategory, "Categoria atualizada com sucesso !");
                    listCategory();
                    break;
            }
            jTextFieldCategoryDescription.setText("");
            jFormattedTextFieldCategoryRentValue.setValue(null);
            jTextFieldCategoryDescription.requestFocus();
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(jPanelCategory, "Valor de locação inválido !");
        }
        catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jButtonUpdateCategoryActionPerformed

    private void jButtonIncludeModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncludeModelActionPerformed
        try {
            Brand brand = (Brand) jComboBoxBrandModel.getSelectedItem();
            String modelDescription = jTextFieldModelDescription.getText().trim();
            int yearModel = Integer.parseInt(jSpinnerYearModel.getValue().toString());
            String modelColor = jTextFieldModelColor.getText().trim();
            String modelPicturePath = jTextFieldModelPicture.getText().trim();
            String alert = "";
            if (modelDescription.isEmpty() || modelPicturePath.isEmpty() || modelColor.isEmpty()) {
                alert += modelDescription.isEmpty() ? "Informe a descrição do modelo !" : "Selecione a foto do modelo / Informe a cor !";
            }
            switch(String.valueOf(modelDescription.isEmpty() || modelPicturePath.isEmpty() || modelColor.isEmpty())) {
                case "true":
                    JOptionPane.showMessageDialog(jPanelModel, alert);
                    break;
                case "false":
                    boolean bool = false;
                    Model model = new Model(modelDescription, yearModel, modelColor, modelPicturePath, brand);
                    Model modelObject = new Model();
                    
                    String[] vectModel = control.receiveFromServer(new Model(), Operation.READ);
                    for (String objecStr : vectModel) {
                        if (objecStr.isEmpty()) {
                            break;
                        }
                        modelObject.mount(objecStr);
                        boolean boolDatas = model.getDescription().toUpperCase().equals(modelObject.getDescription().toUpperCase());
                        boolDatas = boolDatas && model.getYear() == modelObject.getYear();
                        boolDatas = boolDatas && model.getColor().toUpperCase().equals(modelObject.getColor().toUpperCase());
                        boolDatas = boolDatas && model.getBrand().getId() == modelObject.getBrand().getId();
                        if (boolDatas) {
                            bool = true;
                            JOptionPane.showMessageDialog(jPanelModel, "Modelo já existente !");
                            break;
                        }
                    }
                    if (bool) {
                        break;
                    }
                    
                    control.includeData(model, Operation.INCLUDE);
                    JOptionPane.showMessageDialog(jPanelModel, "Modelo cadastrado com sucesso !");
                    listModel();
                    break;
            }
            jTextFieldModelDescription.setText("");
            jTextFieldModelPicture.setText("");
            jTextFieldModelColor.setText("");
            jTextFieldModelDescription.requestFocus();
        }
        catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(jPanelModel, "Cadastre uma marca !");
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonIncludeModelActionPerformed
    
    private void listModel() {
        try {
            modelTableModel = new ModelTableModel();
            jTableModelModel.setModel(modelTableModel);
            
            ((DefaultTableCellRenderer) jTableModelModel.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            
            for (int i = 0; i < modelTableModel.getColumnCount(); i++) {
                jTableModelModel.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
            
            String[] vectStr = control.receiveFromServer(new Model(), Operation.READ);
            jComboBoxVehicleModel.removeAllItems();
            for (String str : vectStr) {
                if (!str.isEmpty()) {
                    Model model = new Model();
                    model.mount(str);
                    modelTableModel.addRow(model);
                    jComboBoxVehicleModel.addItem(model);
                }
            }
            listVehicle();
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButtonUpdateModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateModelActionPerformed
        try {
            int index = jTableModelModel.getSelectedRow();
            int modelId = Integer.parseInt(modelTableModel.getValueAt(index, 0).toString());
            Brand brand = (Brand) jComboBoxBrandModel.getSelectedItem();
            String modelDescription = jTextFieldModelDescription.getText().trim();
            int yearModel = Integer.parseInt(jSpinnerYearModel.getValue().toString());
            String modelColor = jTextFieldModelColor.getText().trim();
            String modelPicturePath = jTextFieldModelPicture.getText().trim();
            String alert = "";
            if (modelDescription.isEmpty() || modelPicturePath.isEmpty() || modelColor.isEmpty()) {
                alert += modelDescription.isEmpty() ? "Informe a descrição do modelo !" : "Selecione a foto do modelo / Informe a cor !";
            }
            switch(String.valueOf(modelDescription.isEmpty() || modelPicturePath.isEmpty() || modelColor.isEmpty())) {
                case "true":
                    JOptionPane.showMessageDialog(jPanelModel, alert);
                    break;
                case "false":
                    boolean bool = false;
                    Model updatedModel = new Model(modelId, modelDescription, yearModel, modelColor, modelPicturePath, brand);
                    Model modelObject = new Model();
                    
                    String[] vectModel = control.receiveFromServer(new Model(), Operation.READ);
                    for(String objectStr : vectModel) {
                        if (objectStr.isEmpty()) {
                            break;
                        }
                        modelObject.mount(objectStr);
                        boolean boolDatas = updatedModel.getDescription().toUpperCase().equals(modelObject.getDescription().toUpperCase());
                        boolDatas = boolDatas && updatedModel.getYear() == modelObject.getYear();
                        boolDatas = boolDatas && updatedModel.getColor().toUpperCase().equals(modelObject.getColor().toUpperCase());
                        boolDatas = boolDatas && updatedModel.getBrand().getId() == modelObject.getBrand().getId();
                        
                        if (boolDatas) {
                            if (updatedModel.getId() == modelObject.getId()) {
                                break;
                            }
                            bool = true;
                            JOptionPane.showMessageDialog(jPanelModel, "Há um modelo cadastrado com este mesmo nome !");
                            break;
                        }
                    }
                    if (bool) {
                        break;
                    }
                    
                    control.updateData(updatedModel, Operation.UPDATE);
                    JOptionPane.showMessageDialog(jPanelModel, "Modelo atualizado com sucesso !");
                    listModel();
                    break;
            }
            jTextFieldModelDescription.setText("");
            jTextFieldModelPicture.setText("");
            jTextFieldModelColor.setText("");
            jTextFieldModelDescription.requestFocus();
        }
        catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jButtonUpdateModelActionPerformed
    
    private void listDriver() {
        try {
            driverTableModel = new DriverTableModel();
            jTableModelDriver.setModel(driverTableModel);
            
            ((DefaultTableCellRenderer) jTableModelDriver.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            
            for (int i = 0; i < driverTableModel.getColumnCount(); i++) {
                jTableModelDriver.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
            
            String[] vectStr = control.receiveFromServer(new Driver(), Operation.READ);
            for (String str : vectStr) {
                if (!str.isEmpty()) {
                    Driver driver = new Driver();
                    driver.mount(str);
                    driverTableModel.addRow(driver);
                }
            }
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButtonUpdateDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateDriverActionPerformed
        try {
            int index = jTableModelDriver.getSelectedRow();
            int driverId = Integer.parseInt(driverTableModel.getValueAt(index, 0).toString());
            String genderSelected = jComboBoxDriverGenre.getSelectedItem().toString().toUpperCase();
            String driverName = jTextFieldDriverName.getText().trim();
            String driverCPF = jFormattedTextFieldDriverCPF.getText().trim();
            String driverCNH = jFormattedTextFieldDriverCNH.getText().trim();
            String cnhPicturePath = jTextFieldCNHPicture.getText().trim();
            boolean bool = driverName.isEmpty() || driverCPF.isEmpty() || driverCNH.isEmpty() || cnhPicturePath.isEmpty();
            switch (String.valueOf(bool)) {
                case "true":
                    JOptionPane.showMessageDialog(jPanelDriver, "Não é permitido atualização com campos avulsos !");
                    break;
                case "false":
                    bool = false;
                    Driver updatedDriver = new Driver(driverId, driverName, driverCPF, driverCNH, cnhPicturePath, GenderEnum.valueOf(genderSelected));
                    Driver driverObject = new Driver();
                    
                    String[] vectDriver = control.receiveFromServer(new Driver(), Operation.READ);
                    for (String objectStr : vectDriver) {
                        if (objectStr.isEmpty()) {
                            break;
                        }
                        driverObject.mount(objectStr);
                        boolean boolDatas = updatedDriver.getCpf().equals(driverObject.getCpf());
                        boolDatas = boolDatas || updatedDriver.getCnh().equals(driverObject.getCnh());
                        if (boolDatas) {
                            if (updatedDriver.getId() == driverObject.getId()) {
                                break;
                            }
                            bool = true;
                            String alert = updatedDriver.getCpf().equals(driverObject.getCpf()) ? "CPF já cadastrado !" : "CNH já cadastrada !";
                            JOptionPane.showMessageDialog(jPanelDriver, alert);
                            break;
                        }
                    }
                    if (bool) {
                        break;
                    }
                    
                    control.includeData(updatedDriver, Operation.UPDATE);
                    JOptionPane.showMessageDialog(jPanelDriver, "Motorista atualizado com sucesso !");
                    listDriver();
                    break;
            }
            jTextFieldDriverName.setText("");
            jFormattedTextFieldDriverCPF.setText("");
            jFormattedTextFieldDriverCNH.setText("");
            jTextFieldCNHPicture.setText("");
            jTextFieldDriverName.requestFocus();
        }
        catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jButtonUpdateDriverActionPerformed

    private void jButtonIncludeDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncludeDriverActionPerformed
        try {
            String genderSelected = jComboBoxDriverGenre.getSelectedItem().toString().toUpperCase();
            String driverName = jTextFieldDriverName.getText().trim();
            String driverCPF = jFormattedTextFieldDriverCPF.getText().trim();
            String driverCNH = jFormattedTextFieldDriverCNH.getText().trim();
            String cnhPicturePath = jTextFieldCNHPicture.getText().trim();
            boolean bool = driverName.isEmpty() || driverCPF.isEmpty() || driverCNH.isEmpty() || cnhPicturePath.isEmpty();
            switch (String.valueOf(bool)) {
                case "true":
                    JOptionPane.showMessageDialog(jPanelDriver, "Não é permitido inclusão com campos avulsos !");
                    break;
                case "false":
                    bool = false;
                    Driver driver = new Driver(driverName, driverCPF, driverCNH, cnhPicturePath, GenderEnum.valueOf(genderSelected));
                    Driver driverObject = new Driver();
                    
                    String[] vectDriver = control.receiveFromServer(new Driver(), Operation.READ);
                    for (String objectStr : vectDriver) {
                        if (objectStr.isEmpty()) {
                            break;
                        }
                        driverObject.mount(objectStr);
                        boolean boolDatas = driver.getCpf().equals(driverObject.getCpf());
                        boolDatas = boolDatas || driver.getCnh().equals(driverObject.getCnh());
                        if (boolDatas) {
                            bool = true;
                            String alert = driver.getCpf().equals(driverObject.getCpf()) ? "CPF já cadastrado !" : "CNH já cadastrada !";
                            JOptionPane.showMessageDialog(jPanelDriver, alert);
                            break;
                        }
                    }
                    if (bool) {
                        break;
                    }
                    
                    control.includeData(driver, Operation.INCLUDE);
                    JOptionPane.showMessageDialog(jPanelDriver, "Motorista cadastrado com sucesso !");
                    listDriver();
                    break;
            }
            jTextFieldDriverName.setText("");
            jFormattedTextFieldDriverCPF.setText("");
            jFormattedTextFieldDriverCNH.setText("");
            jTextFieldCNHPicture.setText("");
            jTextFieldDriverName.requestFocus();
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonIncludeDriverActionPerformed

    private void jButtonIncludeVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncludeVehicleActionPerformed
        try {
            Model vehicleModel = (Model) jComboBoxVehicleModel.getSelectedItem();
            Category vehicleCategory = (Category) jComboBoxVehicleCategory.getSelectedItem();
            String vehiclePlate = jFormattedTextFieldVehiclePlate.getText().trim();
            String lastMileAgeStr = jFormattedTextFieldVehicleLastMileage.getText().trim().replaceAll(",", ".");
            switch(String.valueOf(vehiclePlate.length() != 8 || ".".equals(lastMileAgeStr))) {
                case "true":
                    if (vehiclePlate.length() != 8) {
                        JOptionPane.showMessageDialog(jPanelVehicle, "Placa inválida !");
                    }
                    if (".".equals(lastMileAgeStr)) {
                        JOptionPane.showMessageDialog(jPanelVehicle, "Kilometragem inválida !");
                    }
                    break;
                case "false":
                    boolean bool = false;
                    Vehicle vehicle = new Vehicle(vehiclePlate, Double.parseDouble(lastMileAgeStr), vehicleModel, vehicleCategory, VehicleStatusEnum.DISPONIVEL);
                    Vehicle vehicleObject = new Vehicle();
                    
                    String[] vectVehicle = control.receiveFromServer(new Vehicle(), Operation.READ);
                    for (String objectStr : vectVehicle) {
                        if (objectStr.isEmpty()) {
                            break;
                        }
                        vehicleObject.mount(objectStr);
                        if (vehicle.getVehiclePlate().equals(vehicleObject.getVehiclePlate())) {
                            bool = true;
                            JOptionPane.showMessageDialog(jPanelVehicle, "Um veículo com esta placa já está cadastrado !");
                            break;
                        }
                    }
                    if (bool) {
                        break;
                    }
                    
                    control.includeData(vehicle, Operation.INCLUDE);
                    JOptionPane.showMessageDialog(jPanelVehicle, "Veículo cadastrado com sucesso !");
                    listVehicle();
                    break;
            }
            jFormattedTextFieldVehiclePlate.setText(null);
            jFormattedTextFieldVehicleLastMileage.setText(null);
            jFormattedTextFieldVehiclePlate.requestFocus();
        }
        catch (NullPointerException npe) {
            String alert = jComboBoxVehicleModel.getSelectedItem() == null ? "Cadastre um modelo !" : "Cadastre uma categoria !";
            JOptionPane.showMessageDialog(jPanelVehicle, alert);
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(jPanelCategory, "Kilometragem inválida !");
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonIncludeVehicleActionPerformed
    
    private void listVehicle() {
        try {
            vehicleTableModel = new VehicleTableModel();
            jTableModelVehicle.setModel(vehicleTableModel);
            
            ((DefaultTableCellRenderer) jTableModelVehicle.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            
            for (int i = 0; i < vehicleTableModel.getColumnCount(); i++) {
                jTableModelVehicle.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
            
            String[] vectStr = control.receiveFromServer(new Vehicle(), Operation.READ);
            for (String str : vectStr) {
                if (!str.isEmpty()) {
                    Vehicle vehicle = new Vehicle();
                    vehicle.mount(str);
                    vehicleTableModel.addRow(vehicle);
                }
            }
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButtonUpdateVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateVehicleActionPerformed
        try {
            int index = jTableModelVehicle.getSelectedRow();
            int vehicleId = Integer.parseInt(vehicleTableModel.getValueAt(index, 0).toString());
            String vehicleStatus = vehicleTableModel.getValueAt(index, 6).toString().toUpperCase();
            Model vehicleModel = (Model) jComboBoxVehicleModel.getSelectedItem();
            Category vehicleCategory = (Category) jComboBoxVehicleCategory.getSelectedItem();
            String vehiclePlate = jFormattedTextFieldVehiclePlate.getText().trim();
            String lastMileAgeStr = jFormattedTextFieldVehicleLastMileage.getText().trim().replaceAll(",", ".");
            switch(String.valueOf(vehiclePlate.length() != 8 || ".".equals(lastMileAgeStr))) {
                case "true":
                    if (vehiclePlate.length() != 8) {
                        JOptionPane.showMessageDialog(jPanelVehicle, "Placa inválida !");
                    }
                    if (".".equals(lastMileAgeStr)) {
                        JOptionPane.showMessageDialog(jPanelVehicle, "Kilometragem inválida");
                    }
                    break;
                case "false":
                    boolean bool = false;
                    Vehicle updatedVehicle = new Vehicle(vehicleId, vehiclePlate, Double.parseDouble(lastMileAgeStr), vehicleModel,
                                                         vehicleCategory, VehicleStatusEnum.valueOf(vehicleStatus));
                    Vehicle vehicleObject = new Vehicle();
                    
                    String[] vectVehicle = control.receiveFromServer(new Vehicle(), Operation.READ);
                    for (String objectStr : vectVehicle) {
                        if (objectStr.isEmpty()) {
                            break;
                        }
                        vehicleObject.mount(objectStr);
                        
                        if (updatedVehicle.getVehiclePlate().equals(vehicleObject.getVehiclePlate())) {
                            if (updatedVehicle.getId() == vehicleObject.getId()) {
                                break;
                            }
                            bool = true;
                            JOptionPane.showMessageDialog(jPanelVehicle, "Um veículo com esta placa já está cadastrado !");
                            break;
                        }
                    }
                    if (bool) {
                        break;
                    }
                    
                    control.updateData(updatedVehicle, Operation.UPDATE);
                    JOptionPane.showMessageDialog(jPanelVehicle, "Veículo atualizado com sucesso !");
                    listVehicle();
                    break;
            }
            jFormattedTextFieldVehiclePlate.setText(null);
            jFormattedTextFieldVehicleLastMileage.setText(null);
            jFormattedTextFieldVehiclePlate.requestFocus();
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(jPanelCategory, "Kilometragem inválida !");
        }
        catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jButtonUpdateVehicleActionPerformed

    private void jButtonCNHPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCNHPictureActionPerformed
        String title = "Procurar Imagem da CNH";
        selectPicture(title, jTextFieldCNHPicture);
    }//GEN-LAST:event_jButtonCNHPictureActionPerformed
    
    private void clearFields() {
        jTextFieldClientName.setText("");
        jFormattedTextFieldClientSocialID.setValue(null);
        jTextFieldClientSocialName.setText("");
        jTextFieldPlace.setText("");
        jTextFieldNeighborhood.setText("");
        jTextFieldNumber.setText("");
        jFormattedTextFieldTelephone.setValue(null);
        jFormattedTextFieldCellphone.setValue(null);
        jTextFieldEmail.setText("");
        jFormattedTextFieldClientBirthDate.setValue(null);
    }
    
    private void listClient(java.awt.event.ActionEvent evt) throws Exception {
        try {
            if (jRadioButtonIndividual.isSelected()) {
                individualClientTableModel = new IndividualClientTableModel();
                jTableModelClient.setModel(individualClientTableModel);
                ((DefaultTableCellRenderer) jTableModelClient.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
                
                int[] size = {1, 120, 1, 18, 60, 45, 90, 40, 40, 5, 10};
                
                for (int i = 0; i < individualClientTableModel.getColumnCount(); i++) {
                    jTableModelClient.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    jTableModelClient.getColumnModel().getColumn(i).setMinWidth(1);
                    jTableModelClient.getColumnModel().getColumn(i).setPreferredWidth(size[i]);
                }
                
                String[] vectStr = control.receiveFromServer(new IndividualClient(), Operation.READ);
                for (String str : vectStr) {
                    if (!str.isEmpty()) {
                        IndividualClient client = new IndividualClient();
                        client.mount(str);
                        individualClientTableModel.addRow(client);
                    }
                }
            }
            else {
                legalClientTableModel = new LegalClientTableModel();
                jTableModelClient.setModel(legalClientTableModel);
                ((DefaultTableCellRenderer) jTableModelClient.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
                
                int[] size = {1, 90, 90, 50, 60, 60, 90, 30, 30, 20};
                
                for (int i = 0; i < legalClientTableModel.getColumnCount(); i++) {
                    jTableModelClient.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    jTableModelClient.getColumnModel().getColumn(i).setMinWidth(1);
                    jTableModelClient.getColumnModel().getColumn(i).setPreferredWidth(size[i]);
                }
                
                String[] vectStr = control.receiveFromServer(new LegalClient(), Operation.READ);
                for (String str : vectStr) {
                    if (!str.isEmpty()) {
                        LegalClient client = new LegalClient();
                        client.mount(str);
                        legalClientTableModel.addRow(client);
                    }
                }
            }
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButtonSetBrandIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetBrandIconActionPerformed
        String title = "Procurar logo da Marca";
        selectPicture(title, jTextFieldBrandIconPath);
    }//GEN-LAST:event_jButtonSetBrandIconActionPerformed

    private void jButtonSetModelPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetModelPictureActionPerformed
        String title = "Procurar foto do Modelo";
        selectPicture(title, jTextFieldModelPicture);
    }//GEN-LAST:event_jButtonSetModelPictureActionPerformed

    private void jRadioButtonLegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLegalActionPerformed
        jLabelClientName.setText("Razão Social:");
        jLabelClientSocialID.setText("CNPJ:");
        clearFields();
        try {
            jFormattedTextFieldClientSocialID.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##.###.###/####-##")));
        }
        catch (ParseException ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabelClientSocialName.setText("Nome Fantasia:");
        jFormattedTextFieldClientBirthDate.setEnabled(false);
        jComboBoxClientGender.setEnabled(false);
        try {
            listClient(evt);
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButtonLegalActionPerformed

    private void jRadioButtonIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonIndividualActionPerformed
        jLabelClientName.setText("Nome:");
        jLabelClientSocialID.setText("CPF:");
        clearFields();
        try {
            jFormattedTextFieldClientSocialID.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###.###.###-##")));
        }
        catch (ParseException ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabelClientSocialName.setText("Nome Social:");
        jFormattedTextFieldClientBirthDate.setEnabled(true);
        jComboBoxClientGender.setEnabled(true);
        try {
            listClient(evt);
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButtonIndividualActionPerformed

    private void jButtonUpdateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateClientActionPerformed
        try {
            int index = jTableModelClient.getSelectedRow();
            String clientName = jTextFieldClientName.getText().trim();
            String clientSocialId = jFormattedTextFieldClientSocialID.getText().trim();
            String clientSocialName = jTextFieldClientSocialName.getText().trim();
            String place = jTextFieldPlace.getText().trim();
            String neighborhood = jTextFieldNeighborhood.getText().trim();
            String number = jTextFieldNumber.getText().trim();
            String telephone = jFormattedTextFieldTelephone.getText().trim();
            String cellphone = jFormattedTextFieldCellphone.getText().trim();
            String email = jTextFieldEmail.getText().trim();

            boolean bool = clientName.isEmpty() || (clientSocialId.length() != 18 && clientSocialId.length() != 14) ||
            clientSocialName.isEmpty() || place.isEmpty() || neighborhood.isEmpty() || number.isEmpty() ||
            telephone.length() != 18 || cellphone.length() != 19 || email.isEmpty();

            switch(String.valueOf(bool)) {
                case "true":
                JOptionPane.showMessageDialog(jPanelClient, "Campos inválidos !");
                break;
                case "false":
                Adress adress = new Adress(place, number, neighborhood);
                Contact contact = new Contact(telephone, cellphone, email);
                Client updatedClient = null;
                if (jRadioButtonIndividual.isSelected()) {
                    String birthDateStr = jFormattedTextFieldClientBirthDate.getText();
                    String gender = jComboBoxClientGender.getSelectedItem().toString().toUpperCase();
                    if (birthDateStr.length() != 10) {
                        JOptionPane.showMessageDialog(jPanelClient, "Data de nascimento inválida !");
                        break;
                    }
                    else {
                        bool = false;
                        int clientId = Integer.parseInt(individualClientTableModel.getValueAt(index, 0).toString());
                        Date birthDate = sdf.parse(birthDateStr);
                        updatedClient = new IndividualClient(birthDate, clientId, clientName, clientSocialName, adress,
                                                             contact, clientSocialId, GenderEnum.valueOf(gender));
                        
                        IndividualClient clientObject = (IndividualClient) updatedClient;
                        if (clientObject.getAge() < 21) {
                            JOptionPane.showMessageDialog(jPanelClient, "Não é possível realizar o cadastro de menores de 21 anos !");
                            break;
                        }
                        
                        clientObject = new IndividualClient();

                        String[] vectClient = control.receiveFromServer(new IndividualClient(), Operation.READ);
                        for (String objectStr : vectClient) {
                            if(objectStr.isEmpty()) {
                                break;
                            }
                            clientObject.mount(objectStr);

                            if (updatedClient.getSocialId().equals(clientObject.getSocialId())) {
                                if (updatedClient.getId() == clientObject.getId()) {
                                    break;
                                }
                                bool = true;
                                JOptionPane.showMessageDialog(jPanelClient, "O CPF deste cliente já está cadastrado !");
                                break;
                            }
                        }
                    }
                }
                else {
                    bool = false;
                    int clientId = Integer.parseInt(legalClientTableModel.getValueAt(index, 0).toString());
                    updatedClient = new LegalClient(clientId, clientName, clientSocialName, adress, contact, clientSocialId);
                    LegalClient clientObject = new LegalClient();

                    String[] vectClient = control.receiveFromServer(new LegalClient(), Operation.READ);
                    for (String objectStr : vectClient) {
                        if (objectStr.isEmpty()) {
                            break;
                        }
                        clientObject.mount(objectStr);

                        boolean boolDatas = updatedClient.getSocialId().equals(clientObject.getSocialId());
                        boolDatas = boolDatas || updatedClient.getName().equals(clientObject.getName());

                        if (boolDatas) {
                            if (updatedClient.getId() == clientObject.getId()) {
                                break;
                            }
                            bool = true;
                            String alert = updatedClient.getSocialId().equals(clientObject.getSocialId()) ? "O CNPJ deste cliente já está cadastrado !" :
                            "Razão social já cadastrada !";
                            JOptionPane.showMessageDialog(jPanelClient, alert);
                            break;
                        }
                    }
                }
                if (bool) {
                    break;
                }

                control.includeData(updatedClient, Operation.UPDATE);
                JOptionPane.showMessageDialog(jPanelClient, "Cliente atualizado com sucesso !");
                listClient(evt);
                break;
            }
            clearFields();
        }
        catch (ParseException ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonUpdateClientActionPerformed

    private void jButtonIncludeClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncludeClientActionPerformed
        try {
            String clientName = jTextFieldClientName.getText().trim();
            String clientSocialId = jFormattedTextFieldClientSocialID.getText().trim();
            String clientSocialName = jTextFieldClientSocialName.getText().trim();
            String place = jTextFieldPlace.getText().trim();
            String neighborhood = jTextFieldNeighborhood.getText().trim();
            String number = jTextFieldNumber.getText().trim();
            String telephone = jFormattedTextFieldTelephone.getText().trim();
            String cellphone = jFormattedTextFieldCellphone.getText().trim();
            String email = jTextFieldEmail.getText().trim();

            boolean bool = clientName.isEmpty() || (clientSocialId.length() != 18 && clientSocialId.length() != 14) ||
            clientSocialName.isEmpty() || place.isEmpty() || neighborhood.isEmpty() || number.isEmpty() ||
            telephone.length() != 18 || cellphone.length() != 19 || email.isEmpty();

            switch(String.valueOf(bool)) {
                case "true":
                JOptionPane.showMessageDialog(jPanelClient, "Campos inválidos !");
                break;
                case "false":
                Adress adress = new Adress(place, number, neighborhood);
                Contact contact = new Contact(telephone, cellphone, email);
                Client client = null;
                if (jRadioButtonIndividual.isSelected()) {
                    String birthDateStr = jFormattedTextFieldClientBirthDate.getText();
                    String gender = jComboBoxClientGender.getSelectedItem().toString().toUpperCase();
                    if (birthDateStr.length() != 10) {
                        JOptionPane.showMessageDialog(jPanelClient, "Data de nascimento inválida !");
                        break;
                    }
                    else {
                        bool = false;
                        Date birthDate = sdf.parse(birthDateStr);
                        client = new IndividualClient(birthDate, clientName, clientSocialName, adress, contact, clientSocialId, GenderEnum.valueOf(gender));
                        
                        IndividualClient clientObject = (IndividualClient) client;
                        if (clientObject.getAge() < 21) {
                            bool = true;
                            JOptionPane.showMessageDialog(jPanelClient, "Não é possível realizar o cadastro de menores de 21 anos !");
                            break;
                        }
                        
                        clientObject = new IndividualClient();
                        
                        String[] vectClient = control.receiveFromServer(new IndividualClient(), Operation.READ);
                        for (String objectStr : vectClient) {
                            if (objectStr.isEmpty()) {
                                break;
                            }
                            clientObject.mount(objectStr);
                            if (client.getSocialId().equals(clientObject.getSocialId())) {
                                bool = true;
                                JOptionPane.showMessageDialog(jPanelClient, "O CPF deste cliente já está cadastrado !");
                                break;
                            }
                        }
                    }
                }
                else {
                    client = new LegalClient(clientName, clientSocialName, adress, contact, clientSocialId);
                    LegalClient clientObject = new LegalClient();

                    String[] vectClient = control.receiveFromServer(new LegalClient(), Operation.READ);
                    for (String objectStr : vectClient) {
                        if (objectStr.isEmpty()) {
                            break;
                        }
                        clientObject.mount(objectStr);
                        boolean boolDatas = client.getSocialId().equals(clientObject.getSocialId());
                        boolDatas = boolDatas || client.getName().equals(clientObject.getName());

                        if(boolDatas) {
                            bool = true;
                            String alert = client.getSocialId().equals(clientObject.getSocialId()) ? "O CNPJ deste cliente já está cadastrado !" :
                            "Razão social já cadastrada !";
                            JOptionPane.showMessageDialog(jPanelClient, alert);
                            break;
                        }
                    }
                }
                if (bool) {
                    break;
                }

                control.includeData(client, Operation.INCLUDE);
                JOptionPane.showMessageDialog(jPanelClient, "Cliente cadastrado com sucesso !");
                listClient(evt);
                break;
            }
            clearFields();
        }
        catch (ParseException ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonIncludeClientActionPerformed

    private void jTableModelBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableModelBrandMouseClicked
        int index = jTableModelBrand.getSelectedRow();
        ImageIcon brandIcon = new ImageIcon(brandTableModel.getValueAt(index, 2).toString());
        Image brandImage = brandIcon.getImage().getScaledInstance(jLabelBrandIcon.getWidth(), jLabelBrandIcon.getHeight(), Image.SCALE_DEFAULT);
        jLabelBrandIcon.setIcon(new ImageIcon(brandImage));
    }//GEN-LAST:event_jTableModelBrandMouseClicked

    private void jTableModelModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableModelModelMouseClicked
        int index = jTableModelModel.getSelectedRow();
        ImageIcon modelIcon = new ImageIcon(modelTableModel.getValueAt(index, 5).toString());
        Image modelImage = modelIcon.getImage().getScaledInstance(jLabelModelPicture.getWidth(), jLabelModelPicture.getHeight(), Image.SCALE_DEFAULT);
        jLabelModelPicture.setIcon(new ImageIcon(modelImage));
    }//GEN-LAST:event_jTableModelModelMouseClicked

    private void jComboBoxBrandModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBrandModelActionPerformed
        Brand brandModel = (Brand) jComboBoxBrandModel.getSelectedItem();
        if (brandModel != null) {
            ImageIcon brandModelIcon = new ImageIcon(brandModel.getIconPath());
        Image brandModelImage = brandModelIcon.getImage().getScaledInstance(jLabelBrandModelIcon.getWidth(), jLabelBrandModelIcon.getHeight(), Image.SCALE_DEFAULT);
        jLabelBrandModelIcon.setIcon(new ImageIcon(brandModelImage));
        }
    }//GEN-LAST:event_jComboBoxBrandModelActionPerformed

    private void jTableModelDriverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableModelDriverMouseClicked
        int index = jTableModelDriver.getSelectedRow();
        ImageIcon cnhDriverIcon = new ImageIcon(driverTableModel.getValueAt(index, 5).toString());
        Image cnhDriverImage = cnhDriverIcon.getImage().getScaledInstance(jLabelCNHPicture.getWidth(), jLabelCNHPicture.getHeight(), Image.SCALE_DEFAULT);
        jLabelCNHPicture.setIcon(new ImageIcon(cnhDriverImage));
    }//GEN-LAST:event_jTableModelDriverMouseClicked
    
    private void selectPicture(String title, JTextField textField) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle(title);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagem", "jpg", "png");
        fileChooser.setFileFilter(filter);
        
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            textField.setText(configWindowsPath(file.getPath()));
        }
    }
    
    private String configWindowsPath(String path) {
        String[] vectPath = path.split("\\\\");
        String pathConfig = "";
        for (int i = 0; i < vectPath.length; i++) {
            pathConfig += i != vectPath.length - 1 ? vectPath[i] + "\\" + "\\" : vectPath[i];
        }
        return pathConfig;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupClientType;
    private javax.swing.JButton jButtonCNHPicture;
    private javax.swing.JButton jButtonIncludeBrand;
    private javax.swing.JButton jButtonIncludeCategory;
    private javax.swing.JButton jButtonIncludeClient;
    private javax.swing.JButton jButtonIncludeDriver;
    private javax.swing.JButton jButtonIncludeModel;
    private javax.swing.JButton jButtonIncludeVehicle;
    private javax.swing.JButton jButtonSetBrandIcon;
    private javax.swing.JButton jButtonSetModelPicture;
    private javax.swing.JButton jButtonUpdateBrand;
    private javax.swing.JButton jButtonUpdateCategory;
    private javax.swing.JButton jButtonUpdateClient;
    private javax.swing.JButton jButtonUpdateDriver;
    private javax.swing.JButton jButtonUpdateModel;
    private javax.swing.JButton jButtonUpdateVehicle;
    private javax.swing.JComboBox<Brand> jComboBoxBrandModel;
    private javax.swing.JComboBox<String> jComboBoxClientGender;
    private javax.swing.JComboBox<String> jComboBoxDriverGenre;
    private javax.swing.JComboBox<Category> jComboBoxVehicleCategory;
    private javax.swing.JComboBox<Model> jComboBoxVehicleModel;
    private javax.swing.JFormattedTextField jFormattedTextFieldCategoryRentValue;
    private javax.swing.JFormattedTextField jFormattedTextFieldCellphone;
    private javax.swing.JFormattedTextField jFormattedTextFieldClientBirthDate;
    private javax.swing.JFormattedTextField jFormattedTextFieldClientSocialID;
    private javax.swing.JFormattedTextField jFormattedTextFieldDriverCNH;
    private javax.swing.JFormattedTextField jFormattedTextFieldDriverCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelephone;
    private javax.swing.JFormattedTextField jFormattedTextFieldVehicleLastMileage;
    private javax.swing.JFormattedTextField jFormattedTextFieldVehiclePlate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBrandIcon;
    private javax.swing.JLabel jLabelBrandIconPath;
    private javax.swing.JLabel jLabelBrandModelIcon;
    private javax.swing.JLabel jLabelBrandName;
    private javax.swing.JLabel jLabelCNHPath;
    private javax.swing.JLabel jLabelCNHPicture;
    private javax.swing.JLabel jLabelCategoryDescription;
    private javax.swing.JLabel jLabelCategoryRentValue;
    private javax.swing.JLabel jLabelCellphone;
    private javax.swing.JLabel jLabelClientBirthDate;
    private javax.swing.JLabel jLabelClientGender;
    private javax.swing.JLabel jLabelClientName;
    private javax.swing.JLabel jLabelClientSocialID;
    private javax.swing.JLabel jLabelClientSocialName;
    private javax.swing.JLabel jLabelDriverCNH;
    private javax.swing.JLabel jLabelDriverCPF;
    private javax.swing.JLabel jLabelDriverGernder;
    private javax.swing.JLabel jLabelDriverName;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelModelBrand;
    private javax.swing.JLabel jLabelModelColor;
    private javax.swing.JLabel jLabelModelName;
    private javax.swing.JLabel jLabelModelPicture;
    private javax.swing.JLabel jLabelModelPicturePath;
    private javax.swing.JLabel jLabelModelYear;
    private javax.swing.JLabel jLabelNeighborhood;
    private javax.swing.JLabel jLabelNumber;
    private javax.swing.JLabel jLabelPlace;
    private javax.swing.JLabel jLabelTelephone;
    private javax.swing.JLabel jLabelVehicleCategory;
    private javax.swing.JLabel jLabelVehicleIcon;
    private javax.swing.JLabel jLabelVehicleLastMileage;
    private javax.swing.JLabel jLabelVehicleModel;
    private javax.swing.JLabel jLabelVehiclePlate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelBrand;
    private javax.swing.JPanel jPanelCategory;
    private javax.swing.JPanel jPanelClient;
    private javax.swing.JPanel jPanelDriver;
    private javax.swing.JPanel jPanelModel;
    private javax.swing.JPanel jPanelVehicle;
    private javax.swing.JRadioButton jRadioButtonIndividual;
    private javax.swing.JRadioButton jRadioButtonLegal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerYearModel;
    private javax.swing.JTabbedPane jTabbedPaneCRUD;
    private javax.swing.JTable jTableModelBrand;
    private javax.swing.JTable jTableModelCategory;
    private javax.swing.JTable jTableModelClient;
    private javax.swing.JTable jTableModelDriver;
    private javax.swing.JTable jTableModelModel;
    private javax.swing.JTable jTableModelVehicle;
    private javax.swing.JTextField jTextFieldBrandIconPath;
    private javax.swing.JTextField jTextFieldBrandName;
    private javax.swing.JTextField jTextFieldCNHPicture;
    private javax.swing.JTextField jTextFieldCategoryDescription;
    private javax.swing.JTextField jTextFieldClientName;
    private javax.swing.JTextField jTextFieldClientSocialName;
    private javax.swing.JTextField jTextFieldDriverName;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldModelColor;
    private javax.swing.JTextField jTextFieldModelDescription;
    private javax.swing.JTextField jTextFieldModelPicture;
    private javax.swing.JTextField jTextFieldNeighborhood;
    private javax.swing.JTextField jTextFieldNumber;
    private javax.swing.JTextField jTextFieldPlace;
    // End of variables declaration//GEN-END:variables
}
