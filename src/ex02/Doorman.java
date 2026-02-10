package ex02;

public class Doorman {  //프록시로 감싸진 실제 오브젝트
    public void chaseOut(Animal a){
        System.out.println(a.getName() + " 꺼져");
    }
}
