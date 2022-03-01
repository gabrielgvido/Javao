import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        double kelvin, reaumur, rankine, fahrenheit;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura");
        Double temperatura = leitor.nextDouble();

        kelvin = (temperatura + 273.15);
        System.out.println("A temperatura em Kelvin é "+kelvin);

        reaumur = temperatura * 0.8;
        System.out.println("A temperatura em Reaumur é "+reaumur);

        rankine = temperatura * 1.8 + 32 + 459.67;
        System.out.println("A temperatura em Rankine é "+rankine);

        fahrenheit = temperatura * 1.8 + 32;
        System.out.println("A temperatura em Fahrenheit é "+fahrenheit);
    }
}
