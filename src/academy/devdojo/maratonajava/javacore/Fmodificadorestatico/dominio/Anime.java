package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    public String nome;
    private int[] epsisodios;
    {
        System.out.println("Dentro do bloco de inicialização");
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
     epsisodios = new int[100];
        for (int i = 0; i < epsisodios.length; i++) {
            epsisodios[i] = i+1;
        }
        for(int episodio: this.epsisodios){
            System.out.println(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpsisodios() {
        return epsisodios;
    }
}
