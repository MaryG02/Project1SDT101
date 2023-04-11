public class Part1 {

    public static void main(String[] args) {
        int[][] arr1 = initializeArray1(5, 5);
        System.out.println("Array1:");
        printArray(arr1);

        int[][] arr2 = initializeArray2(5, 5);
        System.out.println("\n"+"Array2:");
        printArray(arr2);

        int[][] arr3 = initializeArray3(5, 5);
        System.out.println("\n"+"Array3:");
        printArray(arr3);

        int[][] arr4 = initializeArray4(5, 5);
        System.out.println("\n"+"Array4:");
        printArray(arr4);

    }

    public static int[][] initializeArray1(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = 5;
            }
        }
        return arr;
    }

    public static int[][] initializeArray2(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = j;
            }
        }
        return arr;
    }

    public static int[][] initializeArray3(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = counter;
                counter++;
            }
        }
        return arr;
    }
    public static int[][] initializeArray4(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        int counter = 24;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = counter;
                counter--;
            }
        }
        return arr;
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}