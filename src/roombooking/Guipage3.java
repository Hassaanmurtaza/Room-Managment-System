/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roombooking;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.*;
import static roombooking.Guipage2.Deserialize;
import static roombooking.Student.StudentIDPass;


/**
 *
 * @author ovais
 */
public class Guipage3 extends javax.swing.JFrame {
    

    /**
     * Creates new form Guipage3
     */
    public Guipage3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Impress BT", 1, 24)); // NOI18N
        jLabel2.setText("Student Login Menu");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 20, 250, 60);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(150, 100, 200, 20);

        jLabel3.setFont(new java.awt.Font("Impress BT", 1, 18)); // NOI18N
        jLabel3.setText("User Id :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 80, 100, 60);

        jLabel4.setFont(new java.awt.Font("Impress BT", 1, 18)); // NOI18N
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 150, 100, 60);

        jButton1.setFont(new java.awt.Font("Impress BT", 0, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 220, 90, 40);

        jButton2.setFont(new java.awt.Font("Impress BT", 0, 14)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 220, 120, 40);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(150, 170, 200, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rtlstudent\\Documents\\NetBeansProjects\\RoomBooking\\src\\roombooking\\polygonal-texture-background-vector.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
      Guipage1 abc=new Guipage1();
      abc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String Id=jTextField1.getText();
         char[] aab=   jPasswordField1.getPassword();
            String pass="";
            for (int i = 0; i < aab.length; i++) {
            pass=pass+aab[i];
        }
       
        ArrayList ab=Deserialize("student");
          for (int i = 0; i < ab.size(); i++) {
              Student ba=(Student)ab.get(i);
              if(Id.equalsIgnoreCase(ba.getID())&&pass.equals(ba.getPass())){
                   
                  this.dispose();
                    Guipage5 abc=new Guipage5();
                    abc.setVisible(true);
                    break;
              }
          if(i==ab.size()-1){    
          JOptionPane.showMessageDialog(null,
                    "Incorrect Id or Password. Try again.",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
          
          }
          }
          jTextField1.setText ("");
           
              
           
              
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Guipage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guipage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guipage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guipage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guipage3().setVisible(true);
            }
        });
    }
    public static ArrayList Deserialize(String a ){
    ArrayList Room = null;
    String s=a+".dat";
    try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(s));
        Room = (ArrayList)in.readObject(); 
        in.close();
    }
    catch(Exception e) {}
    return Room;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}