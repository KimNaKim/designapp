package ex03.lib;

public class OuterRabbit {
    //내가 아닌 타인이 만든 클래스
    //내가 내부 코드를 수정하는 것은 불가능 (고로 Animal을 상속받도록 추가하는 것도 불가)
    private String fullname = "토끼";

    public String getFullname() {
        return fullname;
    }
}
