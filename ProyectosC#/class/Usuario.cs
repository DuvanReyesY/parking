public class Usuario
{
    internal object nombre;

    private int Id { get; set; }
    private string Nombre { get; set; }
    private string TipoUsuario { get; set; }   // "Estudiante", "Maestro", "Funcionario"
    private string Carnet { get; set; }

    public Usuario(int id, string nombre, string tipoUsuario, string carnet)
    {
        Id = id;
        Nombre = nombre;
        TipoUsuario = tipoUsuario;
        Carnet = carnet;
    }

    public bool Entrar(Parqueadero parqueadero)
    {
        // Lógica para entrar al parqueadero
        Console.WriteLine($"{Nombre} ha entrado al parqueadero.");
        return true;
    }

    public bool Salir(Parqueadero parqueadero)
    {
        // Lógica para salir del parqueadero
        Console.WriteLine($"{Nombre} ha salido del parqueadero.");
        return true;
    }
}
