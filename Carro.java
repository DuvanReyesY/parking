
package parking;

public class Carro extends Vehiculo {
    
    public Carro(String modelo, String placa, Usuario dueño) {
        super(modelo, placa, "Carro " , dueño);
    }

    @Override
    public Usuario getDueño() {
        return super.getDueño();
    }
    
}
