package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int result = number01 - number02;
        System.out.println(result);

        // %
        int rest = 20 % 2;
        System.out.println(rest);

        // < > <= >=  !=(different) ==(equal)
        boolean IsDezMaiorQueVinte = 10 > 20;
        System.out.println("IsDezMaiorQueVinte" + IsDezMaiorQueVinte);

        // && (AND)
        int idade = 35;
        float salario = 3500F;
        boolean IsDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("IsDentroDaLeiMaiorQueTrinta " + IsDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        //or
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;

        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);
    }
}
