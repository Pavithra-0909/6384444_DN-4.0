public class Test {
    public static void main(String[] args) {

        PaymentProcessor phonePay = new PhonePayAdapter(new PhonePayGateway());
        phonePay.processPayment(5000.0);

        PaymentProcessor googlePay = new GooglePayAdapter(new GooglePayGateway());
        googlePay.processPayment(10000.0);

    }
}