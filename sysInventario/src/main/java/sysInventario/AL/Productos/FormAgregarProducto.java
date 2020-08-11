package sysInventario.AL.Productos;

import java.awt.Color;
import javax.swing.JOptionPane;
import sysInventario.BL.ProductoBL;
import sysInventario.Model.Producto;
import sysInventario.Model.Repuesta;
import sysInventario.Model.Usuario;

public class FormAgregarProducto extends javax.swing.JDialog {

    private Usuario usuarioLogeado;
    private FormProductos formProducto;

    public void setFormProdcuto(FormProductos fp) {
        this.formProducto = fp;
    }

    public void setUsuarioLogeado(Usuario usuario) {
        this.usuarioLogeado = usuario;
    }

    public FormAgregarProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtActual = new javax.swing.JTextField();
        txtMinima = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JPanel();
        lblcerrar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(83, 109, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR PRODUCTO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 5, 380, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 61, 86));
        jLabel2.setText("Nombre producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 61, 86));
        jLabel3.setText("Exitencia actual");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 61, 86));
        jLabel4.setText("Exitencia minima");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtProducto.setBorder(null);
        txtProducto.setOpaque(false);
        txtProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProductoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtProductoMousePressed(evt);
            }
        });
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductoKeyPressed(evt);
            }
        });
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 320, 30));

        txtActual.setBorder(null);
        txtActual.setOpaque(false);
        txtActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtActualMousePressed(evt);
            }
        });
        txtActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtActualKeyPressed(evt);
            }
        });
        jPanel1.add(txtActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 320, 30));

        txtMinima.setBorder(null);
        txtMinima.setOpaque(false);
        txtMinima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMinimaMousePressed(evt);
            }
        });
        txtMinima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMinimaKeyPressed(evt);
            }
        });
        jPanel1.add(txtMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 320, 30));

        btnRegistrar.setBackground(new java.awt.Color(63, 61, 86));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registrar");

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 250, 40));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 61, 86)));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });

        lblcerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblcerrar.setForeground(new java.awt.Color(63, 61, 86));
        lblcerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcerrar.setText("Cerrar");

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblcerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 40));

        jSeparator1.setBackground(new java.awt.Color(63, 61, 86));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 320, -1));

        jSeparator2.setBackground(new java.awt.Color(63, 61, 86));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 320, 10));

        jSeparator3.setBackground(new java.awt.Color(63, 61, 86));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 320, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 460));

        setSize(new java.awt.Dimension(371, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        // TODO add your handling code here:
        btnRegistrar.setBackground(new Color(83, 109, 254));
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        // TODO add your handling code here:
        btnRegistrar.setBackground(new Color(63, 61, 86));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_btnCerrarMousePressed

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        // TODO add your handling code here:
        btnCerrar.setBackground(new Color(63, 61, 86));
        lblcerrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        // TODO add your handling code here:
        btnCerrar.setBackground(Color.white);
        lblcerrar.setForeground(new Color(63, 61, 86));
    }//GEN-LAST:event_btnCerrarMouseExited

    private void txtProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtProductoMouseClicked

    private void txtProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyPressed
        // TODO add your handling code here:
        jSeparator1.setBackground(new Color(83, 109, 254));
        jSeparator2.setBackground(new Color(63, 61, 86));
        jSeparator3.setBackground(new Color(63, 61, 86));
    }//GEN-LAST:event_txtProductoKeyPressed

    private void txtProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductoMousePressed
        // TODO add your handling code here:
        jSeparator1.setBackground(new Color(83, 109, 254));
        jSeparator2.setBackground(new Color(63, 61, 86));
        jSeparator3.setBackground(new Color(63, 61, 86));
    }//GEN-LAST:event_txtProductoMousePressed

    private void txtActualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActualKeyPressed
        // TODO add your handling code here:
        jSeparator3.setBackground(new Color(83, 109, 254));
        jSeparator2.setBackground(new Color(63, 61, 86));
        jSeparator1.setBackground(new Color(63, 61, 86));
    }//GEN-LAST:event_txtActualKeyPressed

    private void txtActualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtActualMousePressed
        // TODO add your handling code here:
        jSeparator3.setBackground(new Color(83, 109, 254));
        jSeparator2.setBackground(new Color(63, 61, 86));
        jSeparator1.setBackground(new Color(63, 61, 86));
    }//GEN-LAST:event_txtActualMousePressed

    private void txtMinimaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinimaKeyPressed
        // TODO add your handling code here:
        jSeparator2.setBackground(new Color(83, 109, 254));
        jSeparator3.setBackground(new Color(63, 61, 86));
        jSeparator1.setBackground(new Color(63, 61, 86));
    }//GEN-LAST:event_txtMinimaKeyPressed

    private void txtMinimaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimaMousePressed
        // TODO add your handling code here:
        jSeparator2.setBackground(new Color(83, 109, 254));
        jSeparator3.setBackground(new Color(63, 61, 86));
        jSeparator1.setBackground(new Color(63, 61, 86));
    }//GEN-LAST:event_txtMinimaMousePressed

    private void btnRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMousePressed
        // TODO add your handling code here:
        Producto pro = new Producto();
        Repuesta resp;
        if (!txtProducto.getText().isEmpty() && !txtMinima.getText().isEmpty() && !txtActual.getText().isEmpty()) {
            pro.setNombreProducto(txtProducto.getText().trim());
            pro.setCantidadExistencia(Double.valueOf(txtActual.getText().trim()));
            pro.setExistenciMinima(Double.valueOf(txtMinima.getText().trim()));
            pro.setIdUsuario(usuarioLogeado.getIdUsuario());
            resp = ProductoBL.registrar(pro);
            if (resp.isSuccess()) {
                formProducto.cargarDaatos();

                JOptionPane.showMessageDialog(null, resp.getMessage());
            } else {
                JOptionPane.showMessageDialog(null, resp.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Campo vacio");
        }

    }//GEN-LAST:event_btnRegistrarMousePressed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAgregarProducto dialog = new FormAgregarProducto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblcerrar;
    private javax.swing.JTextField txtActual;
    private javax.swing.JTextField txtMinima;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
