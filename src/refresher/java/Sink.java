package refresher.java;

public class Sink {
    private boolean isFull;

    public Sink(boolean isFull) {
        this.isFull = isFull;
    }

    public boolean isFull() {
        return isFull;
    }
}
