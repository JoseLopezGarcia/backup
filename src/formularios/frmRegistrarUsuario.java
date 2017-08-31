/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.ControladorProveedor;
import clases.ControladorUsuario;
import clases.ErrorTienda;
import clases.Proveedor;
import clases.Usuario;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author proxc
 */
public class frmRegistrarUsuario extends javax.swing.JFrame {
    int numeroAleatorio = (int) (Math.random()*9999+0001);
    /**
     * Creates new form NewJFrame
     */
    public frmRegistrarUsuario() {
        initComponents();
        lblPIN.setText("Contraseña Aleatoria: "+numeroAleatorio);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtNombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        txtDUI = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFemenino = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtNIT = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        dtcNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        pnl_overlay = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPIN = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/iconos/home/lanzador.png")).getImage());
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa los datos:");

        txtApellidos.setBackground(new java.awt.Color(102, 0, 0));
        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setBorder(null);
        txtApellidos.setCaretColor(new java.awt.Color(255, 255, 255));
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombres:");

        txtNombres.setBackground(new java.awt.Color(102, 0, 0));
        txtNombres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setBorder(null);
        txtNombres.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DUI:");

        btnAgregar.setBackground(new java.awt.Color(57, 137, 186));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("¡Iniciemos!");
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtDUI.setBackground(new java.awt.Color(102, 0, 0));
        txtDUI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDUI.setForeground(new java.awt.Color(255, 255, 255));
        txtDUI.setBorder(null);
        txtDUI.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDUIActionPerformed(evt);
            }
        });
        txtDUI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDUIKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NIT:");

        rbtMasculino.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup1.add(rbtMasculino);
        rbtMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbtMasculino.setText("M");

        rbtFemenino.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup1.add(rbtFemenino);
        rbtFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbtFemenino.setText("F");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sexo:");

        txtNIT.setBackground(new java.awt.Color(102, 0, 0));
        txtNIT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNIT.setForeground(new java.awt.Color(255, 255, 255));
        txtNIT.setBorder(null);
        txtNIT.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNITActionPerformed(evt);
            }
        });
        txtNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNITKeyTyped(evt);
            }
        });

        dtcNacimiento.setDateFormatString("dd/MM/yyyy");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("F. Nacimiento:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Rol en Tienda:");

        cmbCargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comprador", "Vendedor", "Analista", " " }));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Agregarás un nuevo usuario");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Dirección:");

        txtDireccion.setBackground(new java.awt.Color(102, 0, 0));
        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setBorder(null);
        txtDireccion.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(txtApellidos)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2)
                        .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                        .addComponent(jSeparator3)
                        .addComponent(txtDUI))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(22, 22, 22)
                        .addComponent(rbtMasculino)
                        .addGap(18, 18, 18)
                        .addComponent(rbtFemenino))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dtcNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator5)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator4)
                            .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(rbtMasculino))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbtFemenino)
                        .addGap(12, 12, 12)
                        .addComponent(dtcNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 650));

        pnl_overlay.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_overlayMouseDragged(evt);
            }
        });
        pnl_overlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_overlayMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/LogoRegistro.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("IShop - Registro de Usuario");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/Mas.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Datos de Usuario:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        exit.setBackground(new java.awt.Color(102, 0, 0));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 0, 0));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario:");

        lblPIN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPIN.setForeground(new java.awt.Color(102, 102, 102));
        lblPIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPIN.setText("Contraseña primeriza: ");

        btnAtras.setBackground(new java.awt.Color(102, 0, 0));
        btnAtras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(102, 0, 0));
        btnAtras.setText("¡Volver atrás!");
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setFocusPainted(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_overlayLayout = new javax.swing.GroupLayout(pnl_overlay);
        pnl_overlay.setLayout(pnl_overlayLayout);
        pnl_overlayLayout.setHorizontalGroup(
            pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_overlayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_overlayLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPIN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 109, Short.MAX_VALUE))
        );
        pnl_overlayLayout.setVerticalGroup(
            pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_overlayLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPIN)
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jPanel1.add(pnl_overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 490, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void mensajeNotificacion(String mensaje, String tipo){
        if(tipo.equals("Error")){
        frmNotificacion not = new frmNotificacion();
        not.Mensaje(mensaje);
        not.setVisible(true);
        not.lblIcono.setIcon(new ImageIcon(getClass().getResource("/iconos/Error.png")));
        //not.setIcon(new ImageIcon(getClass().getResource("/iconos/botones/eliminar.png")));
        }else if(tipo == "Ok"){
        frmNotificacion not = new frmNotificacion();
        not.Mensaje(mensaje);
        not.setVisible(true);
        not.lblIcono.setIcon(new ImageIcon(getClass().getResource("/iconos/Ok.png")));
        }else if(tipo == "Adv"){
        frmNotificacion not = new frmNotificacion();
        not.Mensaje(mensaje);
        not.setVisible(true);
        not.lblIcono.setIcon(new ImageIcon(getClass().getResource("/iconos/Adv.png")));
        }
    }
    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        txtDUI.requestFocus();
    }//GEN-LAST:event_txtNombresActionPerformed
    int xy;
    int xx;
         
    private void pnl_overlayMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_overlayMouseDragged
        // TODO add your handling code here:int x = evt.getXOnScreen();
       
    }//GEN-LAST:event_pnl_overlayMouseDragged

    private void pnl_overlayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_overlayMousePressed
        // TODO add your handling code here:
          
        
    }//GEN-LAST:event_pnl_overlayMousePressed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void txtDUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDUIActionPerformed
        txtNIT.requestFocus();
    }//GEN-LAST:event_txtDUIActionPerformed

    private void txtNITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNITActionPerformed
        txtDireccion.requestFocus();
    }//GEN-LAST:event_txtNITActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Usuario agregado=new Usuario();
        int idUsuario;
        if (txtApellidos.getText().equals("") || txtNombres.getText().equals("") || txtDUI.getText().equals("") || txtNIT.getText().equals("")  || txtDireccion.getText().equals("")) {
            mensajeNotificacion("Debe de rellenar todos los campos.", "Error");
        }
        else{
            if(txtNIT.getText().length() != 14){
                mensajeNotificacion("El NIT debe de contener 14 digitos.", "Adv");
                txtNIT.requestFocus();
                txtNIT.selectAll();
            }
            else{
            try {
                idUsuario = ControladorUsuario.ObtenerIdUsuario();
                agregado.setIdUsuario(idUsuario+1);
            } catch (ErrorTienda ex) {
                Logger.getLogger(frmRegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
              }
                  agregado.setApellidos(txtApellidos.getText());
                  agregado.setNombres(txtNombres.getText());
                  agregado.setDUI(txtDUI.getText());
                  agregado.setNIT(txtNIT.getText());
                  agregado.setDireccion(txtDireccion.getText());
                  if(rbtMasculino.isSelected()){
                      agregado.setSexo("M");
                  }else if(rbtFemenino.isSelected()){
                      agregado.setSexo("F");
                  }
                  Date fecha= dtcNacimiento.getDate();
                  SimpleDateFormat formatofecha=new SimpleDateFormat("YYYY-MM-dd");
                  agregado.setFechaNacimiento(formatofecha.format(fecha));
                  System.out.println();
                  //agregado.setRol(1);
                  agregado.setClave(""+numeroAleatorio);
                  agregado.setUsuario("lala");
              try {
              ControladorUsuario.Agregar(agregado);
              //mensajeNotificacion("¡Proveedor agregado exitosamente!", "Ok");
              //tblProveedores.removeAll();
             //actualizarTablaProveedor();
              
              } catch (ErrorTienda e) {      
           }
                
        }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        txtNombres.requestFocus();
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        char mayu=evt.getKeyChar();
        if (Character.isLowerCase(mayu)) {
            String cadena=(""+mayu).toUpperCase();
            mayu=cadena.charAt(0);
            evt.setKeyChar(mayu);
        }
        else{

        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char mayu=evt.getKeyChar();
        if (Character.isLowerCase(mayu)) {
            String cadena=(""+mayu).toUpperCase();
            mayu=cadena.charAt(0);
            evt.setKeyChar(mayu);
        }
        else{

        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        char mayu=evt.getKeyChar();
        if (Character.isLowerCase(mayu)) {
            String cadena=(""+mayu).toUpperCase();
            mayu=cadena.charAt(0);
            evt.setKeyChar(mayu);
        }
        else{

        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtNITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNITKeyTyped
        char c = evt.getKeyChar();
        if(txtNIT.getText().length()>=14){
            evt.consume();
        }else{
            if (c < '0' || c > '9') {

                if (c != (char) KeyEvent.VK_BEGIN) {
                    if (c != (char) KeyEvent.VK_BACK_SPACE) {
                        if (c != (char) KeyEvent.VK_DELETE) {
                            if (c != (char) KeyEvent.VK_ENTER) {
                                evt.consume();
                                mensajeNotificacion("¡Error! Solo números.", "Error");
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_txtNITKeyTyped

    private void txtDUIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDUIKeyTyped
        char c = evt.getKeyChar();
        if(txtDUI.getText().length()>=9){
            evt.consume();
        }else{
            if (c < '0' || c > '9') {

                if (c != (char) KeyEvent.VK_BEGIN) {
                    if (c != (char) KeyEvent.VK_BACK_SPACE) {
                        if (c != (char) KeyEvent.VK_DELETE) {
                            if (c != (char) KeyEvent.VK_ENTER) {
                                evt.consume();
                                mensajeNotificacion("¡Error! Solo números.", "Error");
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_txtDUIKeyTyped
                       
                                       

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCargo;
    private com.toedter.calendar.JDateChooser dtcNacimiento;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblPIN;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnl_overlay;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDUI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}