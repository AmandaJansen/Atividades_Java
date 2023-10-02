import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; num--){
            System.out.println(num);

        }
    }
}