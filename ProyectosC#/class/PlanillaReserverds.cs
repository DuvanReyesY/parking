using System.Collections.Generic;

public class PlanillaReserverds
{
    private List<Reserva> Reserveds { get; set; }

    public PlanillaReserverds()
    {
        Reserveds = new List<Reserva>();
    }

    public void AddReserv(Reserva resv)
    {
        Reserveds.Add(resv);
        Console.WriteLine("Reserva añadida a la planilla.");
    }

    public void RemoveReserv(Reserva resv)
    {
        Reserveds.Remove(resv);
        Console.WriteLine("Reserva eliminada de la planilla.");
    }
}
