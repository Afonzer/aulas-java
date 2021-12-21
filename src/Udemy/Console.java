package Udemy;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("");
        Scanner entrada = new Scanner(System.in); //scanner System.in faz com q vc possa interagir com o tecladoi
        System.out.println("aaaaaaaaaaaaa");

        String a = entrada.nextLine(); //com o scanner ele determina se eh string ou int com line = string

        System.out.println(a);

        int b = entrada.nextInt();//ou int q eh int

        System.out.println(b);

        entrada.close();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        teclado.nextLine(); //caso nn deixe este next line aqui o next int faz a impressao de todos os prints primeiro
        //para ai entao pedir para escrever, eh um erro mas eh s[o colocar um next line logo em seguida q vai dar tudo certo
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();

        teclado.close();
    }
}
