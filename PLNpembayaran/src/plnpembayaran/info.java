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
public class info extends harga{

    static void harga(double bayar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected String nama,alamat;
    protected double bayar,kembalian,harga;
    
    public info(String nama, String alamat, String tipe, String blok){
     this.nama=nama;
     this.alamat=alamat;
        double getharga = 0;
     this.harga=getharga;
    }
    
    public void cetakkembalian(double harga){
        kembalian = bayar-harga;
        System.out.println("kembalian =  "+kembalian);
        
        



    }}

