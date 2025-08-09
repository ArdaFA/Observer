// ConcreteObserver: An actual channel that will receive updates from the NewsAgency.
public class NewsChannel implements Observer {

    private String channelName;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String news) {
        // Defines how the channel reacts to the news.
        System.out.println("[" + channelName + "] Breaking News: " + news);
    }
}