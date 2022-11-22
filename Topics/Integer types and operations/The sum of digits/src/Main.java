import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var test =scanner.next();
        var digit1=test.charAt(0);
        var digit2=test.charAt(1);
        var digit3=test.charAt(2);
        System.out.println(digit1-'0'+digit2-'0'+digit3-'0');
    }
}