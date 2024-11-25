package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClienteProncipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente(1,"1725658965","alex","constante","av Pichincha","0987654321","alexconstante@gmail.com");
		Cliente cliente2 = new Cliente(1,"1825658965","pedro","ruiz","av Ilalo","0989898988","pedro@gmail.com");
		
		System.out.println(cliente.toString());
		System.out.println(cliente2.toString());
		
	}

}
