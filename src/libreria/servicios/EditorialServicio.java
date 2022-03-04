package libreria.servicios;

import java.util.*;
import libreria.entidades.Editorial;

public class EditorialServicio {
    
    public Editorial crearEditorial(){
        
        Scanner scn = new Scanner(System.in);
  
        System.out.println("Ingrese la id de la editorial: ");
        Integer id = scn.nextInt();
        
        System.out.println("Ingrese el nombre de la editorial:");
        String nombre = scn.next();
        
        System.out.println("Ingrese el alta de la editorial");
        boolean alta = scn.nextBoolean();
        
              Editorial editorial = new Editorial(id,nombre,alta);
        
        return editorial;
    }
    
    public Integer buscarID(){
    
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Ingrese el id de la editorial");
        Integer id = scn.nextInt();
        
        return id;
    }
    
    
    
    
}
