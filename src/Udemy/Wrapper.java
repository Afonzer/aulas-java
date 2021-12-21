package Udemy;

import java.util.Locale;
import java.util.Scanner;

public class Wrapper { //embrulho
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        /*
        ao contrario das variaveis nos temos os objetos q podem ser utilizados com a conotacao ponto
        String eh um objeto e todas as outras variaveis sao do tipo primitivo
        com os Wrappers podemos transformar de tipo primitivo para objeto

        para cada tipo primitivo existe uma forma de transformar em objeto
         */
        Byte b = 100; //bite
        Short s = 1000; //short
        Integer i = 10000; //Integer.parseInt(entrada.next()); converte string para int//int
        Long l = 100000l; //long precisa demonstrar q eh long com o L no final
        Character c = '#'; //char
        Float f = 123.0f; //float
        Double D = 12351.312; //double


        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3.0);

        Boolean bo = Boolean.parseBoolean("true"); //converte string para boolean
        System.out.println(bo.toString().toUpperCase());



        /*

         */
    }
}
