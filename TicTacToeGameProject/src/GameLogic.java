public class GameLogic {
	private Player firstPlayer;
	private Player secondPlayer;
	private Board board;
	private ConsoleInputOutput userInterface;

	public GameLogic(ConsoleInputOutput userInterface) {
		try {
			this.userInterface = userInterface;
			board = new Board(this.userInterface);
			setPlayers();
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal arguements");
		}
	}

	public void play() {
		try {
			int move;
			Player currentPlayer = secondPlayer;
			do {
				currentPlayer = changeTurn(currentPlayer);
				board.printBoard();
				move = getMove(currentPlayer);
				board.setBoardCell(move, currentPlayer.getSelectedSymbol());
			} while (!hasWon(currentPlayer, move) && !hasDrawn());

			board.printBoard();
			if (currentPlayer.isWinner()) {
				userInterface.showMesssage(currentPlayer.getName() + " is the winner!!");
			} else {
				userInterface.showMesssage("This game ended up in a draw!!");
			}
		} catch (UnsupportedOperationException e) {
			System.out.println("Unsupported operation");
		}

	}

	private int getMove(Player currentPlayer) {
		try {
			int move;
			move = currentPlayer.move(userInterface);
			while (board.isOccupiedAt(move)) {
				userInterface.showErrorMesssage("Please enter a valid move!!");
				move = currentPlayer.move(userInterface);
			}
			return move;
		} catch (UnsupportedOperationException e) {
			System.out.println("Unsupported arguements");
			return 0;
		}
	}

	private Player changeTurn(Player currentPlayer) {
		try {
			if (currentPlayer.equals(firstPlayer)) {
				currentPlayer = secondPlayer;
			} else {
				currentPlayer = firstPlayer;
			}
			return currentPlayer;
		} catch (UnsupportedOperationException e) {
			System.out.println("Unsupported operation caught");
			return currentPlayer;
		}
	}

	private boolean hasDrawn() {
		// TODO Auto-generated method stub
		return board.isFull();
	}

	private boolean hasWon(Player currentPlayer, int lastCell) {
		try {
			// TODO Auto-generated method stub
			String[] rows = board.getRow(lastCell);
			String[] cols = board.getColumn(lastCell);
			String[][] diagonals = board.getDiagonal();
			if (haveSameElements(rows) || haveSameElements(cols) || haveSameElements(diagonals[0])
					|| haveSameElements(diagonals[1])) {
				currentPlayer.setWinner(true);
				return true;
			}
			return false;

		} catch (IllegalArgumentException e) {
			System.out.println("Illegal arguement");
			return false;
		}
	}

	private boolean haveSameElements(String[] items) {
		try {
			// TODO Auto-generated method stub
			// System.out.println(Arrays.toString(items));
			for (int index = 0; index < items.length - 1; index++) {
				String item = items[index];
				String nextItem = items[index + 1];
				if (item.contentEquals(BoardStates.BOARD_STATE_EMPTY) || !item.contentEquals(nextItem)) {
					return false;
				}
			}
			return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
			return false;
		}
	}

	private void setPlayers() {
		try {
			userInterface.showMesssage("Enter the first player's name: ");
			String firstPlayerName = userInterface.takePlayerInputString();
			firstPlayer = new Player(firstPlayerName, BoardStates.BOARD_STATE_X);
			userInterface.showMesssage("Enter the second player's name: ");
			String secondPlayerName = userInterface.takePlayerInputString();
			secondPlayer = new Player(secondPlayerName, BoardStates.BOARD_STATE_O);
		} catch (SecurityException e) {
			System.out.println("Security exception caught");
		}
	}
}