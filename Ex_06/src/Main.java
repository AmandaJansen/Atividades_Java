import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º número");
        int num1 =  scanner.nextInt();
        System.out.println("Digite o 2º número");
        int num2 = scanner.nextInt();
        System.out.println("Digite o 3º número");
        int num3 =  scanner.nextInt();

        int media = (num1 + num2 + num3) / 3;

        System.out.println("O valor da média é: " + media);




    }
}
//------------------------em float------------------------/
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite o 1º número");
//        float num1 =  scanner.nextFloat();
//        System.out.println("Digite o 2º número");
//        float num2 = scanner.nextFloat();
//        System.out.println("Digite o 3º número");
//        float num3 =  scanner.nextFloat();
//
//        float media = (num1 + num2 + num3) / 3;
//
//        System.out.println("O valor da média é: " + media);
//
//
//
//
//    }
//}