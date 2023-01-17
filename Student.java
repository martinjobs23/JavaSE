public class Student {
    String name;
    private int age;
    int a;
    int b;
    Student(){
        name = "sam";
        age = 20;
        a = 10;
        b = 20;
    }
    void setAge(int a){
        age = a;
    }
    int getAge(){
        return age;
    }
    String test(){
        return null;
    }
    int Add(int a ,int b,int c){
        if (c == 1){
            return (a+b);
        }
        else {
            return 0;
        }
    }
}