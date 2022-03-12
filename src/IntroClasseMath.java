public class IntroClasseMath {
    public static void main(String[] args) {
        int numero1 = 9;
        double raizQuadradaNumero1 = Math.sqrt(numero1); // raiz quadrada do numero no parametro, nesse caso 1
        System.out.println(raizQuadradaNumero1);

        int numero2 = 4;
        double exponenciacaoNumero2 = Math.pow(numero2,3); // exponenciação do numero2 pelo outro valor no parametro, nesse caso 2
        System.out.println(exponenciacaoNumero2);

        int numero3 = -10;
        int valorAbsolutoNumero3 = (int)Math.abs(numero3);// abs mostra o numero, nao importando suas casas decimais ou sinal, valor absoluto
        System.out.println(valorAbsolutoNumero3);

        double numero4 = 10.9123;
        int floorNumero4 = (int)Math.floor(numero4); // floor sempre arredonda pra baixo
        System.out.println(floorNumero4);

        double numero5 = 56.188;
        int ceilNumero5 = (int)Math.ceil(numero5); // ceil sempre arredonda pra cima
        System.out.println(ceilNumero5);

        double numero6 = 43.540;
        int roundNumero6 = (int)Math.round(numero6);// round sempre arredonda pra cima
        System.out.println(roundNumero6);

        double numeroAleatorio = 3 + Math.random() * (10-3);
        System.out.println(numeroAleatorio);
        /*a classe random do java gera valores de 0-1, ou seja, pra criar um numero aleatorio é necessario fazer esse macete
        onde o primeiro numero (3) é somado ao valor de 0-1 e depois esse valor é multiplicado pelo resto da subtração
        do maior pelo menor, nesse caso 10 - 3
        * */
    }
}
