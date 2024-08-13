
package parking;

public class Funcionario extends Usuario{
    
    private String cargo;
    
    public Funcionario(String cargo, int id, String nombre,String carnet) {
        super(id, nombre,"Funcionario",carnet);
        
        this.cargo=cargo;
    }
    
    
    
    
}
