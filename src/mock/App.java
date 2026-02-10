package mock;

//필요한 객체가 아직 만들어지지 않았다면 Mock(가짜 객체)를 구현해둘 것
//후에 만들어진 객체와 연결할 때에는 Adaptor 이용
public class App {
    public static void main(String[] args) {
        MeterService ms = new MeterService(new MockMeter());
        ms.render();
    }
}
