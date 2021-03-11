import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean reachedZero = false;
        int count = 0;
        while (!reachedZero) {
            int nextNumber = scanner.nextInt();

            if (nextNumber != 0) {
                count++;
            } else {
                reachedZero = true;
            }
        }

        System.out.println(count);
    }
}