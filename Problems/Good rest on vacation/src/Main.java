import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int durationInDays = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int oneNightCost = scanner.nextInt();

        System.out.println(durationInDays * foodPerDay + (durationInDays - 1) * oneNightCost + 2 * flightCost);
    }
}