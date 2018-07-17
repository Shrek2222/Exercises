package ch8;

import java.util.Random;

public class TicTac {
	//initializes to zero, 1 = X and -1 for 0
	private final static int X = 1;
	private final static int O = 2;
	private int[][] holders = new int[3][3];
	private void paint() {
		for(int i = 0;i < holders.length; ++i) {
			drawSolidLine();
			drawPlayerLine(holders[i]);
		}
		drawSolidLine();
	}

	private void drawPlayerLine(int[] choice) {
		for(int i = 0;i < choice.length ; ++i) {			
			String str = "";
			switch(choice[i]) {
			case 0: 
				str = " "; break;
			case X:
				str = "X"; break;
			default:
				str = "0"; 
			}
			System.out.printf("| %s ", str);
		}
		System.out.println("|");

	}

	private void drawSolidLine() {		
		System.out.println("-------------");
	}
	/**
	 * return 0 for continue; 1 for draw and 2 for win;
	 * @return
	 */
	private int getResult(int player) {
		if(didPlayerWin(player)) {
			return 2;
		} else if(isItADraw()) {
			return 1;
		}
		return 0;
	}
	//if all elements are not zero, it's a draw
	private boolean isItADraw() {
		boolean notDraw = false;
		outer: for (int[] roVal : holders) {
			for (int val : roVal) {
				notDraw = val == 0;
				if(notDraw) break outer;
			}
		}
		return !notDraw;
	}

	private boolean didPlayerWin(int player) {
		boolean win = false ;
		//check all rows
		for(int i = 0;i<holders.length;++i) {
			win = true;
			for(int x:holders[i]) {				 
				win = win & player == x;
				//optimizer code to break when first mismatch occurs
				if(!win) break;
			}	
			if(win) break;
		}
		//check all columns
		if(!win) {
			 for(int i = 0;i<holders.length;++i) {
				win = true;
				for(int j = 0;j<holders[i].length;++j) {				 
					win = win & player == holders[j][i];
					//optimizer code to break when first mismatch occurs
					if(!win) break ;
				}
				if(win) break;
			}
		}
		return win;		
	}

	public static void main(String[] args) {
		TicTac game = new TicTac();
		game.populate();
		

	}

	private void populate() {
		
//		 for(int i = 0;i<holders.length;++i) holders[i][1]= X;
//		System.out.println("Win? "+didPlayerWin(X));
//		paint();
//		
		Random rand = new Random();
		end: for(int i = 0;i<holders.length;++i) {
			for(int j = 0; j< holders[i].length;++j) {
				int player = rand.nextBoolean()?X:O;
				holders[i][j] = player;
				paint();
				if (didPlayerWin(player)){
					System.out.printf("Whoo hoo, %d you won ", player);
					break end;
				}
				if(isItADraw()) {
					System.out.println("It's a draw");
					break end;	
				}
			}
		}
		
	}

}
