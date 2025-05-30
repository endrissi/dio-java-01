import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("por favor, digite o número da conta:");
        numero = sc.nextInt();
        sc.nextLine(); //adicionado para evitar problemas na captura da entrada dos dados

        System.out.println("por favor, digite a agencia:");
        agencia = sc.nextLine();

        System.out.println("por favor, digite o nome do cliente:");
        nomeCliente = sc.nextLine();

        System.out.println("por favor, digite o saldo da conta");
        saldo = sc.nextDouble();

        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );

        sc.close();
    }
}
