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
class harga {
     double harga;
   public double getharga(String tipe, String blok){
       if ((tipe.equals("36"))&&(blok.equals("a"))){
          harga = 500000;
       }
       else if ((tipe.equals("36"))&&(blok.equals("b"))){
          harga = 300000;
        }
       else if ((tipe.equals("37"))&&(blok.equals("a"))){
          harga = 800000;
        }
       else if((tipe.equals("37"))&&(blok.equals("b"))){
         harga = 600000;
        }
        return harga;
   

       
        
   }
}
