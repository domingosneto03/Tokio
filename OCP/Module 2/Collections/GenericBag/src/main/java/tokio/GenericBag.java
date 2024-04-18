package tokio;

import java.util.*;

public class GenericBag<T> {
    private Set<T> bag;

    public GenericBag() {
        this.bag = new HashSet<>();
    }

    public void add(T value) {
        System.out.println("-> value added");
        bag.add(value);
    }

    public void addAll(List<T> values) {
        System.out.println("-> all the values were added");
        bag.addAll(values);
    }

    public void clear() {
        System.out.println("-> the bag was cleared");
        bag.clear();
    }

    public boolean contains(T value) {
        return bag.contains(value);
    }

    public boolean isEmpty() {
        return bag.isEmpty();
    }

    public int size() {
        return bag.size();
    }

    public T extract() {
        if(!isEmpty()) {
            Random random = new Random();
            int index = random.nextInt(size());

            Iterator<T> iterator = bag.iterator();
            for (int i = 0; i < index; i++) {
                iterator.next();
            }

            T extracted = iterator.next();
            iterator.remove();
            return extracted;
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericBag<?> that = (GenericBag<?>) o;
        return Objects.equals(bag, that.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bag);
    }

    @Override
    public String toString() {
        return "GenericBag{" +
                "bag=" + bag +
                '}';
    }
}
