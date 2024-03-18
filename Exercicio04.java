import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Perímetro do círculo \n2. Área do círculo \n3. Volume da esfera \nDigite o número do cálculo desejado: ");
        int numeroCalculo = scanner.nextInt();

        if (numeroCalculo < 1 || numeroCalculo > 3) {
            System.out.println("Digite um número válido.");
        } else {
            System.out.println("Digite o valor do raio: ");
            double raio = scanner.nextDouble();

            if (raio <= 0) {
                System.out.println("O raio deve ser um valor positivo.");
            } else {
                switch (numeroCalculo) {
                    case 1:
                        double perimetro = 2 * Math.PI * raio;
                        System.out.println("O perímetro do círculo é: " + perimetro);
                        break;
                    case 2:
                        double area = Math.PI * raio * raio;
                        System.out.println("A área do círculo é: " + area);
                        break;
                    case 3:
                        double volume = (4.0 / 3.0) * Math.PI * raio * raio * raio;
                        System.out.println("O volume da esfera é: " + volume);
                        break;
                }
            }
        }

        scanner.close();
    }
}