package com.tothenew.beyond_java_8.ques2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UseOfExample {

    public static void main(String[] args) {

//        Collections created with of function have these limitaion :
//          is immutable
//          cannot take null value


        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


//        for Set it cannot take duplicate values
        Set<Float> set = Set.of(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f);


//        Map.of() wokr like :: Map.of(key1,value1, key2,value2, .....)
//        Map.of() can only create 10 items
        Map<String, Integer> map = Map.of(
                "a", 1, "b", 2, "c", 3,
                "d", 4, "e", 5, "f", 6,
                "g", 7, "h", 8, "i", 9,
                "j", 10
        );


        System.out.println(list);


    }


}
