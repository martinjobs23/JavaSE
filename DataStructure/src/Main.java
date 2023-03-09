import collection.ArrayList;

import java.util.Optional;
import java.util.function.Function;

public class Main {
    private static final Function<Integer, String> INTEGER_TO_STRING_FUNCTION = Object::toString;
    public static void main(String[] args) {
//        String str = INTEGER_TO_STRING_FUNCTION.apply(10);
//        System.out.println(str);
//        test("beijing");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.insert_element(10,0);
        arrayList.insert_element(10,1);
        for (int i = 0; i < 30; i++) {
            arrayList.insert_element(i,i);
        }
        System.out.println(arrayList);
        Integer integer = arrayList.remove_element(20);
        System.out.println(integer);
        System.out.println(arrayList);
        integer = arrayList.get_element(31);
        System.out.println(integer);
    }
//    public static void main(String[] args) {
//        Supplier<Student> studentSupplier = () -> new Student();
//        studentSupplier.get().hello();
//    }
    public static class Student {
        public void hello(){
            System.out.println("我是学生！");
        }
    }
    private static void test(String str){
        Integer integer = Optional.ofNullable(str).map(String::length).get();
        System.out.println(integer);
    }
}