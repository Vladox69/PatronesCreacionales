/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver;

import java.io.File;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bamboozle for the foozle !!!
 */
public class AdminEventos {
    Map<String, List<IEvento>> listeners = new HashMap<>();

    public AdminEventos(String... operaciones) {
        for (String operacion : operaciones) {
            this.listeners.put(operacion, new ArrayList<>());
        }
    }

    public void subscribe(String tipoEvento, IEvento evento) {
        List<IEvento> usuarios = listeners.get(tipoEvento);
        usuarios.add(evento);
    }

    public void unsubscribe(String tipoEvento, IEvento evento) {
        List<IEvento> usuarios = listeners.get(tipoEvento);
        usuarios.remove(evento);
    }

    public void notify(String tipoEvento, File archivo) {
        List<IEvento> usuarios = listeners.get(tipoEvento);
        for (IEvento evento : usuarios) {
            evento.actualizar(tipoEvento, archivo);
        }
    }
}

