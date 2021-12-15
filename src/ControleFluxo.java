public class ControleFluxo {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");
        System.out.println("if e else");
//if/else/else if sao literalmente caso/senao aonde podemos colocar condicoes para rodar no programa


        int idade = 13;
        boolean adulto = idade >= 18; //neste caso eh false

        //|| e && ou entao E e OU usados para melhorar o condicionamento do codigo
        if (idade == 12 || idade < 12){ //caso variavel diade seja menor ou igual a 12
        //caso idade seja igual a 12 E maior a 12 roda o if
            System.out.println("Crianca"); //ele mostra o q esta dentro dele
            System.out.println("Ta novo");
        }
        else if(idade == 18 && idade > 18){ //pode sim colocar if novamente mas ele estaria tentando os dois aos mesmo tempo, else if eh para caso um nn for tente o outro
        //caso se idade for igual a 18 OU maior que 18 roda o else if
            System.out.println("Adulto");
            System.out.println("Ta velho");
        }else{ //e vice e versa
            System.out.println("Adolecente");
            System.out.println("Ta meio termo");
        }//escopo eh aonde uma variavel comeca e aodne ela termina determinado por {}

        System.out.println("Boolean"); //usado para verdadeiro ou falso
        boolean acompanhado = false; //sempre necessario colocar se true ou false
        if(acompanhado){ //nn eh necessario colocar seu valor dentro dele pois boolean ja eh padrao verdadeiro
            System.out.println("voce esta acompanhado");
        }else{
            System.out.println("Voce nn esta acompanhado");
        }


        System.out.println("Estrutura de repeticao while");

        int laco = 0;
        while(laco <= 10){ //while eh o enquanto, literalmente uma estrutura de repeticao booleana q vai rodar enquanto true dentro do seu escopo
            System.out.println("O numero do laco eh: "+ laco);
            laco = laco + 1; //podendo ser laco += 1
            //caso vc va aumentar em so o numero literal 1 eh so colocar laco++
        }
        System.out.println(laco);

        laco = 0;
        int total = 0;
        while(laco <= 10){
            //int total = 0; por causa do escopo ele nn soma os numeros
            //o q estavamos buscando aqui era q ele somasse os numeros 0 + 1 = 1, 1 + 2 = 3, 3 + 3 = 6
            total = total + laco;

            System.out.println(total);
            laco++;
        }



        System.out.println("Estrutura de repeticao FOR");

        for(laco = 0; laco <= 10; laco++){ //ao contrario do while q precisa demarcar a variavel antes ou dentro de seu for e depois demarcar o q ele vai fazer
            //o for nn, ele ja faz tudo de uma vez dentro de suas () e so sendo realizado dentro de seu escopo
            System.out.println(laco);
        }




        System.out.println("Lacos encadeados/alinhados");
        for(int multiplicador = 1; multiplicador <= 10; multiplicador++){//caso multiplicador seja menor ou igual a 10
            //faz o de baixo e entao soma mais um no multiplicador
            for(int contador = 0; contador <=10; contador++){//caso contador seja menor ou igual a 10 faz o de baixo e soma mais 1
                //o multiplicador so soma maus um quando o contador termina um laco inteiro e eh resetado
                System.out.print(multiplicador * contador);
                System.out.print(" ");

            }
            System.out.println();
        }


        for(int linha = 0; linha < 10; linha++){
            for(int coluna = 0; coluna <10; coluna++){
                if(coluna > linha){
                    break;
                }
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
