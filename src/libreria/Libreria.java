package libreria;

import libreria.persistencia.AutorDAO;
import libreria.persistencia.EditorialDAO;
import libreria.persistencia.LibroDAO;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Libreria {

    public static void main(String[] args) {
        
        AutorDAO aDAO = new AutorDAO();
        AutorServicio AS = new AutorServicio();
        EditorialServicio ES = new EditorialServicio();
        EditorialDAO eDAO = new EditorialDAO();
        LibroServicio LS = new LibroServicio();
        LibroDAO lDAO = new LibroDAO();
        
        lDAO.guardar(LS.crearLibro());
        
        
    }
    
}
