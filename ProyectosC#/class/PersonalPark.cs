public class PersonalPark
{
    private string Nombre { get; set; }
    private string Puesto { get; set; }   // "Entrada" o "Patio"

    public PersonalPark(string nombre, string puesto)
    {
        Nombre = nombre;
        Puesto = puesto;
    }

    public bool AutorizaCarnet(string carnet)
    {
        // Lógica para autorizar el carnet
        Console.WriteLine($"Carnet {carnet} autorizado.");
        return true;
    }
}
