public class Quadrilatero {

    //Cálculo de área do quadrado
    public static double area(double lado) {
        return lado * lado;
    }

    //Cálculo de área do retângulo
    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    //Cálculo de área do trapézio
    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior * baseMenor) * altura) / 2;
    }

    //Cálculo de área do losango
    public static float area(float diagonal1, float diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }
}
