package hust.soict.dsai.garbage;
public class ConcatenationInLoops {
    public static void main(String[] args) {
        int iterations = 10000;
        long startTime, endTime, duration;

        // Using + operator
        startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += "hello";
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Using + operator:");
        System.out.println("Result length: " + result.length());
        System.out.println("Execution time: " + duration + "ms");

        // Using StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            buffer.append("hello");
        }
        result = buffer.toString();
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("\nUsing StringBuffer:");
        System.out.println("Result length: " + result.length());
        System.out.println("Execution time: " + duration + "ms");

        // Using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            builder.append("hello");
        }
        result = builder.toString();
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("\nUsing StringBuilder:");
        System.out.println("Result length: " + result.length());
        System.out.println("Execution time: " + duration + "ms");
    }
}

