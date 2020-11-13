package App;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Clientes extends javax.swing.JInternalFrame {
    Database ok = new Database();
    public Clientes() {
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
        ok.tabCliente(tablah);
    }
    public void desh(){
        txtnom.setEnabled(false);
        txtsald.setEnabled(false);
        txtasala.setEnabled(false);
        txtdoc.setEnabled(false);
         txtap.setEnabled(false);
         btncan.setEnabled(false);
         btngua.setEnabled(false);
         btneliminar.setEnabled(false);
    }
     public void hab(){
       
        txtnom.setEnabled(true);
        txtsald.setEnabled(true);
        txtasala.setEnabled(true);
        txtdoc.setEnabled(true);
         txtap.setEnabled(true);
         btncan.setEnabled(true);
         btngua.setEnabled(true);
         btneliminar.setEnabled(false);
    }
    public void limpiar(){
    
        txtnom.setText("");
        txtsald.setText("");
        txtasala.setText("");
        txtap.setText("");
        txtdoc.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtnom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btngua = new javax.swing.JButton();
        btncan = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtasala = new javax.swing.JTextField();
        txtdoc = new javax.swing.JTextField();
        txtap = new javax.swing.JTextField();
        txtsald = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tablah = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtbus = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtT = new javax.swing.JLabel();

        setClosable(true);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setForeground(new java.awt.Color(0, 204, 204));

        txtnom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre : ");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Salario: ");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Apelldo:");

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
        jLabel16.setText("Num doc :");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Saldo:");

        txtasala.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtasala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtasalaActionPerformed(evt);
            }
        });

        txtdoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocActionPerformed(evt);
            }
        });

        txtap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapActionPerformed(evt);
            }
        });

        txtsald.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtsald.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel17)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtasala, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtap, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(txtsald, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btngua)
                        .addGap(18, 18, 18)
                        .addComponent(btncan)
                        .addGap(63, 63, 63))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsald, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtasala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngua)
                    .addComponent(btncan)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 550));

        jPanel7.setBackground(new java.awt.Color(238, 238, 221));

        tablah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "identificacion","nombre","apellido","saldo","salario"
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

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Buscar :");

        txtbus.setBackground(new java.awt.Color(238, 238, 221));
        txtbus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbus.setToolTipText("Ingrese Identificacion");
        txtbus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusActionPerformed(evt);
            }
        });
        txtbus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusKeyReleased(evt);
            }
        });

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eliminar-20.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(62, 62, 62))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtbus, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtbus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtT))
                .addGap(89, 89, 89))
        );

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

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed
    public String pass="";
    private void txtasalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtasalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtasalaActionPerformed

    private void txtdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdocActionPerformed

    private void txtapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapActionPerformed

    private void txtsaldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsaldActionPerformed

    private void btnguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguaActionPerformed
        // TODO add your handling code here:
        String nom,ap,tip,doc,sald,sala;
        nom=txtnom.getText();
        sald=txtsald.getText();
        sala=txtasala.getText();
        ap=txtap.getText();
        doc=txtdoc.getText();
        ok.Cliente(doc, nom, ap,sald, sala);
        escribir();
        pass="";
        desh();
    }//GEN-LAST:event_btnguaActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        ok.DelCliente(pass);
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
            ok.EscribirClienteBusqueda(tablah, bus);
        }
    }//GEN-LAST:event_txtbusKeyReleased

    private void tablahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablahMouseClicked
        // TODO add your handling code here:
        int num;
        String doc,nom,tel,mail,ap1,ap2,tipodoc,cod,dir;
        num=tablah.rowAtPoint(evt.getPoint());
        // System.out.print(num=tablah.rowAtPoint(evt.getPoint()));

        doc = tablah.getModel().getValueAt(num, 0).toString();
        nom = tablah.getModel().getValueAt(num, 1).toString();
        tel = tablah.getModel().getValueAt(num, 2).toString();
        mail = tablah.getModel().getValueAt(num, 3).toString();
        ap1 = tablah.getModel().getValueAt(num, 4).toString();
        // Object var=tablah.getColumnModel().getColumn(0);
        txtnom.setText(nom);
        txtsald.setText(mail);
        txtasala.setText(ap1);
        txtap.setText(tel);
        txtdoc.setText(doc);
        
        //pass=(int) ;
        String i = tablah.getModel().getValueAt(num, 0).toString();
        pass=i;
        hab();
         btneliminar.setEnabled(true);
         txtdoc.setEnabled(false);
    }//GEN-LAST:event_tablahMouseClicked

    private void txtbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncan;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btngua;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tablah;
    private javax.swing.JLabel txtT;
    private javax.swing.JTextField txtap;
    private javax.swing.JTextField txtasala;
    private javax.swing.JTextField txtbus;
    private javax.swing.JTextField txtdoc;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtsald;
    // End of variables declaration//GEN-END:variables
}
