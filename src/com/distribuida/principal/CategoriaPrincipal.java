package com.distribuida.principal;

import com.distribuida.entities.Categoria;

public class CategoriaPrincipal {

    public static void main(String[] args) {
        Categoria categoria1 = new Categoria(1, "Novela", "Libros de ficción narrativa");
        Categoria categoria2 = new Categoria(2, "Ciencia", "Libros relacionados con temas científicos");

        System.out.println(categoria1.toString());
        System.out.println(categoria2.toString());
    }
}