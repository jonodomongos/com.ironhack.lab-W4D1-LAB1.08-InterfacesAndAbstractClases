public class Camion extends Coche {
    private double capacidadRemolque;

    public Camion(String numeroVin, String marca, String modelo, int kilometraje, double capacidadRemolque) {
        super(numeroVin, marca, modelo, kilometraje);
        this.capacidadRemolque = capacidadRemolque;
    }

    @Override
    public String obtenerInfo() {
        return "[Camión] " + super.obtenerInfo() +
                ", Capacidad de remolque: " + capacidadRemolque + " toneladas";
    }
}