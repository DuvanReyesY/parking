
package parking;

public class Funcionario extends Usuario{
    
    private String cargo;
    
    public Funcionario(String cargo, int id, String nombre) {
        super(id, nombre,"Funcionario");
        this.cargo=cargo;
    }
    public void reservCubiculo(Cubiculos cube) {
        cube.Reservar(this);
    }
    
    
    
}
