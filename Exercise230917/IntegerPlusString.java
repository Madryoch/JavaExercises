/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package integerplusstring;

/**
 *
 * @author madryoch
 */
import java.util.Scanner;

public class IntegerPlusString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner intInput=new Scanner(System.in);
        System.out.print("Insert an integer: ");
        int myInt= intInput.nextInt();
        
        Scanner strInput=new Scanner(System.in);
        System.out.print("\nEnter your String value: ");
        String myString=strInput.nextLine();
        
        System.out.println("\n\n You typed: "+myString+" "+myInt);
    }
    
}
