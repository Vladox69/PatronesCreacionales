/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver;

import java.util.ArrayList;
import java.util.EventListener;

/**
 *
 * @author OppositeDragon
 */
public class Listener {

    String evento;
    ArrayList<EventListener> eventListener;

    public Listener(String evento, ArrayList<EventListener> eventListener) {
        this.evento = evento;
        this.eventListener = eventListener;
    }
}
