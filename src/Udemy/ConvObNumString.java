package Udemy;

import javax.swing.*;

public class ConvObNumString {
    public static void main(String[] args) {
        //transf numero em string com conotacao ponto
        Integer a = 10000;
        System.out.println(a.toString().length());

        int b = 10100;
        System.out.println(Integer.toString(b));
        System.out.println(("a" + b).length());

        //transf string para numero
        String v1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String v2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

        System.out.println(v1 + v2);

        double numero1 = Double.parseDouble(v1);
        double numero2 = Double.parseDouble(v2);



        double soma = numero1 + numero2;

        System.out.println(soma);
        System.out.println(soma / 2);



    }
}
