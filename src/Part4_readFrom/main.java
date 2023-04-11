package Part4_readFrom;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
// This part does not work, because I did not know how to fix the problem in line 20
public class main {
    public static void main(String[] args) throws IOException {
        try {
            System.out.print("Enter the name of the file: ");
            Scanner scan = new Scanner(System.in);
            String inputFileName = scan.nextLine();
            Scanner inputFileReader = new Scanner(new File(inputFileName));

            String outputFileName = inputFileName + ".txt";
            PrintWriter outputFileWriter = new PrintWriter(new File(outputFileName));

            int lineNumber = 1;
            String line;
            while ((line = inputFileReader.nextLine()) != null) {
                outputFileWriter.write(String.format("[%03d] %s\n", lineNumber, line));
                lineNumber++;
            }

            inputFileReader.close();
            outputFileWriter.close();

            System.out.printf("Your file was written to '%s'.\n", outputFileName);
        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}
