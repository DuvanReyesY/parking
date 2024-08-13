
package parking;

import java.util.Date;

public class PARQUEADERO {
    
    private Date horaApertura;
    private Date horaCierre;

    public PARQUEADERO(Date horaApertura, Date horaCierre) {
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }
    
    public void abrir() {
        System.out.println("Parqueadero abierto");
    }

    public void cerrar() {
        System.out.println("Parqueadero cerrado");
    }
}
