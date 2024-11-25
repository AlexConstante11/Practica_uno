package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public class LibroPrincipal {

    public static void main(String[] args) {
        Categoria categoria = new Categoria(1, "Ficción", "Libros de narrativa ficticia");
        Autor autor = new Autor(1, "Gabriel", "García Márquez", "Colombia", "Calle Real #123", "0998765432", "gabriel@gmail.com");

        Libro libro = new Libro(1, "Cien años de soledad", "Editorial Sudamericana", 500, "Primera", "Español",
                                new Date(), "Una obra maestra de la literatura", "Dura", "978-3-16-148410-0", 100,
                                "imagen.jpg", "Tapa dura", 29.99, categoria, autor);

        System.out.println(libro.toString());
    }
}

