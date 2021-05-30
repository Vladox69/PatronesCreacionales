/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author ASUS
 */
public class DemoSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hora hora=Hora.getInstance();
        Hora hora2=Hora.getInstance();
        Hora hora3=Hora.getInstance();
        System.out.println(hora);
        System.out.println(hora2);
        System.out.println(hora3);
    }
    
}
