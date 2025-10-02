

package strategy_main;


public final class PhonePay implements Payment {
    private final String email;

    public PhonePay (String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PhonePay: " + email);
    }
}


