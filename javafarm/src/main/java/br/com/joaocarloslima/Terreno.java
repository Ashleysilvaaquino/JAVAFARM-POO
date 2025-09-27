package br.com.joaocarloslima;

public class Terreno {
    private int x, y;
    private Planta planta;
    private boolean ocupado;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
        this.ocupado = false;
    }

    public void plantar(Planta planta) {
        if (!ocupado) {
            this.planta = planta;
            this.ocupado = true;
        }
    }

    public void crescer() {
        if (ocupado && planta != null) {
            planta.crescer();
        }
    }

    public void colher(Celeiro celeiro) {
        if (ocupado && planta != null && planta.podeColher()) {
            celeiro.armazenar(planta.getProduto());
            this.planta = null;
            this.ocupado = false;
        }
    }

    public boolean isOcupado() {
        return ocupado;
    }
    
   
    public Planta getPlanta() {
        return planta;
    }
}