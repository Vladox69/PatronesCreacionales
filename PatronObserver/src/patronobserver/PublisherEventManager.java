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
public class PublisherEventManager {
     Listener listener;

    public PublisherEventManager(String... operations) {
        for (String operation : operations) {
            this.listener.add(operation, new ArrayList<>());
        }
    }

    public void subscribe(listener.) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}

