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
public class Kubus extends BangunRuang {
    float s;
    //sisi
  @Override  
    float volume(){
         float volume = s*s*s;
         System.out.println("Volume Kubus adalah : "+volume);
         return volume;
}
}