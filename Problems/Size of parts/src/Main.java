import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfParts = scanner.nextInt();
        int readyParts = 0;
        int fixedParts = 0;
        int rejectedParts = 0;
        int detectorPrints = 0;

        for (int i = 1; i <= numberOfParts; i++) {
            detectorPrints = scanner.nextInt();

            if (detectorPrints == 0) {
                readyParts++;
            } else if (detectorPrints == -1) {
                rejectedParts++;
            } else {
                fixedParts++;
            }
        }

        System.out.print(readyParts);
        System.out.print(" ");
        System.out.print(fixedParts);
        System.out.print(" ");
        System.out.print(rejectedParts);
    }
}