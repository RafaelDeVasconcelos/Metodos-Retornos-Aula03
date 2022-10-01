public class Main {
    public static void main(String[] args) {

        //Retorno da área do quadrado
        double quadrado = Quadrilatero.area(30);
        System.out.println(quadrado);

        // Retorno da área do retângulo
        double retangulo = Quadrilatero.area(12d, 30d);
        System.out.println(retangulo);

        //Retorno da área do trapézio
        double trapezio = Quadrilatero.area(20, 13, 8);
        System.out.println(trapezio);

        //Retorno da área do losango
        float losango = Quadrilatero.area(23f, 23f);
        System.out.println(losango);
    }
}