import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        int numeroAgencia = scanner.nextInt();
        System.out.println("Por favor, digite o número da conta !");
        String numeroConta = scanner.next();
        scanner.nextLine(); // Limpar o buffer de entrada
        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.nextLine();
        scanner.close();
        double saldo = 237.48;
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia +
                ", conta: " + numeroConta + ", e seu saldo: " + saldo + ", já está disponível para saque.");
    }
}
