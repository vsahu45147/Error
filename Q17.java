package Nullpoint;
public class Q17<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public Q17() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        ensureCapacity(size + 1);
        array[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }
        return (T) array[index];
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > array.length) {
            int newCapacity = Math.max(DEFAULT_CAPACITY, array.length * 2);
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Q17<Integer> dynamicArray = new Q17<>();

        // Adding elements beyond the initial capacity
        for (int i = 0; i < 20; i++) {
            dynamicArray.add(i);
        }

        // Accessing elements using valid indices
        System.out.println("Elements in the dynamic array:");
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println("Index " + i + ": " + dynamicArray.get(i));
        }

        // Accessing elements using invalid indices
        try {
            System.out.println("Accessing an element at index 25: " + dynamicArray.get(25));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
