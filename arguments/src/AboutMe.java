public class AboutMe {
    public static void main(String[] args) throws Exception {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos de idade");
        System.out.println("Minha altura é " + altura + " cm");
    }
}
