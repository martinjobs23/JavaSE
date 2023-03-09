package collection;

public class ArrayList<E> {
    private int capacity = 10;
    private int size = 0;
    private Object[] array = new Object[capacity];

    public void insert_element(E element, int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("插入位置为非法位置！插入的合法位置为”0 - " + size + "“。");
        }
        if(size >= capacity){
            int newCapacity = capacity + (capacity >> 1);   //右移一位代表除以2，相当于扩容到原先的1.5倍
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array,0,newArray,0,size);
            array = newArray;
            capacity = newCapacity;
        }
        for(int i = size; i >index; i--){
            array[i] = array[i-1];
        }
        array[index] = element;
        size++;
    }
    public E remove_element(int index){
        if(index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException("删除位置为非法位置！删除的合法位置为”0 - " + (size-1) + "“。");
        }
        E element = (E) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return element;
    }
    public E get_element(int index){
        if(index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException("位置为非法位置！合法位置为”0 - " + (size-1) + "“。");
        }
        return (E) array[index];
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(array[i]).append(" ");
        }
        return stringBuilder.toString();
    }
    public boolean isEmpty(){
        return size == 0;
    }
}
