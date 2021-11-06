package sOOPer;

import sOOPer.enums.TipoContenedor;

import java.util.Set;

public interface IContenedor {

    int getReferencia();

    int getVolumen();

    int getSuperficie = 0;

    int VolumenDisponible();

    int getResistencia();

    Set<IProducto> getProductos();

    TipoContenedor getTipo();

    boolean meter(IProducto producto);

    boolean resiste(IProducto producto);
}
