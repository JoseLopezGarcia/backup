/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricky
 */
public class frmParametro extends javax.swing.JFrame {

    boolean estadoMenu;
    
    public frmParametro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBarraSuperior = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblBotonCerrar = new javax.swing.JLabel();
        jpnMenu = new javax.swing.JPanel();
        lblSucursales = new javax.swing.JLabel();
        lblInventario = new javax.swing.JLabel();
        lblProveedores = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblVentas = new javax.swing.JLabel();
        lblMenuCerrar = new javax.swing.JLabel();
        lblParametro = new javax.swing.JLabel();
        lblCompras = new javax.swing.JLabel();
        jpnCompras = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        txtDireccionParametro = new javax.swing.JTextField();
        txtNombreParametro = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtTelefonoParametro = new javax.swing.JFormattedTextField();
        txtMailParametro = new javax.swing.JTextField();
        btnGuardarModificarProveedor = new javax.swing.JButton();
        txtIVAParametro = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtPercepcionParametro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/iconos/home/lanzador.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnBarraSuperior.setBackground(new java.awt.Color(102, 0, 0));
        jpnBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpnBarraSuperiorMouseDragged(evt);
            }
        });
        jpnBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnBarraSuperiorMousePressed(evt);
            }
        });
        jpnBarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Menu.png"))); // NOI18N
        menu.setToolTipText("Menú");
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });
        jpnBarraSuperior.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 8, 50, 40));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Home.png"))); // NOI18N
        home.setToolTipText("Ir a Home");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jpnBarraSuperior.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 10, 50, 40));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");
        jpnBarraSuperior.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 10, 60));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setToolTipText("");
        jpnBarraSuperior.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 60, 60));

        lblBotonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/home/exit32.png"))); // NOI18N
        lblBotonCerrar.setToolTipText("Salir");
        lblBotonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonCerrarMouseClicked(evt);
            }
        });
        jpnBarraSuperior.add(lblBotonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 30, 55));

        getContentPane().add(jpnBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 55));

        jpnMenu.setBackground(new java.awt.Color(102, 0, 0));
        jpnMenu.setPreferredSize(new java.awt.Dimension(80, 304));
        jpnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnMenuMouseExited(evt);
            }
        });
        jpnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSucursales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Sucursales.png"))); // NOI18N
        lblSucursales.setToolTipText("Sucursales");
        lblSucursales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSucursalesMouseClicked(evt);
            }
        });
        jpnMenu.add(lblSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 270, -1, 30));

        lblInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Inventario.png"))); // NOI18N
        lblInventario.setToolTipText("Inventario");
        lblInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInventarioMouseClicked(evt);
            }
        });
        jpnMenu.add(lblInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 230, -1, 30));

        lblProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Proveedores.png"))); // NOI18N
        lblProveedores.setToolTipText("Proveedores");
        lblProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProveedoresMouseClicked(evt);
            }
        });
        jpnMenu.add(lblProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 190, -1, 30));

        lblProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Productos.png"))); // NOI18N
        lblProductos.setToolTipText("Productos");
        lblProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblProductosMouseEntered(evt);
            }
        });
        jpnMenu.add(lblProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 150, -1, 30));

        lblVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ventas.png"))); // NOI18N
        lblVentas.setToolTipText("Ventas");
        lblVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVentasMouseClicked(evt);
            }
        });
        jpnMenu.add(lblVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, 30));

        lblMenuCerrar.setBackground(new java.awt.Color(0, 0, 0));
        lblMenuCerrar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMenuCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Menu.png"))); // NOI18N
        lblMenuCerrar.setToolTipText("Cerrar");
        lblMenuCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuCerrar.setOpaque(true);
        lblMenuCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuCerrarMouseClicked(evt);
            }
        });
        jpnMenu.add(lblMenuCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 55));

        lblParametro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Parametro.png"))); // NOI18N
        lblParametro.setToolTipText("Sucursales");
        lblParametro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblParametro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblParametroMouseClicked(evt);
            }
        });
        jpnMenu.add(lblParametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 310, -1, 30));

        lblCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Compras.png"))); // NOI18N
        lblCompras.setToolTipText("Compras");
        lblCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComprasMouseClicked(evt);
            }
        });
        jpnMenu.add(lblCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, -1, 30));

        getContentPane().add(jpnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -360, 80, 358));

        jpnCompras.setBackground(new java.awt.Color(0, 0, 0));
        jpnCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jpnCompras.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 20, 50));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(240, 240, 240));
        jLabel34.setText("Modificar el Parámetro:");
        jpnCompras.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 12, -1, 30));

        getContentPane().add(jpnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, 50));

        txtDireccionParametro.setForeground(new java.awt.Color(102, 0, 0));
        txtDireccionParametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionParametroActionPerformed(evt);
            }
        });
        txtDireccionParametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionParametroKeyTyped(evt);
            }
        });
        getContentPane().add(txtDireccionParametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 410, 30));

        txtNombreParametro.setForeground(new java.awt.Color(102, 0, 0));
        txtNombreParametro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombreParametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreParametroActionPerformed(evt);
            }
        });
        txtNombreParametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreParametroKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreParametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 410, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Nombre:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Teléfono:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Dirección:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, 20));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("E-Mail:");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, 20));

        txtTelefonoParametro.setForeground(new java.awt.Color(102, 0, 0));
        try {
            txtTelefonoParametro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonoParametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoParametroActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefonoParametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 230, 30));

        txtMailParametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMailParametroKeyTyped(evt);
            }
        });
        getContentPane().add(txtMailParametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 200, 30));

        btnGuardarModificarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/botones/guardarprov.png"))); // NOI18N
        btnGuardarModificarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarModificarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarModificarProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarModificarProveedorMouseExited(evt);
            }
        });
        btnGuardarModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModificarProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarModificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 600, 110, 30));

        txtIVAParametro.setForeground(new java.awt.Color(102, 0, 0));
        txtIVAParametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIVAParametroActionPerformed(evt);
            }
        });
        txtIVAParametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIVAParametroKeyTyped(evt);
            }
        });
        getContentPane().add(txtIVAParametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 410, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("IVA:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Percepción:");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, 20));

        txtPercepcionParametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPercepcionParametroKeyTyped(evt);
            }
        });
        getContentPane().add(txtPercepcionParametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 200, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionParametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionParametroActionPerformed
        txtMailParametro.requestFocus();
    }//GEN-LAST:event_txtDireccionParametroActionPerformed

    private void txtDireccionParametroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionParametroKeyTyped
        char mayu=evt.getKeyChar();
        if (Character.isLowerCase(mayu)) {
            String cadena=(""+mayu).toUpperCase();
            mayu=cadena.charAt(0);
            evt.setKeyChar(mayu);
        }
        else{

        }
    }//GEN-LAST:event_txtDireccionParametroKeyTyped

    private void txtNombreParametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreParametroActionPerformed
        txtTelefonoParametro.requestFocus();
    }//GEN-LAST:event_txtNombreParametroActionPerformed

    private void txtNombreParametroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreParametroKeyTyped
        char mayu=evt.getKeyChar();
        if (Character.isLowerCase(mayu)) {
            String cadena=(""+mayu).toUpperCase();
            mayu=cadena.charAt(0);
            evt.setKeyChar(mayu);
        }
        else{

        }
    }//GEN-LAST:event_txtNombreParametroKeyTyped

    private void txtTelefonoParametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoParametroActionPerformed
        txtDireccionParametro.requestFocus();
    }//GEN-LAST:event_txtTelefonoParametroActionPerformed

    private void txtMailParametroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailParametroKeyTyped
        char c = evt.getKeyChar();
        //if(txtNIT.getText().length()>=14){
            evt.consume();
        //}else{
            if (c < '0' || c > '9') {

                if (c != (char) KeyEvent.VK_BEGIN) {
                    if (c != (char) KeyEvent.VK_BACK_SPACE) {
                        if (c != (char) KeyEvent.VK_DELETE) {
                            if (c != (char) KeyEvent.VK_ENTER) {
                                evt.consume();
                                JOptionPane.showMessageDialog(null, "Solo Numeros", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            //}
        }
    }//GEN-LAST:event_txtMailParametroKeyTyped

    private void btnGuardarModificarProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarModificarProveedorMouseEntered
        btnGuardarModificarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/botones/guardarprovB.png")));
    }//GEN-LAST:event_btnGuardarModificarProveedorMouseEntered

    private void btnGuardarModificarProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarModificarProveedorMouseExited
        btnGuardarModificarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/botones/guardarprov.png")));
    }//GEN-LAST:event_btnGuardarModificarProveedorMouseExited

    private void btnGuardarModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModificarProveedorActionPerformed

    }//GEN-LAST:event_btnGuardarModificarProveedorActionPerformed

    private void txtIVAParametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIVAParametroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVAParametroActionPerformed

    private void txtIVAParametroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIVAParametroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVAParametroKeyTyped

    private void txtPercepcionParametroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPercepcionParametroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPercepcionParametroKeyTyped

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        if(estadoMenu==true){
            Animacion.Animacion.subir(0, -360, 1, 2, jpnMenu);
            estadoMenu=false;
        }else{
            Animacion.Animacion.bajar(-360, 0, 1, 2, jpnMenu);
            estadoMenu=true;
        }
    }//GEN-LAST:event_menuMouseClicked

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited

    }//GEN-LAST:event_menuMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        frmHome home = new frmHome();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void lblBotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblBotonCerrarMouseClicked

    private void jpnBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnBarraSuperiorMouseDragged

    }//GEN-LAST:event_jpnBarraSuperiorMouseDragged

    private void jpnBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnBarraSuperiorMousePressed

    }//GEN-LAST:event_jpnBarraSuperiorMousePressed

    private void lblSucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSucursalesMouseClicked
        frmSucursales sc = new frmSucursales();
        sc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblSucursalesMouseClicked

    private void lblInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInventarioMouseClicked
        frmInventario iv = new frmInventario();
        iv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblInventarioMouseClicked

    private void lblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProveedoresMouseClicked
        frmProveedores pv = new frmProveedores();
        pv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblProveedoresMouseClicked

    private void lblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseClicked
        frmProductos pd = new frmProductos();
        pd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblProductosMouseClicked

    private void lblProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseEntered

    }//GEN-LAST:event_lblProductosMouseEntered

    private void lblVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVentasMouseClicked
        frmVentas vt = new frmVentas();
        vt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblVentasMouseClicked

    private void lblMenuCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuCerrarMouseClicked
        if(estadoMenu==true){
            Animacion.Animacion.subir(0, -360, 1, 2, jpnMenu);
            estadoMenu=false;
        }
    }//GEN-LAST:event_lblMenuCerrarMouseClicked

    private void lblParametroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParametroMouseClicked
        frmParametro pt = new frmParametro();
        pt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblParametroMouseClicked

    private void lblComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprasMouseClicked
        frmCompras cm = new frmCompras();
        cm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblComprasMouseClicked

    private void jpnMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnMenuMouseExited

    }//GEN-LAST:event_jpnMenuMouseExited

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmParametro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmParametro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmParametro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmParametro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmParametro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarModificarProveedor;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel jpnBarraSuperior;
    private javax.swing.JPanel jpnCompras;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JLabel lblBotonCerrar;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblMenuCerrar;
    private javax.swing.JLabel lblParametro;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JLabel lblSucursales;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JLabel menu;
    private javax.swing.JTextField txtDireccionParametro;
    private javax.swing.JTextField txtIVAParametro;
    private javax.swing.JTextField txtMailParametro;
    private javax.swing.JTextField txtNombreParametro;
    private javax.swing.JTextField txtPercepcionParametro;
    private javax.swing.JFormattedTextField txtTelefonoParametro;
    // End of variables declaration//GEN-END:variables
}
