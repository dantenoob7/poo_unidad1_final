package uni1a;

public class Podcast extends ContenidoAudiovisual {

    private String presentador;
    private int numeroEpisodio;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String presentador, int numeroEpisodio) {
        super(titulo, duracionEnMinutos, genero);
        this.presentador = presentador;
        this.numeroEpisodio = numeroEpisodio;
    }

    @Override
    public void mostrarDetalles() 
    {
        System.out.println("Detalles del Podcast:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Presentador: " + presentador);
        System.out.println("Episodio: " + numeroEpisodio);
        
        System.out.println();
    }
}
