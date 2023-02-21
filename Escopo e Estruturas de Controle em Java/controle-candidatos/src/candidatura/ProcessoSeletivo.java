package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"MARIA", "JOSE", "FELIPE", "MARIO", "JOSEFA", "RITA"};

        System.out.println("Lista de candidatos com índice:");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O nome do candidato de n° " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Lista de candidatos com for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"MARIA", "JOSE", "FELIPE", "MARIO", "JOSEFA", "RITA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou R$" + salarioPretendido + " de salário ");

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > 2000.0) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
