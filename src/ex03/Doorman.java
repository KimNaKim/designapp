package ex03;

public class Doorman {  //책임 - 입력받은 객체의 타입에 따라 대응방식을 달리하는 패턴

    public void chaseOut(Animal a){
        System.out.println(a.getName() + " 꺼져");
    }
}
