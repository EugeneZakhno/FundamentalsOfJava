package io.github.eugenezakhno.listing14_2;

import java.util.Comparator;

class ReverseX implements Comparator<A> {
    @Override
    public int compare(A a, A b) {
        return b.compareTo(a);
    }
}
