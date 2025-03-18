import java.util.ArrayList;
import java.util.Random;

public class Bag<T> {

    private int size;
    private ArrayList<T> elements;

    public Bag() {
        this.size = 0;
        this.elements = new ArrayList<T>();
    }

    public boolean add(T element) {
        this.elements.add(element);
        this.size++;
        return true;
    }

    public void clear() {
        this.elements.clear();
        this.size = 0;
    }

    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public Object extract() {
        Random random = new Random();
        int index = random.nextInt(this.size);
        return this.elements.get(index);
    }
}
