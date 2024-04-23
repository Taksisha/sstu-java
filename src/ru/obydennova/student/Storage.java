package ru.obydennova.student;

public class Storage<T> {
    private final T item;
    private final T alternativeValue;

    public Storage(T item, T alternativeValue) {
        this.item = item;
        this.alternativeValue = alternativeValue;
    }

    public T getItem() {
        return item != null ? item : alternativeValue;
    }

    public static void main(String[] args) {
        // Хранилище чисел, значение null
        Storage<Integer> intStorageNull = new Storage<>(null, 0);
        System.out.println("Хранилище чисел (null): " + intStorageNull.getItem());

        // Хранилище чисел, значение 99
        Storage<Integer> intStorage99 = new Storage<>(99, -1);
        System.out.println("Хранилище чисел (99): " + intStorage99.getItem());

        // Хранилище строк, значение null
        Storage<String> stringStorageNull = new Storage<>(null, "default");
        System.out.println("Хранилище строк (null): " + stringStorageNull.getItem());

        // Хранилище строк, значение "hello"
        Storage<String> stringStorageHello = new Storage<>("hello", "hello world");
        System.out.println("Хранилище строк (hello): " + stringStorageHello.getItem());
    }
}


//public interface Comparable<T> {
//    int compareTo(T object);
//}

