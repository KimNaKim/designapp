package ex00;

/**
 * 목표 : 다형성, 동적바인딩
 * 1. 소나타(오브젝트 == 객체), 제네시스(오브젝트 ==객체) == 자동차(추상)
 */

abstract class Car { // new x
    void run(){
        System.out.println("달린다");
    };
}

class Sonata extends Car{
    @Override // 재정의
    void run() {
        System.out.println("소나타 달린다");
    } // sonata -> car

}

class Genesis extends Car{
    @Override // 재정의
    void run() {
        System.out.println("제네시스 달린다");
    } // genesis -> car

}

class BMW extends Car{
}


public class Mem02 {

    public static void main(String[] args) {
        Car s = new Sonata(); // 메모리 sonata(run), car(run)
        // car의 run을 호출하러 갔더니, sonata가 run을 재정의해서,
        // car의 run의 오버라이드(무효화)되고, sonata의 run이 호출된다.
        s.run();
        Car g = new Genesis(); // 메모리 genesis(run), car(run)
        g.run();
        //다수의 자녀 클래스가 같은 동작을 수행할 경우에는, 추상 클래스에서 메서드를 구현하고 클래스 내부를 비워도 괜찮음
        Car b1 = new BMW();
        b1.run();
        BMW b2 = new BMW();
        b2.run();   //BMW 내부에는 메서드 선언이 안 되어 있지만, 부모 클래스에 run()이 존재하므로 super.run이 실행
    }
}