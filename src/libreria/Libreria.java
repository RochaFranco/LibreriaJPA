package libreria;

import libreria.persistencia.AutorDAO;
import libreria.servicios.AutorServicio;

public class Libreria {

    public static void main(String[] args) {
        
        AutorDAO aDAO = new AutorDAO();
        AutorServicio AS = new AutorServicio();
        
        aDAO.guardar(AS.crearAutor());
        
        
        
    }
    
}
