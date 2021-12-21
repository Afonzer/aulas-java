package Udemy.Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        //(F - 32) x 5/9 = C
        final double mult = 5.0 / 9;
        final int diferencaFC = 32;
        int f = 79;
        final double celcius = (f - diferencaFC) * mult;

        System.out.println("Convertendo o valor em firenhaint de " + f + " para celcius, o valor fica: " + celcius);
    }
}
