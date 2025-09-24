package vehiculos;

// Clase Camion que hereda de Vehículo e implementa la interfaz Combustible
// Sobreescribe el método mover() e implmenta recargar(), demostrando herencia y polimorfismo
public class Camion extends Vehiculo implements Combustible {
    // Constructor que invoca al constructor de la superclase Vehiculo
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    // Sobreescribe el método mover() para definir el comportamiento específico del camión
    @Override
    public void mover() {
        System.out.println("El camnion " + getMarca() + " " + getModelo() + " se mueve transportando carga.");
    }

    // Implementa el método recargar() de la interfaz combustible
    @Override
    public void recargar() {
        System.out.println("Recargando diésel para el camnion " + getMarca() + " " + getModelo() + ".");
    }
}
