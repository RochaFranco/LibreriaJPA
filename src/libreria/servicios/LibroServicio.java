package libreria.servicios;

import libreria.entidades.Libro;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.EditorialDAO;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import java.util.*;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;

public class LibroServicio {
    
        AutorDAO aDAO = new AutorDAO();
        AutorServicio AS = new AutorServicio();
        EditorialServicio ES = new EditorialServicio();
        EditorialDAO eDAO = new EditorialDAO();
    
  public Libro crearLibro(){
      
      Scanner scn = new Scanner(System.in);
      
      System.out.println("Ingrese el ISBN del libro");
      long isbn = scn.nextLong();
      
      System.out.println("ingrese el titulo del libro");
      String titulo  = scn.next();
      
      System.out.println("Ingrese el año del libro");
      Integer anio = scn.nextInt();
      
      System.out.println("Ingrese los ejemplares del libro");
      Integer ejemplares = scn.nextInt();
      
      System.out.println("Ingrese los ejemplares prestados");
      Integer ejemplaresPrestados = scn.nextInt();
      
      System.out.println("Ingrese los ejemplares restantes");
      Integer ejempalresRestantes = scn.nextInt();
      
      boolean alta = true;
      
      System.out.println("Ingrese el autor");
       Autor autor = aDAO.buscarPorID(AS.buscarID());
      
      System.out.println("Ingrese la editorial");
      Editorial editorial = eDAO.buscarPorID(ES.buscarID());
      
      Libro libro = new Libro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejempalresRestantes, alta, autor, editorial);
      
      return libro;
  }
  
      public Long buscarISBN(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro:");
        Long ISBN =  scn.nextLong();
        return ISBN;
    }
      
      public String buscarTitulo(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro:");
        String titulo =  scn.next();
        return titulo;
    }
    
}
