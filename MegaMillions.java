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

public class MegaMillions 
{
    public static void main(String[] args) 
    {
        Scanner gambler;
        gambler = new Scanner(System.in);
        
        Random numbers = new Random();
        Random goldnum = new Random();
        
        //MegaMillions.Megamill( numbers, goldnum);
        
    }
    
    public void Megamill ( Random num, Random gnum)
    {
        
        int a = 0;
        int b = 0;
        
        System.out.println( "The winning numbers are: " );
        
            do
            {
              int ticknum = num.nextInt(76);
              
              int tempnum = ticknum;
             
             if (ticknum == tempnum)
             {
                 ticknum = num.nextInt(70);
             }
              
              System.out.print( "[" +ticknum + "] ");
              a++;
            }
            while(a <= 5 );
            
            do
            {
               int ticknumg = gnum.nextInt(16);
               
               System.out.print( "[" + ticknumg + "] ");
               b++;
            }
            while ( b <= 1);
        }
    
    
}
