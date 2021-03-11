import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfSquirrels = scanner.nextInt();
        int numOfNuts = scanner.nextInt();

        System.out.println(numOfNuts % numOfSquirrels);
    }
}