package br.com.joaocarloslima;

import java.util.HashMap;
import java.util.Map;

public class Celeiro {
    private int capacidade;
    private Map<Produtos, Integer> estoque;

    public Celeiro(int capacidade) {
        this.capacidade = capacidade;
        this.estoque = new HashMap<>();
    }

    public void armazenar(Produtos produto) {
        if (getOcupacao() < 1) { 
            estoque.put(produto, estoque.getOrDefault(produto, 0) + 1);
        }
    }

    public int getQtde(Produtos produto) {
        return estoque.getOrDefault(produto, 0);
    }

    public double getOcupacao() {
        int total = 0;
        for (int qtde : estoque.values()) {
            total += qtde;
        }
        return (double) total / capacidade;
    }
}