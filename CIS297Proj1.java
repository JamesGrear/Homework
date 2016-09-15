/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.pkg297.proj.pkg1;

/**
 *
 * @author owner
 */
import java.util.Scanner;
public class CIS297Proj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int credits;
        int totcredits;
        int scredits;
        int Result;
        
        Scanner user;
        String name;
      
        
        
        user = new Scanner(System.in);
       
    
        
        System.out.println("What is your name?");
        name = user.next();
        
        
        System.out.println(name + " how many credits are needed total to graduate?");
        totcredits = user.nextInt();
        
        System.out.println(name + " how many have you completed?");
        credits = user.nextInt();
        
        System.out.println(name + " how many credits do you take a semster?");
        scredits = user.nextInt();
        
        Result = totcredits - credits;
        Result = Result / scredits;
        
        System.out.println(name + " You have " + Result + " semesters to graduate." );
        
        
    }
    
}
