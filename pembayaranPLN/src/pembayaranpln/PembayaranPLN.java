/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaranpln;

import java.util.Scanner;
class bayar{
    String nama,alamat,blok,tipe;
    double bayar;
    double harga=0;
}

  
  
/**
 *
 * @author ASUS
 */
public class PembayaranPLN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double kembalian;
        bayar a = new bayar(); 
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("nama = ");
        a.nama = input.next();
        System.out.print("alamat =  ");
        a.alamat = input.next();
        System.out.print("tipe =  ");
        a.tipe = input.next();
        System.out.print("blok =  ");
        a.blok = input.next();
        System.out.print("bayar =  ");
        a.bayar = input.nextDouble();
       
        
       if ((a.tipe.equals("36"))&&(a.blok.equals("a"))){
          a.harga = 500000;
       }
       else if ((a.tipe.equals("36"))&&(a.blok.equals("b"))){
          a.harga = 300000;
        }
       else if ((a.tipe.equals("37"))&&(a.blok.equals("a"))){
          a.harga = 800000;
        }
       else if((a.tipe.equals("37"))&&(a.blok.equals("b"))){
          a.harga = 600000;
        }
       kembalian = (a.bayar-a.harga);
       
        
        System.out.println("Nama = " + a.nama);
        System.out.println("Alamat = " + a.alamat);
        System.out.println("harga bayar = " + a.harga);
        System.out.println("bayar = " + a.bayar);
        System.out.println("kembalian =  "+kembalian);
        System.out.println();
    } 
    }
