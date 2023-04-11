package Part5_exeptions;
public class main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };

        try {
            int i = array[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3");
        }

        try {
            int i = array[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3");
        } finally {
            System.out.println("With finally clause");
        }
    }
}