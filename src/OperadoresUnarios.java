public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        int numero3;
        int numero4;
        int numero5 = 5;
        System.out.println(numero1);
        numero1++;
        System.out.println(numero1);
        numero1--;
        System.out.println("Aqui o valor dele continua "+numero1+" pois o incremento muda o valor da variavel");

        numero3 = 5 + ++numero2;
        numero4 = 5 + numero5++;
        System.out.println(numero3);
        System.out.println(numero4);

    }
}
