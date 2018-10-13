/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner masukan = new Scanner(System.in);
      String nama,alamat;
      
      double bayar,kembalian;
      double harga = 0;
        
        System.out.print("Nama = ");
        String Str1 = masukan.nextLine();
        System.out.print("Alamat = ");
        String Str2 = masukan.nextLine();
        System.out.print("Tipe Pesawat = ");
        String tp = masukan.nextLine();
 

       
        if (tp.equals("a")){
            harga = 5000000;
        }else if(tp.equals("b")){
            harga = 2000000;
        }else if(tp.equals("c")){
            harga = 1000000;
        }else{
            System.out.println("Pilihan Salah");
        }
        
        
        
            System.out.print("Bayar = Rp. ");
            bayar=masukan.nextInt();
            if (bayar < harga){
               System.out.println("Uang Kurang");
            }else{
                kembalian= bayar - harga;
                System.out.println("Nama = " +Str1);
                System.out.println("Alamat = " +Str2); 
                System.out.println("Kembalian =  Rp. " +kembalian);  
       
            }
    }
    
};

