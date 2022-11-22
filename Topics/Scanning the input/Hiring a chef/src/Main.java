import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var field1=scanner.nextLine();
        var field2=scanner.nextLine();
        var field3=scanner.nextLine();

        System.out.format("The form for %s is completed. We will contact you " +
                "if we need a chef who cooks %s dishes and has %s years " +
                "of experience.",field1,field3,field2);
    }
}