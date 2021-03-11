import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        for (int i = 1; counter > 0; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                counter--;

                if (counter < 1) {
                    break;
                }
            }
        }
    }
}