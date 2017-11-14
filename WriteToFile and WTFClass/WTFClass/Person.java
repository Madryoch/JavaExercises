/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Madryoch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Zeakros
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String fathersName;
    private String dateOfBirth;
    
       
    public Person(String fName,String lName, String fthName, String dateOB)
    {
        this.firstName=fName;
        this.lastName=lName;
        this.fathersName=fthName;
        this.dateOfBirth=dateOB;
    }
    
    public String getFName()
    {
        return this.firstName;
    }
    
    public void setFName(String name)
    {
        this.firstName=name;
    }
    
    public String getLName()
    {
        return this.lastName;
    }
    
    public void setLName(String name)
    {
        this.lastName=name;
    }
    
    public String getFthName()
    {
        return this.fathersName;
    }
    
    public void setFthName(String name)
    {
        this.fathersName=name;
    }
    
    public String getDateOfBirth()
    {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(String date)
    {
        this.dateOfBirth=date;
    }
    
    public void writeString(int line,String filename) throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        
        PrintWriter pw;
        String s;
        int i=line;
        switch(i)
            {
                case 1:
                    pw=new PrintWriter(filename,"UTF-8");
                    s=this.firstName+", "+this.lastName+", "+this.fathersName;
                    pw.println("Line "+i+": "+s);
                    pw.close();
                    break;
                case 2:
                    pw=new PrintWriter(new FileOutputStream(    new File(filename),    true ));
                    s=this.dateOfBirth;
                    pw.append("Line "+i+": "+s);
                    pw.println();
                    pw.close();
                    break;
                case 3:
                    pw=new PrintWriter(new FileOutputStream(    new File(filename),    true ));
                    String s2[]=this.dateOfBirth.split("/");
                    
                    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Enter current date in dd/mm/yyyy format: ");
                    String s3[]=br.readLine().split("/");
                    
                    
                    int days=(Integer.parseInt(s3[1])*31+Integer.parseInt(s3[0]))-(Integer.parseInt(s2[1])*31+Integer.parseInt(s2[0]));
                    int age=Integer.parseInt(s3[2])-Integer.parseInt(s2[2]);
                    
                    if (days<0)
                        age--;
                    //System.out.printf("Line "+line+": "+"Your age is: "+age +"\n");
                    pw.append("Line "+i+": "+"Your age is: "+age +"\n");
                    pw.println();
                    pw.close();
                    break;
                default:
                    
                    
            }
        
    }
    
}




