// The programs generates a Tic Tac Toe board game.

import acm.program.*;

import java.awt.Color;

import acm.graphics.*;

public class TicTacToeBoard extends GraphicsProgram {
	public void run() {
		setSize(400, 400);
		GRect rect = new GRect(getWidth()/2, getHeight()/2, BOARD_SIZE, BOARD_SIZE);
		rect.setFilled(true);
		rect.setColor(Color.WHITE);
		add(rect);
		add(new GLine(BOARD_SIZE - 80, BOARD_SIZE - 35, BOARD_SIZE + 80, BOARD_SIZE - 35));
		add(new GLine(BOARD_SIZE - 80, BOARD_SIZE + 35, BOARD_SIZE + 80, BOARD_SIZE + 35));
		add(new GLine(BOARD_SIZE - 30, BOARD_SIZE - 100, BOARD_SIZE - 30, BOARD_SIZE + 100));
		add(new GLine(BOARD_SIZE + 30, BOARD_SIZE + 100, BOARD_SIZE + 30, BOARD_SIZE - 100));
	}

	// Constant to define the heigh and width of the figure
	private static final int BOARD_SIZE = 200;
}
