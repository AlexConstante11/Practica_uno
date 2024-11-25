package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente(1,"1725658965","alex","constante","av Pichincha","0987654321","alexconstante@gmail.com");
		Cliente cliente2 = new Cliente(1,"1825658965","pedro","ruiz","av Ilalo","0989898988","pedro@gmail.com");
		
		Factura factura = new Factura();
		
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-001");
		factura.setFecha(new Date());
		factura.setTotalNeto(100.50);
		factura.setIva(15.30);
		factura.setTotal(116.20);
		
		factura.setCliente(cliente2);
		
		System.out.println(factura.toString());
	}

}
