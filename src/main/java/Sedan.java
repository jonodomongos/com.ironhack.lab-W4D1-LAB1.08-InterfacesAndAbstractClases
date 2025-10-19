public class Sedan extends Coche {

    public Sedan(String numeroVin, String marca, String modelo, int kilometraje) {
        super(numeroVin, marca, modelo, kilometraje);
    }

    @Override
    public String obtenerInfo() {
        return "[Sedán] " + super.obtenerInfo();
    }
}