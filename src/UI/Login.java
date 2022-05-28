/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;


import java.sql.*;
import javax.swing.JOptionPane;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.PreparedStatement;
import src.Db;
import java.sql.ResultSet;




public class Login extends javax.swing.JFrame {



    
    
    public Login() {
        initComponents();
       setLocationRelativeTo(null);
       
        error.setVisible(false);
        sta1.setVisible(false);
        sta2.setVisible(false);
        
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
        sta2 = new javax.swing.JLabel();
        sta1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        op = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sta2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sta2.setForeground(new java.awt.Color(102, 0, 0));
        sta2.setText("*");
        jPanel1.add(sta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 20, -1));

        sta1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sta1.setForeground(new java.awt.Color(102, 0, 0));
        sta1.setText("*");
        jPanel1.add(sta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 26, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("USER NAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 220, 29));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 220, 34));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/istockphoto-1325306868-170667a.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 480, -1));

        error.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        error.setForeground(new java.awt.Color(153, 0, 0));
        error.setText("ERROR MSG");
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, 20));

        login.setBackground(new java.awt.Color(204, 0, 204));
        login.setFont(new java.awt.Font("Segoe UI Emoji", 1, 11)); // NOI18N
        login.setText("LOGIN");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 100, 30));

        cancel.setBackground(new java.awt.Color(153, 0, 153));
        cancel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 11)); // NOI18N
        cancel.setText("CANCEL");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 510, 110, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Select User");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 110, -1));

        op.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Admin", "Teacher", "", "" }));
        jPanel1.add(op, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
         try{
              String username  = uname.getText();
              String password = pass.getText();
              String usertype = op.getSelectedItem().toString();
             ResultSet rs = Db.getConnection().createStatement().executeQuery("select * from multiuserlogin where username='"+username+"' and password='"+password+"' and usertype='"+usertype+"' ");
             
             if(rs.next())
             {  
                 this.dispose();
                
                Home home= new Home();
                home.setVisible(true);
                
                dispose();
             }else if(username.equals("")&& password.equals("")&& usertype.equals(""))
             {
                 sta1.setVisible(true);
                 sta2.setVisible(true);
                 error.setVisible(true);
                 error.setText("Login Error");
             }else
             {
                 error.setVisible(true);
                 error.setText("Username or Password incorrect");
             }
            
                
        }catch(Exception e)   {
            e.printStackTrace();
        }  
        
          
           
             
             
                  
              
         
        
    

   
       
                
                
                 
            
                     
        
        
    }//GEN-LAST:event_loginActionPerformed
    
     
    

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    } catch (UnsupportedLookAndFeelException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JComboBox<String> op;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel sta1;
    private javax.swing.JLabel sta2;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}