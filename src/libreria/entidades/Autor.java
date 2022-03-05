package libreria.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Autor implements Serializable {
    
    @Id
    Integer id;

    String nombre;
    boolean alta;

    public Autor(Integer id, String nombre, boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }

    public Autor() {
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }
    
    @Override
    public String toString(){
        
        String stringARetornar = "id: " +this.id + ", nombre: " + this.nombre + ", alta: " + this.alta;
        
        return stringARetornar;
    }
    
}
