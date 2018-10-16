
package clase2;


public class Persona {
    
    //ATRIBUTOS
    private String nombre;
    private String apellido;

    //CONSTRUCTOR VACIO 
    public Persona() {
        this.nombre="";
        this.apellido="";
    }

    //CONSTRUCTOR LLENO ESTE ACEPTA COMO PARAMETRO DEL OBJETO LOS ATRIBUTOS
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Nombre:"+this.nombre + "\nApellido:"+this.apellido;
    }
    
 }