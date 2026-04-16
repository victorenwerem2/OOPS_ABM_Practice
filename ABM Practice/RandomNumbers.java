import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate 10 random numbers between 1 and 100
        for (int i = 0; i < 10; i++) {
            int number = rand.nextInt(100) + 1;
            System.out.println(number);
        }
    }
}