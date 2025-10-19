public abstract class Video {
    private String titulo;
    private int duracion; // en minutos

    public Video(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    // Getters & Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Método propio
    public String obtenerInfo() {
        return "Título: " + titulo + ", Duración: " + duracion + " minutos";
    }
}