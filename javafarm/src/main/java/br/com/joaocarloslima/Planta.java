package br.com.joaocarloslima;

public class Planta {

    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;
    private Produtos produto;
    private int tamMax;

    public Planta(int tamanho, int tempoDeVida, int tempoDeCrescimento, Produtos produto, int tamMax) {
        this.tamanho = tamanho;
        this.tempoDeVida = tempoDeVida;
        this.tempoDeCrescimento = tempoDeCrescimento;
        this.produto = produto;
        this.tamMax = tamMax;
    }

    public void crescer() {
        tempoDeVida++;

        if (tempoDeVida % tempoDeCrescimento == 0 && tamanho < tamMax) {
            tamanho++;
        }
    }

    public boolean podeColher() {
        return tamanho == tamMax;
    }
    
    public String getImagem() {
        return "images/" + produto + tamanho + ".png";
    }

    public Produtos getProduto() {
        return produto;
    }
}