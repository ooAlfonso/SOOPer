package sOOPer.Contenedores;

import sOOPer.enums.TipoContenedor;

public class Bolsa extends Contenedor {
    private int ancho;
    public Bolsa(String referencia, int alto, int ancho) {
        super(referencia, alto);
        this.ancho = ancho;
    }

    @Override
    public int getSuperficie() {
        int radio = getDiametro()/2;
        return (int)(Math.PI * radio * radio);
    }

    @Override
    protected String volumenDisponible() {
        return null;
    }

    private int getDiametro() {
        return (int)(2 * ancho / Math.PI);
    }

    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.BOLSA;
    }
}
