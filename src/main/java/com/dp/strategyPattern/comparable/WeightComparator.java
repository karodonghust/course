package com.dp.strategyPattern.comparable;

import java.util.Comparator;


public class WeightComparator<T extends HaveWeight> implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        T haveWeight1 = (T) o1;
        T haveWeight2 = (T) o2;
        if (haveWeight1.getWeight() > haveWeight2.getWeight()) {
            return -1;
        } else if (haveWeight1.getWeight() > haveWeight2.getWeight()) {
            return 1;
        } else {
            return 0;
        }
    }
}
