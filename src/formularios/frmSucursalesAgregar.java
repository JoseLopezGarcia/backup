/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.ControladorProveedor;
import clases.ControladorSucursal;
import clases.ErrorTienda;
import clases.Sucursal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricky
 */
public class frmSucursalesAgregar extends javax.swing.JFrame {

    public DefaultTableModel modeloSucursales= new DefaultTableModel();
    boolean encontradoSuc;

    public frmSucursalesAgregar() {
        initComponents();
        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);
        limpiandoTxtSucursal();
    }
    
    //METODO GENERAL PARA ENVIAR MENSAJES POR NOTIFICAICON DE FRMNOTIFICACION
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
           //---------------------------Busca datos repetidos----------------------------------------
        public void buscarRepetidos(){
            modeloSucursales.setRowCount(0);
            
            ArrayList<Sucursal> listaSucursal=new ArrayList();
            Object fila[]=new Object[4];
            
        
            try {
            listaSucursal=ControladorSucursal.obtener();
            String[] nombreSucursal = new String []{"IdSucursal","Nombre","Direccion","Telefono"};
            modeloSucursales.setColumnIdentifiers(nombreSucursal);
            Iterator<Sucursal> prov=listaSucursal.iterator();
                while(prov.hasNext()){
                    fila[0]= prov.next();
                    fila[1]= prov.next();
                    fila[2]= prov.next();
                    fila[3]= prov.next();
                    modeloSucursales.addRow(fila);
                    tblSucursales.setModel(modeloSucursales);
                }
            }
            
         catch (ErrorTienda ex) {
             Logger.getLogger(frmProveedores.class.getName()).log(Level.SEVERE, null, ex);
            
        
         }
    }
    public void limpiandoTxtSucursal(){
        txtIDSucursal.setText("");
        txtNombreSucursal.setText("");
        txtDireccionSucursal.setText("");
        txtTelefonoSucursal.setText("");
        txtNombreSucursal.requestFocus();
        int idSuc;
        try {
            idSuc = ControladorSucursal.ObtenerIdMax();
            idSuc = idSuc+1;
            txtIDSucursal.setText(""+idSuc);
        } catch (ErrorTienda ex) {
            Logger.getLogger(frmProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    public void guardarDatos(){
        Sucursal agregado=new Sucursal();
        int idSuc;
        encontradoSuc = false;
        if (txtNombreSucursal.getText().equals("") || txtDireccionSucursal.getText().equals("") || txtTelefonoSucursal.getText().equals("")) {
            mensajeNotificacion("Debe de rellenar todos los campos.", "Error");
        }
        else{
            try {
                idSuc = ControladorSucursal.ObtenerIdMax();
                agregado.setIdSucursal(idSuc+1);
            } catch (ErrorTienda ex) {
                Logger.getLogger(frmProveedoresAgregar.class.getName()).log(Level.SEVERE, null, ex);
              }
              buscarRepetidos();
              if (tblSucursales.getRowCount()>0) {
                  int i = 0;
                     while (encontradoSuc==false&&i<tblSucursales.getRowCount()) {
                     encontradoSuc = tblSucursales.getValueAt(i, 1).equals(txtNombreSucursal.getText());
                     i++;
                  }
              }
              if(encontradoSuc == false){
                  agregado.setNombre(txtNombreSucursal.getText());
                  agregado.setTelefono(txtTelefonoSucursal.getText());
                  agregado.setDireccion(txtDireccionSucursal.getText());
              try {
              ControladorSucursal.agregarSucursal(agregado);
              mensajeNotificacion("¡Sucursal agregada exitosamente!", "Ok");
              limpiandoTxtSucursal();

              } catch (ErrorTienda e) {      
           }
        }else{mensajeNotificacion("¡Error! Sucursal ya registrada.", "Error");}
              encontradoSuc=false;
              txtNombreSucursal.requestFocus();
              txtNombreSucursal.selectAll();
                
        }
        //LlenarCompra();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSucursales = new javax.swing.JTable();
        jpnBarraSuperior = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblAtras = new javax.swing.JLabel();
        jpnCompras = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        txtIDSucursal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccionSucursal = new javax.swing.JTextField();
        txtNombreSucursal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTelefonoSucursal = new javax.swing.JFormattedTextField();
        btnGuardarSucursal = new javax.swing.JButton();

        tblSucursales =new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idSucursal", "Sucursal", "Teléfono", "Dirección"
            }
        ));
        tblSucursales.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblSucursales);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 700));
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

        lblLogo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/home/lanzador.png"))); // NOI18N
        lblLogo.setToolTipText("");
        jpnBarraSuperior.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 50, 50));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");
        jpnBarraSuperior.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, 60));

        lblAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Atras.png"))); // NOI18N
        lblAtras.setToolTipText("Volver Atrás");
        lblAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });
        jpnBarraSuperior.add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 50, 40));

        getContentPane().add(jpnBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 55));

        jpnCompras.setBackground(new java.awt.Color(0, 0, 0));
        jpnCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jpnCompras.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 20, 50));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(240, 240, 240));
        jLabel34.setText("Agregar una Sucursal:");
        jpnCompras.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 12, -1, 30));

        txtIDSucursal.setEditable(false);
        txtIDSucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDSucursalKeyTyped(evt);
            }
        });
        jpnCompras.add(txtIDSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 90, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID:");
        jpnCompras.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, 30));

        getContentPane().add(jpnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, 50));

        txtDireccionSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionSucursalActionPerformed(evt);
            }
        });
        txtDireccionSucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionSucursalKeyTyped(evt);
            }
        });
        getContentPane().add(txtDireccionSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 410, 30));

        txtNombreSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombreSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSucursalActionPerformed(evt);
            }
        });
        txtNombreSucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreSucursalKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 410, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nombre:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Teléfono:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Dirección:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, 20));

        try {
            txtTelefonoSucursal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonoSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefonoSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 230, 30));

        btnGuardarSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/botones/guardarprov.png"))); // NOI18N
        btnGuardarSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarSucursal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarSucursalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarSucursalMouseExited(evt);
            }
        });
        btnGuardarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 110, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        frmSucursales su = new frmSucursales();
        su.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void jpnBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnBarraSuperiorMouseDragged

    }//GEN-LAST:event_jpnBarraSuperiorMouseDragged

    private void jpnBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnBarraSuperiorMousePressed

    }//GEN-LAST:event_jpnBarraSuperiorMousePressed

    private void txtIDSucursalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDSucursalKeyTyped

    }//GEN-LAST:event_txtIDSucursalKeyTyped

    private void txtDireccionSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionSucursalActionPerformed
        txtTelefonoSucursal.requestFocus();
    }//GEN-LAST:event_txtDireccionSucursalActionPerformed

    private void txtDireccionSucursalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionSucursalKeyTyped
        char mayu=evt.getKeyChar();
        if (Character.isLowerCase(mayu)) {
            String cadena=(""+mayu).toUpperCase();
            mayu=cadena.charAt(0);
            evt.setKeyChar(mayu);
        }
        else{

        }
    }//GEN-LAST:event_txtDireccionSucursalKeyTyped

    private void txtNombreSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSucursalActionPerformed
        txtDireccionSucursal.requestFocus();
    }//GEN-LAST:event_txtNombreSucursalActionPerformed

    private void txtNombreSucursalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreSucursalKeyTyped
        char mayu=evt.getKeyChar();
        if (Character.isLowerCase(mayu)) {
            String cadena=(""+mayu).toUpperCase();
            mayu=cadena.charAt(0);
            evt.setKeyChar(mayu);
        }
        else{

        }
    }//GEN-LAST:event_txtNombreSucursalKeyTyped

    private void txtTelefonoSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoSucursalActionPerformed
        txtDireccionSucursal.requestFocus();
    }//GEN-LAST:event_txtTelefonoSucursalActionPerformed

    private void btnGuardarSucursalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarSucursalMouseEntered
        btnGuardarSucursal.setIcon(new ImageIcon(getClass().getResource("/iconos/botones/guardarprovB.png")));
    }//GEN-LAST:event_btnGuardarSucursalMouseEntered

    private void btnGuardarSucursalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarSucursalMouseExited
        btnGuardarSucursal.setIcon(new ImageIcon(getClass().getResource("/iconos/botones/guardarprov.png")));
    }//GEN-LAST:event_btnGuardarSucursalMouseExited

    private void btnGuardarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSucursalActionPerformed
        guardarDatos();
    }//GEN-LAST:event_btnGuardarSucursalActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmSucursalesAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSucursalesAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSucursalesAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSucursalesAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSucursalesAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarSucursal;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel jpnBarraSuperior;
    private javax.swing.JPanel jpnCompras;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTable tblSucursales;
    private javax.swing.JTextField txtDireccionSucursal;
    private javax.swing.JTextField txtIDSucursal;
    private javax.swing.JTextField txtNombreSucursal;
    private javax.swing.JFormattedTextField txtTelefonoSucursal;
    // End of variables declaration//GEN-END:variables
}
