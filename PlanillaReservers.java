
package parking;

import java.util.ArrayList;
import java.util.List;

public class PlanillaReservers {
    private List<Reserva> reserveds;

    public PlanillaReservers(List<Reserva> reserveds) {
        this.reserveds = new ArrayList<>();
    }
    
    public void NewReserv(Reserva resv){
        reserveds.add(resv);
    }
    
    public void ElimReserv(Reserva resv){
        reserveds.remove(resv);
    }
}
