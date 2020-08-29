package br.fsa.wumpus.cli;
import br.fsa.kernel.Kernel;
import br.fsa.wumpus.interfac.WumpusGame;

public class WumpusCLI implements WumpusGame {

    Kernel game;
    public static final boolean Debug = true;

    @Override
    public boolean shoot() {
        if (game.shoot()) {
            System.out.println("Flecha Atirada");
            return true;
        } else {
            System.out.println("Sem Flecha");
            return false;
        }
    }

    @Override
    public void turnL() {
        game.turnL();
        atualizaBoard();
    }

    @Override
    public void turnR() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void newGame() {
        game = new Kernel();
    }

    private void atualizaBoard() {

        System.out.println("------WUMPUSWORLD------");

        if (Debug) {
            // mostrar tudo que tem nas células
        } else {
            //ocultar seundo matriz de visitação
        }

        int[][] cave = game.getCave();

        for (int i = 0; i < 10; i++) {
            //aqui o professor nao Terminou ;(
        }

    }
}