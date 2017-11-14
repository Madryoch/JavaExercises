/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Madryoch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Zeakros
 */
public class WTFClass {

    public static void main(String[] args) throws IOException 
    {
        //Keyboard Entry of a String
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your first name: ");
        String fName=br.readLine();
        
        System.out.println("Please enter your last name: ");
        String lName=br.readLine();
        
        System.out.println("Please enter your Father's name: ");
        String fthName=br.readLine();
        
        
      
        System.out.println("Enter your date of birth in dd/mm/yyyy format: ");
        String date=br.readLine();
        
        Person person=new Person(fName,lName,fthName,date);
        String filename=person.getLName()+"."+person.getFName()+".txt";
        
        for(int i=1;i<=3;++i)
        {
            person.writeString(i, filename);
                       
        }
                
    }
    
}
