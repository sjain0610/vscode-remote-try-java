package com.tech.chessboard;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.tech.chessboard.Controller.ChessController;

@SpringBootApplication
public class ChessboardApplication {
	public static void main(String[] args) {	
	    
		ChessController chessController=new ChessController();

		//chessController.displayBoard();

		Scanner sc=new Scanner(System.in);
        System.out.println("Select the type King, Queen, Pawn");
		String type=sc.nextLine();
		System.out.println("Enter the position G1, H1..");
		String position=sc.nextLine();
		
		List<String> possibleMoves = chessController.getMoves(type, position);
		for(String moves:possibleMoves){
			System.out.print(moves+", ");
		}
	}

}
