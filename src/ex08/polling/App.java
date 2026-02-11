package ex08.polling;

// 옵저버(관찰자) 패턴 - 이벤트(객체 상태 변화)를 감지
// 옵저버는 이벤트와 행위가 세트
// 관찰자는 daemon이어야 함 - 이벤트가 감지되기 전까지 '상시 실행중'이어야 함
// 패턴을 사용하지 않아도 옵저버는 구현이 가능
public class App {
    public static void main(String[] args) {
        Customer1 cus1 = new Customer1();
        LotteMart mart = new LotteMart();

        //1. 마트 입고 준비하기 - 타 스레드로 동작시키기
        new Thread(() -> {
            for(int i = 0; i<10; i++){
                System.out.println("입고 중... (" + i + "초)");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            mart.received();
            System.out.println("입고 완료!");
        }).start();

        //2. 손님의 polling
        new Thread(()->{
            while(true){
                System.out.println("[손님] : 상품 있어?");
                boolean isIn = cus1.request(mart);
                if(isIn){
                    break;
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
