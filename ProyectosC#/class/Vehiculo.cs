public class Vehiculo
{
    public Usuario Dueno { get; set; }
    public string Marca { get; set; }
    public string Modelo { get; set; }
    public string TipoVehiculo { get; set; }  // "carro" o "moto"

    public Vehiculo(Usuario dueno, string marca, string modelo, string tipoVehiculo)
    {
        Dueno = dueno;
        Marca = marca;
        Modelo = modelo;
        TipoVehiculo = tipoVehiculo;
    }

    public Usuario GetDueno()
    {
        return Dueno;
    }
}
