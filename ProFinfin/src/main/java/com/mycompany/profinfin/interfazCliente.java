package com.mycompany.profinfin;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class interfazCliente extends javax.swing.JFrame {
    
    public interfazCliente() {
        initComponents();
        cargarClientes();
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datosCliente = new javax.swing.JDialog();
        titJdiag = new javax.swing.JLabel();
        titnomClidiag = new javax.swing.JLabel();
        txtfieldNomCli = new javax.swing.JTextField();
        titnumTelClidiag = new javax.swing.JLabel();
        txtfieldnumTelClidiag = new javax.swing.JTextField();
        titemClidiag = new javax.swing.JLabel();
        txtfieldemClidiag = new javax.swing.JTextField();
        diagagreCli = new javax.swing.JButton();
        datosClientemod = new javax.swing.JDialog();
        titJdiag1 = new javax.swing.JLabel();
        titnomClidiag1 = new javax.swing.JLabel();
        txtfieldNomCli1 = new javax.swing.JTextField();
        titnumTelClidiag1 = new javax.swing.JLabel();
        txtfieldnumTelClidiag1 = new javax.swing.JTextField();
        titemClidiag1 = new javax.swing.JLabel();
        txtfieldemClidiag1 = new javax.swing.JTextField();
        diagagreCli1 = new javax.swing.JButton();
        scrollClientes = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        Titulo = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        eliminar1 = new javax.swing.JButton();

        datosCliente.setBounds(new java.awt.Rectangle(100, 100, 260, 280));

        titJdiag.setText("Ingrese los datos del cliente");

        titnomClidiag.setText("Nombre del cliente");

        titnumTelClidiag.setText("N??mero telef??nico");

        titemClidiag.setText("Email del cliente");

        diagagreCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add.png"))); // NOI18N
        diagagreCli.setText("Agregar");
        diagagreCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagagreCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout datosClienteLayout = new javax.swing.GroupLayout(datosCliente.getContentPane());
        datosCliente.getContentPane().setLayout(datosClienteLayout);
        datosClienteLayout.setHorizontalGroup(
            datosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClienteLayout.createSequentialGroup()
                .addGroup(datosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosClienteLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(titJdiag))
                    .addGroup(datosClienteLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(datosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datosClienteLayout.createSequentialGroup()
                                .addComponent(titnomClidiag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfieldNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(datosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(datosClienteLayout.createSequentialGroup()
                                    .addComponent(titemClidiag)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtfieldemClidiag, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(datosClienteLayout.createSequentialGroup()
                                    .addComponent(titnumTelClidiag)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtfieldnumTelClidiag, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(diagagreCli)
                .addGap(61, 61, 61))
        );
        datosClienteLayout.setVerticalGroup(
            datosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titJdiag)
                .addGap(32, 32, 32)
                .addGroup(datosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titnomClidiag))
                .addGap(18, 18, 18)
                .addGroup(datosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldnumTelClidiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titnumTelClidiag))
                .addGap(18, 18, 18)
                .addGroup(datosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldemClidiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titemClidiag))
                .addGap(35, 35, 35)
                .addComponent(diagagreCli)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        datosClientemod.setBounds(new java.awt.Rectangle(100, 200, 260, 280));

        titJdiag1.setText("Ingrese los datos del cliente");

        titnomClidiag1.setText("Nombre del cliente");

        titnumTelClidiag1.setText("N??mero telef??nico");

        titemClidiag1.setText("Email del cliente");

        diagagreCli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add.png"))); // NOI18N
        diagagreCli1.setText("Agregar");
        diagagreCli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagagreCli1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout datosClientemodLayout = new javax.swing.GroupLayout(datosClientemod.getContentPane());
        datosClientemod.getContentPane().setLayout(datosClientemodLayout);
        datosClientemodLayout.setHorizontalGroup(
            datosClientemodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClientemodLayout.createSequentialGroup()
                .addGroup(datosClientemodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosClientemodLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(titJdiag1))
                    .addGroup(datosClientemodLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(datosClientemodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datosClientemodLayout.createSequentialGroup()
                                .addComponent(titnomClidiag1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfieldNomCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(datosClientemodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(datosClientemodLayout.createSequentialGroup()
                                    .addComponent(titemClidiag1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtfieldemClidiag1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(datosClientemodLayout.createSequentialGroup()
                                    .addComponent(titnumTelClidiag1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtfieldnumTelClidiag1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosClientemodLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(diagagreCli1)
                .addGap(66, 66, 66))
        );
        datosClientemodLayout.setVerticalGroup(
            datosClientemodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClientemodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titJdiag1)
                .addGap(29, 29, 29)
                .addGroup(datosClientemodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldNomCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titnomClidiag1))
                .addGap(18, 18, 18)
                .addGroup(datosClientemodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldnumTelClidiag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titnumTelClidiag1))
                .addGap(18, 18, 18)
                .addGroup(datosClientemodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldemClidiag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titemClidiag1))
                .addGap(38, 38, 38)
                .addComponent(diagagreCli1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facturaci??n Tienda Nordic Style");
        setBackground(new java.awt.Color(102, 102, 102));
        setLocation(new java.awt.Point(200, 200));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Cliente", "Nombre", "Num. Telefono", "Email"
            }
        ));
        tablaClientes.getTableHeader().setReorderingAllowed(false);
        scrollClientes.setViewportView(tablaClientes);
        tablaClientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Titulo.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Men?? de Mantenimiento de clientes");

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add.png"))); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Edit.png"))); // NOI18N
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Remove.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        eliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Salir2.png"))); // NOI18N
        eliminar1.setText("Salir");
        eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addComponent(scrollClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Titulo)))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminar1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(scrollClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (evt.getSource()== agregar) {
            datosCliente.setVisible(true);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        if (evt.getSource()== editar)
            datosClientemod.setVisible(true);
    }//GEN-LAST:event_editarActionPerformed
    public void clientesBase(){
        ProFinfin.cl.add(new Cliente(0, "Jose Mu??oz", "87026720", "jmunozc023@ulacit.ed.cr"));
        ProFinfin.cl.add(new Cliente(1, "Diana Rodriguez", "72845478", "drodriguezs298@ulacit.ed.cr"));
        ProFinfin.cl.add(new Cliente(2, "Julliam Salazar", "57124752", "jsalazarg423@ulacit.ed.cr"));
        cargarClientes();
    }
    private void diagagreCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagagreCliActionPerformed
        // TODO add your handling code here:
        Cliente cliente1 = new Cliente();
        
        cliente1.setClnombre(txtfieldNomCli.getText());
        cliente1.setClnumeroTel(txtfieldnumTelClidiag.getText());
        cliente1.setClemail(txtfieldemClidiag.getText());
        cliente1.setClnumero(00+ProFinfin.cl.size());
        
        ProFinfin.cl.add(cliente1);
        
        JOptionPane.showMessageDialog(this, "Cliente ingresado exitosamente con el numero: 00"+ cliente1.getClnumero());
        txtfieldNomCli.setText("");
        txtfieldnumTelClidiag.setText("");
        txtfieldemClidiag.setText("");
        cargarClientes();
        
    }//GEN-LAST:event_diagagreCliActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int eliminarFila=tablaClientes.getSelectedRow();
        if (eliminarFila>=0) {
            ProFinfin.cl.remove(eliminarFila);
            cargarClientes();
        } 
    }//GEN-LAST:event_eliminarActionPerformed

    private void diagagreCli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagagreCli1ActionPerformed
       Cliente clientemod = new Cliente();
        int modificarFila=tablaClientes.getSelectedRow();
        if (modificarFila>=0) {
            clientemod.setClnombre(txtfieldNomCli1.getText());
            clientemod.setClnumeroTel(txtfieldnumTelClidiag1.getText());
            clientemod.setClemail(txtfieldemClidiag1.getText());
            clientemod.setClnumero(00+ProFinfin.cl.size());
            ProFinfin.cl.set(modificarFila, clientemod);
            cargarClientes();
            
        } 
        JOptionPane.showMessageDialog(this, "Cliente modificado exitosamente con el numero: 00"+ clientemod.getClnumero());
        txtfieldNomCli1.setText("");
        txtfieldnumTelClidiag1.setText("");
        txtfieldemClidiag1.setText("");
        cargarClientes();
    }//GEN-LAST:event_diagagreCli1ActionPerformed

    private void eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_eliminar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void cargarClientes(){
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Num. Cliente", "Nombre", "Num. Telefono", "Email"}, ProFinfin.cl.size());
        tablaClientes.setModel(modelo);
        
        TableModel modeloDatos= tablaClientes.getModel();
        for (int i = 0; i < ProFinfin.cl.size(); i++) {
            Cliente cliente1=ProFinfin.cl.get(i);
            modeloDatos.setValueAt(cliente1.getClnumero(), i, 0);
            modeloDatos.setValueAt(cliente1.getClnombre(), i, 1);
            modeloDatos.setValueAt(cliente1.getClnumeroTel(), i, 2);
            modeloDatos.setValueAt(cliente1.getClemail(), i, 3);
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton agregar;
    private javax.swing.JDialog datosCliente;
    private javax.swing.JDialog datosClientemod;
    private javax.swing.JButton diagagreCli;
    private javax.swing.JButton diagagreCli1;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminar1;
    private javax.swing.JScrollPane scrollClientes;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JLabel titJdiag;
    private javax.swing.JLabel titJdiag1;
    private javax.swing.JLabel titemClidiag;
    private javax.swing.JLabel titemClidiag1;
    private javax.swing.JLabel titnomClidiag;
    private javax.swing.JLabel titnomClidiag1;
    private javax.swing.JLabel titnumTelClidiag;
    private javax.swing.JLabel titnumTelClidiag1;
    private javax.swing.JTextField txtfieldNomCli;
    private javax.swing.JTextField txtfieldNomCli1;
    private javax.swing.JTextField txtfieldemClidiag;
    private javax.swing.JTextField txtfieldemClidiag1;
    private javax.swing.JTextField txtfieldnumTelClidiag;
    private javax.swing.JTextField txtfieldnumTelClidiag1;
    // End of variables declaration//GEN-END:variables

    
}
