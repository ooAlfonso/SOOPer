package sOOPer;

import sOOPer.enums.Categoria;

public interface IProducto {

    String getRefencia();

    int getPeso();

    int getVolumen();

    Categoria getCategoria();

    boolean esCompatible(IProducto p);

    boolean tengoEspacio(IContenedor contenedor);



}
