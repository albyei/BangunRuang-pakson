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
public class Tabung extends BangunRuang{
    float r;
    float t;
    // jari" dan tinggi
     float volume(){
         float volume = r*r*t*(22/7);
         System.out.println("Volume Tabung adalah : "+volume);
         return volume;
}
}