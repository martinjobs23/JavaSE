package Person;

public class Teacher extends Person implements Exam{
    public Teacher(){
        super.job = Job.Teacher;
    }
    public void Exam(){
        System.out.println("老师正在考试。");
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
