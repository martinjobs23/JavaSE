package stu;

public enum Status {
    Running("跑步"),Sleeping("睡觉"),Studying("学习");
    private final String name;
    Status(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
