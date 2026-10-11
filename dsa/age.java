import java.util.Scanner;

public class VotingEligibility {

    
    public static boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        
        if (isEligibleToVote(userAge)) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

       
        scanner.close();
    }
}
