package laboratorio5_gabrielvasquez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        Usuario x = new Usuario("Gabriel", "gabs", "12345");
        usuarios.add(x);
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
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

        jMenu1.setText("Home");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cartas");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Clan");
        jMenuBar1.add(jMenu3);

        jd_VentanaUsuario.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jd_VentanaUsuarioLayout = new javax.swing.GroupLayout(jd_VentanaUsuario.getContentPane());
        jd_VentanaUsuario.getContentPane().setLayout(jd_VentanaUsuarioLayout);
        jd_VentanaUsuarioLayout.setHorizontalGroup(
            jd_VentanaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jd_VentanaUsuarioLayout.setVerticalGroup(
            jd_VentanaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
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
            if (tfr_nombre.getText().equals("") || tfr_apellido.getText().equals("") || tfr_usuario.getText().equals("") || pfr_contrasena.getText().equals("") ||
                    jdc_nacimiento.getDate() == null || br_color.getBackground() == null) {
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
                usuarios.add(new Usuario(nombre, apellido, usuario, contra, fecha, edad, color));

                tfr_nombre.setText("");
                tfr_apellido.setText("");
                tfr_usuario.setText("");
                pfr_contrasena.setText("");
                jdc_nacimiento.setCalendar(null);
                br_color.setBackground(null);
                JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente");
                jd_Registro.setVisible(false);
                jd_VentanaUsuario.setModal(true);
                jd_VentanaUsuario.pack();
                jd_VentanaUsuario.setLocationRelativeTo(this);
                jd_VentanaUsuario.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrión un error y no se pudio registrar el Usuario");
        }
    }//GEN-LAST:event_b_registerMouseClicked

    private void br_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_br_colorMouseClicked
        br_color.setBackground(JColorChooser.showDialog(this, "Seleccione un color", null));
    }//GEN-LAST:event_br_colorMouseClicked

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
    private javax.swing.JButton b_enter;
    private javax.swing.JButton b_register;
    private javax.swing.JButton br_color;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDialog jd_Registro;
    private javax.swing.JDialog jd_VentanaUsuario;
    private com.toedter.calendar.JDateChooser jdc_nacimiento;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JPasswordField pfr_contrasena;
    private javax.swing.JTextField tf_username;
    private javax.swing.JTextField tfr_apellido;
    private javax.swing.JTextField tfr_nombre;
    private javax.swing.JTextField tfr_usuario;
    // End of variables declaration//GEN-END:variables
    ArrayList<Usuario> usuarios = new ArrayList();
}