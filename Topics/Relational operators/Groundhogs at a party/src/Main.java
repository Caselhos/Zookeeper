import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        var test= scanner.nextBoolean();
        boolean party;
        if (test){
            if (15<=number && number<=25){
                party=true;
                System.out.println(party);
            }
            else{
                party=false;
                System.out.println(party);
            }

        }
        else{
            if (10<=number && number<=20){
                party=true;
                System.out.println(party);
            }
            else {
                party=false;
                System.out.println(party);
            }

        }
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
    }
}