/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.util.Timer;
import java.util.TimerTask;

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
        Hora hora = Hora.getInstance();
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                hora.setTime(System.currentTimeMillis());
                System.out.println(hora);
            }
        }, 0, 1000);
        
    }

}
