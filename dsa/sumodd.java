public static void printSumOfOdds(int n) {
    int sum = 0;
    
    
    for (int i = 1; i <= n; i += 2) {
        sum += i;
    }
    
    System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sum);
}
