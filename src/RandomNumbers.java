import java.util.Scanner;

public class RandomNumbers {
    public static void guessNumber(String name) {
        Scanner sc = new Scanner(System.in);
        int random_Number = (int) (Math.random() * 100) + 1;
        System.out.println("A number is Generated Between 1 To 100.Guess the Number!!! ");
        System.out.println("You Have 5 attempts to Guess the Number!!!!");
        System.out.println("Best Of Luck!!!!");
        int trails = 5;
        int i;
        for (i = 0; i < trails; i++) {
            try {
                System.out.print("Guess the Number:");
                int guess_Number = sc.nextInt();
                if (guess_Number >= 0 && guess_Number <= 100) {
                    if (guess_Number == random_Number) {
                        System.out.println("You guessed the number....");
                        System.out.print("Do you want to play again[yes/no]:");
                        String play = sc.next();
                        if (play.equalsIgnoreCase("yes")) {
                            guessNumber(name);
                        } else {
                            System.exit(1);
                        }
                        break;
                    } else if (random_Number > guess_Number && i != trails - 1) {

                        System.out.println("The Random number is greater then :" + guess_Number);
                        System.out.println((trails - i - 1) + " attempts left...");

                    } else if (random_Number < guess_Number && i != trails - 1) {
                        System.out.println("The Random Number is less than :" + guess_Number);
                        System.out.println((trails - i - 1) + " attempts left...");
                    }
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Guess Number must Between 1 to 100 only....");
                System.out.println("Do you want to play again[yes/no]:");
                @SuppressWarnings("unused")
                String play = sc.nextLine();
                String play1 = sc.next();
                if (play1.equalsIgnoreCase("yes")) {
                    guessNumber(name);
                } else {
                    System.out.println("Thanks for using my Application....");
                    System.exit(1);
                }
                System.exit(1);
            }
        }
        if (i == trails) {
            System.out.println("Sorry!! You have used all attempts to guess a number.....");
            System.out.println("Better luck next time....");
            System.out.println("The Random Number is:" + random_Number);
            System.out.print("Do you want to play again[yes/no]:");
            String play = sc.next();
            if (play.equalsIgnoreCase("yes")) {
                guessNumber(name);
            } else {
                System.out.println("Thanks for using my Application....");
                System.exit(1);
            }
        }
        sc.close();
    }
}
