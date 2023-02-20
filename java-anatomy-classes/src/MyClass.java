public class MyClass {

    public static void main(String[] args) {
        String firstName = "José";
        String lastName = "Maria";

        String fullName = fullName(firstName, lastName);

        System.out.println(fullName);
    }

    public static String fullName(String firstName, String lastName) {
        return "Method return: " + firstName.concat(" ").concat(lastName);
    }

}