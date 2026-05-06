package setgetscanner;

public class Persona {
    // Atributos de la clase Persona
    String nombre;
    String apellido;
    int edad;
    
    // SETers y GETers
    void setNombre (String nom){
        this.nombre=nom;
    }
    void setApellido (String cognom){
        this.apellido=cognom;
    }
    void setEdad (int edat){
        this.edad=edat;
    }
    String getNombre (){
        return(this.nombre);
    }
    String getApellido (){
        return(this.apellido);
    }
    int getEdad (){
        return(this.edad);
    }
    
    // Método para devolver la información de los atributos
    String obtenerInfo(){
        return(this.nombre + " " + this.apellido + " tiene " + this.edad + ".");
    }
}
