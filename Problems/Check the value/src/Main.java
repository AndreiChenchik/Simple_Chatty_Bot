import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber = scanner.nextInt();

        System.out.println(userNumber < 10 && userNumber > 0);
    }
}