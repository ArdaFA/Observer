// The Subject interface is implemented by the subject (publisher).
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}
