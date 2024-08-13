
package parking;

public class Carnet extends Usuario{
    private String Nombre;
    private String Tpcarnet; //maestros y estudiantes O funcionarios  
    private String valido;
    private int NoSerial;

    public Carnet(int id, String nombre,String Tpcarnet, String tipoUsuario) {
        super(id, nombre, tipoUsuario);
        this.Nombre = Nombre;
        this.Tpcarnet = Tpcarnet;
        this.valido = "1"; //o "0" si no es valido
        this.NoSerial = NoSerial;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public boolean getValidar(){
        if(valido.equals("1")){
            return true;
        }else{
            return false;
        }
        
        
    }
    

    
}
