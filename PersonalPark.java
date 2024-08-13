
package parking;


public class PersonalPark {
    private String nombre;
    private String Puesto; //Entrada o patio
    
    public PersonalPark() {
    }
    
    public PersonalPark(String nombre, String Puesto) {
        this.nombre = nombre;
        this.Puesto = Puesto;    
    }
    
    public boolean VerifCarnet(Usuario usuario){
        if(!usuario.getCarnet().isEmpty()){
            System.out.println("Carnet verificado");
            return true;
        }
        else{
            System.out.println("Carnet invalido");
            return false;            
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;   
    }
    
}
