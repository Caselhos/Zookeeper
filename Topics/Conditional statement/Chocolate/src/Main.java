import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        var k = scanner.nextInt();
        if (k < n && k < m || n * m < k){
            System.out.println("NO");
        } else {
            if (k % m == 0) {
                System.out.println("YES");
            } else if (k % n == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}