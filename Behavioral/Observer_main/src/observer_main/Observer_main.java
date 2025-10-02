/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer_main;

public class Observer_main {
    public static void main(String[] args) {
        Message service = new Message();

        User alice = new User("Alice");
        User bob = new User("Bob");

        service.subscribe(alice);
        service.subscribe(bob);

        // Notifications from multiple threads
        Thread t1 = new Thread(() -> service.notifyUsers("New Product Launch!"));
        Thread t2 = new Thread(() -> service.notifyUsers("50% Discount Offer!"));
        t1.start();
        t2.start();
    }
}

    
