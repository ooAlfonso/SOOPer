package sOOPer.Contenedores;

import sOOPer.IContenedor;
import sOOPer.IProducto;

import java.util.HashSet;
import java.util.Set;

public abstract class Contenedor implements IContenedor {

    private String referencia;
    private int alto;
    private HashSet<IProducto> productos;

    public Contenedor(String referencia, int alto) {
        this.referencia = referencia;
        this.alto = alto;
        productos = new HashSet<IProducto>();
    }

    @Override
    public int getReferencia() {
        return alto * getSuperficie();
    }

    public abstract int getSuperficie();


    @Override
    public int getVolumen() {
        return 0;
    }
    @Override
    public int VolumenDisponible() {
        return 0;
    }

    @Override
    public int getResistencia() {
        return 0;
    }

    @Override
    public Set<IProducto> getProductos() {
        return null;
    }

    @Override
    public boolean meter(IProducto producto) {
        return false;
    }

    @Override
    public boolean resiste(IProducto producto) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("contenedor " + referencia + " [" + getTipo()+ "] (sup" + getSuperficie() + "cm2 - vol" + getVolumen() + "cm3 - resistencia " + getResistencia());
        if (productos.isEmpty()) {
            sb.append("\t\tvacio\n");
        }
        for (IProducto p : productos) {
            sb.append("\t\t" + p + "\n");
        }
        sb.append("\t\t>> Disponible vol" + volumenDisponible() + "cm3");
        return sb.toString();
    }

    protected abstract String volumenDisponible();
}
