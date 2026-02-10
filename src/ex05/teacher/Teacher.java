package ex05.teacher;

public abstract class Teacher {

    public void lesson(){
        //구현된 메서드들을 템플릿화
        admission();
        attendanceCheck();
        lecture();
        exitClassroom();
    }

    private void admission(){
        System.out.println("입장하기");
    }

    private void attendanceCheck(){
        System.out.println("출석 부르기");
    }

    protected abstract void lecture();

    private void exitClassroom(){
        System.out.println("퇴장하기");
    }

}
