package com.distribuida.principaldao;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class ClienteDAOPrincipal {

    public static void main(String[] args) {
        // Carga del contexto de Spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Obtención del bean ClienteDAOImpl
        ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);

        // NEW
        Cliente cliente = new Cliente(0, "1723523523", "Alex", "Constante", "Puembo", "0987654321", "alex@constante.com");
        //clienteDAO.add(cliente);

        //UP
        Cliente cliente2 = new Cliente(39, "71723523523", "7Alex", "7Constante", "7Puembo", "70987654321", "7alex@constante.com");
        clienteDAO.up(cliente2);
        
        //DEL
        //clienteDAO.del(39);
        
        //FINDONE

        try {
        	
        	Cliente cliente3 = clienteDAO.findOne(39);
        	System.out.println(cliente3.toString());
        } catch (Exception e) {
        	//TODO: handle exception
        	e.printStackTrace();
        }
        
        // FINDALL
        
        List<Cliente> clientes = clienteDAO.findAll();

        for (Cliente item : clientes) {
            System.out.println(item.toString());
        }

        // Cierre del contexto
        context.close();
    }
}
