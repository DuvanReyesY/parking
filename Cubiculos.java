
package parking;

public class Cubiculos {
    private String TipoCubiculo;
    private String Estado;
    
    public Cubiculos(String TipoCubiculo, String Estado){
        this.TipoCubiculo= TipoCubiculo;
        this.Estado="Libre";
    }
    public void Ocupar(Usuario user){
        if(Estado.equals("Libre")){
            Estado = "Ocupado";
            System.out.println("Este cubiculo fue ocupado por " + user.getNombre());
        }else{
            System.out.println("El cubiculo se encuentra ocupado");
        }           
    }
    public void Liberar(){
        Estado = "Libre";
        System.out.println("Cubículo Disponible");
    }
    public void Reservar(Funcionario funcer){
        if(Estado.equals("Libre")){
            Estado= "Reservado";
            System.out.println("Cubículo reservado por: " + funcer.getNombre());
        }else {
            System.out.println("Cubículo Reservado");
        }
    }

}
