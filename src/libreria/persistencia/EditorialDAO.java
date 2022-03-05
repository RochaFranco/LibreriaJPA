package libreria.persistencia;

import javax.persistence.*;
import libreria.entidades.Editorial;

public class EditorialDAO {
    
    EntityManager em;
    
    public EditorialDAO() {
        this.em = em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
    }

    public Editorial guardar(Editorial editorial){
         
        em.getTransaction().begin();
        
        em.persist(editorial);
        
        em.getTransaction().commit();
        
        return editorial;
    }
    
        public Editorial buscarPorID(Integer id){
        return em.find(Editorial.class, id);
    }
        
        
    
}
