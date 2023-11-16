package tp1.control;

import static tp1.view.Messages.debug;

import java.util.Scanner;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.view.GamePrinter;
import tp1.view.Messages;

/**
 *  Accepts user input and coordinates the game execution logic
 */
public class Controller {

	private Game game;
	private Scanner scanner;
	private GamePrinter printer;
	private boolean endByPlayer = false;

	public Controller(Game game, Scanner scanner) {
		this.game = game;
		this.scanner = scanner;
		printer = new GamePrinter(game);
	}

	private String[] prompt() {
		System.out.print(Messages.PROMPT);
		String line = scanner.nextLine();
		String[] words = line.toLowerCase().trim().split("\\s+");

		System.out.println(debug(line));

		return words;
	}

	/**
	 * Runs the game logic
	 */
	public void run() {
		//TODO fill your code
		printGame();
		while(!game.playerWin() && !game.aliensWin() && !endByPlayer) {
			// prompt();
			String[] words = prompt();
			switch(words[0]){
				case "n":
				case "none":
				case "":
					game.update(); 
					printGame();
					break;
				// case "right":
				case "m":
				case "move":
					if(game.moveShip(Move.parse(words[1]))){
						game.update();
						printGame();
					}
					else System.out.println("Movement cannot be performed");

					break;
				case "s":
					if(game.shootLaser()){
						game.update();
						printGame();
					}
					else System.out.println("Laser cannot be shot");

					break;
				case "h":
				case "help":
					printHelp();
				break;
				case "e":
				case "exit":
					endByPlayer = true;
					System.out.println("Players leaves the game");
				break;

					
			}
		}
		//Game.update()?
	}
	private void printHelp() {
		String[] help = Messages.HELP_LINES;
		for (int i=0; i<help.length; i++) {
			System.out.println(help[i]);

		}
	}
	
	private void printGame() {
		System.out.println(printer);
	}
	
	public void printEndMessage() {
		System.out.println(printer.endMessage());
	}
	
}
