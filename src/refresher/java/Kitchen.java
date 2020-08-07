package refresher.java;

public class Kitchen {

    public static void main(String[] args) {
        Stove stove = new Stove("High");
        Sink sink = new Sink(true);
        Microwave microwave = new Microwave(60.0, 1500);
        Refrigerator refrigerator = new Refrigerator(true, 40);

        Kitchen kitchen = new Kitchen(refrigerator, sink, microwave, stove);
        microwave.cook();
        kitchen.cleanSink();
    }
    private Refrigerator refrigerator;
    private Sink sink;
    private Microwave microwave;
    private Stove stove;

    public Kitchen(Refrigerator refrigerator, Sink sink, Microwave microwave, Stove stove) {
        this.refrigerator = refrigerator;
        this.sink = sink;
        this.microwave = microwave;
        this.stove = stove;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public Sink getSink() {
        return sink;
    }

    public Microwave getMicrowave() {
        return microwave;
    }

    public Stove getStove() {
        return stove;
    }

    public void cookFood(Microwave microwave){
        System.out.println("cooking food");
        microwave.cook();
    }
    public void cookFood(Stove stove){
        System.out.println("cooking");
        stove.cook();
    }


    public void cleanSink(){
        if (sink.isFull()){
            System.out.println("Cleaning sink");
        } else {
            System.out.println("There's nothing to clean");
        }
    }
}
