public class MainCoches {
    public static void main(String[] args) {
    /*
    INSTRUCCIONES:
    1. Sistema de Inventario de Automóviles
    Supón que estás construyendo un sistema de inventario de automóviles.
    Todos los coches tienen un número de identificación del vehículo (VIN), una marca, un modelo y un kilometraje.
    Pero ningún coche es simplemente un coche: cada vehículo será un sedán, un vehículoUtilitario o un camión.

    Crea una clase abstracta llamada Coche y define las siguientes propiedades y comportamientos:
	    - numeroVin: un Sting que representa el número de identificación del vehículo.
	    - marca: un String que representa la marca del coche.
	    - modelo: un String que representa el modelo del coche.
	    - kilometraje: un int que representa los kilómetros recorridos por el coche.
	    - obtenerInfo(): un método que devuelve un String con todas las propiedades del coche en un formato legible.

    Crea tres clases que hereden de Coche: Sedan, VehiculoUtilitario y Camion.
	    - Los objetos de tipo VehiculoUtilitario deben tener una propiedad adicional llamada traccionCuatroRuedas,
        de tipo Boolean, que indique si el vehículo dispone de tracción a las cuatro ruedas.
	    - Los objetos de tipo Camion deben tener una propiedad adicional llamada capacidadRemolque,
        de tipo Double, que indique la capacidad de remolque del camión.

    2. Servicio de Transmisión de Vídeos
    Supón que estás construyendo un servicio de transmisión de vídeos.
    Todos los vídeos serán o bien series de televisión o películas.

    Crea una clase abstracta llamada Video y define las siguientes propiedades y comportamientos:
	    - titulo: un String que represente el título del vídeo.
	    - duracion: un Int que represente la duración del vídeo en minutos.
	    - obtenerInfo(): un método que devuelve una cadena de texto con todas las propiedades del vídeo en un formato legible.

    Crea dos clases que hereden de Video: SerieTelevision y Pelicula.
	    - Los objetos de tipo SerieTelevision deben tener una propiedad adicional llamada episodios,
        un Int que indique la cantidad de episodios de la serie.
	    - Los objetos de tipo Pelicula deben tener una propiedad adicional llamada valoracion,
        un Double que indique la puntuación o valoración de la película.
      */
        Sedan sedan = new Sedan("VIN123", "Toyota", "Corolla", 35000);
        VehiculoUtilitario suv = new VehiculoUtilitario("VIN456", "Jeep", "Wrangler", 42000, true);
        Camion camion = new Camion("VIN789", "Volvo", "FH16", 80000, 25.5);

        System.out.println(sedan.obtenerInfo());
        System.out.println(suv.obtenerInfo());
        System.out.println(camion.obtenerInfo());
    }
}
