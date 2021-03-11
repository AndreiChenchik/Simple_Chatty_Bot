import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largestNumber = 0;
        int number = 0;

        boolean reachedZero = false;

        while (!reachedZero) {
            number = scanner.nextInt();
            if (number == 0) {
                reachedZero = true;
            } else if (number > largestNumber) {
                largestNumber = number;
            }
        }

        System.out.println(largestNumber);
    }
}