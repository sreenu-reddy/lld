package org.example.sree.designpatterns.strategy.insert;

import java.util.List;

public class UnderedInserter implements Inserter{
    @Override
    public void insert(int num, List<Integer> nums) {
        nums.add(num);
    }
}
