package Part6_staticMembers;
public class main {

    // This variable is private because we will control access to it through getter
    private static int instanceCounter = 0;

    // This method is public because we need to call it from outside the class
    public static void incrementCount() {
        instanceCounter++;
    }

    public main() {
        incrementCount();
        System.out.println("Current count is: " + instanceCounter);
    }

    // This method is public because we need to access the count from outside the class
    public static int getInstanceCount() {
        return instanceCounter;
    }

    public static void main(String[] args) {

        main obj1 = new main();
        main obj2 = new main();
        main obj3 = new main();
        main obj4 = new main();

        System.out.println("Total count of the objects: " + getInstanceCount());
    }
}

