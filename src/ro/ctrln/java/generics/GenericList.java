package ro.ctrln.java.generics;

import java.util.Arrays;

public class GenericList<T> {

    private static final int INITIAL_SIZE = 10; //Declarerea unei constante INITIAL_SIZE
    private Object[] list = new Object[INITIAL_SIZE];
    private int size = 0;

    public void addElement(T element) {
        if (size == list.length) {
            increaseSize();
        }
        list[size] = element;
        size++;
    }

    private void increaseSize() {
        list = Arrays.copyOf(list, list.length * 2);
    }

    @SuppressWarnings("unchecked")
    public T getElement(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of range ! Index is :" + index + "and size is" + size);
        }
        return (T) list[index];
    }

    public int getSize() {
        return size;
    }

    public void removeElement(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of range ! Index is :" + index + "and size is" + size);
        }
        System.arraycopy(list, index+1, list, index, size -index);
        size--;
    }
}
