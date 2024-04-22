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


import javax.swing.table.DefaultTableModel;
public class StocksPage extends javax.swing.JFrame {

    /**
     * Creates new form StocksPage
     */
    Connection con = null;
     ResultSet rs = null;
     PreparedStatement ps = null;
 
     int id;
     String name;
     String email;
     int balance;
     int dematid;
    String stockname;
     int stockprice;

    public StocksPage() {
        initComponents();
        con = DB.mycon();
        populateStockTable();
    }

    public StocksPage(int id, String name, String email, int balance) {
        initComponents();
        con = DB.mycon();
        this.id = id;
        useridDisplay3.setText("User ID: " + String.valueOf(id));
        populateStockTable();
        this.name=name;
        Namedisplay3.setText("Name: "+name);
        this.email=email;
        emaildisplay3.setText("Email: "+email);
        this.balance=balance;
        balancedisplay3.setText("Balance: "+String.valueOf(balance));
    }

    private void populateStockTable() {
        try {
            
            String query = "SELECT * FROM stock";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            
            DefaultTableModel model = new DefaultTableModel();
            StockTable.setModel(model);

            
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            
        } finally {
            
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StockTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        stockidfield = new javax.swing.JTextField();
        BuyBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        useridDisplay3 = new javax.swing.JLabel();
        emaildisplay3 = new javax.swing.JLabel();
        Namedisplay3 = new javax.swing.JLabel();
        balancedisplay3 = new javax.swing.JLabel();
        PortfolioBtn3 = new javax.swing.JButton();
        StocksBtn3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        StockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(StockTable);

        jPanel3.setBackground(new java.awt.Color(193, 219, 249));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(16, 48, 144));
        jLabel7.setText("Buy a stock");

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(16, 48, 144));
        jLabel8.setText("Stock ID");

        stockidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockidfieldActionPerformed(evt);
            }
        });

        BuyBtn.setBackground(new java.awt.Color(16, 48, 144));
        BuyBtn.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        BuyBtn.setForeground(new java.awt.Color(255, 255, 255));
        BuyBtn.setText("BUY");
        BuyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stockidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(BuyBtn)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stockidfield))
                .addGap(37, 37, 37)
                .addComponent(BuyBtn)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(193, 219, 249));

        useridDisplay3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        useridDisplay3.setForeground(new java.awt.Color(16, 48, 144));
        useridDisplay3.setText("User ID");

        emaildisplay3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        emaildisplay3.setForeground(new java.awt.Color(16, 48, 144));
        emaildisplay3.setText("Email:");

        Namedisplay3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Namedisplay3.setForeground(new java.awt.Color(16, 48, 144));
        Namedisplay3.setText("Name");

        balancedisplay3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        balancedisplay3.setForeground(new java.awt.Color(16, 48, 144));
        balancedisplay3.setText(" Balance:");

        PortfolioBtn3.setBackground(new java.awt.Color(193, 219, 249));
        PortfolioBtn3.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        PortfolioBtn3.setText("Portfolio");
        PortfolioBtn3.setBorder(null);
        PortfolioBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PortfolioBtn3ActionPerformed(evt);
            }
        });

        StocksBtn3.setBackground(new java.awt.Color(137, 182, 242));
        StocksBtn3.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        StocksBtn3.setText("Stocks");
        StocksBtn3.setBorder(null);
        StocksBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StocksBtn3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(16, 48, 144));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Account Info: ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(PortfolioBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StocksBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emaildisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Namedisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(useridDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balancedisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PortfolioBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(StocksBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(balancedisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Namedisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emaildisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(useridDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stockidfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockidfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockidfieldActionPerformed

    private void BuyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyBtnActionPerformed
        int stockid=Integer.parseInt(stockidfield.getText());
        
        try {
            String query="select AccountNo from demataccount where userid=?";
            ps=con.prepareStatement(query);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            if(rs.next())
            {
                dematid=rs.getInt(1);
            }
            else{
                System.out.println("not found");
            }

        try {
            String query2="select stockname, stockprice from stock where stockid=?";
            ps=con.prepareStatement(query2);
            ps.setInt(1, stockid);
            rs=ps.executeQuery();
            if(rs.next())
            {
                stockname=rs.getString(1);
                stockprice=rs.getInt(2);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            String query3="insert into portfolio (userid, dematid, stockid, stockname, stockprice) values (?,?,?,?,?)";
            ps=con.prepareStatement(query3);
            ps.setInt(1, id);
            ps.setInt(2, dematid);
            ps.setInt(3, stockid);
            ps.setString(4, stockname);
            ps.setInt(5, stockprice);
            int rows=ps.executeUpdate();
            System.out.println(rows);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_BuyBtnActionPerformed

    private void PortfolioBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PortfolioBtn3ActionPerformed
        HomePage homepage = new HomePage(id,name, email, balance);
        homepage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_PortfolioBtn3ActionPerformed

    private void StocksBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StocksBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StocksBtn3ActionPerformed

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
            java.util.logging.Logger.getLogger(StocksPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StocksPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StocksPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StocksPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StocksPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuyBtn;
    private javax.swing.JLabel Namedisplay3;
    private javax.swing.JButton PortfolioBtn3;
    private javax.swing.JTable StockTable;
    private javax.swing.JButton StocksBtn3;
    private javax.swing.JLabel balancedisplay3;
    private javax.swing.JLabel emaildisplay3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stockidfield;
    private javax.swing.JLabel useridDisplay3;
    // End of variables declaration//GEN-END:variables
}