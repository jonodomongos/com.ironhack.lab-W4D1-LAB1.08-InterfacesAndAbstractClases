public class MainVideos {
    public static void main(String[] args) {
        SerieTelevision serie = new SerieTelevision("Breaking Bad", 50, 62);
        Pelicula pelicula = new Pelicula("Interstellar", 169, 9.2);

        System.out.println(serie.obtenerInfo());
        System.out.println(pelicula.obtenerInfo());
    }
}