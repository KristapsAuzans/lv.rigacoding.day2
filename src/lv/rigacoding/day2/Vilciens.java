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
public class Vilciens implements Transportlidzeklis {

    @Override
    public void Pārvietoties() {
       System.out.println("Vilciens brauc.");
    }
    
    @Override
    public int MaxĀtrums() {
        return 250;
    }
    
}
