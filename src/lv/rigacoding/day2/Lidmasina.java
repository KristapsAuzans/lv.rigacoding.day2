/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day2;

/**
 *
 * @author Kristaps
 */
public class Lidmasina implements Transportlidzeklis {

    @Override
    public void Pārvietoties() {
       System.out.println("Lidmašīna lido.");  }
    
    @Override
    public int MaxĀtrums() {
        return 1300;
    }
}
