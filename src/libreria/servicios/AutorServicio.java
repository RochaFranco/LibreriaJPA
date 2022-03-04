package libreria.servicios;

import java.util.*;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {
    
    AutorDAO aDAO = new AutorDAO();
    
    public Autor crearAutor(){
        
        Scanner scn = new Scanner(System.in);
  
        System.out.println("Ingrese la id del autor: ");
        Integer id = scn.nextInt();
        
        System.out.println("Ingrese el nombre del autor:");
        String nombre = scn.next();
        
        System.out.println("Ingrese el alta del autor");
        boolean alta = scn.nextBoolean();
        
              Autor autor = new Autor(id,nombre,alta);
        
        return autor;
    }
    
    public Integer buscarID(){
    
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Ingrese el id del Autor");
        Integer id = scn.nextInt();
        
        return id;
    }
   
    
    
}
