package laboratorio5_gabrielvasquez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Registro = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        b_register = new javax.swing.JButton();
        tfr_nombre = new javax.swing.JTextField();
        tfr_apellido = new javax.swing.JTextField();
        tfr_usuario = new javax.swing.JTextField();
        pfr_contrasena = new javax.swing.JPasswordField();
        jdc_nacimiento = new com.toedter.calendar.JDateChooser();
        br_color = new javax.swing.JButton();
        jd_VentanaUsuario = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        box_tipo = new javax.swing.JComboBox<>();
        js_dano = new javax.swing.JSpinner();
        js_hp = new javax.swing.JSpinner();
        tf_nombrecarta = new javax.swing.JTextField();
        b_create = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        box_mazo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_mazos = new javax.swing.JTree();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        popup_tree = new javax.swing.JPopupMenu();
        jmi_mostrar = new javax.swing.JMenuItem();
        jmi_mod = new javax.swing.JMenuItem();
        jd_Info = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_info = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        b_enter = new javax.swing.JButton();

        jd_Registro.setTitle("Registro");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel4.setText("Registro");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setText("Apellido");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setText("Nombre de Usuario");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setText("Contraseña");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel10.setText("Color Favorito");

        b_register.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        b_register.setText("Registrar");
        b_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_registerMouseClicked(evt);
            }
        });

        br_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                br_colorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_RegistroLayout = new javax.swing.GroupLayout(jd_Registro.getContentPane());
        jd_Registro.getContentPane().setLayout(jd_RegistroLayout);
        jd_RegistroLayout.setHorizontalGroup(
            jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_RegistroLayout.createSequentialGroup()
                .addGroup(jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_RegistroLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel4))
                    .addGroup(jd_RegistroLayout.createSequentialGroup()
                        .addGroup(jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jd_RegistroLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_RegistroLayout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jd_RegistroLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))))
                        .addGap(84, 84, 84)
                        .addGroup(jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfr_nombre)
                            .addComponent(tfr_apellido)
                            .addComponent(tfr_usuario)
                            .addComponent(pfr_contrasena)
                            .addComponent(jdc_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(br_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jd_RegistroLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(b_register, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jd_RegistroLayout.setVerticalGroup(
            jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_RegistroLayout.createSequentialGroup()
                .addGroup(jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_RegistroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfr_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfr_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfr_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_RegistroLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdc_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(br_color, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(b_register, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("LABORATORIO DE CARTAS");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel11.setText("Nombre");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel12.setText("Daño");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel13.setText("HP");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel15.setText("Tipo");

        box_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minipeka", "Montapuerco", "Golem", "Leñador", "Dragon Infernal", "Dragon", "Gigante Noble", "Pandilla de Duendes" }));

        js_dano.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        js_dano.setOpaque(false);

        js_hp.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        b_create.setText("Crear");
        b_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_createMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel16.setText("Mazo");

        box_mazo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mazo 1", "Mazo 2", "Mazo 3" }));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Mazos");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mazo 1");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mazo 2");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mazo 3");
        treeNode1.add(treeNode2);
        jt_mazos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_mazos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_mazosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_mazos);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Mazos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(35, 35, 35)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(js_hp, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(js_dano))
                                .addComponent(box_mazo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(224, 224, 224))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_nombrecarta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(107, 107, 107)
                                    .addComponent(b_create, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombrecarta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(js_dano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_hp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_mazo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(b_create, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        jTabbedPane2.addTab("Cartas", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Clan", jPanel4);

        javax.swing.GroupLayout jd_VentanaUsuarioLayout = new javax.swing.GroupLayout(jd_VentanaUsuario.getContentPane());
        jd_VentanaUsuario.getContentPane().setLayout(jd_VentanaUsuarioLayout);
        jd_VentanaUsuarioLayout.setHorizontalGroup(
            jd_VentanaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_VentanaUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jd_VentanaUsuarioLayout.setVerticalGroup(
            jd_VentanaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_VentanaUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jmi_mostrar.setText("Mostrar");
        jmi_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_mostrarActionPerformed(evt);
            }
        });
        popup_tree.add(jmi_mostrar);

        jmi_mod.setText("Modificar");
        popup_tree.add(jmi_mod);

        ta_info.setColumns(20);
        ta_info.setRows(5);
        jScrollPane2.setViewportView(ta_info);

        javax.swing.GroupLayout jd_InfoLayout = new javax.swing.GroupLayout(jd_Info.getContentPane());
        jd_Info.getContentPane().setLayout(jd_InfoLayout);
        jd_InfoLayout.setHorizontalGroup(
            jd_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jd_InfoLayout.setVerticalGroup(
            jd_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setText("Contraseña");

        b_enter.setText("Ingresar");
        b_enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_enterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_username)
                            .addComponent(pf_password, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(b_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel2)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(b_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_enterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_enterMouseClicked
        String us = "", pass = "";
        Usuario x = null;
        for (Usuario u : usuarios) {
            if (tf_username.getText().equals(u.getUser()) && pf_password.getText().equals(u.getPassword())) {
                us = tf_username.getText();
                pass = pf_password.getText();
                x = u;
            }
        }
        if (us.equals("") && pass.equals("")) {
            tf_username.setText("");
            pf_password.setText("");
            JOptionPane.showMessageDialog(this, "El usuario ingresado no ha sido encontrado, debe registrarse");
            this.setVisible(false);
            jd_Registro.setModal(true);
            jd_Registro.pack();
            jd_Registro.setLocationRelativeTo(this);
            jd_Registro.setVisible(true);
        } else {
            tf_username.setText("");
            pf_password.setText("");
            JOptionPane.showMessageDialog(this, "Bienvenido " + x.getNombre());
            dude = x;
            this.setVisible(false);
            jd_VentanaUsuario.setModal(true);
            jd_VentanaUsuario.pack();
            jd_VentanaUsuario.setLocationRelativeTo(this);
            jd_VentanaUsuario.setVisible(true);
        }
    }//GEN-LAST:event_b_enterMouseClicked

    private void b_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_registerMouseClicked
        String nombre, apellido, usuario, contra;
        Date fecha;
        int edad;
        Color color;
        try {
            if (tfr_nombre.getText().equals("") || tfr_apellido.getText().equals("") || tfr_usuario.getText().equals("") || pfr_contrasena.getText().equals("")
                    || jdc_nacimiento.getDate() == null || br_color.getBackground() == null) {
                JOptionPane.showMessageDialog(this, "Debe ingresar todos los datos que se le piden");
            } else {
                nombre = tfr_nombre.getText();
                apellido = tfr_apellido.getText();
                usuario = tfr_usuario.getText();
                contra = pfr_contrasena.getText();
                fecha = jdc_nacimiento.getDate();
                int año = (new Date()).getYear();
                edad = año - fecha.getYear();
                color = br_color.getBackground();
                usuarios.add(new Usuario(nombre, apellido, usuario, contra, fecha, edad, color, null, null, null));

                tfr_nombre.setText("");
                tfr_apellido.setText("");
                tfr_usuario.setText("");
                pfr_contrasena.setText("");
                jdc_nacimiento.setCalendar(null);
                br_color.setBackground(null);
                JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente");

                jd_Registro.setVisible(false);

                this.setVisible(true);
//                jd_VentanaUsuario.setModal(true);
//                jd_VentanaUsuario.pack();
//                jd_VentanaUsuario.setLocationRelativeTo(this);
//                jd_VentanaUsuario.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrión un error y no se pudio registrar el Usuario");
        }
    }//GEN-LAST:event_b_registerMouseClicked

    private void br_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_br_colorMouseClicked
        br_color.setBackground(JColorChooser.showDialog(this, "Seleccione un color", null));
    }//GEN-LAST:event_br_colorMouseClicked

    private void b_createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_createMouseClicked
        int x = box_tipo.getSelectedIndex();
        DefaultTreeModel m = (DefaultTreeModel) jt_mazos.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodo_tipo;
        DefaultMutableTreeNode nodo_carta;

        switch (box_mazo.getSelectedIndex()) {

            case 0:
                if (dude.getM1().getCartas().size() <= 3) {
                    Carta y = null;
                    switch (x) {
                        case 0:
                            y = new Minipekka(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Alta", 4, "Especial");
                            dude.getM1().getCartas().add(y);
                            break;
                        case 1:
                            y = new Montapuerco(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Alta", 4, "Especial");
                            dude.getM1().getCartas().add(y);
                            break;
                        case 2:
                            y = new Golem(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Baja", 8, "Epica");
                            dude.getM1().getCartas().add(y);
                            break;
                        case 3:
                            y = new Leñador(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Alta", 4, "Legendaria");
                            dude.getM1().getCartas().add(y);
                            break;
                        case 4:
                            y = new Dragon_Infernal(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres y Aereos", "Media", 4, "Legendaria");
                            dude.getM1().getCartas().add(y);
                            break;
                        case 5:
                            y = new Dragon(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres y Aereos", "Media", 4, "Epica");
                            dude.getM1().getCartas().add(y);
                            break;
                        case 6:
                            y = new Gigante_Noble(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Media", 6, "Comun");
                            dude.getM1().getCartas().add(y);
                            break;
                        case 7:
                            y = new Pandilla_Duendes(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres y Aereos", "Alta", 3, "Comun");
                            dude.getM1().getCartas().add(y);
                            break;
                    }
                    JOptionPane.showMessageDialog(this, "Carta creada exitosamente");
                    nodo_tipo = new DefaultMutableTreeNode(y.getRango());
                    nodo_carta = new DefaultMutableTreeNode(y);
                    ((DefaultMutableTreeNode) raiz.getChildAt(0)).add(nodo_tipo);
                    nodo_tipo.add(nodo_carta);
                    m.reload();
                } else {
                    JOptionPane.showMessageDialog(this, "El mazo ya está lleno");
                }
                break;

            case 1:
                if (dude.getM2().getCartas().size() <= 3) {
                    Carta y = null;
                    switch (x) {
                        case 0:
                            y = new Minipekka(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Alta", 4, "Especial");
                            dude.getM2().getCartas().add(y);
                            break;
                        case 1:
                            y = new Montapuerco(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Alta", 4, "Especial");
                            dude.getM2().getCartas().add(y);
                            break;
                        case 2:
                            y = new Golem(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Baja", 8, "Epica");
                            dude.getM2().getCartas().add(y);
                            break;
                        case 3:
                            y = new Leñador(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Alta", 4, "Legendaria");
                            dude.getM2().getCartas().add(y);
                            break;
                        case 4:
                            y = new Dragon_Infernal(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres y Aereos", "Media", 4, "Legendaria");
                            dude.getM2().getCartas().add(y);
                            break;
                        case 6:
                            y = new Dragon(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres y Aereos", "Media", 4, "Epica");
                            dude.getM2().getCartas().add(y);
                            break;
                        case 7:
                            y = new Gigante_Noble(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Media", 6, "Comun");
                            dude.getM2().getCartas().add(y);
                            break;
                        case 8:
                            y = new Pandilla_Duendes(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres y Aereos", "Alta", 3, "Comun");
                            dude.getM2().getCartas().add(y);
                            break;
                    }
                    JOptionPane.showMessageDialog(this, "Carta creada exitosamente");
                    nodo_tipo = new DefaultMutableTreeNode(y.getRango());
                    nodo_carta = new DefaultMutableTreeNode(y);
                    ((DefaultMutableTreeNode) raiz.getChildAt(1)).add(nodo_tipo);
                    nodo_tipo.add(nodo_carta);
                    m.reload();
                } else {
                    JOptionPane.showMessageDialog(this, "El mazo ya está lleno");
                }
                break;

            case 2:
                if (dude.getM3().getCartas().size() <= 3) {
                    Carta y = null;
                    switch (x) {
                        case 0:
                            y = new Minipekka(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Alta", 4, "Especial");
                            dude.getM3().getCartas().add(y);
                            break;
                        case 1:
                            y = new Montapuerco(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Alta", 4, "Especial");
                            dude.getM3().getCartas().add(y);
                            break;
                        case 2:
                            y = new Golem(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Baja", 8, "Epica");
                            dude.getM3().getCartas().add(y);
                            break;
                        case 3:
                            y = new Leñador(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Alta", 4, "Legendaria");
                            dude.getM3().getCartas().add(y);
                            break;
                        case 4:
                            y = new Dragon_Infernal(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres y Aereos", "Media", 4, "Legendaria");
                            dude.getM3().getCartas().add(y);
                            break;
                        case 5:
                            y = new Dragon(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres y Aereos", "Media", 4, "Epica");
                            dude.getM3().getCartas().add(y);
                            break;
                        case 6:
                            y = new Gigante_Noble(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres", "Media", 6, "Comun");
                            dude.getM3().getCartas().add(y);
                            break;
                        case 7:
                            y = new Pandilla_Duendes(tf_nombrecarta.getText(), (int) js_dano.getValue(), (int) js_hp.getValue(), "Terrestres y Aereos", "Alta", 3, "Comun");
                            dude.getM3().getCartas().add(y);
                            break;
                    }
                    JOptionPane.showMessageDialog(this, "Carta creada exitosamente");
                    nodo_tipo = new DefaultMutableTreeNode(y.getRango());
                    nodo_carta = new DefaultMutableTreeNode(y);
                    ((DefaultMutableTreeNode) raiz.getChildAt(2)).add(nodo_tipo);
                    nodo_tipo.add(nodo_carta);
                    m.reload();
                } else {
                    JOptionPane.showMessageDialog(this, "El mazo ya está lleno");
                }
                break;
        }
    }//GEN-LAST:event_b_createMouseClicked

    private void jt_mazosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_mazosMouseClicked
        if (evt.isMetaDown()) {
            ta_info.setText("");
            int row = jt_mazos.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_mazos.setSelectionRow(row);
            Object v1 = jt_mazos.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            if (nodo_seleccionado.getUserObject() instanceof Carta) {
                carta_seleccionada = (Carta) nodo_seleccionado.getUserObject();
                popup_tree.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_mazosMouseClicked

    private void jmi_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_mostrarActionPerformed
        jd_Info.setModal(true);
        jd_Info.pack();
        jd_Info.setLocationRelativeTo(this);
        jd_Info.setVisible(true);
        ta_info.append("Nombre: " + carta_seleccionada.getNombre() + "\nDaño: " + carta_seleccionada.getDamage() + "\nPuntos de Vida: " + carta_seleccionada.getHp() + "\nObjetivos: "
                + carta_seleccionada.getObjetivo() + "\nVelocidad: " + carta_seleccionada.getVelocidad() + "\nCosto de Elixir: " + carta_seleccionada.getElixir());
    }//GEN-LAST:event_jmi_mostrarActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_create;
    private javax.swing.JButton b_enter;
    private javax.swing.JButton b_register;
    private javax.swing.JComboBox<String> box_mazo;
    private javax.swing.JComboBox<String> box_tipo;
    private javax.swing.JButton br_color;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JDialog jd_Info;
    private javax.swing.JDialog jd_Registro;
    private javax.swing.JDialog jd_VentanaUsuario;
    private com.toedter.calendar.JDateChooser jdc_nacimiento;
    private javax.swing.JMenuItem jmi_mod;
    private javax.swing.JMenuItem jmi_mostrar;
    private javax.swing.JSpinner js_dano;
    private javax.swing.JSpinner js_hp;
    private javax.swing.JTree jt_mazos;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JPasswordField pfr_contrasena;
    private javax.swing.JPopupMenu popup_tree;
    private javax.swing.JTextArea ta_info;
    private javax.swing.JTextField tf_nombrecarta;
    private javax.swing.JTextField tf_username;
    private javax.swing.JTextField tfr_apellido;
    private javax.swing.JTextField tfr_nombre;
    private javax.swing.JTextField tfr_usuario;
    // End of variables declaration//GEN-END:variables
    ArrayList<Usuario> usuarios = new ArrayList();
    Usuario dude;
    DefaultMutableTreeNode nodo_seleccionado;
    Carta carta_seleccionada;
}