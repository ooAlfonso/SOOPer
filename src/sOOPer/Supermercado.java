package sOOPer;

import sOOPer.Contenedores.Bolsa;
import sOOPer.Contenedores.Caja;
import sOOPer.Productos.Congelado;
import sOOPer.Productos.Fresco;
import sOOPer.Productos.Higiene;

public class Supermercado {

    public static void main(String[] args) {
    IPedido miPedido = new Pedido("pedido001");
    IContenedor bolsa = new Bolsa("Bill", 40, 25);
    IContenedor caja = new Caja("C22", 40, 25, 75);
    System.out.printf("Bolsa: " + bolsa);
    System.out.printf("Caja: " + caja);

    miPedido.addContenedor(bolsa);
    miPedido.addContenedor(caja);
    System.out.println("Mi pedido con contenedores: " + miPedido);
    IProducto manzanas = new Fresco("MNZ", 1000, 1500);
    IProducto helado = new Congelado("HLD", 800, 1000);
    IProducto papelWC = new Higiene("PWC", 500, 2500);
    IProducto peras = new Fresco("PER", 800, 1200);
    System.out.printf("Mi pedido con productos: " + miPedido);


    }
}
