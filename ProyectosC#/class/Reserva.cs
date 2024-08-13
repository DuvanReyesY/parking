using System;

public class Reserva
{
    private int Id { get; set; }
    private Cubiculo Cubiculo { get; set; }
    private Usuario Usuario { get; set; }
    private DateTime HoraReserva { get; set; }

    public Reserva(int id, Cubiculo cubiculo, Usuario usuario)
    {
        Id = id;
        Cubiculo = cubiculo;
        Usuario = usuario;
        HoraReserva = DateTime.Now;
    }

    public void Reservar()
    {
        Cubiculo.Reservar(Usuario as Funcionario);
    }

    public void ElimReserva()
    {
        Cubiculo.Liberar();
        Console.WriteLine("Reserva eliminada.");
    }
}
