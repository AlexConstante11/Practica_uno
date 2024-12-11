package com.distribuida.principaldao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class FacturaDetalleDAOPrincipal {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        FacturaDetalleDAO facturaDetalleDAO = context.getBean("facturaDetalleDAOImpl", FacturaDetalleDAO.class);
        FacturaDAO facturaDAO = context.getBean("facturaDAOImpl", FacturaDAO.class);
        LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);

        // Add
        Factura factura = facturaDAO.findOne(1);
        Libro libro = libroDAO.findOne(1);

        FacturaDetalle facturaDetalle = new FacturaDetalle();
        facturaDetalle.setIdFacturaDetalle(0);
        facturaDetalle.setCantidad(2);
        facturaDetalle.setSubtotal(50.0);
        facturaDetalle.setFactura(factura);
        facturaDetalle.setLibro(libro);

        // facturaDetalleDAO.add(facturaDetalle);

        // Update
        FacturaDetalle facturaDetalle2 = facturaDetalleDAO.findOne(1);
        if (facturaDetalle2 != null) {
            facturaDetalle2.setCantidad(3);
            facturaDetalle2.setSubtotal(75.0);
            // facturaDetalleDAO.up(facturaDetalle2);
        }

        // Delete
        // facturaDetalleDAO.del(1);

        // FindOne
        try {
            System.out.println(facturaDetalleDAO.findOne(1).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // FindAll
        facturaDetalleDAO.findAll().forEach(item -> {
            System.out.println(item.toString());
        });

        context.close();
    }
}
