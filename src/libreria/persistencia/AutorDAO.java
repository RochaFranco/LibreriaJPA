package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Autor;


public class AutorDAO {

    EntityManager em;
    
    public AutorDAO() {
        this.em = em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
    }

    public Autor guardar(Autor autor){
         
        em.getTransaction().begin();
        
        em.persist(autor);
        
        em.getTransaction().commit();
        
        return autor;
    }
    
    public Autor buscarPorID(Integer id){
        return em.find(Autor.class, id);
    }
    
    public Autor buscarPorNombre(String nombre){
        
        return (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
    }

    
}
