import java.util.Scanner;
import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();


        if (num1 < num2) { 
            int numAle = random.nextInt(num2 - num1 + 1) + num1;
            if (numAle % 2 == 0) { 
                System.out.println("O número aleatório gerado é: (" + numAle + ") e ele é um número par.");
            } else {
                System.out.println("O número aleatório gerado é: (" + numAle + ") e ele é um número ímpar.");
            }
        } else { 
            int numAle = random.nextInt(num1 - num2 + 1) + num2;
            if (numAle % 2 == 0) { 
                System.out.println("O número aleatório gerado é: (" + numAle + ") e ele é um número par.");
            } else {
                System.out.println("O número aleatório gerado é: (" + numAle + ") e ele é um número ímpar.");
            }
        }
        scanner.close();
    }
}