package com.tech.chessboard.Model;

public class Queen extends ChessPiece{
    public Queen(String position){
        super(position);
    }

    @Override
    public boolean canMove(String newPosition){
        char column = position.charAt(0);
        int row = Character.getNumericValue(position.charAt(1));

        char newColumn = newPosition.charAt(0);
        int newRow = Character.getNumericValue(position.charAt(1));

        return (column==newColumn || row==newRow ||
        Math.abs(row-newRow)== Math.abs(column-newColumn));    //Queen move any number of position in any direction
    }
}