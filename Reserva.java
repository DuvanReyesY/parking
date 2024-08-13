
package parking;


public class Reserva{
    private int id;
    private Cubiculos cube;
    private Funcionario funcer;
    
    public Reserva(int id,Cubiculos cube, Funcionario funcer){
        this.id = id;
        this.cube = cube;
        this.funcer = funcer;
    }
    
    public void Reservar(){
        cube.Reservar(funcer);
    }
    
    public void ElimReserva(){
        cube.Liberar(funcer);
    }
    
}
