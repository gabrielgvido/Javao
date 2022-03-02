import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        double kelvin, reaumur, rankine, fahrenheit;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura");
        Double temperatura = leitor.nextDouble();

        kelvin = (temperatura + 273.15);
        System.out.format("A temperatura em Kelvin é %.3f \n",kelvin);

        reaumur = temperatura * 0.8;
        System.out.println("A temperatura em Reaumur é "+reaumur);

        rankine = temperatura * 1.8 + 32 + 459.67;
        System.out.format("A temperatura em Rankine é %.2f\n",rankine);

        fahrenheit = temperatura * 1.8 + 32;
        System.out.println("A temperatura em Fahrenheit é "+fahrenheit);
    /*
     System.out.format é uma saida formatada do System.out.println, existem tambem o System.out.printf, mas o format é mais facil de
     lembrar pra formatação de saida de dados
     */
    }
}
