import java.util.Arrays;

public class MyDynamicArray {

    private int[] value;
    private int size;

    public MyDynamicArray(int a) {
        this.value = new int[a];
    }

    public MyDynamicArray() {
        this.value = new int[10];
    }

    public void add(int n) {
        if (size == value.length) {
            grow();
        }
        value[size++] = n;
    }


    public void add(int n, int index) {
        if (size == value.length) {
            grow();
        }

        value[index] = n;

    }


    public void remove(int index) {
        if (index < 0 || index >= size) return;
        for (int i = index; i < size - 1; i++) {
            value[i] = value[i + 1];
        }
        size--;
    }


    private void grow() {

        int[] arr = new int[value.length + 10];
        System.arraycopy(value, 0, arr, 0, value.length);
        value = arr;
    }

    public int size() {

        return size;
    }

    public void clear() {
        size = 0;
    }

    public int indexOf(int val) {
        for (int i = 0; i < value.length; i++) {
            if (value[i] == val) return i;
        }

        return -1;
    }

    public void isEmpty() {
        if (size == 0) {
            System.out.println(1);
        } else System.out.println(0);
    }


    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(value, size));
    }
}