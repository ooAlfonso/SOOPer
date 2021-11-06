package sOOPer.Productos;

import sOOPer.IProducto;
import sOOPer.enums.Categoria;

public class Higiene extends Producto{
    public Higiene(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.HIGIENE;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        return false;
    }
}
