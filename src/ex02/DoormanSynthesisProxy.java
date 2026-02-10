package ex02;

public class DoormanSynthesisProxy {
    //합성 기반 프록시
    // 컴퍼지션 이용
    //Doorman 클래스는 '쫓아내는' 책임만을 가지는 것이 좋기 때문에 proxy로 별도의 책임 추가
    private final Doorman doorman;  

    public DoormanSynthesisProxy(Doorman doorman) {
        this.doorman = doorman;
    }

    public void chaseOut(Animal a){
        System.out.println("지갑을 검사합니다.");   //추가 행동은 프록시에서 추가
        doorman.chaseOut(a);    //실제 행동은 내부 객체(실제 객체)에게 위임
    }
}
