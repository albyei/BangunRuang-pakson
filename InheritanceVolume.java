/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancevolume;

/**
 *
 * @author MOLKET012
 */
public class InheritanceVolume {
    public static void main(String[] args) {
        //objek bangun ruang
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
