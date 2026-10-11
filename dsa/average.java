public class AverageCalculator {


    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        
        scanner.close();

        
        double result = calculateAverage(num1, num2, num3);

        
        System.out.println("The average of the three numbers is: " + result);
    }

    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }
}