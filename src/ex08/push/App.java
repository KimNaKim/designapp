package ex08.push;

import ex08.push.pub.LotteMart;
import ex08.push.sub.Cus1;

//push 방식 (옵저버 패턴)
// 1. 구현 방식이 정해져 있음
// 2. 자바 라이브러리 : Reactive Java
public class App {
    public static void main(String[] args) {
        //객체 생성
        LotteMart lm = new LotteMart();
        Cus1 cus1 = new Cus1();
        Cus1 cus2 = new Cus1();

        //구독 등록
        lm.add(cus1);
        lm.add(cus2);

        //출판
        System.out.println("입고 시작!");
        for(int i = 0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("입고 끝!");
        lm.received();

        //구독 취소
        lm.remove(cus1);
        lm.remove(cus2);
    }
}
