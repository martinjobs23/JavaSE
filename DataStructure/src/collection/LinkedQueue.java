package collection;

import java.util.NoSuchElementException;

public class LinkedQueue<E> {
    private Node<E> head = new Node<>(null);
    private int size = 0;
    private static class Node<E> {
        E element;
        LinkedQueue.Node<E> next;
        public Node(E element){
            this.element  = element;
        }
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void offer(E element){
        Node<E> node = new Node<>(element);
        Node<E> prev = head;
        for (int i = 0; i < size; i++) {
            prev = prev.next;
        }
        prev.next = node;
        size++;
    }
    public E poll(){
        if(isEmpty()){
            throw new NoSuchElementException("空队列，无法删除。");
        }
        E element = head.next.element;
        head.next = head.next.next;
        size--;
        return element;
    }
    public E peek(){
        if(isEmpty()){
            throw new NoSuchElementException("空队列");
        }
        return head.next.element;
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Node<E> node = head.next;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(node.element).append(" ");
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
