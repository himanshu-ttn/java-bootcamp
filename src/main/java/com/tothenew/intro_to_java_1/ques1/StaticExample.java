package com.tothenew.intro_to_java_1.ques1;

public class StaticExample {

    static {
        System.out.println("\n:: STATIC-BLOCK :: ");
        Person temp = new Person("Himanshu", "Verma", 99);
        temp.printData();
    }

    public static void main(String[] args) {

        System.out.println("\n:: STATIC-FUNCTION :: ");

        Person tmp = Person.getInstance("Kartik", "Sharma", 80);

        Person.Showdata(tmp);


        System.out.println("\n :: STATIC-VARIABLE :: ");

        Person.FirstName = "Virat";
        Person.LastName = "Kohli";
        Person.Age = 28;

        System.out.println("First Name: " + Person.FirstName);
        System.out.println("Last Name: " + Person.LastName);
        System.out.println("Age : " + Person.Age);

    }
}
