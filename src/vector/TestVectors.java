package vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestVectors {
    public static void main(String[] args) {
        /* TODO */
        ArrayVector arrayVector = new ArrayVector();
        arrayVector.append(1);
        arrayVector.insert(2, 1);
        arrayVector.insert(3, 2);
        System.out.println("arrayVector: " + arrayVector);

        ArrayVector arrayVector1 = new ArrayVector(new double[]{4, 5, 6, 7});
        arrayVector1.remove(3);
        System.out.println("arrayVector1: " + arrayVector1);
        System.out.println("length of arrayVector: " + arrayVector.length());
        System.out.println("magnitude of arrayVector: " + arrayVector.magnitude());
        System.out.println("distance between arrayVector and arrayVector1: " + arrayVector.distanceTo(arrayVector1));
        System.out.println("elements of arrayVector1: " + Arrays.toString(arrayVector1.elements()));
        System.out.println("arrayVector1 minus with arrayVector: " + arrayVector1.minus(arrayVector));
        System.out.println("arrayVector1 plus with arrayVector: " + arrayVector1.plus(arrayVector));
        System.out.println("arrayVector1 scale with 2: " + arrayVector1.scale(2));
        System.out.println("arrayVector1 dot with arrayVector: " + arrayVector1.scale(2));

        System.out.println("========================");

        ListVector listVector = new ListVector();
        listVector.append(1);
        listVector.insert(2, 1);
        listVector.insert(3, 2);
        System.out.println("listVector: " + listVector);

        ListVector listVector1 = new ListVector(List.of(4D, 5D, 6D, 7D));
        listVector1.remove(3);
        System.out.println("listVector1: " + listVector1);
        System.out.println("length of listVector: " + listVector.length());
        System.out.println("magnitude of listVector: " + listVector.magnitude());
        System.out.println("distance between listVector and listVector1: " + listVector.distanceTo(listVector1));
        System.out.println("elements of listVector1: " + Arrays.toString(listVector1.elements()));
        System.out.println("listVector1 minus with listVector: " + listVector1.minus(listVector));
        System.out.println("listVector1 plus with listVector: " + listVector1.plus(listVector));
        System.out.println("listVector1 scale with 2: " + listVector1.scale(2));
        System.out.println("listVector1 dot with listVector: " + listVector1.scale(2));

    }
}
