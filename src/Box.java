public class Box<T> {
    private T item;

    public void put(T newItem) {
        if (item != null) {
            throw new IllegalStateException("Box is already full");
        }
        item = newItem;
    }

    public T get() {
        T temp = item;
        item = null;
        return temp;
    }

    public boolean isEmpty() {
        return item == null;
    }
}