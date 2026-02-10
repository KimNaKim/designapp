package ex05;

import ex05.teacher.HtmlTeacher;
import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;
import ex05.teacher.Teacher;

public class App {
    public static void main(String[] args) {
        Teacher teacher1 = new JavaTeacher();
        teacher1.lesson();

        System.out.println();

        Teacher teacher2 = new HtmlTeacher();
        teacher2.lesson();

        System.out.println();

        Teacher teacher3 = new PythonTeacher();
        teacher3.lesson();
    }
}
