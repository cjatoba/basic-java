public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"José", "Maria", "Rosa", "Felipe"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno do índice " + x + " é " + alunos[x]);
        }

        for (String aluno : alunos) {
            System.out.println("Aluno: " + aluno);
        }
    }
}
