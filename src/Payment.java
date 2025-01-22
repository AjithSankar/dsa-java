interface Payment {

    String paymentMode = "";
    
    public abstract void pay(double amount);

    // Default method
   static void generateReceipt(double amount) {
        System.out.println("Receipt: Payment of $" + amount + " processed.");
    }
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
