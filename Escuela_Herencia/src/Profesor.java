/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marguellc
 */
public class Profesor extends Persona
{
    private int sueldo,antiguedad;
    private String depto;
    
    public Profesor(int clave, int edad, String nombre, String tipo, String depto, int sueldo, int antiguedad)
    {
        super(edad, clave, nombre,tipo);
        this.sueldo = sueldo;
        this.depto = depto;
        this.antiguedad = antiguedad;
    }

    public int getSueldo() {
        return sueldo;
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }

    public String getDepto() {
        return depto;
    }

    @Override
    public String toString() {
        return "Profesor{"  +"Clave: "+getClave()+"Edad: "+getEdad()+"nombre: "+getNombre()+ "sueldo=" + sueldo + ", antiguedad=" + antiguedad + ", depto=" + depto + '}';
    }
    
}
