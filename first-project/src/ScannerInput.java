import java.util.*; //importing Scanner and Locale

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String name = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String lastName = scanner.next();

        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();

            //output
        System.out.println("Hello, my name is " + name + " " + lastName);
        System.out.println("And I'm " + age + " years old");
    }
}
