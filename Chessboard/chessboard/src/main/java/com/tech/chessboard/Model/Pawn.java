package com.tech.chessboard.Model;

public class Pawn extends ChessPiece{
    
    public Pawn(String position){
        super(position);
    }

    @Override
    public boolean canMove(String newPosition){
        return newPosition.equals(getNextPosition());
    }

    private String getNextPosition() {
        char column = position.charAt(0); // To get the column character, e.g., 'A', 'B'.
        int row = Character.getNumericValue(position.charAt(1)); //To get the row number, e.g., 1, 2, 3.
        return "" + column + (row + 1); // Return the new position
    }
}