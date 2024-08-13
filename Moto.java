
package parking;


public class Moto extends Vehiculo{
    
    public Moto(String modelo, String placa, String TipoVehiculo, Usuario dueño) {
        super(modelo, placa, "Moto" , dueño);
    }
    
    @Override
    public Usuario getDueño() {
        return super.getDueño();
    }
    
    
}
