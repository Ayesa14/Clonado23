
import java.util.Collection;



public class Operaciones<T extends Comparable<T>> {

    public T min(Collection<T> collection) {
        T min = null;
        for (T element : collection) {
            if (min == null || element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public T max(Collection<T> collection) {
        T max = null;
        for (T element : collection) {
            if (max == null || element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public int search(Collection<T> collection, T target) {
        int index = 0;
        for (T element : collection) {
            if (element.equals(target)) {
                return index;
            }
            index++;
        }
        return -1;
    }
}