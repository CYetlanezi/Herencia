/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marguellc
 */
public class Persona 
{
    private int edad;
    private int clave;
    private String nombre;
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
