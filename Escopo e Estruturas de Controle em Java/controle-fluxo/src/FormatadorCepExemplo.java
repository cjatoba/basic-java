public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("11333445");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O formato do CEP é inválido!");
        }    
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return "11.333-445";
    }
}
