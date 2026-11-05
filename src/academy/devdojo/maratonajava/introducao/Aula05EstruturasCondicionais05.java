package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima os dias da semana, considerando dia 1 como domingo
        byte dia = 5;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Opção inválida");
            
        }


        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o seu Genêro (M/F): ");
            char sexo = scanner.next().charAt(0);

            switch (sexo) {
                case 'M':
                case 'm':

                    System.out.println("Masculino");
                    break;
                case 'F':
                case 'f':
                    System.out.println("Feminino");
                    break;
                default:
                    System.out.println("Genêro não reconhecido");
            }

            scanner.close();

    }
}
