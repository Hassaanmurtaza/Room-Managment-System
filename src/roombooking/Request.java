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
public class Request implements Serializable{
    Student stu;
    private String ClassName;
    private int Day;
    private int Slot;
    public void setname(String a){
        ClassName =a;
    }
    public  String getname(){
        return ClassName;
    }
    
    public void setday(int a){
        Day =a;
    }
    public  int getday(){
        return Day;
    }
    public void setslot(int a){
        Slot =a;
    }
    public  int getslot(){
        return Slot;
    }
    
    
    
    
}
