package ex05.teacher;

public class JavaTeacher extends Teacher{
    @Override
    protected void lecture(){
        System.out.println("자바 강의하기");
    }
}
