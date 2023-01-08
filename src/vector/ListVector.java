package vector;

import java.util.ArrayList;
import java.util.List;

public class ListVector implements IVector {
    private List<Double> data;

    public ListVector() {
        /* TODO */
        data = new ArrayList<>();
    }

    public ListVector(List<Double> data) {
        /* TODO */
        this.data = new ArrayList<>(data);
    }

    @Override
    public void append(double value) {
        /* TODO */
        data.add(value);
    }

    @Override
    public void insert(double value, int index) {
        /* TODO */
        if (index < 0 || index > length()) {
            System.out.println("Can't insert to index " + index);
            return;
        }
        data.add(index, value);
    }

    @Override
    public void remove(int index) {
        /* TODO */
        if (index < 0 || index > length()) {
            System.out.println("Can't remove at index " + index);
            return;
        }
        data.remove(index);
    }

    @Override
    public int length() {
        /* TODO */
        return data.size();
    }

    @Override
    public double magnitude() {
        /* TODO */
        double d = 0;
        for (int i = 0; i < length(); i++) {
            d += element(i) * element(i);
        }
        return Math.sqrt(d);
    }

    public double distanceTo(ListVector another) {
        /* TODO */
        if (length() != another.length()) {
            return 0;
        }
        double d = 0;
        for (int i = 0; i < length(); i++) {
            d += Math.pow(element(i) - another.element(i), 2);
        }
        return Math.sqrt(d);
    }

    @Override
    public double[] elements() {
        /* TODO */
        double[] d = new double[length()];
        for (int i = 0; i < length(); i++) {
            d[i] = element(i);
        }
        return d;
    }

    public double element(int index) {
        /* TODO */
        if (index < 0 || index > length()) {
            return 0;
        }
        return data.get(index);
    }

    public ListVector minus(ListVector another) {
        /* TODO */
        if (length() != another.length()) {
            return new ListVector();
        }
        List<Double> d = new ArrayList<>();
        for (int i = 0; i < length(); i++) {
            d.add(element(i) - another.element(i));
        }
        return new ListVector(d);
    }

    public ListVector plus(ListVector another) {
        /* TODO */
        if (length() != another.length()) {
            return new ListVector();
        }
        List<Double> d = new ArrayList<>();
        for (int i = 0; i < length(); i++) {
            d.add(element(i) + another.element(i));
        }
        return new ListVector(d);
    }

    public ListVector scale(double factor) {
        /* TODO */
        List<Double> d = new ArrayList<>();
        for (int i = 0; i < length(); i++) {
            d.add(element(i) * factor);
        }
        return new ListVector(d);
    }

    public double dot(ListVector another) {
        /* TODO */
        if (length() != another.length()) {
            return 0;
        }
        double d = 0;
        for (int i = 0; i < length(); i++) {
            d += element(i) * another.element(i);
        }
        return d;
    }

    /*
     * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        return data.toString();
    }
}
