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
public class Automasina implements Transportlidzeklis {
private int maxAtrums;
private String Krāsa;

    public int getMaxAtrums() {
        return maxAtrums;
    }

    public void setMaxAtrums(int maxAtrums) {
        this.maxAtrums = maxAtrums;
    }

    public String getKrāsa() {
        return Krāsa;
    }

    public void setKrāsa(String Krāsa) {
        this.Krāsa = Krāsa;
    }


    
    
    @Override
    public void Pārvietoties() {
       System.out.println("Automašīna brauc.");
    }

    @Override
    public int MaxĀtrums() {
        return 200;
    }
    
}
