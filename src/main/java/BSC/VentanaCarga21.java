package BSC;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import rojerusan.RSAnimation;

/**
 *
 * @author And3r Segovia
 */
public class VentanaCarga21 extends javax.swing.JFrame {

    private Timer t;
    private int n = 0;

    public VentanaCarga21() {
        initComponents();
        BarraDeCarga.setValue(0);
        BarraDeCarga.setColorBackground(new Color(190, 51, 51, 255));
        PanelText.setBackground(new Color(0, 0, 0, 0));
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);

        RSAnimation.setSubir(400, 250, 2, 2, PanelText);
        RSAnimation.setBajar(-200, 33, 2, 2, circlelogo);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                if (n <= 100) {
                    BarraDeCarga.setValue(n);
                    n = n + 5;
                } else {
                    t.stop();

                    new Login.Login().setVisible(true);
                    dispose();
                }
            }
        };
        t = new Timer(300, accion);
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        rSProgressBarBeanInfo1 = new rojerusan.componentes.RSProgressBarBeanInfo();
        rSPanelShadow1 = new necesario.RSPanelShadow();
        rSPanelGradiente2 = new rspanelgradiente.RSPanelGradiente();
        circlelogo = new rojeru_san.rspanel.RSPanelCircleBorder();
        Logotxt = new javax.swing.JTextField();
        BarraDeCarga = new rojeru_san.rsprogress.RSProgressBarSinText();
        PanelText = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rSPanelGradiente2.setColorPrimario(new java.awt.Color(51, 51, 51));
        rSPanelGradiente2.setColorSecundario(new java.awt.Color(255, 51, 51));
        rSPanelGradiente2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        circlelogo.setBackground(new java.awt.Color(66, 66, 66));

        Logotxt.setEditable(false);
        Logotxt.setBackground(new java.awt.Color(66, 66, 66));
        Logotxt.setFont(new java.awt.Font("Times New Roman", 2, 60)); // NOI18N
        Logotxt.setForeground(new java.awt.Color(252, 215, 54));
        Logotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Logotxt.setText("BSC");
        Logotxt.setBorder(null);
        Logotxt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LogotxtMouseMoved(evt);
            }
        });
        Logotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogotxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout circlelogoLayout = new javax.swing.GroupLayout(circlelogo);
        circlelogo.setLayout(circlelogoLayout);
        circlelogoLayout.setHorizontalGroup(
            circlelogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circlelogoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Logotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        circlelogoLayout.setVerticalGroup(
            circlelogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circlelogoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Logotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        rSPanelGradiente2.add(circlelogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 33, 200, 200));

        BarraDeCarga.setValue(20);
        BarraDeCarga.setColorBackground(new java.awt.Color(204, 204, 204));
        BarraDeCarga.setColorBorde(new java.awt.Color(190, 51, 51));
        BarraDeCarga.setColorForeground(new java.awt.Color(153, 153, 153));
        rSPanelGradiente2.add(BarraDeCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 734, 20));

        PanelText.setBackground(new java.awt.Color(51, 51, 51));
        PanelText.setToolTipText("");
        PanelText.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        PanelText.setName(""); // NOI18N
        PanelText.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciando BSC...");
        PanelText.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 690, 80));

        rSPanelGradiente2.add(PanelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 710, 130));

        rSPanelShadow1.add(rSPanelGradiente2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogotxtActionPerformed

    private void LogotxtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogotxtMouseMoved
        Logotxt.setToolTipText("Bus Schedule Control");
    }//GEN-LAST:event_LogotxtMouseMoved

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
            java.util.logging.Logger.getLogger(VentanaCarga21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCarga21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCarga21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCarga21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCarga21().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsprogress.RSProgressBarSinText BarraDeCarga;
    private javax.swing.JTextField Logotxt;
    private javax.swing.JPanel PanelText;
    private rojeru_san.rspanel.RSPanelCircleBorder circlelogo;
    private javax.swing.JLabel jLabel1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente2;
    private necesario.RSPanelShadow rSPanelShadow1;
    private rojerusan.componentes.RSProgressBarBeanInfo rSProgressBarBeanInfo1;
    // End of variables declaration//GEN-END:variables
}
