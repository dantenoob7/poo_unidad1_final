package uni1a;

public class Temporada {

    private int numero;
    private int cantidadEpisodios;

    // Constructor
    public Temporada(int numero, int cantidadEpisodios) {
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    // toString
    @Override
    public String toString() {
        return "Temporada " + numero + " - Episodios: " + cantidadEpisodios;
    }
}
