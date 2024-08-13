public class Cubiculo
{
    private string TipoCubiculo { get; set; }  // carro o moto
    private string Estado { get; set; }

    public Cubiculo(string tipoCubiculo)
    {
        TipoCubiculo = tipoCubiculo;
        Estado = "Libre";
    }

    public void Ocupar(Usuario usuario)
    {
        if (Estado == "Libre")
        {
            Estado = "Ocupado";
            Console.WriteLine(value: $"{usuario.nombre} ha ocupado el cubículo.");
        }
        else
        {
            Console.WriteLine("El cubículo no está disponible.");
        }
    }

    public void Liberar()
    {
        Estado = "Libre";
        Console.WriteLine("El cubículo ha sido liberado.");
    }

    public void Reservar(Funcionario funcionario)
    {
        if (Estado == "Libre")
        {
            Estado = "Reservado";
            Console.WriteLine(value: $"{funcionario.nombre} ha reservado el cubículo.");
        }
        else
        {
            Console.WriteLine("El cubículo no está disponible para reservar.");
        }
    }
}
