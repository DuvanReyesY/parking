
package parking;

import java.util.Date;


public class Reserva{
    private int id;
    private Cubiculos cube;
    private Funcionario funcer;
    private Date hourReserv;
    public Reserva(int id,Cubiculos cube, Funcionario funcer, Date hourReserv){
        this.id = id;
        this.cube = cube;
        this.funcer = funcer;
        this.hourReserv = hourReserv;
    }
    
    public void Reservar(){
        cube.Reservar(funcer);
    }
    
    public void ElimReserva(){
        cube.Liberar();
    }
    
}
