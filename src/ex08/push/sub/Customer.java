package ex08.push.sub;

public interface Customer {
    //polling 방식과 달리 cutomer 객체 내부에 요청을 보내는 장치(request())가 없음
    void update(String msg);
}
