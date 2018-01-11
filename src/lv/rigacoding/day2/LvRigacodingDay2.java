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
public class LvRigacodingDay2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automasina auto1 = new Automasina();
        Transportlidzeklis auto2 = new Automasina();
        Transportlidzeklis lidmasina1 = new Lidmasina();
        Transportlidzeklis vilciens1 = new Vilciens();
        
        auto1.Pārvietoties();
        lidmasina1.Pārvietoties();
        vilciens1.Pārvietoties();
    }
    private void izvaditInformaciju(Transportlidzeklis transports){
        transports.Pārvietoties();
    }
}
