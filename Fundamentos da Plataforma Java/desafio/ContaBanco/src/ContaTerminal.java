import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();
        
        System.out.println("Digite o número da agência:");
        agencia = scanner.next();

        System.out.println("Digite o seu nome:");
        nome = scanner.next();
        
        System.out.println("Digite o seu saldo:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }

}
