package com.tothenew.beyond_java_8.ques1;

import java.util.*;

// user class for putitng it null

class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "--- Username: " + name + " Id: " + id + "---";
    }
}

public class OptionalToStream {

    static final int RECORD_SIZE = 100;
    static List<Optional<User>> withNullValuesList = new LinkedList<>();
    static List<String> values = Arrays.asList("Himanshu", "Sonu", "Monu", "Raj", "Kash");


    static void main(String[] args) {

        BuildNullableListOfUser();

//        PrintList();

//        Getting the valid users
        List<User> validUsers = withNullValuesList
                .stream()
                .flatMap(Optional::stream)
                .toList();

        PrintList(validUsers);

    }

    /**
     * Just putting random null values in List
     *
     */
    static void BuildNullableListOfUser() {

        boolean isNull;

        for (int i = 0; i < RECORD_SIZE; i++) {

            isNull = Math.random() > 0.5;

            withNullValuesList.add(
                    Optional.ofNullable(isNull
                            ? null
                            : new User(values.get((int) (Math.random() * values.size())), i)));
        }

    }

    static void PrintList() {
        for (var temp : withNullValuesList) {
            System.out.println(temp);
        }
    }

    static <T> void PrintList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

}
