package ex08.polling;

public class Customer1 {
    
    //상품의 유무를 물어보는 동작
    public boolean request(LotteMart lotteMart){
        String value = lotteMart.getValue();
        if(value != null) {
            update(value);
            return true;
        }
        return false;
    }
    //상품이 존재할 경우 손님에게 알림
    public void update(String msg){
        System.out.println("손님 1이 받은 알림 : " + msg);
    }
}
