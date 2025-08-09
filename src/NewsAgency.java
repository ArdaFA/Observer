import java.util.ArrayList;
import java.util.List;

// ConcreteSubject: The actual publisher that observers subscribe to.
public class NewsAgency implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String latestNews;

    // When the news changes, it notifies all observers.
    public void setNews(String news) {
        this.latestNews = news;
        System.out.println("\nNews Agency has a new headline: " + news);
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying all " + observers.size() + " channels...");
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }
}