/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprk1;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Tugasprk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Tugas Nomor 1");
    Scanner masukan = new Scanner(System.in);
        Double panjang, luas; 
        System.out.print("Masukkan panjang :"); 
            panjang= masukan.nextDouble(); 
        System.out.print("Masukkan lebar :"); 
            luas = masukan.nextDouble(); 
        System.out.println(); 
      
        System.out.println("luas = " + (panjang*luas) + "  cm"); 
        
        System.out.println(); 
        
     System.out.println("Tugas Nomor 2");
     //Scanner input = new Scanner(System.in);
    
     
     
        System.out.print("Total jam : ");
        double jam = masukan.nextDouble();
        System.out.print("Total Menit : ");
        double menit = masukan.nextDouble();
        System.out.print("Total detik : ");
        double detik = masukan.nextDouble();
        
        double jam1 = jam * 216000;
        double menit1 = menit * 3600;
        
         
        System.out.println("Jam ke detik : " +jam1 + "  detik");
        System.out.println("menit ke detik : " +menit1 + "  detik");
        System.out.println("Detik : " +detik + "  detik");
        System.out.println("Total Detik : " +(jam1+menit1+detik)+ "  detik");
                
        
        
     
            
// TODO code application logic here
    }
    
}
