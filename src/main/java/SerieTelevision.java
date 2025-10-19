public class SerieTelevision extends Video {
    private int episodios;

    public SerieTelevision(String titulo, int duracion, int episodios) {
        super(titulo, duracion);
        this.episodios = episodios;
    }

    @Override
    public String obtenerInfo() {
        return "[Serie de TV] " + super.obtenerInfo() +
                ", Episodios: " + episodios;
    }
}