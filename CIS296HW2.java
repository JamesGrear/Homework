/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis296hw2;

/**
 *
 * @author owner
 */
import java.util.Scanner;
import java.util.Random;

public class CIS296HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner gambler;
        gambler = new Scanner(System.in);
        
        int [] values;
        values = new int[6];
        
        int tickets;
        int moneyspent;
        
        String choice;
        String munny;
        
        MegaMillions tick =  new MegaMillions();
        Powerball tick2 = new Powerball();
        
        Random numbers = new Random();
        Random rednum = new Random();
        
        Random numbers2 = new Random();
        Random goldnum = new Random();
        
        System.out.println("Hello and welcome to Grand Lottery!");
        System.out.println("A ticket for the MegaMillions will cost you a $1 while a ticket for powerball will cost you $2");
        
        System.out.println("would you like to play?");
        choice = gambler.next();
        
       
        
        if(choice.equals("yes"))
        {
            int a = 0;
            int b = 0;
            
            int c =0;
            int d =0;
            
            System.out.println("MegaMillions or Powerball?");
            munny = gambler.next();
            
            System.out.println("How many tickets would you like?");
            tickets = gambler.nextInt();
            
            if(munny.equals("Powerball") || munny.equals("powerball"))
            {
               for(int i = 0; i < tickets; i++)
               {
                   a = 0;
                   b = 0;
                do
                {    
                    int ticknum = numbers.nextInt(70);
                    int tempnum = ticknum;
             
                    if (ticknum == tempnum)
                    {
                        ticknum = numbers.nextInt(70);
                    }
             
                        System.out.print( ticknum + " ");
                        a++;
                }
                while(a <= 5);
           
                do
                {
                    int ticknumr = rednum.nextInt(27);
             
                    System.out.print( ticknumr + " ");
                    b++;
                }
                while (b <= 1);
                
                System.out.println("This is your ticket!");
                
               }
               
               tick2.powerball(numbers, rednum);
               
            }
            
            if (munny.equals("MegaMillions") || munny.equals("megamillions"))
            {
                
                for (int i = 0; i < tickets; i++)
                {
                    c = 0;
                    d = 0;
                   
                    do
                    {
                      int ticknum = numbers2.nextInt(76);
                      int tempnum = ticknum;

                     if (ticknum == tempnum)
                     {
                         ticknum = numbers2.nextInt(70);
                     }

                      System.out.print( ticknum + " ");
                      c++;
                    }
                    while(c <= 5 );

                    do
                    {
                       int ticknumg = goldnum.nextInt(16);

                       System.out.print( ticknumg + " ");
                       d++;
                    }
                    while ( d <= 1);
                    
                    System.out.println("This is your ticket!");
                }
                
                tick.Megamill(numbers2, goldnum);
                
            }
                
        }
        
         else
                {
                    System.out.println("Thanks for choosing our provider!");
                }
    }
}

