package com.mycompany.profinfin;

public class MenuGUI extends javax.swing.JFrame {
    interfazCliente incli=new interfazCliente();
    interfazInventario ininv= new interfazInventario();
    interfazFacturacion infac = new interfazFacturacion();
    interfazCierreCaja incie= new interfazCierreCaja();
    public MenuGUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloMenu = new javax.swing.JLabel();
        MantClientesGUI = new javax.swing.JButton();
        MantInvGUI = new javax.swing.JButton();
        facturacionGUI = new javax.swing.JButton();
        cierreCajaGUI = new javax.swing.JButton();
        Creditos = new javax.swing.JPanel();
        tituloAut = new javax.swing.JLabel();
        Josename = new javax.swing.JLabel();
        Diananame = new javax.swing.JLabel();
        Julliamname = new javax.swing.JLabel();
        salirGUI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 0, 0));

        tituloMenu.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 24)); // NOI18N
        tituloMenu.setText("Programa de Facturación Tienda Nordic Style");

        MantClientesGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cliente.png"))); // NOI18N
        MantClientesGUI.setText("Mant. Clientes");
        MantClientesGUI.setFocusPainted(false);
        MantClientesGUI.setMaximumSize(new java.awt.Dimension(214, 110));
        MantClientesGUI.setMinimumSize(new java.awt.Dimension(214, 110));
        MantClientesGUI.setPreferredSize(new java.awt.Dimension(214, 110));
        MantClientesGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantClientesGUIActionPerformed(evt);
            }
        });

        MantInvGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario.png"))); // NOI18N
        MantInvGUI.setText("Mant. Inventario");
        MantInvGUI.setFocusPainted(false);
        MantInvGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantInvGUIActionPerformed(evt);
            }
        });

        facturacionGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Facturacion.png"))); // NOI18N
        facturacionGUI.setText("Facturacion");
        facturacionGUI.setFocusPainted(false);
        facturacionGUI.setMaximumSize(new java.awt.Dimension(214, 110));
        facturacionGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturacionGUIActionPerformed(evt);
            }
        });

        cierreCajaGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cierrecaja.png"))); // NOI18N
        cierreCajaGUI.setText("Cierre de caja");
        cierreCajaGUI.setFocusPainted(false);
        cierreCajaGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cierreCajaGUIActionPerformed(evt);
            }
        });

        Creditos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tituloAut.setText("Creado por:");

        Josename.setText("Jose Pablo Muñoz Carvajal");

        Diananame.setText("Diana Rodriguez Sole");

        Julliamname.setText("Julliam Salazar Garcia");

        javax.swing.GroupLayout CreditosLayout = new javax.swing.GroupLayout(Creditos);
        Creditos.setLayout(CreditosLayout);
        CreditosLayout.setHorizontalGroup(
            CreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAut)
                    .addComponent(Josename)
                    .addComponent(Diananame)
                    .addComponent(Julliamname))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        CreditosLayout.setVerticalGroup(
            CreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloAut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Josename)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Diananame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Julliamname)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        salirGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Salir.png"))); // NOI18N
        salirGUI.setText("Salir");
        salirGUI.setFocusPainted(false);
        salirGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirGUIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MantInvGUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MantClientesGUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salirGUI, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cierreCajaGUI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                        .addComponent(facturacionGUI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(tituloMenu)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMenu)
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MantClientesGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facturacionGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MantInvGUI)
                    .addComponent(cierreCajaGUI))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salirGUI)
                    .addComponent(Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MantClientesGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantClientesGUIActionPerformed
        if (evt.getSource()== MantClientesGUI) {
            incli.setVisible(true);
        }
    }//GEN-LAST:event_MantClientesGUIActionPerformed

    private void MantInvGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantInvGUIActionPerformed
        if (evt.getSource()== MantInvGUI) {
            ininv.setVisible(true);
        }
    }//GEN-LAST:event_MantInvGUIActionPerformed

    private void facturacionGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturacionGUIActionPerformed
        if (evt.getSource()== facturacionGUI) {
            infac.setVisible(true);
        }
    }//GEN-LAST:event_facturacionGUIActionPerformed

    private void cierreCajaGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cierreCajaGUIActionPerformed
        if (evt.getSource()==cierreCajaGUI) {
            incie.setVisible(true);
        }
    }//GEN-LAST:event_cierreCajaGUIActionPerformed

    private void salirGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirGUIActionPerformed
        if (evt.getSource()== salirGUI) {
            System.exit(0);
        }
    }//GEN-LAST:event_salirGUIActionPerformed

      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Creditos;
    private javax.swing.JLabel Diananame;
    private javax.swing.JLabel Josename;
    private javax.swing.JLabel Julliamname;
    private javax.swing.JButton MantClientesGUI;
    private javax.swing.JButton MantInvGUI;
    private javax.swing.JButton cierreCajaGUI;
    private javax.swing.JButton facturacionGUI;
    private javax.swing.JButton salirGUI;
    private javax.swing.JLabel tituloAut;
    private javax.swing.JLabel tituloMenu;
    // End of variables declaration//GEN-END:variables
}
