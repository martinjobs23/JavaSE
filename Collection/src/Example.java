import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class Example extends JFrame {
    public void creatJFrame(String title){
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("这是一个窗体。");
        jl.setHorizontalAlignment(SwingConstants.CENTER);

        container.add(jl);
        container.setBackground(Color.white);
        jf.setVisible(true);
        jf.setSize(200,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add(0,"Beijing");
//        System.out.println(arrayList);
//        System.out.println("Hello world!");
//        new Example().creatJFrame("创建一个窗体。");
//        List<String> list = Arrays.asList("A", "B", "C");
//        for (String s : list) {   //集合类同样支持这种语法
//            System.out.println(s);
//        }
//
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        list.forEach(System.out::print);
//
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 9, 8, 0, 4, 6, 7));
//        queue.offer("aaa");
//        queue.offer("bbb");
//        queue.offer("ccc");
//        while (!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }
        System.out.println(Collections.max(queue));
    }

    public static void test(Queue queue){
        queue.offer("aaa");
        queue.offer("bbb");
        queue.offer("ccc");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}