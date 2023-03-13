import collection.*;

import java.util.Optional;
import java.util.function.Function;

public class Main {
    private static final Function<Integer, String> INTEGER_TO_STRING_FUNCTION = Object::toString;
    public static void main(String[] args) {
//        String str = INTEGER_TO_STRING_FUNCTION.apply(10);
//        System.out.println(str);
//        test("beijing");
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.insert_element(10,0);
//        arrayList.insert_element(10,1);
//        for (int i = 0; i < 30; i++) {
//            arrayList.insert_element(i,i);
//        }
//        System.out.println(arrayList);
//        Integer integer = arrayList.remove_element(20);
//        System.out.println(integer);
//        System.out.println(arrayList);
//        integer = arrayList.get_element(31);
//        System.out.println(integer);
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.insert_element(10,0);
//        linkedList.insert_element(10,1);
//        for (int i = 0; i < 30; i++) {
//            linkedList.insert_element(i,i);
//        }
//        System.out.println(linkedList);
//        System.out.println(linkedList.remove_element(20));
//        System.out.println(linkedList);
//        System.out.println(linkedList.get_element(30));
//        LinkedStack<Integer> linkedStack = new LinkedStack<>();
//        System.out.println(linkedStack.isEmpty());
//        linkedStack.push(10);
//        linkedStack.push(1);
//        Integer integer = linkedStack.pop();
//        for (int i = 0; i < 30; i++) {
//            linkedStack.push(i);
//        }
//        System.out.println(linkedStack);
//        System.out.println(integer);
//        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
//        System.out.println(linkedQueue.isEmpty());
//        linkedQueue.offer(10);
//        linkedQueue.offer(1);
//        Integer integer = linkedQueue.poll();
//        for (int i = 0; i < 30; i++) {
//            linkedQueue.offer(i);
//        }
//        System.out.println(linkedQueue);
//        System.out.println(integer);
//        System.out.println(linkedQueue.peek());
//        TreeNode<Integer> treeNode1 = new TreeNode<>(1);
//        TreeNode<Integer> treeNode2 = new TreeNode<>(2);
//        TreeNode<Integer> treeNode3 = new TreeNode<>(3);
//        TreeNode<Integer> treeNode4 = new TreeNode<>(4);
//        TreeNode<Integer> treeNode5 = new TreeNode<>(5);
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        treeNode2.left = treeNode4;
//        treeNode2.right = treeNode5;
//        System.out.println(treeNode1.left.right.element);
//        TreeNode<Character> a = new TreeNode<>('A');
//        TreeNode<Character> b = new TreeNode<>('B');
//        TreeNode<Character> c = new TreeNode<>('C');
//        TreeNode<Character> d = new TreeNode<>('D');
//        TreeNode<Character> e = new TreeNode<>('E');
//        TreeNode<Character> f = new TreeNode<>('F');
//        TreeNode<Character> g = new TreeNode<>('G');
//        TreeNode<Character> h = new TreeNode<>('H');
//        TreeNode<Character> i = new TreeNode<>('I');
//        TreeNode<Character> j = new TreeNode<>('J');
//        TreeNode<Character> k = new TreeNode<>('K');
//        TreeNode<Character> l = new TreeNode<>('L');
//        a.left = b;
//        a.right = c;
//        b.left = d;
//        b.right = e;
//        c.left = f;
//        c.right = g;
//        e.left = h;
//        e.right = i;
//        f.left = j;
//        f.right = k;
//        g.right = l;
//        preOrder(a);
//        System.out.println();
//        inOrder(a);
//        System.out.println();
//        postOrder(a);
//        System.out.println();
//        levelOrder(a);
        HashTable<Integer> h= new HashTable();
        h.insert_element(20);
        h.insert_element(30);
        for (int i = 0; i < 100; i++) {
            h.insert_element(i);
        }
        System.out.println(h.contains(20));
        System.out.println(h);
    }
    public static void preOrder(TreeNode<Character> rootnode){
        if (rootnode == null) return ;
        System.out.print(rootnode.element + " ");
        preOrder(rootnode.left);
        preOrder(rootnode.right);
    }
    public static void inOrder(TreeNode<Character> rootnode){
        if (rootnode == null) return ;
        inOrder(rootnode.left);
        System.out.print(rootnode.element + " ");
        inOrder(rootnode.right);
    }
    public static void postOrder(TreeNode<Character> rootnode){
        if (rootnode == null) return ;
        postOrder(rootnode.left);
        postOrder(rootnode.right);
        System.out.print(rootnode.element + " ");
    }
    public static void levelOrder(TreeNode<Character> rootnode){
        LinkedQueue<TreeNode<Character>> lq = new LinkedQueue<>();
        if (rootnode != null) lq.offer(rootnode);
        while(!lq.isEmpty()){
            TreeNode<Character> treeNode = lq.poll();
            System.out.print(treeNode.element + " ");
            if (treeNode.left != null){
                lq.offer(treeNode.left);
            }
            if (treeNode.right != null){
                lq.offer(treeNode.right);
            }
        }
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