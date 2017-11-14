package com.Madryoch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author Madryoch
 * 
 * This program takes a few inputs from the user
 * and places them in a file named lastname.firstname.txt
 * using specified format:
 * 
 */
public class WriteToFile {

    
    public static void main(String[] args) throws IOException {
        
        //Keyboard Entry of a String
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your first name: ");
        String fName=br.readLine();
        String s=fName + ", ";
        System.out.println("Please enter your last name: ");
        String lName=br.readLine();
        s+= lName + ", ";
        System.out.println("Please enter your Father's name: ");
        String fthName=br.readLine();
        s+= fthName;
        
      
        System.out.println("Enter your date of birth in dd/mm/yyyy format: ");
        String s2[]=br.readLine().split("/");
        
        
        /*System.out.println("Enter current date in dd/mm/yyyy format: ");
        String s3[]=br.readLine().split("/");
        */
        
        //Calculating the number of days apart and the age based on year of birth and current date
        //Normally days should be calculated as (month-1)*31+day but it causes no change if we add 
        //a constant number of days to both parts thus we can use month*31+day instead
        //updated the value multiplied by months to 31 after checking that for values
        // Date of Birth 01/08/1981 and Current Date 31/06/2017 we received age 36 which is wrong...
        // There is a date class in Java but it was not used as instructed 
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(new Date());
        String s3[]=date.split("/");
        
        int days=(Integer.parseInt(s3[1])*31+Integer.parseInt(s3[0]))-(Integer.parseInt(s2[1])*31+Integer.parseInt(s2[0]));
        int age=Integer.parseInt(s3[2])-Integer.parseInt(s2[2]);
        
        String filename=lName+"."+fName+".txt";
        PrintWriter pw=new PrintWriter(filename,"UTF-8");
        
        
        for(int i=1;i<=3;++i)
        {
            switch(i)
            {
                case 1:
                    System.out.println("Line "+i+": "+s);
                    pw.println("Line "+i+": "+s);
                    break;
                case 2:
                    System.out.println("Line "+i+": "+s2[0]+"/"+s2[1]+"/"+s2[2]);
                    pw.append("Line "+i+": "+s2[0]+"/"+s2[1]+"/"+s2[2]);
                    pw.println("");
                    break;
                default:
                    if (days<0)
                        age--;
                    System.out.printf("Line "+i+": "+"Your age is: "+age +"\n");
                    pw.append("Line "+i+": "+"Your age is: "+age +"\n");
                    pw.println("");
            }
        }
        pw.close();
        
        
    }
    
}
/*
int year=Calendar.getInstance().get(Calendar,YEAR);
*/