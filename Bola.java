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
public class Bola extends BangunRuang{
    float sisi;
    //sisi
    
  @Override
     float volume(){
         float volume = sisi*sisi*sisi*(3/4)*(22/7);
         System.out.println("Volume Bola adalah : "+volume);
         return volume;
     }
}