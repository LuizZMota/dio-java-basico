import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, insira o número da Agência: ");
        String agencia = input.nextLine(); // Mantém o formato correto

        System.out.print("Por favor, insira o número da Conta: ");
        int numeroConta = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        System.out.print("Por favor, insira o seu nome completo: ");
        String nome = input.nextLine();

        System.out.print("Por favor, insira o saldo inicial: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo "+saldo+"já está disponível para saque");

        input.close();
    }
}
