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
	public void testPawnMovement() {
		Pawn pawn=new Pawn("G2");

		//valid move
		assertTrue(pawn.canMove("G3"),"Pawn can only move one step i.e. G3 from G2");

		//invalid move
		assertFalse(pawn.canMove("G4"), "Pawn cannot move to G4 from G2");
		
		//invalid move
		assertFalse(pawn.canMove("A8"), "Chessboard limit exceeds");
	}
	@Test
	public void testKingMovement(){
        King king=new King("D5");
		
		//valid move
		assertTrue(king.canMove("C4"),"King can move one step i.e. C4 from D5");

		//invalid move
		assertFalse(king.canMove("F5"), "King cannot move to F5 from D5");	
	}
	@Test
	public void testQueenMovement(){
        Queen queen=new Queen("E4");
		
		//valid move
		assertTrue(queen.canMove("E7"),"queen can move to E7 from E4");   

		//invalid move
		assertFalse(queen.canMove("H8"), "queen cannot move to H8 from E4");	
	}

}
