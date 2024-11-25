package com.distribuida.principal;

import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;
import com.distribuida.entities.FacturaDetalle;

import java.util.Date;

public class FacturaDetallePrincipal {

    public static void main(String[] args) {
        Factura factura = new Factura(1, "FAC-001", new Date(), 100.50, 15.30, 116.20, null);
        Libro libro = new Libro(1, "Cien años de soledad", "Editorial Sudamericana", 500, "Primera", "Español",
                                new Date(), "Una obra maestra de la literatura", "Dura", "978-3-16-148410-0", 100,
                                "imagen.jpg", "Tapa dura", 29.99, null, null);

        FacturaDetalle facturaDetalle = new FacturaDetalle(1, 3, 89.97, factura, libro);

        System.out.println(facturaDetalle.toString());
    }
}