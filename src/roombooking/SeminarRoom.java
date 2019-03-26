/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roombooking;
import java.io.Serializable;
/**
 *
 * @author ovais
 */
public class SeminarRoom extends Room implements Serializable{
    public String Available(boolean a){
        
        if (a==true){
            String s="Available";
            return s;
        }
        if(a==false){
            String ab= "Not Available";
            return ab;
        }
        return "aguero";
    }
    public void ClassTT(boolean [][] a,int abc){
        for (int i = 0; i < 6; i++) {
            switch (i){
            case 0: System.out.println("1st Slot "+ Available(a[i][abc]));
            break;
            case 1: System.out.println("2nd Slot "+ Available(a[i][abc]));
            break;
            case 2: System.out.println("3rd Slot "+ Available(a[i][abc]));
            break;
            case 3: System.out.println("Break "+ Available(a[i][abc]));
            break;
            case 4: System.out.println("4th Slot "+ Available(a[i][abc]));
            break;
            case 5: System.out.println("5th Slot "+ Available(a[i][abc]));
            break;
        } 
        }
    }
    private boolean Projector;
    protected SeminarRoom[] SeminarRoomArr;
    public void DisplayTT(){
        String[] arr={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        ClassTT(TimeTableArr,i);
        }
       
    }
     public void setprojector(boolean a){
        Projector=a;
    }
    public boolean getprojector(){
        return Projector;
    }
}
