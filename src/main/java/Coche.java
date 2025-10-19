public abstract class Coche {
    private String numeroVin;
    private String marca;
    private String modelo;
    private int kilometraje;

    // Constructor
    public Coche(String numeroVin, String marca, String modelo, int kilometraje) {
        this.numeroVin = numeroVin;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    // Getters & Setters
    public String getNumeroVin() {
        return numeroVin;
    }
    public void setNumeroVin(String numeroVin) {
        this.numeroVin = numeroVin;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    // Método propio
    public String obtenerInfo() {
        return "VIN: " + numeroVin +
                ", Marca: " + marca +
                ", Modelo: " + modelo +
                ", Kilometraje: " + kilometraje + " km";
    }
}