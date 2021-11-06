package sOOPer;

import java.util.Set;

public interface IPedido {

    String getReferencia();

    Set<IProducto> getProductos();

    Set<IContenedor> getCOntenedor();

    void addContenedor(IContenedor contenedor);

    IContenedor addProductos(IProducto producto);

}
