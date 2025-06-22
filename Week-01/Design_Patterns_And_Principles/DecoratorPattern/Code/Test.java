public class Test {
    public static void main(String[] args) {
        
        Notifier notifier = new SlackNotifierDecorator(
                                new SMSNotifierDecorator(
                                    new EmailNotifier()));

        notifier.send("Your payment was successful.");
    }
}
