/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strategy_main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items = Collections.synchronizedList(new ArrayList<>());

    public void addItem(Item item){
        items.add(item);
    }

    public int calculateTotal(){
        synchronized(items) {
            return items.stream().mapToInt(Item::getPrice).sum();
        }
    }

    public void pay(Payment strategy){
        int amount = calculateTotal();
        strategy.pay(amount);
    }
}

