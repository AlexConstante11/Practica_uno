package com.distribuida.principaldao;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class AutorDAOPrincipal {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);

        List<Autor> autores = autorDAO.findAll();
        for (Autor autor : autores) {
            System.out.println(autor.toString());
        }

        context.close();
    }
}
