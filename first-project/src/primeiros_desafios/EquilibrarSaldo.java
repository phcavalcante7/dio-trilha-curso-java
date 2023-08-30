package primeiros_desafios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DesafioSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.0");

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        saldoAtual += valorDeposito;
        saldoAtual -= valorRetirada;

        System.out.println("Saldo atualizado na conta: " + formato.format(saldoAtual));
        scanner.close();
    }
}