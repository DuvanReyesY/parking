public class Moto : Vehiculo
{
    public Moto(Usuario dueno, string marca, string modelo)
        : base(dueno, marca, modelo, "moto")
    {
    }
}

public class Carro : Vehiculo
{
    public Carro(Usuario dueno, string marca, string modelo)
        : base(dueno, marca, modelo, "carro")
    {
    }
}
