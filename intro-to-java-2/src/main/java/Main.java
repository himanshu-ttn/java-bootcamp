import assignment.*;

import java.util.Scanner;

import static java.lang.Thread.sleep;


public class Main {

    public static void main(String[] args) throws InterruptedException {

//       :: code for ques 1 ::
  /*
        House house = House.SMALL_HOUSE;
        System.out.println("House is " + house.ordinal());
        System.out.println("House is " + house.name());
        System.out.println("Price is " + house.getPrice());
        System.out.println("Enum is "+ House.SMALL_HOUSE );

        System.out.println("-----------------");

        for(House x : House.values()){
           System.out.printf("%-15s | %.2f%n",x.name(),x.getPrice());
        }
*/


//       :: code for ques 2 ::
/*
        UserCreation creation = new UserCreation();
        creation.startProgram();
*/

//       :: code for ques 3::
/*

        // Through commandline
//        String filename = args[0];
//        String word = args[1];

        // Through user input
        Scanner scanner = new Scanner(System.in);
        String filename;
        String word ;

        System.out.print("Enter the file name: ");
        filename = scanner.nextLine();

        System.out.print("Enter the word to count: ");
        word = scanner.nextLine();

        WordCount.start(filename, word);
*/

//       :: code for ques 4 ::
/*
        Shape circleShape = ShapeFactory.getShape(MyShape.CIRCLE);
        circleShape.draw();

        Shape squareShape = ShapeFactory.getShape(MyShape.SQUARE);
        squareShape.draw();

        Shape rectShape = ShapeFactory.getShape(MyShape.RECTANGLE);
        rectShape.draw();
*/

//       :: code for ques 5 ::

        SystemManger manger = SystemManger.getInstance();
        manger.log("Hello World!");

        // this will be getting the same instance :)
        SystemManger tempManger = SystemManger.getInstance();
        System.out.println(tempManger.getLog());
    }


    /// ///////////////////////////////////////////////////////////////
// RANDOM STUFF BELOW THIS ::
    // Just simulating a physics collider :)
    public static void justPlaying() throws InterruptedException {
        float fall = 1000;
        float speed = 100f;
        Test test = new Test();

        while (fall >= 0) {
            fall -= speed;
            sleep(100);
            test.gravity(fall);

        }
    }
}
