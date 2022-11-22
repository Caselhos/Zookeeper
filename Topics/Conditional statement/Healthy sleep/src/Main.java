import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a=scanner.nextInt();
        var b=scanner.nextInt();
        var h=scanner.nextInt();
        if(h<a){
            System.out.println("Deficiency");
        }
        if(h>b){
            System.out.println("Excess");
        }
        if(a<=h && h<=b){
            System.out.println("Normal");
        }

    }
}