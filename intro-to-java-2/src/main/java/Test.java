public class Test implements Trigger {
    public static String NAME = "HIMANSHU";
    public String COLLEGE = "JIMS";

    public void print() {
        System.out.println(NAME);
        System.out.println(COLLEGE);
    }

    public void gravity(float distance) {
        if (distance < 800 && distance > 500) {
            onTriggerEnter();
        } else if (distance == 200) {
            onTriggerExit();
        } else {
            System.out.println("No collision");
        }
    }

    @Override
    public void onTriggerEnter() {
        System.out.println("BODY collided");
    }

    @Override
    public void onTriggerExit() {
        System.out.println("BODY collided");
    }
}