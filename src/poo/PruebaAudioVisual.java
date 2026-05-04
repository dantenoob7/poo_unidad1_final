package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];

     // Pelicula con actor
     contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
     Pelicula avatar = (Pelicula) contenidos[0];
     avatar.agregarActor(new Actor("Sam Worthington", 45));

     // Serie con temporadas
     contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
     SerieDeTV got = (SerieDeTV) contenidos[1];
     got.agregarTemporada(new Temporada(1, 10));
     got.agregarTemporada(new Temporada(2, 10));

     // Documental con investigador
     contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
     Documental cosmos = (Documental) contenidos[2];
     cosmos.agregarInvestigador(new Investigador("Carl Sagan", "Astronomia"));

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
        avatar.mostrarActores();
        got.mostrarTemporadasLista();
        cosmos.mostrarInvestigadores();
        
     // PRUEBA DE PODCAST
        Podcast podcast = new Podcast("Tecnologia Hoy", 30, "Educativo", "Luis Perez", 1);
        podcast.mostrarDetalles();

        // PRUEBA DE AUDIOLIBRO
        Audiolibro audio = new Audiolibro("El Principito", 120, "Ficcion", "Antoine de Saint-Exupéry", "Juan Narrador");
        audio.mostrarDetalles();
    }
}