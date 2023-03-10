package collection;

import java.util.NoSuchElementException;

public class LinkedStack<E> {
    private Node<E> head = new Node<>(null);
    private int size = 0;
    private static class Node<E> {
        E element;
        Node<E> next;
        public Node(E element){
            this.element  = element;
        }
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void push(E element){
        Node<E> node = new Node<>(element);
        node.next = head.next;
        head.next = node;
        size++;
    }
    public E pop(){
        if(isEmpty()){
            throw new NoSuchElementException("空栈，无法删除。");
        }
        Node<E> node = head.next;
        head.next = node.next;
        size--;
        return node.element;
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        LinkedStack.Node<E> node = head.next;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(node.element).append(" ");
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
