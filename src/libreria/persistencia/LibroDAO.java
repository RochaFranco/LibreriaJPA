package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Libro;

public class LibroDAO {
    
    EntityManager em;
    
    public LibroDAO() {
        this.em = em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
    }
    
    public Libro guardar(Libro libro){
         
        em.getTransaction().begin();
        
        em.persist(libro);
        
        em.getTransaction().commit();
        
        return libro;
    }
    
}
