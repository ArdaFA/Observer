public class Main {
    public static void main(String[] args) {
        // 1. Create the Subject (the news agency).
        NewsAgency agency = new NewsAgency();

        // 2. Create Concrete Observers (the news channels).
        Observer channel1 = new NewsChannel("CNN");
        Observer channel2 = new NewsChannel("BBC");
        Observer channel3 = new NewsChannel("FOX");

        // 3. Register the observers with the subject.
        agency.register(channel1);
        agency.register(channel2);
        agency.register(channel3);

        // 4. The subject's state changes. This should trigger a notification.
        agency.setNews("Major earthquake hits Japan.");

        // 5. Unregister one of the observers.
        System.out.println("\n--- BBC is unsubscribing ---");
        agency.unregister(channel2);

        // 6. The subject's state changes again. BBC should not get this update.
        agency.setNews("New president for Turkey!");
    }
}