package escuela_h2;

public class Persona 
{
    public int edad;
    private int clave;
    protected String nombre;
    private String tipo;

    public Persona(int edad, int clave, String nombre, String tipo) 
    {
        this.edad = edad;
        this.clave = clave;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String toString() 
    {
        return "edad=" + edad + ", clave=" + clave + ", nombre=" + nombre + ", tipoo=" + tipo;
    }

    public int getEdad() 
    {
        return edad;
    }

    public int getClave() 
    {
        return clave;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getTipo() 
    {
        return tipo;
    }
    
    
    
}
