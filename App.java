package Qustao1;

import java.util.Scanner;

public class App {
    private int numeroClientes;

    public void calcularMediaGastoPorCliente() {
        Scanner scanner = new Scanner(System.in);
        Media media = new Media();
        double totalGastos = 0;

        System.out.print("Digite o número de clientes: ");
        numeroClientes = scanner.nextInt();

        for (int i = 1; i <= numeroClientes; i++) {
            System.out.print("Digite o gasto em bebidas do cliente " + i + ": ");
            double gastoBebidas = scanner.nextDouble();

            System.out.print("Digite o gasto em comidas do cliente " + i + ": ");
            double gastoComidas = scanner.nextDouble();

            totalGastos += gastoBebidas + gastoComidas;
            double mediaGastoPorCliente = totalGastos / numeroClientes;
        System.out.println("A média de gastos por cliente é: " + mediaGastoPorCliente);
        }

        media.media2(totalGastos, numeroClientes);
        System.out.println("A média total é " );
        scanner.close();
    }
}

