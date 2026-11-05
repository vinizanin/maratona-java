package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 15) {
            System.out.println("Categoria: Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria: Juvenil");
        } else {
            System.out.println("Categoria: Adulto");
        }

        scanner.close();
    }
}
