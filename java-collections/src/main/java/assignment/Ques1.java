package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Q1)
 * Write Java code to define List. Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
 * */
public class Ques1 {

    private List<Float> floatList ;

    // just initializing the list
    public Ques1() {
        floatList = new ArrayList<>();
    }

    public void startAns(){
        floatList.add(27.11f);
        floatList.add(28.11f);
        floatList.add(09.06f);
        floatList.add(24.08f);
        floatList.add(16.06f);

        Iterator<Float> iterator = floatList.iterator();

        long sum = 0;
        while (iterator.hasNext()){
            sum += iterator.next();
        }

        System.out.println("Sum is "+sum);
    }



}
