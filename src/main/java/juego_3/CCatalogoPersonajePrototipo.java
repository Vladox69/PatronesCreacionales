/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_3;

import java.util.Hashtable;

/**
 *
 * @author OppositeDragon
 */
public class CCatalogoPersonajePrototipo {
    private final Hashtable<String,IPersonaje> catalogo = new Hashtable<String,IPersonaje>();
    public CCatalogoPersonajePrototipo(){
        
    }
    public void addPersonaje(String key, IPersonaje personaje){
        catalogo.put(key,personaje);
    }
    public Object getPersonaje(String key){
        return catalogo.get(key);
    }
}
