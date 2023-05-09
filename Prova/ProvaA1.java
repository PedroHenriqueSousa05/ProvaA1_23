import java.util.Scanner;

public class ProvaA1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("PROGRAMA PARA CALCULAR UMA ESTIMATIVA DE CUSTO DE CONBUSTÍVEL");
        System.out.println("----------------------------------------------------------------");

        System.out.println("Informe a placa do automóvel: ");
        String placaVeiculo = scanner.nextLine();

        System.out.println("Informe o valor do litro do conbustível:");
        double valorLitro = scanner.nextDouble();   

        System.out.println("Informe a quantidade de quilômetros rodados a 60 KM/H:");
        double kmH60 = scanner.nextDouble();

        System.out.println("Informe a quantidade de quilômetros rodados a 80 KM/H:");
        double kmH80 = scanner.nextDouble();

        System.out.println("Informe a quantidade de quilômetros rodados a 100 KM/H:");
        double kmH100 = scanner.nextDouble();

        System.out.println("Informe a quantidade de quilômetros rodados a 120 KM/H:");
        double kmH120 = scanner.nextDouble();

        System.out.println("Informe a quantidade de quilômetros rodados a 140 KM/H:");
        double kmH140 = scanner.nextDouble();

        scanner.close();

        double combustivelKmH60 = kmH60 / 30.7;
        double combustivelKmH80 = kmH80 / 26.8;
        double combustivelKmH100 = kmH100 / 22.4;
        double combustivelKmH120 = kmH120 / 18.1;
        double combustivelKmH140 = kmH140 / 14.5;

        double totalCombustivel = combustivelKmH60 + combustivelKmH80 + combustivelKmH100 + combustivelKmH120 + combustivelKmH140;
        double totalKM = kmH60 + kmH80 + kmH100 + kmH120 + kmH140;
        double mediaPond = (kmH60 * 60 + kmH80 * 80 + kmH100 * 100 + kmH120 * 120 + kmH140 * 140) / totalKM;
        double custoTotal = totalCombustivel * valorLitro;

        System.out.println("--------------------------------------------");
        System.out.println("A ESTIMATIVA DE CUSTO PARA ESSA VIAGEM É DE:");
        System.out.println("--------------------------------------------");
        System.out.println("A placa do seu veículo: " + placaVeiculo);
        System.out.printf("O custo total da viagem foi de: R$%.2f", custoTotal);
        System.out.printf("\nA velocidade média ponderada do veículo foi de: %.2f",mediaPond);
        System.out.printf("\nConsumo total de combustível: %.4f",totalCombustivel);
    }
}