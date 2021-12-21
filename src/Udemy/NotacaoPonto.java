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
        System.out.println("\n \n");
        System.out.println(string.charAt(2));
        System.out.println(string.startsWith("B"));
        System.out.println(string.length());
        System.out.println(string.equals("Bom dia senhor!!!!"));
        System.out.println(string);


        System.out.println("afonso".toUpperCase().concat("!!!")); //podendo tambem colocar tudo em uma unica linha economizando espoco de alretacao
        //podendo ser utilizado dentro do print/ nn sendo um tipo primitivo pode se usar

        /*
        a String eh um objeto imutavel, ele nn pode ser modificado
         */

        var nome = "Afonso";
        var sobrenome = "Celso";

        System.out.printf("Nome: %s %s", nome, sobrenome); //uma forma de utilizar o print eh o printf
        //coloque %s em o numero de variaveis q vc vai adiconar e coloque elas com , e tudo sera encaixado no print
        //tendo tambem como parametro para substituicao o %s para string e %d para int


        //tudo em java eh obejto q pode ser usado a conotacao ponto, mas os q nn daoa pra usar temos q usar o Wrappers
    }
}
