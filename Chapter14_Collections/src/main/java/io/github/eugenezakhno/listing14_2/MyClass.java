package io.github.eugenezakhno.listing14_2;

import java.util.ArrayList;
import java.util.Comparator;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<A> arr = new ArrayList<A>();
        arr.add(new A(1, 3));
        arr.add(new A(3, 1));
        arr.add(new A(2, 4));
        System.out.println(arr.toString());
        // [{1;3}, {3;1}, {2;4}]
        // Сортировка по x
        arr.sort(null);
        System.out.println(arr.toString());
        // [{1;3}, {2;4}, {3;1}]
        // Сортировка по y
        arr.sort(new Comparator<A>() {
            @Override
            public int compare(A a, A b) {
                if (a.getY() > b.getY()) return 1;
                if (a.getY() < b.getY()) return -1;
                return 0;
            }
        });
        System.out.println(arr.toString());
        // [{3;1}, {1;3}, {2;4}]
        // Сортировка по x по убыванию
        arr.sort(new ReverseX());
        System.out.println(arr.toString());
        // [{3;1}, {2;4}, {1;3}]
        // Сортировка по y по убыванию
        arr.sort( (a, b) -> Integer.compare(b.getY(), a.getY())
        );
        System.out.println(arr.toString());
        // [{2;4}, {1;3}, {3;1}]
    }
}
