package ex08.push.pub;

import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class LotteMart implements Mart{
    private String value = null; //상품
    //다수의 스레드가 동시 접근을 시도할 수 있는 변수를 임계 영역이라고 하며, 레이스 컨디션이라고 한다.
    private List<Customer> customerList = new ArrayList<>();    //구독자 명단

    //컬렉션에 구독자 추가
    @Override
    synchronized public void add(Customer customer) {
        //타 스레드에서 해당 메서드를 사용중이면 사용불가
        customerList.add(customer);
    }
    
    //상품입고
    @Override
    public void received() {
        value = "바나나";
        notify(value);
    }

    //
    @Override
    public void notify(String msg) {
        customerList.forEach(customer -> {
            //1. 구독한 품목에 따라 다르게 분기해줘야 함
            customer.update(msg);   //push
        });
    }

    //
    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }
}
