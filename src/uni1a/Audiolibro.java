package uni1a;

public class Audiolibro extends ContenidoAudiovisual {

    private String autor;
    private String narrador;

    public Audiolibro(String titulo, int duracionEnMinutos, String genero, String autor, String narrador) {
        super(titulo, duracionEnMinutos, genero);
        this.autor = autor;
        this.narrador = narrador;
    }

    @Override
    public void mostrarDetalles()
    {
        System.out.println("Detalles del Audiolibro:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Autor: " + autor);
        System.out.println("Narrador: " + narrador);
        
        System.out.println();
    }
}