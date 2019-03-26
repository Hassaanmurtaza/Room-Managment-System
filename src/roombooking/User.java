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
public class User implements Serializable{
    protected String Name;
    protected String UserId;
    protected String UserPass;
    
    public void setname(String a){
        Name =a;
    }
    public  String getname(){
        return Name;
    }
    
    public void setID(String a){
        UserId =a;
    }
    public  String getID(){
        return UserId;
    }
    public void setPass(String a){
        UserPass =a;
    }
    public  String getPass(){
        return UserPass;
    }
}
