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
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author ovais
 */
public class RoomBooking {
    public static void InputCR(ClassRoom a){
        Scanner in=new Scanner(System.in);
        
        String ab="MTC 1";
        a.setname(ab);
        String cb="Tabba";
        a.setbuilding(cb);
        int bb=40;
        a.setCapacity(bb);
        boolean bc=true;
        a.setprojector(bc);
        a.intTT();
        a.setTT();
    }
    public static void InputBR(Breakout a){
        Scanner in=new Scanner(System.in);
       
        String ab="BR 1";
        a.setname(ab);
        String cb="Adamjee";
        a.setbuilding(cb);
        int bb=6;
        a.setCapacity(bb);
        a.intTT();
        a.setTT();
    }
    public static void InputSR(SeminarRoom a){
        Scanner in=new Scanner(System.in);
        String ab="MAS 1";
        a.setname(ab);
        String cb="Adamjee";
        a.setbuilding(cb);
        int bb=60;
        a.setCapacity(bb);
        boolean bc=true;
        a.setprojector(bc);
        a.intTT();
        a.setTT();
    }
    public static void InputSR1(SeminarRoom a){
        Scanner in=new Scanner(System.in);
        String ab="MAS 2";
        a.setname(ab);
        String cb="Adamjee";
        a.setbuilding(cb);
        int bb=60;
        a.setCapacity(bb);
        boolean bc=true;
        a.setprojector(bc);
        a.intTT();
        a.setTT();
    }
    
    

  
    public static void main(String[] args) throws Exception {
        
//       ClassRoom MTC1=new ClassRoom();
//        InputCR(MTC1);
//        Breakout BR1=new Breakout();
//        InputBR(BR1);
//        SeminarRoom MAS1=new SeminarRoom();
//        InputSR(MAS1);
//        SeminarRoom MAS2=new SeminarRoom();
//        InputSR1(MAS2);
//        ArrayList CR=new ArrayList();
//        ArrayList BR=new ArrayList();
//        ArrayList SR=new ArrayList();
//        CR.add(MTC1);
//        BR.add(BR1);
//        SR.add(MAS1);
//        SR.add(MAS2);
//        
//     FileOutputStream fileOut = new FileOutputStream("CR.dat");
//     ObjectOutputStream out = new ObjectOutputStream(fileOut);
//     out.writeObject(CR);
//      out.close();
//      FileOutputStream fileOut1 = new FileOutputStream("BR.dat");
//     ObjectOutputStream out1 = new ObjectOutputStream(fileOut1);
//     out1.writeObject(BR);
//      out1.close();
//      FileOutputStream fileOut2 = new FileOutputStream("SR.dat");
//     ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);
//     out2.writeObject(SR);
//      out2.close();
//  
//        Admin ab=new Admin();
//        ab.setID("Waleed");
//        ab.setPass("admin");
//        ab.setname("Waleed Jani");
//        ArrayList bac=new ArrayList();
//        bac.add(ab);
//        Admin abc=new Admin();
//        abc.setID("Hassaan");
//        abc.setPass("admin");
//        abc.setname("Hassaan");
//        bac.add(abc);
//        
//        Student ba=new Student();
//        ba.setID("11554");
//        ba.setPass("admin");
//        ba.setname("Aguero");
//        ArrayList Student=new ArrayList();
//        Student.add(ba);
//        Student bc=new Student();
//        bc.setID("12345");
//        bc.setPass("admin");
//        bc.setname("Iftikhar");
//        Student.add(bc);
////        
//            FileOutputStream fileOut3 = new FileOutputStream("student.dat");
//     ObjectOutputStream out3 = new ObjectOutputStream(fileOut3);
//     out3.writeObject(Student);
//      out3.close();
//      FileOutputStream fileOut4 = new FileOutputStream("admin.dat");
//     ObjectOutputStream out4 = new ObjectOutputStream(fileOut4);
//     out4.writeObject(bac);
//      out4.close();
        java.awt.EventQueue.invokeLater(new Runnable(){
        public void run(){
            new Guipage1().setVisible(true);
        }});
//       
//        
        
       
    }
        
    
   
}
