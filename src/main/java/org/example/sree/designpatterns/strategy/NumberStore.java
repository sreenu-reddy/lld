package org.example.sree.designpatterns.strategy;

import org.example.sree.designpatterns.strategy.insert.Inserter;
import org.example.sree.designpatterns.strategy.search.Searcher;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {
    private final List<Integer> nums;
    private final Inserter inserter;
    private final Searcher searcher;

    public NumberStore( Inserter inserter, Searcher searcher) {
        this.nums = new ArrayList<>();
        this.inserter = inserter;
        this.searcher = searcher;
    }

    public void insert(int num){
        this.inserter.insert(num,this.nums);
    }

    // Return the index of the given num in the list of nums.
    public int search(int num){
       return this.searcher.search(num,this.nums);
    }



    /**
     * Strategy Pattern
     * 1. Let’s Build a Number Store. In which User can perform two operations
     *
     * Insert a  Number
     * Search a Number
     * 2. There is some changes in these operations ,User should insert and search Numbers with their desired algorithms Example : User A wants to insert and store numbers in sorted Order and want to use Binary search for searching , whereas User B wants to store number in unsorted order and wants to use Linear Search.
     *
     * 3. If there are 2 algorithms for insertion (I1, I2) and 2 algorithms for Searching ( O1, O2 ) then the user can use a combination of his own choice like ( I1 and O2) , (I2 and O1) etc.
     *
     * 4. For implementation , we can use ENUM’s InsertStrategy and SearchStrategy.
     *
     * 5. In constructor we can use these two enums as parameter , Hence whenever any user creates an object for this class then he has to pass two parameters i.e.  InsertStrategy and SearchStrategy.
     *
     * 6. We have also declared an Empty List of Integers for storing numbers in this class.
     *
     * 7. We will have Public insert and search methods in our class in which there will be a check for ordered and unordered insertion and a check for linear and binary check.
     *
     * 8. We will have a private ordered insert function, unordered insert function, linear search function and binary search function.
     *
     * 9. Problems with our above class are
     *
     * It violates Open Close principle as if we want to add more and more algorithms and strategies then if-else conditions will increase.
     *
     * This class will bloat up with time as more and more strategies will be added.This class will become Huge with time.
     *
     * The Code is not Readable.
     *
     * 10. Here comes the concept of polymorphism. Poly means many , morphism means form.
     *
     * 11. Instead of depending upon concrete classes , we can depend upon interface i.e. InsertStrategy Interface and searchStrategy Interface.
     * In simple words , we will have two interfaces Inserter and Searcher which will have different implementations Ordered insertion and Unordered insertion ,
     * Linear search and Binary Search. Now our class will
     * depend upon these interfaces and take those things inside our constructor from the user as a parameter while creating objects of the class of their choice.
     *
     * 13. Strategy Pattern : When we wish to have different types for something (eg. inserter , searcher as in this case ) and ensure that these types behave differently for the same function call.
     *
     * In computer programming, the strategy pattern is a behavioral software design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.
     *
     *
     * */
}
