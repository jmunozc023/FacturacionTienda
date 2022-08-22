package com.mycompany.profinfin;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class interfazCierreCaja extends javax.swing.JFrame {
    double totcierre=0;
    public interfazCierreCaja() {
        initComponents();
        cargarCierre();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CierreDialog = new javax.swing.JDialog();
        CieDiagtxt = new javax.swing.JLabel();
        OkButton = new javax.swing.JButton();
        scrollClientes = new javax.swing.JScrollPane();
        tablaCierre = new javax.swing.JTable();
        Titulo = new javax.swing.JLabel();
        cierre = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Refrescar = new javax.swing.JButton();

        CierreDialog.setLocation(new java.awt.Point(250, 250));
        CierreDialog.setMaximumSize(new java.awt.Dimension(370, 200));
        CierreDialog.setMinimumSize(new java.awt.Dimension(350, 178));

        CieDiagtxt.setText("jLabel1");

        OkButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturar.png"))); // NOI18N
        OkButton.setText("OK");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CierreDialogLayout = new javax.swing.GroupLayout(CierreDialog.getContentPane());
        CierreDialog.getContentPane().setLayout(CierreDialogLayout);
        CierreDialogLayout.setHorizontalGroup(
            CierreDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CierreDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(CieDiagtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CierreDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OkButton)
                .addGap(137, 137, 137))
        );
        CierreDialogLayout.setVerticalGroup(
            CierreDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CierreDialogLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(CieDiagtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(OkButton)
                .addGap(24, 24, 24))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facturación Tienda Nordic Style");
        setBackground(new java.awt.Color(102, 102, 102));
        setLocation(new java.awt.Point(200, 200));

        tablaCierre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Num. telefono", "Emaiil", "Total Compra"
            }
        ));
        tablaCierre.setColumnSelectionAllowed(true);
        tablaCierre.getTableHeader().setReorderingAllowed(false);
        scrollClientes.setViewportView(tablaCierre);
        tablaCierre.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Titulo.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Menú de Cierre de caja");

        cierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturar.png"))); // NOI18N
        cierre.setText("Cierre");
        cierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cierreActionPerformed(evt);
            }
        });

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Salir2.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Refrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Refresh.png"))); // NOI18N
        Refrescar.setText("Actualizar");
        Refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Refrescar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cierre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(scrollClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(Titulo)))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(cierre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Refrescar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(scrollClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cierreActionPerformed
        totalCierre();
        System.out.println(totcierre);
        CieDiagtxt.setText("Cierre de caja del dia: " +String.valueOf(totcierre));
        CierreDialog.setVisible(true);
    }//GEN-LAST:event_cierreActionPerformed
    
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void RefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefrescarActionPerformed
        clearCierre();
        cargarCierre();
    }//GEN-LAST:event_RefrescarActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        if (evt.getSource()== OkButton) {
            tablaCierre.setModel(new DefaultTableModel(null, new String[]{"Cliente", "Num. Telefono", "Email", "Total Compra"}));
            ProFinfin.cie.clear();
                        
            CierreDialog.dispose();
        }
    }//GEN-LAST:event_OkButtonActionPerformed

   
    public void cargarCierre(){
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Cliente", "Num. Telefono", "Email", "Total Compra"}, ProFinfin.cie.size());
        tablaCierre.setModel(modelo);
        
        TableModel modeloDatos= tablaCierre.getModel();
        for (int i = 0; i < ProFinfin.cie.size(); i++) {
            Cierre cierreC=ProFinfin.cie.get(i);
            modeloDatos.setValueAt(cierreC.getCliente(), i, 0);
            modeloDatos.setValueAt(cierreC.getNumtel(), i, 1);
            modeloDatos.setValueAt(cierreC.getEmail(), i, 2);
            modeloDatos.setValueAt(cierreC.getTotalCompra(), i, 3);
        }
    }
    public void clearCierre(){
       tablaCierre.removeAll();
    }
    private void totalCierre(){
        double fila=0;
        double tot=0;
        for (int i = 0; i < tablaCierre.getRowCount(); i++) {
            fila= (double)tablaCierre.getValueAt(i, 3);
            tot+= fila;
        }
        totcierre= tot;
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CieDiagtxt;
    private javax.swing.JDialog CierreDialog;
    private javax.swing.JButton OkButton;
    private javax.swing.JButton Refrescar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton cierre;
    private javax.swing.JScrollPane scrollClientes;
    private javax.swing.JTable tablaCierre;
    // End of variables declaration//GEN-END:variables

    
}
