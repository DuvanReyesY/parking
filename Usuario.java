
package parking;


public class Usuario {
    private int id;
    private String nombre;
    private String tipoUsuario; //estudiante y maestro O funcionario

    public Usuario(int id, String nombre, String tipoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
}
