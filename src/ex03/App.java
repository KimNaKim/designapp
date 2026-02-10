package ex03;

import ex03.lib.OuterRabbit;

// 어댑터 패턴 - 인터페이스에 맞게 변환해주는 역할
// 용도 1 : 아직 만들지 않은 도구를 미리 연결하기 위함
// 용도 2 : 이미 만들어진 도구의 인터페이스가 맞지 않을 때 연결하기 위함
public class App {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Mouse mouse = new Mouse();
        RabbitAdaptor rabbit = new RabbitAdaptor(new OuterRabbit());
        Doorman doorman = new Doorman();
        doorman.chaseOut(tiger);
        doorman.chaseOut(rabbit);

    }
}
