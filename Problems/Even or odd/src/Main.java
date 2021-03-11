import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber;

        while (true) {
            userNumber = scanner.nextInt();

            if (userNumber == 0) {
                break;
            }

            if (userNumber % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}