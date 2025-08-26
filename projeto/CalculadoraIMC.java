import java.util.Scanner;
import java.util.Locale;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in).useLocale(Locale.US);
        char opcao;

        do {
            System.out.print("Digite seu nome: ");
            String nome = cs.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = cs.nextInt();
            cs.nextLine(); // limpa enter

            System.out.print("Digite seu peso (kg): ");
            double peso = cs.nextDouble();
            cs.nextLine(); // limpa enter

            System.out.print("Digite sua altura (m): ");
            double altura = cs.nextDouble();
            cs.nextLine(); // limpa enter

            double imc = peso / (altura * altura);
            System.out.printf("\n%s, %d anos\nPeso: %.2f kg\nAltura: %.2f m\n", nome, idade, peso, altura);
            System.out.printf("Seu IMC é: %.2f\n", imc);

            if (imc < 18.5) {
                System.out.println("Classificação: Abaixo do peso");
            } else if (imc < 25) {
                System.out.println("Classificação: Peso normal");
            } else if (imc < 30) {
                System.out.println("Classificação: Sobrepeso");
            } else {
                System.out.println("Classificação: Obesidade");
            }

            System.out.print("\nDeseja calcular novamente? (s/n): ");
            opcao = cs.next().charAt(0);
            cs.nextLine();

        } while (opcao == 's' || opcao == 'S');

        System.out.println("\nPrograma encerrado.");
    }
}
