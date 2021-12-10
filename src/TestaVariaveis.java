public class TestaVariaveis {
    public static void main(String[] args) {
        //variaveis sao os metodos, as informacoes q ficam guardadas junto a palavras chaves no sistema demarcadas por int/string/etc

        System.out.println("Variaveis"); //lembrando q tudo o q vc abrir no java precisa fechar com ; pois o programa precisa saber aonde parar

        System.out.println("int");

        int idade = 23; //int eh a variavel de numero
        int data;//voce pode abrir a variavel sem valor
        data = 19062021; //e determinar o seu valor depois
        System.out.println(idade);
        System.out.println(data);

        //com as variaveis podemos fazer conotacoes matematicas
        int v1 = 2;
        int v2 = 3;
        int soma;
        soma = v1 + v2; //determinando o valor de soma somando as variaveis v1 e v2
        System.out.println("A soma eh: " + soma);//usando o + no Sysout ele liga a variavel e concatena/junta elas para aparecer no print

        System.out.println("Double");

        //double eh o numero flutuante, numero com virgula
        double salario;
        salario = 1235.02;
        System.out.println("Salario: "+ salario);

        double resultado; //se a variavel q resulta na soma de ambos int e double for int ele nn aceita, o int ele busca colcoar um numero inteiro
        resultado = v1 + salario;
        System.out.println("resultado: " + resultado ); //mesmo sendo uma variavel diferente, o double pode somar com um int

        System.out.println("Casting");
        int valor = (int) salario; //casting, converte para o tipo de variavel determinada entre os parenteses ()
        System.out.println(valor);


        System.out.println("Char");
        char a = 'a'; //como o nome ja fala, ele literalmente guarda 1 caractere sendo um valor expecifico
        char b = 66; //ele aceita pois o numero interliga um char
        System.out.println(b);

        b = (char) (b + 2); //Casting como explicado, mas em char ja q ele eh um valor de um caracter ele pode ser concatenado e somado para puxar outro char
        System.out.println(b);


        System.out.println("string");

        String palavra = "aaaaaaaaaaaaaaaaaaaaaa ";
        System.out.println(palavra);

        palavra = palavra + 2021; //ao contrario das variaveis de numero, o string converte tudo para string nn precisando usar o casting
        System.out.println(palavra);


    }//escopo eh aonde uma variavel comeca e aodne ela termina determinado por {}
}
