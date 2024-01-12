package org.example.sree.designpatterns.strategy;

import org.example.sree.designpatterns.strategy.insert.OrderInserter;
import org.example.sree.designpatterns.strategy.search.BinarySearch;

public class Tester {

    public static void main(String[] args) {
        NumberStore store = new NumberStore(new OrderInserter(),new BinarySearch());
    }
}
