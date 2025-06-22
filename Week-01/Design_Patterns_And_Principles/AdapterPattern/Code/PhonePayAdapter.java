public class PhonePayAdapter implements PaymentProcessor {
    private PhonePayGateway phonePay;

    public PhonePayAdapter(PhonePayGateway phonePay) {
        this.phonePay = phonePay;
    }

    @Override
    public void processPayment(double amount) {
        phonePay.sendMoney(amount);
    }
}