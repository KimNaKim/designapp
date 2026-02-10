package ex04;


public class App {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Mouse mouse = new Mouse();
        //new로 새 객체 생성은 불가하고, 이미 생성된 Doorman singleton의 인스턴스를 재사용해야 함
        Doorman doorman1 = Doorman.instance;
        doorman1.chaseOut(tiger);
        doorman1.chaseOut(mouse);

        Doorman doorman2 = Doorman.instance;

        System.out.println(doorman1);
        System.out.println(doorman2);
    }
}
