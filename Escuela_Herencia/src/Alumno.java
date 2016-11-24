import escuela_h2.Persona;

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
        return "Alumno{" +"Clave: "+getClave()+"Edad: "+edad+"nombre: "+nombre+"prom=" + prom + ", semestre=" + semestre + ", carrera=" + carrera + '}';
    }
    
    
}
