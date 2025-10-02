
package strategy_main;

public class Strategy_main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Book", 200));
        cart.addItem(new Item("Pen", 50));

        Payment ccPayment = new CreditCardPayment("1234-5678-9012-3456");
        Payment paypalPayment = new PhonePay("user@example.com");

        Thread t1 = new Thread(() -> cart.pay(ccPayment));
        Thread t2 = new Thread(() -> cart.pay(paypalPayment));

        t1.start();
        t2.start();
    }
}

    
    
