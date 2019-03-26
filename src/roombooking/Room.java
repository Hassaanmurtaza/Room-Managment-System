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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static roombooking.Guipage4.Deserialize;

/**
 *
 * @author ovais
 */
public abstract class Room implements Serializable{
    Student d;
    Admin a;
    private String Name;
    private String Building;
    private int Capacity;
    public boolean [][] TimeTableArr;
    
    protected void Book(String aa,String bb, String cc ){
       try{ String a=aa;
       String b=bb;
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
      
       int c=Integer.parseInt(cc)-1;
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
                    "Please Enter A NUMBER in the third text field",
                    "Please Try again",
                    JOptionPane.ERROR_MESSAGE);
        
    }}
    protected void UnBook(){
        
    }
    public void DisplayFull(int a, int b){
        
    }
    public abstract void DisplayTT();
    
    public void setname(String a){
        Name =a;
    }
    public  String getname(){
        return Name;
    }
    public void setbuilding(String a){
        Building =a;
    }
    public String getbuilding(){
        return Building;
    }
    public void setCapacity(int a){
        Capacity =a;
    }
    public int getCapacity(){
        return Capacity ;
    }
    public void intTT(){
        TimeTableArr=new boolean[6][6];
    }
    public void setTT(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                TimeTableArr[i][j]=true;
            }
        }
       
    }
    
    
    }
    


