
package Login;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        Usertex.requestFocus();
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        
        DatosIncorrectos.setText("");
        
        //sobre escritura para iniciar secion con enter al escribir la contraseña
        
       Passtex.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                 }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    IniciarSecion();
                }
                }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow1 = new necesario.RSPanelShadow();
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        rSPanelImage1 = new rojeru_san.rspanel.RSPanelImage();
        circlelogo = new rojeru_san.rspanel.RSPanelCircleBorder();
        logotxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Usertex = new RSMaterialComponent.RSTextFieldMaterialIcon();
        Passtex = new RSMaterialComponent.RSPasswordMaterialIcon();
        DatosIncorrectos = new javax.swing.JLabel();
        BotonSalir = new RSMaterialComponent.RSButtonMaterialUno();
        BotonIngresar1 = new RSMaterialComponent.RSButtonMaterialUno();
        rSPanelShadow2 = new necesario.RSPanelShadow();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(102, 0, 102));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(0, 204, 204));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.VERTICAL);

        rSPanelImage1.setImagen(new javax.swing.ImageIcon("E:\\toxYrn.jpg")); // NOI18N

        circlelogo.setBackground(new java.awt.Color(66, 66, 66));
        circlelogo.setColorBorde(new java.awt.Color(255, 153, 153));
        circlelogo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        circlelogo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                circlelogoMouseMoved(evt);
            }
        });

        logotxt.setEditable(false);
        logotxt.setBackground(new java.awt.Color(66, 66, 66));
        logotxt.setFont(new java.awt.Font("Times New Roman", 2, 60)); // NOI18N
        logotxt.setForeground(new java.awt.Color(255, 102, 102));
        logotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        logotxt.setText("BSC");
        logotxt.setBorder(null);
        logotxt.setCaretColor(new java.awt.Color(255, 255, 255));
        logotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logotxt.setSelectionColor(new java.awt.Color(255, 255, 255));
        logotxt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                logotxtMouseMoved(evt);
            }
        });
        logotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logotxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout circlelogoLayout = new javax.swing.GroupLayout(circlelogo);
        circlelogo.setLayout(circlelogoLayout);
        circlelogoLayout.setHorizontalGroup(
            circlelogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circlelogoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(logotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        circlelogoLayout.setVerticalGroup(
            circlelogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circlelogoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(logotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Usertex.setForeground(new java.awt.Color(102, 102, 102));
        Usertex.setColorIcon(new java.awt.Color(102, 102, 102));
        Usertex.setColorMaterial(new java.awt.Color(0, 204, 204));
        Usertex.setPhColor(new java.awt.Color(204, 0, 0));
        Usertex.setPlaceholder("Usuario");
        Usertex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsertexMouseClicked(evt);
            }
        });
        Usertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsertexActionPerformed(evt);
            }
        });

        Passtex.setForeground(new java.awt.Color(102, 102, 102));
        Passtex.setColorIcon(new java.awt.Color(102, 102, 102));
        Passtex.setColorMaterial(new java.awt.Color(0, 204, 204));
        Passtex.setPhColor(new java.awt.Color(204, 0, 0));
        Passtex.setPlaceholder("Contraseña");
        Passtex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasstexMouseClicked(evt);
            }
        });
        Passtex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasstexActionPerformed(evt);
            }
        });

        DatosIncorrectos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DatosIncorrectos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatosIncorrectos.setText("DATOS INCORRECTOS, INTENTALO NUEVAMENTE.");

        BotonSalir.setBackground(new java.awt.Color(255, 102, 51));
        BotonSalir.setForeground(new java.awt.Color(0, 0, 0));
        BotonSalir.setText("SALIR");
        BotonSalir.setBackgroundHover(new java.awt.Color(0, 0, 0));
        BotonSalir.setForegroundText(new java.awt.Color(0, 0, 0));
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonIngresar1.setBackground(new java.awt.Color(0, 204, 204));
        BotonIngresar1.setForeground(new java.awt.Color(0, 0, 0));
        BotonIngresar1.setText("INGRESAR");
        BotonIngresar1.setBackgroundHover(new java.awt.Color(0, 0, 0));
        BotonIngresar1.setForegroundText(new java.awt.Color(0, 0, 0));
        BotonIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Passtex, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usertex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DatosIncorrectos)
                .addGap(131, 131, 131))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(BotonIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Usertex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Passtex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(DatosIncorrectos)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelImage1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelImage1Layout.createSequentialGroup()
                        .addComponent(circlelogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))))
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(circlelogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, Short.MAX_VALUE)
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSPanelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        rSPanelShadow1.add(rSPanelGradiente1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarSecion(){
        if(Usertex.getText().isEmpty() || Passtex.getText().isEmpty()){
              DatosIncorrectos.setText("Campos requeridos");
        }else{
         if(Usertex.getText().equals("User")&& Passtex.getText().equals("123")){
             
             new Menu.PrincipalMenu().setVisible(true);
             this.dispose();
         }else{
             Passtex.setText("");
             DatosIncorrectos.setText("Datos incorrectos.!");
         }
        }
     
    }
    private void logotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logotxtActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresar1ActionPerformed
        IniciarSecion();
    }//GEN-LAST:event_BotonIngresar1ActionPerformed

    private void UsertexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsertexMouseClicked
        Usertex.setText("");
    }//GEN-LAST:event_UsertexMouseClicked

    private void PasstexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasstexMouseClicked
        Passtex.setText("");
    }//GEN-LAST:event_PasstexMouseClicked

    private void PasstexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasstexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasstexActionPerformed

    private void UsertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsertexActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        Passtex.requestFocus();
    }//GEN-LAST:event_UsertexActionPerformed

    private void circlelogoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circlelogoMouseMoved
       
    }//GEN-LAST:event_circlelogoMouseMoved

    private void logotxtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logotxtMouseMoved
         logotxt.setToolTipText("Bus Schedule Control");
    }//GEN-LAST:event_logotxtMouseMoved

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialUno BotonIngresar1;
    private RSMaterialComponent.RSButtonMaterialUno BotonSalir;
    private javax.swing.JLabel DatosIncorrectos;
    private RSMaterialComponent.RSPasswordMaterialIcon Passtex;
    private RSMaterialComponent.RSTextFieldMaterialIcon Usertex;
    private rojeru_san.rspanel.RSPanelCircleBorder circlelogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField logotxt;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage1;
    private necesario.RSPanelShadow rSPanelShadow1;
    private necesario.RSPanelShadow rSPanelShadow2;
    // End of variables declaration//GEN-END:variables
}
