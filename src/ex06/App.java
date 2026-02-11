package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.SmsNotifier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *     {
 *      "sends" : [basic, email],
 *       "msg": "반가워!!"
 *     }
 */

//데코레이터 패턴 - 기존 코드의 기능을 확장하면서 계속 추가하는 패턴
// OCP를 지키면서 기능을 확장하기 위함
public class App {
    public static void main(String[] args) throws IOException {
        BasicNotifier N1 = new BasicNotifier(new SmsNotifier());
        SmsNotifier N2 = new SmsNotifier(new BasicNotifier());
        SmsNotifier N3 = new SmsNotifier();
        EmailNotifier N4 = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        BasicNotifier N5 = new BasicNotifier(new EmailNotifier(new SmsNotifier(new BasicNotifier())));
        N1.send();
        System.out.println();
        N2.send();
        System.out.println();
        N3.send();
        System.out.println();
        N4.send();
        System.out.println();
        N5.send();

        /**
         * 데코레이터의 대표적인 예 : 키보드 입력 스트림 관련 객체들
         * */
        //키보드에 stream을 연결
        InputStream in = System.in;
        //InputStream + 고정된 길이의 버퍼를 만들고, '입력받은 값을 문자화시켜줌' 기능 추가
        InputStreamReader isr = new InputStreamReader(System.in);
        //InputStreamReader + '가변 길이의 버퍼를 자동으로 계산해주는' 기능 추가
        BufferedReader reader = new BufferedReader(isr);

    }
}
