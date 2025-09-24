package vehiculos;

// Clase Moto que hereda a Vehículo
// Sobreescribe el método mover(), pero no implementa Combustible, ya que no es requerido

public class Moto extends Vehiculo {
    // Constructor que invoca el constructor de la superclase Vehículo
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    // Sobreescribe el método mover() para definir el comportamiento específicos de la moto
    @Override
    public void mover(){
        System.out.println("La moto " + getMarca() + " " + getModelo() + " se mueve en 2 ruedas.");
    }



}