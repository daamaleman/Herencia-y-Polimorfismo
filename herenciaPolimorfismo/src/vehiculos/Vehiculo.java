package vehiculos;

// Clase abstracta vehículo que representa la superclase base para diferentes tipos de vehículo s
// Encapsula atributos comunes como marca y modelo y define un método abstracto mover() que debe ser sobreescrito por las subclases. Esto promueve la reutilización de código y el polimorfismo.
public abstract class Vehiculo {
    // Atributos encapsulados (private) para promover el encapsulamiento
    private String marca;
    private String modelo;

    // Constructor que inicializa la marca y el modelo del vehículo
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método getter para obtener la marca del vehículo
    public String getMarca() {
        return marca;
    }

    // Método getter para obtener el modelo del vehículo
    public String getModelo() {
        return modelo;
    }

    // Método abstracto que define el comportamiento de movimiento
    public abstract void mover();
}
