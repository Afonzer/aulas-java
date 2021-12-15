package Udemy;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {
        //nn pdoe ser utilizado em tipos primitivos int, double, etc..
        String string = "Bom dia x!";
        string = string.replace("x", "senhor"); //lembrando q temos q colocar a variavel para receber a alteracao
        //notacao ponto tem varias formas de correcao/alteracao da variavel
        string = string.toUpperCase();
        string = string.concat("!!!");

        System.out.println(string);


        System.out.println("afonso".toUpperCase().concat("!!!")); //podendo tambem colocar tudo em uma unica linha economizando espoco de alretacao
        //podendo ser utilizado dentro do print/ nn sendo um tipo primitivo pode se usar
    }
}
