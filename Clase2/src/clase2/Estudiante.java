package clase2;
public class Estudiante extends Persona {
    
    private String semestre;

    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, String apellido, String semestre) {
        super(nombre, apellido);
        this.semestre = semestre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSemestre:" + this.semestre; // con esto llamo al tostring de persona y solo agrtego lo que quieor es decir semestre
    }
    
    
    
}
