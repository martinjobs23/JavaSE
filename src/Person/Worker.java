package Person;

public class Worker extends Person{
    public Worker(){
        super.job = Job.Worker;
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
