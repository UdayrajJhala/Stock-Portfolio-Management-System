package StockPortfolioManagement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author udayj
 */

import java.sql.*;

public class CreateDemat extends javax.swing.JFrame {

    /**
     * Creates new form CreateDemat
     */

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    int id;
    String name;
    String email;

    public CreateDemat() {
        initComponents();
        con = DB.mycon();
    }

    public CreateDemat(int id) {
        initComponents();
        con = DB.mycon();
        this.id = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        balancefield = new javax.swing.JTextField();
        dematidfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        panidfield = new javax.swing.JTextField();
        createdematbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(193, 219, 249));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 80)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 48, 144));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Stock Portfolio Management System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 14, Short.MAX_VALUE)));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 52)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(16, 48, 144));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Enter Details For Demat Account");
        jLabel7.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 52)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(16, 48, 144));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Demat Account ID:");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 52)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(16, 48, 144));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Add Funds (Rs.):");

        balancefield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        balancefield.setForeground(new java.awt.Color(16, 48, 144));
        balancefield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        balancefield.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(16, 48, 144), null));
        balancefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balancefieldActionPerformed(evt);
            }
        });

        dematidfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dematidfield.setForeground(new java.awt.Color(16, 48, 144));
        dematidfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dematidfield.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(16, 48, 144), null));
        dematidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dematidfieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 52)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(16, 48, 144));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("PAN ID:");

        panidfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panidfield.setForeground(new java.awt.Color(16, 48, 144));
        panidfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panidfield.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(16, 48, 144), null));
        panidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panidfieldActionPerformed(evt);
            }
        });

        createdematbutton.setBackground(new java.awt.Color(193, 219, 249));
        createdematbutton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        createdematbutton.setForeground(new java.awt.Color(16, 48, 144));
        createdematbutton.setText("Create Demat Account");
        createdematbutton
                .setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(16, 48, 144), null));
        createdematbutton.setDefaultCapable(false);
        createdematbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createdematbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 339,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 306,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 243,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 254,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dematidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 254,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(balancefield, javax.swing.GroupLayout.PREFERRED_SIZE, 254,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createdematbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 305,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(336, 336, 336)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dematidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(balancefield, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(createdematbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 52, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void balancefieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_balancefieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_balancefieldActionPerformed

    private void dematidfieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dematidfieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_dematidfieldActionPerformed

    private void panidfieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_panidfieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_panidfieldActionPerformed

    private void createdematbuttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createdematbuttonActionPerformed

        int dematid = 0;
        int balance = 0;
        boolean error = false;
        try {
            dematid = Integer.parseInt(dematidfield.getText());
        } catch (NumberFormatException e) {
            error = true;
            Dematerror de = new Dematerror();
            de.setVisible(true);
        }
        try {
            balance = Integer.parseInt(balancefield.getText());
        } catch (NumberFormatException e) {
            error = true;
            Amounterror ae = new Amounterror();
            ae.setVisible(true);
        }

        String panid = panidfield.getText();

        

        if (error == false) {
            try {
                String query = "insert into demataccount values (?,?,?,?)";
                ps = con.prepareStatement(query);
                ps.setInt(1, dematid);
                ps.setInt(2, balance);
                ps.setString(3, panid);
                ps.setInt(4, id);
                int rows = ps.executeUpdate();
                System.out.println(rows);
    
            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                String query2 = "select name from user where userid=?";
                ps = con.prepareStatement(query2);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if (rs.next()) {
                    name = rs.getString(1);
                    System.out.println(name);
                } else {

                    System.out.println("No user found with the given name.");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                String query3 = "select ContactInfo from user where userid=?";
                ps = con.prepareStatement(query3);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if (rs.next()) {
                    email = rs.getString(1);
                    System.out.println(email);
                } else {

                    System.out.println("No user found with the given name.");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            HomePage homepage = new HomePage(id, name, email, balance);
            homepage.setVisible(true);
            setVisible(false);
        }

    }// GEN-LAST:event_createdematbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateDemat.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateDemat.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateDemat.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateDemat.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateDemat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balancefield;
    private javax.swing.JButton createdematbutton;
    private javax.swing.JTextField dematidfield;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField panidfield;
    // End of variables declaration//GEN-END:variables
}
