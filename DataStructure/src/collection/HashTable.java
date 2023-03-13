package collection;

public class HashTable<E> {
    private final int TABLE_SIZE = 10;
    private final LinkedList.Node<E>[] TABLE = new LinkedList.Node[TABLE_SIZE];

    public HashTable(){
        for (int i = 0; i < TABLE_SIZE; i++)
            TABLE[i] = new LinkedList.Node<>(null);
    }
    private int hash(E element){
        int hashcode = element.hashCode();
        return hashcode % TABLE_SIZE;
    }
    public void insert_element(E element){
        int index = hash(element);
        LinkedList.Node<E> head = TABLE[index];
        LinkedList.Node<E> node = new LinkedList.Node<>(element);
        node.next = head.next;
        head.next = node;
    }
    public boolean contains(E element){
        int index = hash(element);
        LinkedList.Node<E> node = TABLE[index].next;
        while(node != null){
            if(node.element == element)
                return true;
            node = node.next;
        }
        return false;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TABLE_SIZE; i++) {
            LinkedList.Node<E> node = TABLE[i].next;
            while(node != null){
                sb.append(node.element).append("->");
                node = node.next;
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
