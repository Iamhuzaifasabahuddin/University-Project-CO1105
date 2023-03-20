
import java.util.ArrayList;

public class Genericclass<E> extends ArrayList<E> {

    public void push(E item) {
        add(item);
    }

    public E pop() {
        if (size() == 0) {
            throw new RuntimeException("Stack is empty");
        }
        return remove(size() - 1);
    }

    public E peek() {
        if (size() == 0) {
            throw new RuntimeException("Stack is empty");
        }
        return get(size() - 1);
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}

