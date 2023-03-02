package Person;

public class Stu extends Person implements Exam{
    public Stu(){
        super.job = Job.Student;
    }
    public void Exam(){
        System.out.println("学生正在考试。");
    }

    @Override
    public void eat() {
        System.out.println("吃饭。");
    }

    @Override
    public void exercise() {
        System.out.println("运动。");
    }

    @Override
    public void study() {
        System.out.println("学习。");
    }
}
