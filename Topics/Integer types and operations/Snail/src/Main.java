import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        var height_H = scanner.nextInt();
        var height_A = scanner.nextInt();
        var height_B = scanner.nextInt();
        day=(height_H-height_B)/(height_A-height_B);
        if((height_H-height_B)%(height_A-height_B)!=0){
            day+=1;
        }
        //10=3x-2x+2
        //3x-2x=8
        //x(3-2)=8
        //
        System.out.println(day);

    }
}