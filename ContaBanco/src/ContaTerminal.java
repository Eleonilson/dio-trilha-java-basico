import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner.

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        // Exibir as mensagens para o nosso usuário:
        System.out.print("Por favor, digite o número da conta: ");
        int conta = sc.nextInt();
        System.out.print("número da Agência: ");
        String agencia = sc.next();
        System.out.print("Nome do cliente: ");
        String nome = sc.next();
        System.out.print("Deposite um valor: ");
        Double valor = sc.nextDouble();
        // Obter pela scanner os valores digitados no terminal:
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + valor + " já está disponível para saque.");
        // Exibir a mensagem da conta criada:

        sc.close();
    }
}
