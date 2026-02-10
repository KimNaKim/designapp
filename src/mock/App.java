package mock;



public class App {
    public static void main(String[] args) {
        MeterService ms = new MeterService(new MockMeter());
        ms.render();
    }
}
