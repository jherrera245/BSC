
package Menu;

import rojeru_san.rspanel.RSPanelSlider;

public class PrincipalMenu extends javax.swing.JFrame {

    public PrincipalMenu() {
        initComponents();
        BtHome.requestFocus();
        
                rsutilities.RSUtilities.setCentrarVentana(this);

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accelerateInterpolator1 = new rojeru_san.extras.AccelerateInterpolator();
        rSPanelSlider1 = new rojeru_san.rspanel.RSPanelSlider();
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        circlelogo = new rojeru_san.rspanel.RSPanelCircleBorder();
        logotxt = new javax.swing.JTextField();
        BtEstaciones = new RSMaterialComponent.RSButtonMaterialIconUno();
        BtLinBus = new RSMaterialComponent.RSButtonMaterialIconUno();
        BtIngresos = new RSMaterialComponent.RSButtonMaterialIconUno();
        BtEgresos = new RSMaterialComponent.RSButtonMaterialIconUno();
        BtSalir = new RSMaterialComponent.RSButtonMaterialIconUno();
        BtInfoBus = new RSMaterialComponent.RSButtonMaterialIconUno();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BtEmpleados = new RSMaterialComponent.RSButtonMaterialIconUno();
        BtTarjetas = new RSMaterialComponent.RSButtonMaterialIconUno();
        BtHome = new RSMaterialComponent.RSButtonMaterialIconUno();
        PanelSlider = new rojeru_san.rspanel.RSPanelSlider();
        panelHome = new Menu.PanelHome1();
        PanelTablasEstaciones = new Menu.PanelTablasEstaciones1();
        PanelTablasInfoBus = new Menu.PanelTablasInfoBus1();
        PanelTablasLineaBus = new Menu.PanelTablasLineaBus();
        PanelTablasIngresos = new Menu.PanelTablasIngresos1();
        PanelTablasEgresos = new Menu.PanelTablasEgresos1();
        PanelTablasEmpleados = new Menu.PanelTablasEmpleados1();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(0, 0, 0));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(102, 102, 102));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.CENTRAL);

        circlelogo.setBackground(new java.awt.Color(0, 0, 0));
        circlelogo.setColorBorde(new java.awt.Color(255, 153, 153));
        circlelogo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        circlelogo.setMaximumSize(new java.awt.Dimension(0, 0));

        logotxt.setEditable(false);
        logotxt.setBackground(new java.awt.Color(0, 0, 0));
        logotxt.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        logotxt.setForeground(new java.awt.Color(255, 102, 102));
        logotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        logotxt.setText("BSC");
        logotxt.setBorder(null);
        logotxt.setCaretColor(new java.awt.Color(255, 255, 255));
        logotxt.setSelectionColor(new java.awt.Color(255, 255, 255));
        logotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logotxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout circlelogoLayout = new javax.swing.GroupLayout(circlelogo);
        circlelogo.setLayout(circlelogoLayout);
        circlelogoLayout.setHorizontalGroup(
            circlelogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, circlelogoLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(logotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        circlelogoLayout.setVerticalGroup(
            circlelogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circlelogoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(logotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        BtEstaciones.setBackground(new java.awt.Color(102, 102, 102));
        BtEstaciones.setForeground(new java.awt.Color(0, 255, 102));
        BtEstaciones.setText("Estaciones");
        BtEstaciones.setBackgroundHover(new java.awt.Color(66, 66, 66));
        BtEstaciones.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        BtEstaciones.setForegroundHover(new java.awt.Color(252, 215, 54));
        BtEstaciones.setForegroundText(new java.awt.Color(0, 0, 0));
        BtEstaciones.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCATION_ON);
        BtEstaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEstacionesActionPerformed(evt);
            }
        });

        BtLinBus.setBackground(new java.awt.Color(102, 102, 102));
        BtLinBus.setForeground(new java.awt.Color(0, 204, 204));
        BtLinBus.setText("Lineas de buses");
        BtLinBus.setBackgroundHover(new java.awt.Color(66, 66, 66));
        BtLinBus.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        BtLinBus.setForegroundHover(new java.awt.Color(252, 215, 54));
        BtLinBus.setForegroundText(new java.awt.Color(0, 0, 0));
        BtLinBus.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DIRECTIONS_BUS);
        BtLinBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLinBusActionPerformed(evt);
            }
        });

        BtIngresos.setBackground(new java.awt.Color(102, 102, 102));
        BtIngresos.setForeground(new java.awt.Color(0, 204, 204));
        BtIngresos.setText("Ingresos");
        BtIngresos.setBackgroundHover(new java.awt.Color(66, 66, 66));
        BtIngresos.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        BtIngresos.setForegroundHover(new java.awt.Color(252, 215, 54));
        BtIngresos.setForegroundText(new java.awt.Color(0, 0, 0));
        BtIngresos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MONETIZATION_ON);
        BtIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIngresosActionPerformed(evt);
            }
        });

        BtEgresos.setBackground(new java.awt.Color(102, 102, 102));
        BtEgresos.setForeground(new java.awt.Color(0, 204, 204));
        BtEgresos.setText("Egresos");
        BtEgresos.setBackgroundHover(new java.awt.Color(66, 66, 66));
        BtEgresos.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        BtEgresos.setForegroundHover(new java.awt.Color(252, 215, 54));
        BtEgresos.setForegroundText(new java.awt.Color(0, 0, 0));
        BtEgresos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MONEY_OFF);
        BtEgresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEgresosActionPerformed(evt);
            }
        });

        BtSalir.setBackground(new java.awt.Color(102, 102, 102));
        BtSalir.setForeground(new java.awt.Color(0, 204, 204));
        BtSalir.setText("Salir");
        BtSalir.setBackgroundHover(new java.awt.Color(66, 66, 66));
        BtSalir.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        BtSalir.setForegroundHover(new java.awt.Color(252, 215, 54));
        BtSalir.setForegroundText(new java.awt.Color(0, 0, 0));
        BtSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        BtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalirActionPerformed(evt);
            }
        });

        BtInfoBus.setBackground(new java.awt.Color(102, 102, 102));
        BtInfoBus.setForeground(new java.awt.Color(0, 204, 204));
        BtInfoBus.setText("Información de buses");
        BtInfoBus.setBackgroundHover(new java.awt.Color(66, 66, 66));
        BtInfoBus.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        BtInfoBus.setForegroundHover(new java.awt.Color(252, 215, 54));
        BtInfoBus.setForegroundText(new java.awt.Color(0, 0, 0));
        BtInfoBus.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INFO);
        BtInfoBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInfoBusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText(" Bus Schedule Control ");

        BtEmpleados.setBackground(new java.awt.Color(102, 102, 102));
        BtEmpleados.setForeground(new java.awt.Color(0, 204, 204));
        BtEmpleados.setText("Empleados");
        BtEmpleados.setBackgroundHover(new java.awt.Color(66, 66, 66));
        BtEmpleados.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        BtEmpleados.setForegroundHover(new java.awt.Color(252, 215, 54));
        BtEmpleados.setForegroundText(new java.awt.Color(0, 0, 0));
        BtEmpleados.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        BtEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEmpleadosActionPerformed(evt);
            }
        });

        BtTarjetas.setBackground(new java.awt.Color(102, 102, 102));
        BtTarjetas.setForeground(new java.awt.Color(0, 204, 204));
        BtTarjetas.setText("TARJETAS");
        BtTarjetas.setBackgroundHover(new java.awt.Color(66, 66, 66));
        BtTarjetas.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        BtTarjetas.setForegroundHover(new java.awt.Color(252, 215, 54));
        BtTarjetas.setForegroundText(new java.awt.Color(0, 0, 0));
        BtTarjetas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CARD_MEMBERSHIP);
        BtTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTarjetasActionPerformed(evt);
            }
        });

        BtHome.setBackground(new java.awt.Color(102, 102, 102));
        BtHome.setForeground(new java.awt.Color(0, 204, 204));
        BtHome.setText("Home");
        BtHome.setBackgroundHover(new java.awt.Color(66, 66, 66));
        BtHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtHome.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        BtHome.setForegroundHover(new java.awt.Color(252, 215, 54));
        BtHome.setForegroundText(new java.awt.Color(0, 0, 0));
        BtHome.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        BtHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtEstaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(BtIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtLinBus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtEgresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtInfoBus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtTarjetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(BtHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(circlelogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addComponent(circlelogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtEstaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtInfoBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtLinBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(BtEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(BtSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        circlelogo.getAccessibleContext().setAccessibleDescription("");

        PanelSlider.setBackground(new java.awt.Color(0, 204, 204));
        PanelSlider.setName("PanelSlider"); // NOI18N

        panelHome.setName("panelHome"); // NOI18N
        PanelSlider.add(panelHome, "card2");

        PanelTablasEstaciones.setName("PanelTablasEstaciones"); // NOI18N
        PanelSlider.add(PanelTablasEstaciones, "card3");

        PanelTablasInfoBus.setName("PanelTablasInfoBus"); // NOI18N
        PanelSlider.add(PanelTablasInfoBus, "card4");

        PanelTablasLineaBus.setName("PanelTablasLineaBus"); // NOI18N
        PanelSlider.add(PanelTablasLineaBus, "card5");

        PanelTablasIngresos.setName("PanelTablasIngresos"); // NOI18N
        PanelSlider.add(PanelTablasIngresos, "card6");

        PanelTablasEgresos.setName("PanelTablasEgresos"); // NOI18N
        PanelSlider.add(PanelTablasEgresos, "card7");

        PanelTablasEmpleados.setName("PanelTablasEmpleados"); // NOI18N
        PanelSlider.add(PanelTablasEmpleados, "card8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logotxtActionPerformed

    private void BtLinBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLinBusActionPerformed
      if(!BtLinBus.isSelected()){
           BtInfoBus.setSelected(false);
           BtEgresos.setSelected(false);
           BtEmpleados.setSelected(false);
           BtEstaciones.setSelected(false);
           BtHome.setSelected(false);
           BtIngresos.setSelected(false);
           BtLinBus.setSelected(true);
           BtSalir.setSelected(false);
           BtTarjetas.setSelected(false);
           
           PanelSlider.setPanelSlider(1, PanelTablasLineaBus, RSPanelSlider.DIRECT.RIGHT);
         }
    }//GEN-LAST:event_BtLinBusActionPerformed

    private void BtIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIngresosActionPerformed
        if(!BtIngresos.isSelected()){
           BtInfoBus.setSelected(false);
           BtEgresos.setSelected(false);
           BtEmpleados.setSelected(false);
           BtEstaciones.setSelected(false);
           BtHome.setSelected(false);
           BtIngresos.setSelected(true);
           BtLinBus.setSelected(false);
           BtSalir.setSelected(false);
           BtTarjetas.setSelected(false);
           
           PanelSlider.setPanelSlider(1, PanelTablasIngresos, RSPanelSlider.DIRECT.RIGHT);
         }
    }//GEN-LAST:event_BtIngresosActionPerformed

    private void BtEgresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEgresosActionPerformed
           if(!BtEgresos.isSelected()){
           BtInfoBus.setSelected(false);
           BtEgresos.setSelected(true);
           BtEmpleados.setSelected(false);
           BtEstaciones.setSelected(false);
           BtHome.setSelected(false);
           BtIngresos.setSelected(false);
           BtLinBus.setSelected(false);
           BtSalir.setSelected(false);
           BtTarjetas.setSelected(false);
           
           PanelSlider.setPanelSlider(1, PanelTablasEgresos, RSPanelSlider.DIRECT.RIGHT);
         }
    }//GEN-LAST:event_BtEgresosActionPerformed

    private void BtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalirActionPerformed
this.dispose();
new Login.Login().setVisible(true);
    }//GEN-LAST:event_BtSalirActionPerformed

    private void BtInfoBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInfoBusActionPerformed
        if(!BtInfoBus.isSelected()){
          BtInfoBus.setSelected(true);
           BtEgresos.setSelected(false);
           BtEmpleados.setSelected(false);
           BtEstaciones.setSelected(false);
            BtHome.setSelected(false);
           BtIngresos.setSelected(false);
           BtLinBus.setSelected(false);
           BtSalir.setSelected(false);
           BtTarjetas.setSelected(false);
           
           PanelSlider.setPanelSlider(1, PanelTablasInfoBus, RSPanelSlider.DIRECT.RIGHT);
         }
    }//GEN-LAST:event_BtInfoBusActionPerformed

    private void BtEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEmpleadosActionPerformed
          if(!BtEmpleados.isSelected()){
          BtInfoBus.setSelected(false);
           BtEgresos.setSelected(false);
           BtEmpleados.setSelected(true);
           BtEstaciones.setSelected(false);
            BtHome.setSelected(false);
           BtIngresos.setSelected(false);
           BtLinBus.setSelected(false);
           BtSalir.setSelected(false);
           BtTarjetas.setSelected(false);
           
           PanelSlider.setPanelSlider(1, PanelTablasEmpleados, RSPanelSlider.DIRECT.RIGHT);
         }
    }//GEN-LAST:event_BtEmpleadosActionPerformed

    private void BtTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTarjetasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtTarjetasActionPerformed

    private void BtHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtHomeActionPerformed
       if(!BtHome.isSelected()){
           BtHome.setSelected(true);
           BtEgresos.setSelected(false);
           BtEmpleados.setSelected(false);
           BtEstaciones.setSelected(false);
           BtInfoBus.setSelected(false);
           BtIngresos.setSelected(false);
           BtLinBus.setSelected(false);
           BtSalir.setSelected(false);
           BtTarjetas.setSelected(false);
           
           PanelSlider.setPanelSlider(1, panelHome, RSPanelSlider.DIRECT.RIGHT);
           
       }
    }//GEN-LAST:event_BtHomeActionPerformed

    private void BtEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEstacionesActionPerformed
  if(!BtEstaciones.isSelected()){
           BtEstaciones.setSelected(true);
           BtEgresos.setSelected(false);
           BtEmpleados.setSelected(false);
           BtHome.setSelected(false);
           BtInfoBus.setSelected(false);
           BtIngresos.setSelected(false);
           BtLinBus.setSelected(false);
           BtSalir.setSelected(false);
           BtTarjetas.setSelected(false);
           
           PanelSlider.setPanelSlider(1, PanelTablasEstaciones, RSPanelSlider.DIRECT.RIGHT);
           
       }    }//GEN-LAST:event_BtEstacionesActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconUno BtEgresos;
    private RSMaterialComponent.RSButtonMaterialIconUno BtEmpleados;
    private RSMaterialComponent.RSButtonMaterialIconUno BtEstaciones;
    private RSMaterialComponent.RSButtonMaterialIconUno BtHome;
    private RSMaterialComponent.RSButtonMaterialIconUno BtInfoBus;
    private RSMaterialComponent.RSButtonMaterialIconUno BtIngresos;
    private RSMaterialComponent.RSButtonMaterialIconUno BtLinBus;
    private RSMaterialComponent.RSButtonMaterialIconUno BtSalir;
    private RSMaterialComponent.RSButtonMaterialIconUno BtTarjetas;
    private rojeru_san.rspanel.RSPanelSlider PanelSlider;
    private Menu.PanelTablasEgresos1 PanelTablasEgresos;
    private Menu.PanelTablasEmpleados1 PanelTablasEmpleados;
    private Menu.PanelTablasEstaciones1 PanelTablasEstaciones;
    private Menu.PanelTablasInfoBus1 PanelTablasInfoBus;
    private Menu.PanelTablasIngresos1 PanelTablasIngresos;
    private Menu.PanelTablasLineaBus PanelTablasLineaBus;
    private rojeru_san.extras.AccelerateInterpolator accelerateInterpolator1;
    private rojeru_san.rspanel.RSPanelCircleBorder circlelogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField logotxt;
    private Menu.PanelHome1 panelHome;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.rspanel.RSPanelSlider rSPanelSlider1;
    // End of variables declaration//GEN-END:variables
}
