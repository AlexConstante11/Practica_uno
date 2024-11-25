package com.distribuida.principal;

import com.distribuida.entities.Autor;

public class AutorPrincipal {

    public static void main(String[] args) {
        Autor autor1 = new Autor(1, "Gabriel", "García Márquez", "Colombia", "Calle Real #123", "0998765432", "gabriel@gmail.com");
        Autor autor2 = new Autor(2, "J.K.", "Rowling", "Reino Unido", "Privet Drive", "0987654321", "jkrowling@gmail.com");

        System.out.println(autor1.toString());
        System.out.println(autor2.toString());
    }
}