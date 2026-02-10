package ex01;

// SOLID : 객체 지향 원칙
// OCP : SOLID의 O - 새로운 코드 추가는 가능하되(OPEN), 기존의 완성된 코드 수정은 금지되어야(CLOSE) 한다.
// DIP : SOLID의 D - 추상적인 것에 의존하라.
public class App {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Mouse mouse = new Mouse();
        Doorman doorman = new Doorman();
        doorman.chaseOut(tiger);
        doorman.chaseOut(mouse);
    }
}
