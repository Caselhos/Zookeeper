import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var string = scanner.nextLine();
        var minRange = scanner.nextInt();
        var maxRange = scanner.nextInt();
        System.out.println(string.substring(minRange,maxRange+1));

    }
}