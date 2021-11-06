package sOOPer.Productos;

import sOOPer.IContenedor;
import sOOPer.IProducto;

public abstract class Producto implements IProducto {
    private String referencia;
    private int peso;
    private int volumen;

    public Producto(String referencia, int peso, int volumen){
        this.referencia = referencia;
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public int getPeso() {
        return 0;
    }

    @Override
    public int getVolumen() {
        return 0;
    }

    @Override
    public String getRefencia() {
        return null;
    }

    @Override
    public boolean tengoEspacio(IContenedor contenedor) {
        return false;
    }
}
