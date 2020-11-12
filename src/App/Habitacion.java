package App;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Habitacion extends javax.swing.JInternalFrame {
    Database ok = new Database();
    public Habitacion() {
        initComponents();
         escribir();
         JTableHeader header = tablah.getTableHeader();
         header.setBackground(new java.awt.Color(238,238,221));
         //header.setForeground(Color.yellow)
         scroll.getViewport().setBackground(new java.awt.Color(238,238,221));

         JTableHeader header2 = tablah.getTableHeader();
         header2.setBackground(new java.awt.Color(238,238,221));
         //header.setForeground(Color.yellow)
         scroll.getViewport().setBackground(new java.awt.Color(238,238,221));
         desh();
    }
    public void escribir(){
       
        DefaultTableModel tb =  (DefaultTableModel) tablah.getModel();
        int a = tablah.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
         Database ok = new Database();
        ok.tabHabitacion(tablah,cmbestadoB.getSelectedItem().toString());
    }
    public void desh(){
        cmbtipo.setEnabled(false);
        txtespacio.setEnabled(false);
        txtcamas.setEnabled(false);
        txtnum.setEnabled(false);
         cmbestado.setEnabled(false);
         btncan.setEnabled(false);
         btngua.setEnabled(false);
         btneliminar.setEnabled(false);
    }
     public void hab(){
       
        cmbtipo.setEnabled(true);
        txtespacio.setEnabled(true);
        txtcamas.setEnabled(true);
        txtnum.setEnabled(true);
         cmbestado.setEnabled(true);
         btncan.setEnabled(true);
         btngua.setEnabled(true);
         btneliminar.setEnabled(false);
    }
    public void limpiar(){
    
        txtespacio.setText("");
        txtcamas.setText("");
        txtnum.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btngua = new javax.swing.JButton();
        btncan = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtcamas = new javax.swing.JTextField();
        txtnum = new javax.swing.JTextField();
        txtespacio = new javax.swing.JTextField();
        cmbestado = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cmbtipo = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tablah = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtbus = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtT = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbestadoB = new javax.swing.JComboBox<>();

        setClosable(true);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setForeground(new java.awt.Color(0, 204, 204));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Estado: ");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Camas:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-agregar-enlace-20.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btngua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-guardar-20.png"))); // NOI18N
        btngua.setText("Guardar");
        btngua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguaActionPerformed(evt);
            }
        });

        btncan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cerrar-ventana-20.png"))); // NOI18N
        btncan.setText("Cancelar");
        btncan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Numero");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Espacios:");

        txtcamas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtcamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcamasActionPerformed(evt);
            }
        });

        txtnum.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumActionPerformed(evt);
            }
        });

        txtespacio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtespacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtespacioActionPerformed(evt);
            }
        });

        cmbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupado", "Mantenimiento" }));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Tipo:");

        cmbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btngua)
                .addGap(18, 18, 18)
                .addComponent(btncan)
                .addGap(63, 63, 63))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17)
                    .addComponent(jLabel7)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16))
                .addGap(64, 64, 64)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtcamas)
                        .addComponent(txtespacio)
                        .addComponent(cmbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtcamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtespacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngua)
                    .addComponent(btncan)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 550));

        jPanel7.setBackground(new java.awt.Color(238, 238, 221));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablah.setAutoCreateRowSorter(true);
        tablah.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        tablah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero","tipo","camas","espacios","estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablah.setGridColor(new java.awt.Color(102, 102, 102));
        tablah.setSelectionBackground(new java.awt.Color(0, 204, 51));
        tablah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablahMouseClicked(evt);
            }
        });
        scroll.setViewportView(tablah);

        jPanel7.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 619, 311));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Buscar :");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 26, -1, -1));

        txtbus.setBackground(new java.awt.Color(238, 238, 221));
        txtbus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbus.setToolTipText("Ingrese Identificacion");
        txtbus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtbus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusKeyReleased(evt);
            }
        });
        jPanel7.add(txtbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 23, 190, 29));

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eliminar-20.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel7.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 116, 40));
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 461, -1, -1));
        jPanel7.add(txtT, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 461, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Estado: ");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        cmbestadoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Disponible", "Ocupado", "Mantenimiento" }));
        cmbestadoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbestadoBActionPerformed(evt);
            }
        });
        jPanel7.add(cmbestadoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 196, 38));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 660, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String pass="";
    private void txtcamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcamasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcamasActionPerformed

    private void txtnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumActionPerformed

    private void txtespacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtespacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtespacioActionPerformed

    private void btnguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguaActionPerformed
        // TODO add your handling code here:
        String tipo,camas,tip,doc,espacios,estado;
        tipo=cmbtipo.getSelectedItem().toString();
        espacios=txtespacio.getText();
        camas=txtcamas.getText();
        estado=cmbestado.getSelectedItem().toString();
        doc=txtnum.getText();
        
        /*
        try {
            ok.AgregarCLiente(nom,doc,tel,cor,ap1,ap2,tip,cod,dir,pass,tablah);
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        ok.Habitacion(doc, tipo, camas,espacios, estado);
        escribir();
        pass="";
        desh();
    }//GEN-LAST:event_btnguaActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        /*
         Max2 ok = new Max2();
        try {
            ok.EliminarCliente(pass);
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        ok.DelHabitacion(pass);
        pass="";
        escribir();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanActionPerformed
        // TODO add your handling code here:
        desh();
        pass="";
    }//GEN-LAST:event_btncanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiar();
        hab();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtbusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusKeyReleased
        // TODO add your handling code here:
        if(txtbus.getText().equalsIgnoreCase("")){
            escribir();
        }else{
           DefaultTableModel tb =  (DefaultTableModel) tablah.getModel();
        int a = tablah.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
          
         String bus=txtbus.getText();
        ok.EscribirHabitacionBusqueda(tablah, bus);
          }
    }//GEN-LAST:event_txtbusKeyReleased

    private void tablahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablahMouseClicked
        // TODO add your handling code here:
        int num;
        String nu,tipo,camas,espacio,estados;
        num=tablah.rowAtPoint(evt.getPoint());
        // System.out.print(num=tablah.rowAtPoint(evt.getPoint()));

        nu = tablah.getModel().getValueAt(num, 0).toString();
        tipo = tablah.getModel().getValueAt(num, 1).toString();
        camas = tablah.getModel().getValueAt(num, 2).toString();
        espacio = tablah.getModel().getValueAt(num, 3).toString();
        estados = tablah.getModel().getValueAt(num, 4).toString();
        // Object var=tablah.getColumnModel().getColumn(0);
        cmbtipo.setSelectedItem(tipo);
        txtespacio.setText(espacio);
        txtcamas.setText(camas);
        cmbestado.setSelectedItem(estados);
        txtnum.setText(nu);
        
        //pass=(int) ;
        String i = tablah.getModel().getValueAt(num, 0).toString();
        pass=i;
        hab();
         btneliminar.setEnabled(true);
         txtnum.setEnabled(false);
    }//GEN-LAST:event_tablahMouseClicked

    private void cmbestadoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbestadoBActionPerformed
        escribir();
    }//GEN-LAST:event_cmbestadoBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncan;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btngua;
    private javax.swing.JComboBox<String> cmbestado;
    private javax.swing.JComboBox<String> cmbestadoB;
    private javax.swing.JComboBox<String> cmbtipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tablah;
    private javax.swing.JLabel txtT;
    private javax.swing.JTextField txtbus;
    private javax.swing.JTextField txtcamas;
    private javax.swing.JTextField txtespacio;
    private javax.swing.JTextField txtnum;
    // End of variables declaration//GEN-END:variables
}
