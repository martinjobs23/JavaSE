import Person.*;
import stu.*;

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
//        stu.Student s1 = new stu.Student("zhangsan");
//        String word = "abcdef";
//        //s1.name = "zhangsan";
//        s1.setAge(18);
//
//        System.out.println(s1.name);
//        System.out.println(s1.getAge());
//
//        stu.Student.test01();
//        s1.test01();
//        StringBuilder stringBuilder = new StringBuilder();
//
//        System.out.println(stringBuilder.append("a").append("b").append("c").toString());

        //int[] arr = new int[]{3,2,1,0};
        //arr.length = 10;//final类型，不能修改

//        for(int i = 0;i < arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
////        for(int i:arr){
////            System.out.println(i);
////        }
//        test(arr);
//        System.out.println(arr[0]);
//        String[] strarr = new String[10];
//        strarr[0] = "a";
//        int[][] arr = new int[][]{{1,2},{3,4},{5,6}};
//        for(int i = 0;i<arr.length;i++){
//            for(int j = 0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        ArtStu artStu = new ArtStu();
//        artStu.art();
//        artStu.Study();
//        artStu.eat();
//
//        Student stu = new ArtStu("xiaoming");
//        stu.Study();
//        System.out.println(stu.name);
//        System.out.println(stu.getAge());
//        System.out.println(stu.getAge(3,0));
//        Eat eat = new ArtStu();
//        eat.eat();
//        Student student = new Student();
//        student.setStatus(Status.Running);
//        System.out.println(student.getStatus()) ;
//        Integer i ;
        Person person1 = new Worker();
        Person person2 = new Teacher();
        Person person3 = new Stu();
        Exam(person1);
        Exam(person2);
        Exam(person3);
    }

    private static void Exam(Person person){
        if (person instanceof Teacher){
            ((Teacher) person).Exam();
        } else if (person instanceof Stu) {
            ((Stu) person).Exam();
        }else {
            System.out.println("不能参加考试。");
        }
    }
    private static void test(int arr[]){
        arr[0] = 10;
    }
}
