package App;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Alquiler extends javax.swing.JInternalFrame {
    Database ok = new Database();
    String numh;
    public Alquiler() {
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
         p2.setVisible(false);
          p3.setVisible(false);
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
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        p3 = new javax.swing.JPanel();
        lbltotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdias = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtT = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtbus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbestadoB = new javax.swing.JComboBox<>();
        scroll = new javax.swing.JScrollPane();
        tablah = new javax.swing.JTable();

        setClosable(true);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(238, 238, 221));
        jPanel7.setLayout(null);

        p2.setBackground(new java.awt.Color(238, 238, 221));
        p2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 30)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        p2.add(jLabel2);
        jLabel2.setBounds(820, 10, 30, 41);

        txtid.setBackground(new java.awt.Color(238, 238, 221));
        txtid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtid.setToolTipText("Ingrese Identificacion");
        txtid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidKeyReleased(evt);
            }
        });
        p2.add(txtid);
        txtid.setBounds(430, 80, 150, 29);

        p3.setBackground(new java.awt.Color(238, 238, 221));

        lbltotal.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 30)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(0, 153, 51));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 30)); // NOI18N
        jLabel4.setText("Dias :");

        txtdias.setBackground(new java.awt.Color(238, 238, 221));
        txtdias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdias.setToolTipText("Ingrese Identificacion");
        txtdias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtdias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdiasKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Alquilar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 30)); // NOI18N
        jLabel5.setText("Total :");

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtdias, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(p3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdias, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        p2.add(p3);
        p3.setBounds(210, 130, 430, 290);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 30)); // NOI18N
        jLabel3.setText("Identificacion: ");
        p2.add(jLabel3);
        jLabel3.setBounds(210, 70, 188, 41);

        jPanel7.add(p2);
        p2.setBounds(50, 10, 880, 520);
        jPanel7.add(jLabel1);
        jLabel1.setBounds(598, 461, 0, 0);
        jPanel7.add(txtT);
        txtT.setBounds(592, 461, 0, 0);

        p1.setBackground(new java.awt.Color(238, 238, 221));
        p1.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Buscar :");
        p1.add(jLabel13);
        jLabel13.setBounds(300, 40, 64, 22);

        txtbus.setBackground(new java.awt.Color(238, 238, 221));
        txtbus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbus.setToolTipText("Ingrese Identificacion");
        txtbus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtbus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusKeyReleased(evt);
            }
        });
        p1.add(txtbus);
        txtbus.setBounds(390, 40, 190, 29);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Estado: ");
        jLabel8.setEnabled(false);
        p1.add(jLabel8);
        jLabel8.setBounds(300, 110, 65, 22);

        cmbestadoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible" }));
        cmbestadoB.setEnabled(false);
        cmbestadoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbestadoBActionPerformed(evt);
            }
        });
        p1.add(cmbestadoB);
        cmbestadoB.setBounds(380, 100, 196, 38);

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

        p1.add(scroll);
        scroll.setBounds(110, 160, 710, 320);

        jPanel7.add(p1);
        p1.setBounds(10, 10, 980, 500);

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 550));

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
        p2.setVisible(true);
        p1.setVisible(false);
        this.numh = nu;
        // Object var=tablah.getColumnModel().getColumn(0);
        /*txttipo.setText(tipo);
        txtespacio.setText(espacio);
        txtcamas.setText(camas);
        cmbestado.setSelectedItem(estados);
        txtnum.setText(nu);
        
        //pass=(int) ;
        String i = tablah.getModel().getValueAt(num, 0).toString();
        pass=i;
        hab();
         btneliminar.setEnabled(true);
         txtnum.setEnabled(false);*/
    }//GEN-LAST:event_tablahMouseClicked

    private void cmbestadoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbestadoBActionPerformed
        escribir();
    }//GEN-LAST:event_cmbestadoBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ok.ActualizarEstado(numh,"Ocupado");
        ok.ActualizarSaldo(txtid.getText(),lbltotal.getText());
        ok.Alquilar(txtid.getText(),numh,txtdias.getText(),lbltotal.getText());
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdiasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiasKeyReleased
      
      int dias = Integer.parseInt(txtdias.getText());
      int valor = Integer.parseInt(ok.ObtenerPrecio(numh));
      lbltotal.setText(""+(dias*valor));
    }//GEN-LAST:event_txtdiasKeyReleased

    private void txtidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyReleased
        p3.setVisible(ok.ValidarCliente(txtid.getText()));
        
    }//GEN-LAST:event_txtidKeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       p2.setVisible(false);
       p1.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbestadoB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tablah;
    private javax.swing.JLabel txtT;
    private javax.swing.JTextField txtbus;
    private javax.swing.JTextField txtdias;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
