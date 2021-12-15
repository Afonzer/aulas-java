package Udemy;

public class Desafio1 {
    public static void main(String[] args) {
        //(F - 32) x 5/9 = C
        double mult = 5.0 / 9;
        int diferenca = 32;
        int f = 79;
        double celcius = (f - diferenca) * mult;

        System.out.println("Convertendo o valor em firenhaint de " + f + " para celcius, o valor fica: " + celcius);
    }
}
