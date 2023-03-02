package stu;

import jdk.jshell.Snippet;

public class Student {
    public String name;
    private int age;
    static int a;
    private Status Status;

    public Student(){
        this.name = "sam";
        this.age = 20;
    }
    public Student(String name){
        this.name = name;
        age = 0;
    }

    public void setStatus(Status status) {
        Status = status;
    }
    public String getStatus() {
        return Status.getName();
    }

    static void test01(){
        System.out.println("test01");
    }
    void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public int getAge(int a,int b){
        if(a>b){
            return age;
        }
        return 0;
    }
    String test(){
        return "test";
    }
    public void Study(){
        System.out.println("正在学习。");
    }
    void Speak(String word){
        System.out.println(name + ":" + word);
    }
}