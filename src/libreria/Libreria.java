package libreria;

import libreria.persistencia.AutorDAO;
import libreria.persistencia.EditorialDAO;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;

public class Libreria {

    public static void main(String[] args) {
        
        AutorDAO aDAO = new AutorDAO();
        AutorServicio AS = new AutorServicio();
        EditorialServicio ES = new EditorialServicio();
        EditorialDAO eDAO = new EditorialDAO();
        
        //aDAO.guardar(AS.crearAutor());
        
        eDAO.guardar(ES.crearEditorial());
        
        
        
    }
    
}
