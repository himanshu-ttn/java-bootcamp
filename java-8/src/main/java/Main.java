import java.io.PipedOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };

        List<String> ola = new ArrayList<>();
        ola.add("Hello World");
        ola.add("Blue");
        ola.add("cat");
        ola.add("red");

        Stream stream = ola.stream();

        Predicate predicate;

//        String x = hello;
//        StackTraceElement[] element = Thread.currentThread().getStackTrace();
//
//        System.out.println(element[0].getClassName());
//        System.out.println(element[0].getLineNumber());
//        System.out.println(element[0].getMethodName());
//        System.out.println(element[0].getFileName());
//
//        Method method = Main.class.getDeclaredMethod("hello");
//        System.out.println(method.getDeclaringClass().getName());

//        FunctionalInterface ab = (FunctionalInterface) Main::hello;


/*
        List<String> list = Arrays.asList("abc","def");
        System.out.println(
                list.stream()
                        .collect(Collectors.joining(","))
        );

*/

/*
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(
                list.stream()
                        .collect(Collectors.summarizingInt(x -> x * 2))
        );

    }
*/

/*
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(
                list.stream()
                        .collect(Collectors.averagingInt(x -> x * 2))
        );

*/

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(
                list.stream()
                        .collect(Collectors.toMap(e -> e, e -> e + " Number" ))
        );

        String  str = 
    }
//    public static void hello(){System.out.println("Hello World");}

    interface testing {
        default void chacha() {
            System.out.println("Hello World");
        }
    }

    class X implements testing {

    }
}