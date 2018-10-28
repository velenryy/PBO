/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plnpembayaran;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
//import static plnpembayaran.info.harga;
public class PLNpembayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        harga a = new harga(); 
        String nama,alamat,blok,tipe;
         double bayar, kembalian;
         double harga = 0;
        
        
        
        System.out.print("nama = ");
        nama = input.next();
        System.out.print("alamat =  ");
        alamat = input.next();
        System.out.print("tipe =  ");
        tipe = input.next();
        System.out.print("blok =  ");
        blok = input.next();
        System.out.print("bayar =  ");
        bayar = input.nextDouble(); 
        System.out.println("");
        
        System.out.println("Nama = " + nama);
        System.out.println("Alamat = " + alamat);
        System.out.println("harga bayar = " + a.getharga(tipe, blok));
        System.out.println("bayar = " + bayar);
       
        kembalian = (bayar-a.getharga(tipe, blok));
        System.out.println("kembalian =  "+kembalian);
        System.out.println("");
        
        
        info data = new info(nama,alamat,blok,tipe);
        a.getharga(tipe, blok);
        info.harga(bayar);// TODO code application logic here
    }
    
}
