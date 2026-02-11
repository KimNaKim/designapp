package ex08.push.pub;

import ex08.push.sub.Customer;

public interface Mart {
    //1. 구독 등록 - 등록된 객체들을 담을 컬렉션이 필요
    void add(Customer customer);
    
    //2. 출판
    void received();
    
    //3. 알림- 구독자들에게 update를 알림
    void notify(String msg);
    
    //4. 구독 취소
    void remove(Customer customer);
    
}
