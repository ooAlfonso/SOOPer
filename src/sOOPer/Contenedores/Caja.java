package sOOPer.Contenedores;

import sOOPer.enums.TipoContenedor;

public class Caja extends Contenedor{

    private int ancho;
    private int largo;

    public Caja(String referencia, int alto, int ancho, int lagro) {
        super(referencia, alto);
        this.ancho = ancho;
        this.largo = lagro;
    }


    @Override
    public int getSuperficie() {
        return ancho * largo;
    }

    @Override
    protected String volumenDisponible() {
        return null;
    }

    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.CAJA;
    }
}
