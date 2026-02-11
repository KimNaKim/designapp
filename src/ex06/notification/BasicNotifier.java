package ex06.notification;

public class BasicNotifier implements Notifier{

    //한 번에 필드를 1개만 받을 수 있지만, EmailNotifier나 SmsNotifier 둘 다 받을 수 있음
    protected Notifier notifier;

    //디폴트 기본생성자
    public BasicNotifier(){}

    public BasicNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(){
        if(notifier != null) notifier.send();
        System.out.println("기본 알림!");
    }
}
