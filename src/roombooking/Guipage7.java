/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roombooking;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static roombooking.Guipage4.Deserialize;

/**
 *
 * @author ovais
 */
public class Guipage7 extends javax.swing.JFrame {

    /**
     * Creates new form Guipage7
     */
    public Guipage7() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Impress BT", 0, 24)); // NOI18N
        jLabel2.setText("Notifications Panel");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 10, 200, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 510, 180);

        jTextField2.setText("Type Name Here");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(410, 240, 100, 30);

        jTextField1.setText("Type Day Here");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(410, 270, 100, 30);

        jButton3.setFont(new java.awt.Font("Impress BT", 0, 24)); // NOI18N
        jButton3.setText("Book!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(370, 350, 150, 40);

        jTextField3.setText("Type Class Here");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(10, 250, 100, 30);

        jTextField4.setText("Type Slot Here");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(410, 300, 100, 30);

        jButton1.setFont(new java.awt.Font("Impress BT", 0, 14)); // NOI18N
        jButton1.setText("Display Notifications");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 20, 160, 30);

        jButton2.setFont(new java.awt.Font("Impress BT", 0, 14)); // NOI18N
        jButton2.setText("Press To Delete Notification");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 280, 210, 40);

        jButton4.setFont(new java.awt.Font("Impress BT", 0, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(10, 360, 140, 33);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rtlstudent\\Documents\\NetBeansProjects\\RoomBooking\\src\\roombooking\\polygonal-texture-background-vector.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{  String a=jTextField2.getText();
            String b=jTextField1.getText();
            int ab=0 ;
            if(b.equalsIgnoreCase("monday"))
            ab=0;
            if(b.equalsIgnoreCase("tuesday"))
            ab=1;
            if(b.equalsIgnoreCase("wednesday"))
            ab=2;
            if(b.equalsIgnoreCase("thursday"))
            ab=3;
            if(b.equalsIgnoreCase("Friday"))
            ab=4;
            if(b.equalsIgnoreCase("Saturday"))
            ab=5;

            int c=Integer.parseInt(jTextField4.getText())-1;
            if(a.startsWith("C", 2)||a.startsWith("c", 2)){
                ArrayList abc=Deserialize("CR");
                for (int i = 0; i < abc.size(); i++) {
                    ClassRoom ba=(ClassRoom)abc.get(i);
                    if(a.equalsIgnoreCase(ba.getname())){
                        if(ba.TimeTableArr[c][ab]==false){
                            JOptionPane.showMessageDialog(null,
                                "Room already Booked",
                                "Please Select Another",
                                JOptionPane.ERROR_MESSAGE);
                            break;}
                        else{abc.remove(i);
                            ba.TimeTableArr[c][ab]=true;
                            JOptionPane.showMessageDialog(null,
                                "Successfully booked",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                            abc.add(ba);
                            FileOutputStream fileOut2;
                            try {
                                fileOut2 = new FileOutputStream("CR.dat",false);
                                ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);
                                out2.writeObject(abc);
                                out2.close();
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Guipage4.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(Guipage4.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            break;}}
                    if(i==abc.size()-1){
                        JOptionPane.showMessageDialog(null,
                            "You have entered Something wrong",
                            "Please Try again",
                            JOptionPane.ERROR_MESSAGE);
                    }}}
                    if(a.startsWith("S", 2)||a.startsWith("s", 2)){
                        ArrayList abc=Deserialize("SR");
                        for (int i = 0; i < abc.size(); i++) {
                            SeminarRoom ba=(SeminarRoom)abc.get(i);
                            if(a.equalsIgnoreCase(ba.getname())){
                                if(ba.TimeTableArr[c][ab]==false){
                                    JOptionPane.showMessageDialog(null,
                                        "Room already Booked",
                                        "Please Select Another",
                                        JOptionPane.ERROR_MESSAGE);
                                    break;}
                                else{abc.remove(i);
                                    ba.TimeTableArr[c][ab]=false;
                                    JOptionPane.showMessageDialog(null,
                                        "Successfully booked",
                                        "Success",
                                        JOptionPane.INFORMATION_MESSAGE);
                                    abc.add(ba);
                                    FileOutputStream fileOut2;
                                    try {
                                        fileOut2 = new FileOutputStream("SR.dat",false);
                                        ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);
                                        out2.writeObject(abc);
                                        out2.close();
                                    } catch (FileNotFoundException ex) {
                                        Logger.getLogger(Guipage4.class.getName()).log(Level.SEVERE, null, ex);
                                    } catch (IOException ex) {
                                        Logger.getLogger(Guipage4.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    break;}}
                            if(i==abc.size()-1){
                                JOptionPane.showMessageDialog(null,
                                    "You have entered Something wrong",
                                    "Please Try again",
                                    JOptionPane.ERROR_MESSAGE);
                            }}}
                            if(a.startsWith("B", 0)||a.startsWith("b", 0)){
                                ArrayList abc=Deserialize("BR");
                                for (int i = 0; i < abc.size(); i++) {
                                    Breakout ba=(Breakout)abc.get(i);
                                    if(a.equalsIgnoreCase(ba.getname())){
                                        if(ba.TimeTableArr[c][ab]==false){
                                            JOptionPane.showMessageDialog(null,
                                                "Room already Booked",
                                                "Please Select Another",
                                                JOptionPane.ERROR_MESSAGE);
                                            break;}
                                        else{abc.remove(i);
                                            ba.TimeTableArr[c][ab]=false;
                                            JOptionPane.showMessageDialog(null,
                                                "Successfully booked",
                                                "Success",
                                                JOptionPane.INFORMATION_MESSAGE);
                                            abc.add(ba);
                                            FileOutputStream fileOut2;
                                            try {
                                                fileOut2 = new FileOutputStream("BR.dat",false);
                                                ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);
                                                out2.writeObject(abc);
                                                out2.close();
                                            } catch (FileNotFoundException ex) {
                                                Logger.getLogger(Guipage4.class.getName()).log(Level.SEVERE, null, ex);
                                            } catch (IOException ex) {
                                                Logger.getLogger(Guipage4.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                            break;}}
                                    if(i==abc.size()-1){
                                        JOptionPane.showMessageDialog(null,
                                            "You have entered Something wrong",
                                            "Please Try again",
                                            JOptionPane.ERROR_MESSAGE);
                                    }}}}
                                    catch(NumberFormatException e){
                                        JOptionPane.showMessageDialog(null,
                                            "Please Enter something in the fields ",
                                            "Please Try again",
                                            JOptionPane.ERROR_MESSAGE);
                                    }
        ArrayList ab=Deserialize("request");
        for (int i = 0; i < ab.size(); i++) {
            Request ba=(Request)ab.get(i);
            if(ba.getname().equalsIgnoreCase(jTextField2.getText())){
                ab.remove(i);
            }
        }
        FileOutputStream fileOut2;
                       try {
                           fileOut2 = new FileOutputStream("request.dat",false);
                           ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);
                            out2.writeObject(ab);
                            out2.close();
                       } catch (FileNotFoundException ex) {
                           Logger.getLogger(Guipage4.class.getName()).log(Level.SEVERE, null, ex);
                       } catch (IOException ex) {
                           Logger.getLogger(Guipage4.class.getName()).log(Level.SEVERE, null, ex);
                       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList ab=Deserialize("request");
        for (int i = 0; i < ab.size(); i++) {
        Request ba=(Request)ab.get(i);
        String name=ba.getname();
        int day=ba.getday();
        String slot=Integer.toString(ba.getslot());
        String count=Integer.toString(i+1);
        jTextArea1.append(count+") Class "+name+", for slot number "+slot+" on "+DAY(day)+"\n");
        }
        jTextArea1.append("\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String a=jTextField3.getText();
        ArrayList ab=Deserialize("request");
        for (int i = 0; i < ab.size(); i++) {
            Request ba=(Request)ab.get(i);
            if(ba.getname().equalsIgnoreCase(a)){
                ab.remove(i);
            }
        }
        FileOutputStream fileOut2;
                       try {
                           fileOut2 = new FileOutputStream("request.dat",false);
                           ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);
                            out2.writeObject(ab);
                            out2.close();
                       } catch (FileNotFoundException ex) {
                           Logger.getLogger(Guipage4.class.getName()).log(Level.SEVERE, null, ex);
                       } catch (IOException ex) {
                           Logger.getLogger(Guipage4.class.getName()).log(Level.SEVERE, null, ex);
                       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        Guipage4 abc= new Guipage4();
        abc.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
public static String DAY( int a){
    if(a==0)
        return "Monday";
    if(a==1)
        return "Tuesday";
    if(a==2)
        return "Wednesday";
    if(a==3)
        return "Thursday";
    if(a==4)
        return "Friday";
    if(a==5)
        return "Saturday";
    return "aguero";
}
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
            java.util.logging.Logger.getLogger(Guipage7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guipage7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guipage7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guipage7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guipage7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
