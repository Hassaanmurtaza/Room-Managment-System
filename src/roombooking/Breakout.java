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
public class Breakout extends Room implements Serializable {
    protected Breakout[] BreakoutArr;
    public void DisplayTT(){
        
    }
    public String Available(boolean a){
        
        if (a==true){
            String s="Available";
            return s;
        }
        if(a==false){
            String ab= "No Available";
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
}
