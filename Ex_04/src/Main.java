import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num = scanner.nextInt();

       for (int i = num; i > 1; i--){
           num = num * (i-1);

           System.out.println(num);

       }


    }
}