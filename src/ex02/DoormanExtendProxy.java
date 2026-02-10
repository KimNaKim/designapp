package ex02;

public class DoormanExtendProxy extends Doorman{
    //상속 기반 프록시
    //기존의 chaseOut()을 재정의
    //Doorman 클래스는 '쫓아내는' 책임만을 가지는 것이 좋기 때문에 proxy로 별도의 책임 추가
    @Override
    public void chaseOut(Animal a){
        System.out.println("지갑을 검사합니다.");   //추가 행동은 프록시에서 추가
        super.chaseOut(a);  //부모에게 실제 행동을 위임
    }
}
