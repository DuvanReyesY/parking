using System;
using System.Collections.Generic;

public class Parqueadero
{
    public DateTime HoraApertura { get; set; }
    public DateTime HoraCierre { get; set; }
    public List<Cubiculo> Cubiculos { get; set; }
    public PlanillaReserverds PlanillaReservas { get; set; }

    public Parqueadero(DateTime horaApertura, DateTime horaCierre)
    {
        HoraApertura = horaApertura;
        HoraCierre = horaCierre;
        Cubiculos = new List<Cubiculo>();
        PlanillaReservas = new PlanillaReserverds();
    }

    public void Abrir()
    {
        Console.WriteLine("Parqueadero abierto.");
    }

    public void Cerrar()
    {
        Console.WriteLine("Parqueadero cerrado.");
    }
}
