import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    private static final Function<Integer, String> INTEGER_TO_STRING_FUNCTION = Object::toString;
    public static void main(String[] args) {
        String str = INTEGER_TO_STRING_FUNCTION.apply(10);
        System.out.println(str);
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
}