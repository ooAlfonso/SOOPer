package sOOPer;

import java.util.HashSet;
import java.util.Set;

public class Pedido implements IPedido{

    private String referencia;
    private Set<IContenedor> contenedores;

    public Pedido(String referencia) {
        this.referencia = referencia;
        this.contenedores = new HashSet<IContenedor>();
    }
    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public Set<IProducto> getProductos() {
        return null;
    }

    @Override
    public Set<IContenedor> getCOntenedor() {
        return contenedores;
    }

    @Override
    public void addContenedor(IContenedor contenedor) {
        contenedores.add(contenedor);

    }

    @Override
    public IContenedor addProductos(IProducto producto) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("pedido: " + referencia + "\n");
        for (IContenedor contenedor : contenedores) {
            sb.append("\t" + contenedor + "\n");
        }
        return sb.toString();
    }
}
