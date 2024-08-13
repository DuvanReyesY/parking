
package parking;

public class Vehiculo {
    private String modelo;
    
    private String placa;
    private String TipoVehiculo; //Carro o Moto
    private Usuario dueño;

    public Vehiculo(String modelo, String placa, String TipoVehiculo, Usuario dueño) {
        this.modelo = modelo;
        this.placa = placa;
        this.TipoVehiculo = TipoVehiculo;
        this.dueño = dueño;
    }

    public Usuario getDueño(){
        return dueño;
    }
    
}
