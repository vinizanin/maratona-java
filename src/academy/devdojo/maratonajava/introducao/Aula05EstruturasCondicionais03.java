package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salario: ");
        double salario = scanner.nextInt();
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado;
        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        scanner.close();
    }
}
