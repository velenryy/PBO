/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
        int sks, bayar; 
        System.out.print("Masukkan harga per sks :"); 
            sks= masukan.nextInt(); 
        System.out.print("Masukkan harga bayar :"); 
            bayar = masukan.nextInt(); 
        System.out.println(); 
        System.out.println("Variabel yang terdapat dalam program :"); 
        System.out.println("sks = " + sks); 
        System.out.println("bayar = " + bayar);  
        System.out.println("Total = " + sks*bayar);// TODO code application logic here
    }
    
}
