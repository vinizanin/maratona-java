package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        // if, else if, else
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida");
        } else {
            System.out.println("Não autorizado a comprar bebida");
        }

        // Operador ternário
        String resultado = isAutorizadoComprarBebida ? "Autorizado a comprar bebida" : "Não autorizado a comprar bebida";
        System.out.println(resultado);
    }
}
