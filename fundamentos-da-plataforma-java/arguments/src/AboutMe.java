import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String firstName = scanner.next();
        
        System.out.println("Digite seu sobrenome: ");
        String lastName = scanner.next();
        
        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Digite sua altura (cm): ");
        double height = scanner.nextDouble();

        System.out.println("Meu nome é " + firstName + " " + lastName);
        System.out.println("Tenho " + age + " anos de idade");
        System.out.println("Minha altura é " + height + " cm");
    }
}
