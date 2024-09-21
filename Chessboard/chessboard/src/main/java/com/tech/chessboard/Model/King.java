package com.tech.chessboard.Model;

public class King extends ChessPiece{
    public King(String position){
        super(position);
    }

    @Override
    public boolean canMove(String newPosition){
        char column = position.charAt(0);
        int row = Character.getNumericValue(position.charAt(1));

        char newColumn = newPosition.charAt(0);
        int newRow = Character.getNumericValue(position.charAt(1));

        return Math.abs(newRow-row)<=1 && Math.abs(newColumn-column)<=1;    //king move only one step
    }
}