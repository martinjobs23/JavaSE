import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;


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
        Queue<String> queue = new LinkedList<>();
        queue.offer("aaa");
        queue.offer("bbb");
        queue.offer("ccc");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}