package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    String filename = "test.exe";
    // test.exe is the name or path to an executable file
    byte[] inputBytes = {0};
    long startTime, endTime;

    public void createGarbage() {
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();

            StringBuilder outputBuilder = new StringBuilder();
            for (byte b : inputBytes) {
                outputBuilder.append((char) b);
            }
            String outputString = outputBuilder.toString();

            endTime = System.currentTimeMillis();
            System.out.println("Execution time: " + (endTime - startTime) + "ms");
            System.out.println("Output string length: " + outputString.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GarbageCreator garbageCreator = new GarbageCreator();
        garbageCreator.createGarbage();
    }
}
