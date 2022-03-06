package libreria.persistencia;

import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
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
    
     public Libro buscarPorISBN(Long isbn){
        
        return (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn").setParameter("isbn", isbn).getSingleResult();
    }
     
     public Libro buscarPorTitulo(String titulo){
        
        return (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo").setParameter("titulo", titulo).getSingleResult();
    }
     
     
     public List<Libro> buscarPorAutor(String nombre){
         
         return em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getResultList();
     }
     
     public List<Libro> buscarPorEditorial(String nombre)
     {
         return em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre = :nombre").setParameter("nombre", nombre).getResultList();
     }
    
}
