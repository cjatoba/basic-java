public class VariablesTypes {
    public static void main(String[] args) throws Exception {
        int number1 = 1;
        int number2 = 2;

        String name1 = "José";
        String name2 = new String("José");

        if (number1 == number2) {
            System.out.println("O número " + number1 + " é igual ao número" + number2);
        } else {
            System.out.println("O número " + number1 + " é diferente do número " + number2);
        }

        if (name1.equals(name2)) {
            System.out.println("A String " + name1 + " é igual a String " + name2);
        } else {
            System.out.println("A String " + name1 + " é diferente da String " + name2);
        }
    }
}
