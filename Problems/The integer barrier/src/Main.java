import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        int sum = 0;

        while (true) {
            userNumber = scanner.nextInt();

            sum += userNumber;

            if (userNumber == 0) {
                break;
            } else if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }

        System.out.println(sum);
    }
}