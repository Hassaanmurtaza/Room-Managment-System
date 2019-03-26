/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roombooking;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable; 
import javax.swing.table.DefaultTableModel;

public class Jtable extends JFrame { 
    DefaultTableModel model;
    JTable table;
    
    String col[] = {" ","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public void start(ArrayList ar, String a) { 
        if (a.equalsIgnoreCase("SR")){
         model = new DefaultTableModel(col,ar.size()*10);
        table=new JTable(model){@Override
        public boolean isCellEditable(int arg0, int arg1) {
            return false; }}; 
        JScrollPane	pane = new JScrollPane(table);
        for (int i = 0; i < ar.size(); i++) {
                SeminarRoom ab= (SeminarRoom) ar.get(i);
                boolean [][] TT=ab.TimeTableArr;
                        String abc[]={ab.getname(),"1st Slot","2nd Slot","3rd Slot","4th Slot","5th Slot","6th Slot",};
                for (int j = 0; j < abc.length; j++) {
                    table.setValueAt(abc[j],j+(i*8),0);}
                for (int j = 1; j < 7; j++) {
                    for (int k = 1; k < 7; k++) {
                        table.setValueAt(Available(TT[j-1][k-1]), j+(i*8), k);
                    }}}
        add(pane);
        setVisible(true); 
        setSize(640,480); 
        setLayout(new FlowLayout()); 
        
        }
        if (a.equalsIgnoreCase("BR")){
         model = new DefaultTableModel(col,ar.size()*10);
        table=new JTable(model){@Override
        public boolean isCellEditable(int arg0, int arg1) {
            return false; }}; 
        JScrollPane	pane = new JScrollPane(table);
        for (int i = 0; i < ar.size(); i++) {
                Breakout ab= (Breakout) ar.get(i);
                boolean [][] TT=ab.TimeTableArr;
                       String abc[]={ab.getname(),"1st Slot","2nd Slot","3rd Slot","4th Slot","5th Slot","6th Slot",};
                for (int j = 0; j < abc.length; j++) {
                    table.setValueAt(abc[j],j+(i*8),0);}
                for (int j = 1; j < 7; j++) {
                    for (int k = 1; k < 7; k++) {
                        table.setValueAt(Available(TT[j-1][k-1]), j+(i*8), k);
                    }}}
        add(pane);
        setVisible(true); 
        setSize(640,480); 
        setLayout(new FlowLayout()); 
       
        }
        if (a.equalsIgnoreCase("CR")){
         model = new DefaultTableModel(col,ar.size()*10);
        table=new JTable(model){@Override
        public boolean isCellEditable(int arg0, int arg1) {
            return false; }}; 
        JScrollPane	pane = new JScrollPane(table);
        for (int i = 0; i < ar.size(); i++) {
                ClassRoom ab= (ClassRoom) ar.get(i);
                boolean [][] TT=ab.TimeTableArr;
                       String abc[]={ab.getname(),"1st Slot","2nd Slot","3rd Slot","4th Slot","5th Slot","6th Slot",};
                for (int j = 0; j < abc.length; j++) {
                    table.setValueAt(abc[j],j+(i*8),0);}
                for (int j = 1; j < 7; j++) {
                    for (int k = 1; k < 7; k++) {
                        table.setValueAt(Available(TT[j-1][k-1]), j+(i*8), k);
                    }}}
        add(pane);
        setVisible(true); 
        setSize(640,480); 
        setLayout(new FlowLayout()); 
        
        }
        
    }
    public String Available(boolean a){
        
        if (a==true){
            String s="Available";
            return s;
        }
        if(a==false){
            String ab= "NA";
            return ab;
        }
        return "aguero";
    }
}





    

