package Test;

import collection.LinkedStack;

public class LinkedReverse<E> {
    private Node<E> head = new Node<>(null);
    private int size = 0;
    private static class Node<E> {
        E element;
        Node<E> next;
        public Node(E element){
            this.element  = element;
        }
    }
    public void insert(E element){
        Node<E> node = head;
        if(size == 0){
            head.element = element;
        }else {
            Node<E> node1 = new Node<>(element);
//            node1.next = head.next;
//            head.next = node1;
            node1.next = head;
            head = node1;
        }
        size++;
    }
    public void reverse_element(){
        Node<E> node = head;
        LinkedStack<E> ls = new LinkedStack();
        while (node != null){
            ls.push(node.element);
            node= node.next;
        }
        LinkedReverse<E> lr = new LinkedReverse<>();
        for (int i = 0; i < size; i++) {
            System.out.print(ls.pop() + " ");
        }
        System.out.println(lr);

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> node = head;
        for (int i = 0; i < size; i++) {
            sb.append(node.element).append(" ");
            node = node.next;
        }
        return sb.toString();
    }
}


