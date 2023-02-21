package Person;

public class Teacher extends Person implements Exam{
    public Teacher(){
        super.job = Job.Teacher;
    }
    public void Exam(){
        System.out.println("老师正在考试。");
    }
}
