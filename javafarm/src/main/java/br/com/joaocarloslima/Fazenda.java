package br.com.joaocarloslima;

public class Fazenda {
    private Terreno[][] terrenos;
    private Celeiro celeiro;

    public Fazenda() {
        terrenos = new Terreno[13][13];
        for (int i = 0; i < terrenos.length; i++) {
            for (int j = 0; j < terrenos[i].length; j++) {
                terrenos[i][j] = new Terreno(i, j);
            }
        }
        celeiro = new Celeiro(100);
        // Inicializa o celeiro com 30 de cada produto
        for (int i = 0; i < 30; i++) {
            celeiro.armazenar(Produtos.batata);
            celeiro.armazenar(Produtos.cenoura);
            celeiro.armazenar(Produtos.morango);
        }
    }

    public void plantar(Planta planta, int x, int y) {
        terrenos[x][y].plantar(planta);
    }

    public void crescerTudo() {
        for (int i = 0; i < terrenos.length; i++) {
            for (int j = 0; j < terrenos[i].length; j++) {
                terrenos[i][j].crescer();
            }
        }
    }

    public void colher(int x, int y) {
        terrenos[x][y].colher(celeiro);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }
    
    // Método getTerreno() adicionado
    public Terreno getTerreno(int x, int y) {
        if (x >= 0 && x < 13 && y >= 0 && y < 13) {
            return terrenos[x][y];
        }
        return null;
    }
}