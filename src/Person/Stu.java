package Person;

public class Stu extends Person implements Exam{
    public Stu(){
        super.job = Job.Student;
    }
    public void Exam(){
        System.out.println("学生正在考试。");
    }
}
