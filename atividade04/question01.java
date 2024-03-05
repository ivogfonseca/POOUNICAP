import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("o número é negativo.");
        } else {
            System.out.println("O número é igual a zero");
        }

        scanner.close();

    }
}