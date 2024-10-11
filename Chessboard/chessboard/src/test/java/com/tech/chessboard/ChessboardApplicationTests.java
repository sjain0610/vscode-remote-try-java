package com.tech.chessboard;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tech.chessboard.Model.King;
import com.tech.chessboard.Model.Pawn;
import com.tech.chessboard.Model.Queen;

@SpringBootTest
class ChessboardApplicationTests {

    @Test
	public void testPawnValidMovement() {
		ChessPiece pawn=new Pawn("G2");

		//valid move
		assertTrue(pawn.canMove("G3"),"Pawn can only move one step i.e. G3 from G2");
	}

	@Test
	public void testPawnInvalidMovement() {
		ChessPiece pawn=new Pawn("G2");

		//invalid move
		assertFalse(pawn.canMove("G4"), "Pawn cannot move to G4 from G2");
	}

	@Test
	public void testKingValidMovement(){
        ChessPiece king=new King("E4");
		
		assertTrue(king.canMove("E5"), "King can move up by one");
        assertTrue(king.canMove("F4"), "King can move right by one");

	}

	@Test
	public void testKingInvalidMovement(){
		ChessPiece king=new King("E4");
       assertFalse(king.canMove("E6"), "King cannot move more than one square vertically");
	}

	@Test
	public void testQueenValidMovement(){
        Queen queen=new Queen("E4");
		//valid move
		assertTrue(queen.canMove("E7"),"queen can move to E7 from E4");   
	}

	@Test
	public void testQueenInvalidMovement(){
        Queen queen=new Queen("E4");
		//invalid move
		assertFalse(queen.canMove("H8"), "queen cannot move to H8 from E4"); 
	}	
}
