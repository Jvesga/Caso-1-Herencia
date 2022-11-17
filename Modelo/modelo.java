package Modelo; 

public class Operación
{
    //Atributos
    protected double x;
    protected double y;
    protected double resultados;

    //Constructor
    public Operación(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.resultados=0;
    }

    //Metodos
    public double mostrarResultados()
    {
        return this.resultados;
    }

}