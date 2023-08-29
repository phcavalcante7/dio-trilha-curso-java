package challenges;

import java.util.*; //import Scanner and Locale

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o número da conta: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Entre com a agência: ");
        String agency = scanner.next();

        System.out.println("Entre com seu nome: ");
        String clientName = scanner.next();
        String supportName = scanner.nextLine();    //Linha utilizada para suportar o nome completo e não apenas o primeiro nome

        System.out.println("Entre com o primeiro depósito: ");
        double money = scanner.nextDouble();


            //--output--
        System.out.println("Olá " + clientName + supportName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + accountNumber + " e seu saldo " + money + " já está disponível para saque.");
    }
}
