import javax.swing.*;
import java.awt.*;
import java.io.*;
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
    public static void main(String[] args) throws FileNotFoundException {
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
        //Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 9, 8, 0, 4, 6, 7));
//        queue.offer("aaa");
//        queue.offer("bbb");
//        queue.offer("ccc");
//        while (!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }
        //System.out.println(Collections.max(queue));
        try {   //注意，IO相关操作会有很多影响因素，有可能出现异常，所以需要明确进行处理
            FileInputStream inputStream = new FileInputStream("test.txt");
            System.out.println((char) inputStream.read());  //读取一个字节的数据（英文字母只占1字节，中文占2字节）
            System.out.println(inputStream.read());
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        File file = new File("Hello");
//        System.out.println(file.mkdir());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.createNewFile());

        try(BufferedInputStream stream = new BufferedInputStream(new FileInputStream("test.txt"))){
            stream.mark(0);
            for (int i = 0; i < 4; i++) {
                System.out.print((char) stream.read());
            }
            stream.reset();
            System.out.println((char) stream.read());
            System.out.println("----------");
            stream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

//        try(BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream("test.txt"))){
//            stream.write("YYDS".getBytes());
//        }catch (IOException e){
//            e.printStackTrace();
//        }


//        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))){
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("output.txt"));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("output.txt"))){
            People people = new People("lbw");
            outputStream.writeObject(people);
            outputStream.flush();

            Object o = inputStream.readObject();
            people = (People) o;
            System.out.println(people);
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static class People implements Serializable{
        public String name;
        People(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    '}';
        }
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