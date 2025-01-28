import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Specify the range
        int min = 1;
        int max = 100;
        
        // Generate a random number within the specified range
        int randomNumber = random.nextInt((max - min) + 1) + min;
        
        System.out.println("Random Number: " + randomNumber);
    }
}