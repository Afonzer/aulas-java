package Udemy;

public class Inferencia {
    //inferencia ele determina qual o tipo da variavel sem precisar demarcar ela "int,string,etc"
    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        var b = 4.5; //ele vai inferir o tipo da variavel pelo valor
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        double d; //declarada a variavel
        d = 19.25; //foi iniciada
        System.out.println(d); //entao utilizada
        /*
        c = 4.5;
         nn podemos simplesmetne mudar o tipo da variavel, determinada ela se
         manter fixa a nn ser q seja mudada
         */

        //var e; nn funcionaria pois para inferir tem de ser iniciada na propria declaracao
    }
}
