import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userString = scanner.nextLine();

        System.out.println(userString.replace('a', 'b'));
    }
}