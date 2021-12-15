package Projeto;
//aqui vamos testar tudo aprendido
public class PrimeiroProjeto {
    public static void main(String[] args) {
        //converter celcius para fahrenheit e vice versa com uma variavel boolean
        //(F - 32) x 5/9 = C  fahrenheint para celcius
        //(°C × 9/5) + 32 = F  celcius para fahrenheint

        final double fToC = 5.0 / 9.0;
        final double cToF = 9.0 / 5.0;

        int diferenca = 32;

        double F = 77;
        double C = 25;

        double resultado = 0;



        boolean celcius = true;

        var frase = "A temperatura em X eh: ";


        if(!celcius){ //se a temperatura nn for em celcius vamos transformar para celcius
            frase = frase.replace("X","Celcius");
            resultado = (F - diferenca) * fToC;
            System.out.println(frase + resultado);
        }else{ //mesma coisa so q do contrario
            frase = frase.replace("X", "Fahrenheint");
            resultado = (C * cToF) + diferenca;
            System.out.println(frase + resultado);
        }
    }
}
