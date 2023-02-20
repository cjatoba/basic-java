import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();
    
            System.out.println("Digite seu sobrenome");
            String sobreNome = scanner.nextLine();
    
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
    
            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();
    
            System.out.println("Meu nome é " + nome + " " + sobreNome + " tenho " + idade + " anos de idade e " + altura + "cm de altura");
        } catch (InputMismatchException inputMismatchException) {
            System.err.println("Os campos idade e altura devem ser numéricos e não podem conter vírgula");
        }
    }
}
