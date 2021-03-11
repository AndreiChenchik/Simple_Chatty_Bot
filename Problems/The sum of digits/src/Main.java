import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();

        System.out.println(myNumber / 100 + myNumber % 100 / 10 + myNumber % 10);
    }
}