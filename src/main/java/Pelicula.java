public class Pelicula extends Video {
    private double valoracion;

    public Pelicula(String titulo, int duracion, double valoracion) {
        super(titulo, duracion);
        this.valoracion = valoracion;
    }

    @Override
    public String obtenerInfo() {
        return "[Película] " + super.obtenerInfo() +
                ", Valoración: " + valoracion + "/10";
    }
}