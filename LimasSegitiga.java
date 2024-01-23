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
public class LimasSegitiga extends BangunRuang{
    float la;
    float t;
    //luas alas dan tinggi
    @Override
     float volume(){
         float volume = la*t*(1/3);
         System.out.println("Volume Limas Segitiga adalah : "+volume);
         return volume;
}
}
 