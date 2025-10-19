public class VehiculoUtilitario extends Coche {
    private boolean traccionCuatroRuedas;

    public VehiculoUtilitario(String numeroVin, String marca, String modelo, int kilometraje, boolean traccionCuatroRuedas) {
        super(numeroVin, marca, modelo, kilometraje);
        this.traccionCuatroRuedas = traccionCuatroRuedas;
    }

    @Override
    public String obtenerInfo() {
        return "[Vehículo Utilitario] " + super.obtenerInfo() +
                ", Tracción 4x4: " + (traccionCuatroRuedas ? "Sí" : "No");
    }
}