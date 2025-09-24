package vehiculos;

// Clase Caro que hereda de Vehículo e implementa la interfaz Combustible +
// Sobreescribe el método mover() e implementa recargar(), demostrando herencia y polimorfismo

public class Carro extends Vehiculo implements Combustible{
    // Constructor que invoca al constructor de la superclase Vehículo
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    // Sobreescribe el método mover() para definir el comportamiento específico del carro
    @Override
    public void mover() {
        System.out.println("El carro " + getMarca() + " " + getModelo() + " se mueve en 4 ruedas.");
    }

    // Implementa el método recargar() de la interfaz Combustible
    @Override
    public void recargar(){
        System.out.println("Recargando gasolina para el carro " + getMarca() + " " + getModelo() + ".");
    }
}
