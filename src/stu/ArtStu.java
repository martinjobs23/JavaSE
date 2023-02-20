package stu;

public class ArtStu extends Student implements Eat{
    public ArtStu() {
        super();
    }

    public ArtStu(String name) {
        super(name);
        setAge(20);
    }
//    public ArtStu(String name,int age){
//        super(name,age);
//    }

    @Override
    public int getAge() {
        return super.getAge();
    }
    public void art(){
        System.out.println("在画画。");
    }
    public void Study(){
        System.out.println("艺术生在学习。");
    }

    @Override
    public void eat() {
        System.out.println("正在吃东西。");
    }
}
