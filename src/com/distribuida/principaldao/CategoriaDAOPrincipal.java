package com.distribuida.principaldao;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;

public class CategoriaDAOPrincipal {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);

        List<Categoria> categorias = categoriaDAO.findAll();
        for (Categoria categoria : categorias) {
            System.out.println(categoria.toString());
        }

        context.close();
    }
}
