 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marguellc
 */
public class Alumno extends Persona{
    private int prom;
    private int semestre;
    private String carrera;
    
    public Alumno(int clave, int edad,String nombre, String tipo,String carrera, int prom,int semestre)
    {
        super(edad,clave,nombre,tipo);
        this.prom = prom;
        this.semestre =  semestre;
        this.carrera = carrera;
    }

    public int getProm() {
        return prom;
    }

    public int getSemestre() {
        return semestre;
    }
    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" +"Clave: "+getClave()+"Edad: "+getEdad()+"nombre: "+getNombre()+"prom=" + prom + ", semestre=" + semestre + ", carrera=" + carrera + '}';
    }
    
    
}
