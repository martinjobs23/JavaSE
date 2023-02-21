package Person;

public interface Exam {
    default void Exam(){
        System.out.println("正在考试。");
    }
}
