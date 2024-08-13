public class Funcionario : Usuario
{
    public Funcionario(int id, string nombre, string carnet)
        : base(id, nombre, "Funcionario", carnet)
    {
    }

    public void ReservarCubiculo(Cubiculo cubiculo)
    {
        cubiculo.Reservar(this);
    }
}
