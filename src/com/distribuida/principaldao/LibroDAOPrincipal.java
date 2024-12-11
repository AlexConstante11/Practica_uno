package com.distribuida.principaldao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.LibroDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Libro;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Autor;

public class LibroDAOPrincipal {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);
        CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
        AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);

        // Add
        Categoria categoria = categoriaDAO.findOne(1);
        Autor autor = autorDAO.findOne(1);

        Libro libro = new Libro();
        libro.setIdLibro(0);
        libro.setTitulo("Nuevo Libro");
        libro.setEditorial("Editorial ABC");
        libro.setNumPaginas(300);
        libro.setEdicion("Primera");
        libro.setIdioma("Español");
        libro.setFechaPublicacion(new java.util.Date());
        libro.setDescripcion("Este es un libro de prueba.");
        libro.setTipoPasta("Dura");
        libro.setIsbn("978-1234567890");
        libro.setNumEjemplares(50);
        libro.setPortada("portada.jpg");
        libro.setPrecio(20.0);
        libro.setCategoria(categoria);
        libro.setAutor(autor);

        // libroDAO.add(libro);

        // Update
        Libro libro2 = libroDAO.findOne(1);
        if (libro2 != null) {
            libro2.setTitulo("Libro Actualizado");
            libro2.setPrecio(25.0);
            // libroDAO.up(libro2);
        }

        // Delete
        // libroDAO.del(1);

        // FindOne
        try {
            System.out.println(libroDAO.findOne(1).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // FindAll
        libroDAO.findAll().forEach(item -> {
            System.out.println(item.toString());
        });

        context.close();
    }
}
