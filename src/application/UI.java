package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessPiece;
import chess.ChessPosition;
import chess.Color;

public class UI {

	

		// https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

		final static String ANSI_RESET = "\u001B[0m";
		final String ANSI_BLACK = "\u001B[30m";
		final String ANSI_RED = "\u001B[31m";
		final String ANSI_GREEN = "\u001B[32m";
		final static String ANSI_YELLOW = "\u001B[33m";
		final String ANSI_BLUE = "\u001B[34m";
		final String ANSI_PURPLE = "\u001B[35m";
		final String ANSI_CYAN = "\u001B[36m";
		final static String ANSI_WHITE = "\u001B[37m";

		final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
		final String ANSI_RED_BACKGROUND = "\u001B[41m";
		final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
		final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
		final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
		final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
		final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
		final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
		
		
		// https://stackoverflow.com/questions/2979383/java-clear-the-console
		public static void clearScreen() { 
		 System.out.print("\033[H\033[2J"); 
		 System.out.flush(); 
		}

		
		/*final String RESET = "\033[0m";  // Text Reset final String 
	    // Regular Colors
	     final String BLACK = "\033[0;30m";   // BLACK
	     final String RED = "\033[0;31m";     // RED
	     final String GREEN = "\033[0;32m";   // GREEN
	     final String YELLOW = "\033[0;33m";  // YELLOW
	     final String BLUE = "\033[0;34m";    // BLUE
	     final String PURPLE = "\033[0;35m";  // PURPLE
	     final String CYAN = "\033[0;36m";    // CYAN
	     final String WHITE = "\033[0;37m";   // WHITE
		
		
		
		     final String BLACK_BACKGROUND;   
		     final String RED_BACKGROUND;     
		     final String GREEN_BACKGROUND;   
		     final String YELLOW_BACKGROUND;  
		     final String BLUE_BACKGROUND;    
		     final String MAGENTA_BACKGROUND; 
		     final String CYAN_BACKGROUND;    
		     final String WHITE_BACKGROUND;*/
		
		public static ChessPosition readChessPosition(Scanner sc) {
			try {
			String s = sc.next();
			char column = s.charAt(0);
			int row = Integer.parseInt(s.substring(1));
			return new ChessPosition(column, row);
			} catch(RuntimeException e) {
				throw new InputMismatchException("Erro reading ChessPosition. Valid values from a1 at h8.");
			}
		}
		
		    
	public  static  void  printBoard ( ChessPiece [] [] pieces ) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);

			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");

	}



	private static void printPiece(ChessPiece piece) {
    	if (piece == null) {
            System.out.print("-");
        }
        else {
            if (piece.getColor() == Color.WHITE) {
                System.out.print( ANSI_WHITE + piece + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_YELLOW + piece + ANSI_RESET);
            }
        }
        System.out.print(" ");
	}
	
	
	

}
