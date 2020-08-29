package br.fsa.kernel;
import java.util.Random;
import br.fsa.wumpus.interfac.WumpusGame;
import java.util.Random;

public class Kernel {

	    public static final int EAST = 1;
	    public static final int SOUTH = 2;
	    public static final int WEST = 3;
	    public static final int NORTH = 0;
	    public static final int J = 1;
	    public static final int O = 1 << 1;
	    public static final int W = 1 << 2;
	    public static final int P = 1 << 3;
	    public static final int B = 1 << 4;
	    public static final int F = 1 << 5;
	    public static final int C = 1 << 6;

	    Random random;
	    private int[][] cave;
	    private boolean visit;
	    private boolean arrow;
	    private int dir;
	    private boolean wumpus;

	public Kernel() {

		cave = new int[4][4];
		arrow = true;
		wumpus = true;
		dir = EAST;
		cave[3][0] = J;
		newGame();
		random = new Random();

	}

	public void newGame() {

		startBoard();

	}

	private void startBoard() {

		putGold();
		putWumpus();
		putPit();
		putSensors();
	}

	private void putGold() {
		int x = 0;
		int y = 0;
		do {
			x = random.nextInt(4);
			y = random.nextInt(4);
		} while ((x > 2 && y < 2) || (x < 2 && y >= 2));
		cave[x][y] |= 0;

	}

	private void putWumpus() {

	}

	private void putPit() {

	}

	private void putSensors() {

	}

	public boolean shoot() {
		if (arrow) {

			arrow = false;
			if (testShoot()) {
				return true;

			}

		}
		return false;
	}

	private boolean testShoot() {

		return true;

	}

	private int[] getPlayerPos() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if ((cave[i][j] & J) == J) {
					int[] r = new int[] { i, j };
					return r;
				}
			}
		}
		int[] r = new int[] { -1, -1 };
		return r;

	}

	public void turnR() {

		dir = ++dir % 4;

	}

	public void turnL() {

		dir--;
		if (dir < 0) {

			dir = 3;

		}

	}
	/*
	 public void walk(){
	        
			x,y = posPlayer();
	        removerPlayer();
	        
	        if (dir == WEST) {
	            x--;
	            visit[x][y] = true;
	        }
	    
	    }
	
	*/
	public int [][] getCave(){
	    
	    
	    return cave;
	    }


}
