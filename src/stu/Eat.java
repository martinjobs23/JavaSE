package stu;

public interface Eat {
    default void eat(){
        System.out.println("正在吃。");
    };
}
