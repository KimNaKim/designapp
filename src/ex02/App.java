package ex02;

// SOLID : 객체 지향 원칙
// OCP : SOLID의 O - 새로운 코드 추가는 가능하되(OPEN), 기존의 완성된 코드 수정은 금지되어야(CLOSE) 한다.
// DIP : SOLID의 D - 추상적인 것에 의존하라.
// SRP : SOLID의 S - 하나의 클래스에는 하나의 책임만 존재해야 한다.
public class App {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Mouse mouse = new Mouse();
        //상속 기반 프록시로 객체 선언하기
        DoormanExtendProxy doorman1 = new DoormanExtendProxy();
        doorman1.chaseOut(tiger);
        //합성 기반 프록시로 객체 선언하기
        DoormanSynthesisProxy doorman2 = new DoormanSynthesisProxy(new Doorman());
        doorman2.chaseOut(mouse);
    }
}
