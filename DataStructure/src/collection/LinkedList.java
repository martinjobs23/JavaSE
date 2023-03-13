package collection;

public class LinkedList<E> {
    private Node<E> head = new Node<>(null);
    private int size = 0;
    public static class Node<E> {
        E element;
        Node<E> next;
        public Node(E element){
            this.element  = element;
        }
    }
    public void insert_element(E element, int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("插入位置为非法位置！插入的合法位置为”0 - " + size + "“。");
        }
        Node<E> prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node<E> node = new Node<>(element);
        node.next = prev.next;
        prev.next = node;
        size++;
    }
    public E remove_element(int index){
        if(index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException("删除位置为非法位置！删除的合法位置为”0 - " + (size-1) + "“。");
        }
        Node<E> prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node<E> node = prev.next;
        prev.next = node.next;
        E element = node.element;
        size--;
        return element;
    }
    public E get_element(int index){
        if(index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException("位置为非法位置！合法位置为”0 - " + (size-1) + "“。");
        }
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.element;
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
