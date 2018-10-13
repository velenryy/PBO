/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;
public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int nil1,nil2,nil3,nil4,nil5;
        
        System.out.print("nilai 1 = ");
        nil1 = input.nextInt();
        System.out.print("nilai 2 = ");
        nil2 = input.nextInt();
        System.out.print("nilai 3 = ");
        nil3 = input.nextInt();
        System.out.print("nilai 4 = ");
        nil4 = input.nextInt();
        System.out.print("nilai 5 = ");
        nil5 = input.nextInt();
        
        int max=nil1;
        int min=nil1;
        
        if (nil2>max){
            max=nil2;
        }else if (nil2<min)
            min=nil2;
        
        if (nil3>max){
            max=nil3;
        }else if (nil3<min)
            min=nil3;
        
        if (nil4>max){
            max=nil4;
        }else if (nil4<min)
            min=nil4;
        
        if (nil5>max){
            max=nil5;
        }else if (nil5<min){
            min=nil5;
        }
        System.out.println("Nilai Max = " + max);
        System.out.println("Nilai Min = " + min);
            
        
 
        
     
    
    
    
    
        
    
        // TODO code application logic here
    }
    
}
