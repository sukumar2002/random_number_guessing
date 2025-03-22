import java.util.Scanner;

public class UserGuessing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome To Number Guessing Game!!!!");
        System.out.print("Enter your name:");
        String name = s.next();
        RandomNumbers.guessNumber(name);
    }
}
