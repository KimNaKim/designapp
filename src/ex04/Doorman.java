package ex04;

public class Doorman {

    //static이기에 실행 시 단 한 번만 실행됨
    public static Doorman instance = new Doorman();

    private Doorman (){ //객체 신규생성 잠그기
    }

    public void chaseOut(Animal a){
        System.out.println(a.getName() + " 꺼져");
    }
}
