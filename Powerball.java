package cis296hw2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
import java.util.Scanner;
import java.util.Random;

public class Powerball 
{
    public static void main(String[] args) 
    {
       Scanner gambler;
       gambler = new Scanner(System.in);
       

       
       Random numbers = new Random();
       Random rednum = new Random();
       
       //powerball(numbers, rednum);
       
    }
    
    public void powerball ( Random num, Random rnum)
    {
        int a = 0;
        int b = 0;
       
        System.out.println( "The winning numbers are: ");
        
           do
           {    
             int ticknum = num.nextInt(70);
             
             int tempnum = ticknum;
             
             if (ticknum == tempnum)
             {
                 ticknum = num.nextInt(70);
             }
             
             System.out.print("["+ ticknum + "] ");
             a++;
           }
           while(a <= 5);
           
           do
           {
             int ticknumr = rnum.nextInt(27);
             
             System.out.print( "[" +ticknumr + "] ");
             b++;
           }
           while (b <= 1);
       }
       
      
    
}
