/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancevolume;

import java.util.Scanner;

/**
 *
 * @author MOLKET012
 */
public class InheritanceVolume {
    public static void main(String[] args) {
        //objek bangun ruang
        Scanner input = new Scanner (System.in);
      System.out.print("Masukkan sisi persegi : ");
      int sisi =input.nextInt();
      System.out.print("Masukkan jari-jari lingkaran (r) : ");
      int jari =input.nextInt();
      System.out.print("Masukkan panjang persegi panjang : ");
      int panjang =input.nextInt();
      System.out.print("Masukkan lebar persegi panjang : ");
      int lebar =input.nextInt(); 
      System.out.print("Masukkan tinggi segitiga : ");
      int tinggi =input.nextInt();
      System.out.print("Masukkan alas segitiga : ");
      int alas =input.nextInt();
      
        BangunRuang bangunRuang = new BangunRuang();
        
        //membuat obj dan mengisi
        
        Bola Bola = new Bola();
        Bola.sisi = 543;
        
       Kubus Kubus = new Kubus();
       Kubus.s =322;
       
       Tabung Tabung = new Tabung();
       Tabung.r = 54;
       Tabung.t =32;
       
       LimasSegitiga LimasSegitiga = new LimasSegitiga();
       LimasSegitiga.la = 43;
       LimasSegitiga.t = 22;
       
       
       bangunRuang.volume();
      
       Bola.volume();
       Kubus.volume();
       Tabung.volume();
       LimasSegitiga.volume();
    }
    
    
}
