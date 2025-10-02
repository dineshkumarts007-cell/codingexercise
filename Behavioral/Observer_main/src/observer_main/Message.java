/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer_main;

import java.util.Set;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class Message {
    private final Set<Observer> observers = Collections.newSetFromMap(new ConcurrentHashMap<>());

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyUsers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}


