import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        System.out.println(str);
//        sc.close();
//    }
//}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "zhangsan";
        s1.setAge(18);
        s1.a = 5;
        s1.b = 3;
        String s = s1.test();
        System.out.println(s1.name);
        System.out.println(s1.getAge());
        System.out.println(s1.Add(s1.a,s1.b,1));
        System.out.println(s);
        Test t = new Test();
        Student k = t.setName(s1);
        System.out.println(k.name);
    }
}
