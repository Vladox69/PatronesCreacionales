/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Hora extends Date{
    
    private static Hora hora;

   
    
    private Hora(long currentTimeMillis){
        
    }
    
    public static Hora getInstance(){
        if(hora==null){
            hora = new Hora(System.currentTimeMillis());
        }
        return hora;
    }
    
     public static void setHora(Hora ahora) {
        hora = ahora;
    }
}

