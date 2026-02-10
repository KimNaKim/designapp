package ex00;

/**
 *  목표 : heap, stack, static 구분하기
 *
 *  1. JVM은 static 키워드가 붙은 친구들을 static 메모리에 로드한다.
 *  2. JVM은 static 메모리에서 main 메서드를 찾아서 실행한다.
 *  3. JVM의 생명주기는 main 메서드의 코드 스레드 생명주기 (Queue)
 *  4. heap 동적 메모리 할당
 *  5. 메서드 실행시에 stack이 열린다.
 */


class Animal{
    String name = "강아지";
     void bark(){
         String sound = "멍멍";
         System.out.println(sound);
     }
     static void meow(){
         String sound = "야옹";
         System.out.println(sound);
     }
}

public class Mem01 {
    public static void main(String[] args) {
        //선언한 객체를 heap 공간에 저장하고 싶으면 변수를 지정해야 함 (인스턴스화)
        //객체의 메서드를 사용하고 싶으면 객체를 인스턴스화 시키거나, 메서드를 static(전역화) 시켜야 함
        Animal dog = new Animal();
        dog.bark();
        System.out.println(dog.name);
        //전역메서드 사용하기(인스턴스화 없이 사용가능)
        Animal.meow();
    }
}
