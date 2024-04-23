package ru.obydennova.student;

public class Storage<T> {
    private final T item;

    public Storage(T item) {
        this.item = item;
    }

    public T getItem() {
        if (item == null) {
            // Возвращаем альтернативное значение в зависимости от типа данных
            if (item instanceof Integer) {
                return (T) (Integer) -1;
            } else if (item instanceof String) {
                return (T) "default";
            }
        }
        return item;
    }

    public static void main(String[] args) {
        // Создаем хранилище для чисел, в котором хранится null
        Storage<Integer> intStorage1 = new Storage<>(null);
        // Получаем значение и выводим на экран
        System.out.println(intStorage1.getItem()); // Выведет: 0

        // Создаем хранилище для чисел, в котором хранится значение 99
        Storage<Integer> intStorage2 = new Storage<>(99);
        // Получаем значение и выводим на экран
        System.out.println(intStorage2.getItem()); // Выведет: 99

        // Создаем хранилище для строк, в котором хранится null
        Storage<String> stringStorage1 = new Storage<>(null);
        // Получаем значение и выводим на экран
        System.out.println(stringStorage1.getItem()); // Выведет: default

        // Создаем хранилище для строк, в котором хранится значение "hello"
        Storage<String> stringStorage2 = new Storage<>("hello");
        // Получаем значение и выводим на экран
        System.out.println(stringStorage2.getItem()); // Выведет: hello
    }
}

//public interface Comparable<T> {
//    int compare(T object);
//}

