package com.tech.chessboard.Model;

public class King extends ChessPiece{
    public King(String position){
        super(position);
    }
    @Override
    public boolean canMove(String newPosition) {
        return newPosition.equals(getNextPositions()[0]) || 
               newPosition.equals(getNextPositions()[1]) ||
               newPosition.equals(getNextPositions()[2]) || 
               newPosition.equals(getNextPositions()[3]) ||
               newPosition.equals(getNextPositions()[4]) || 
               newPosition.equals(getNextPositions()[5]) ||
               newPosition.equals(getNextPositions()[6]) || 
               newPosition.equals(getNextPositions()[7]);
    }

    private String[] getNextPositions() {
        char column = position.charAt(0);
        int row = Character.getNumericValue(position.charAt(1));
        
        return new String[]{
            "" + column + (row + 1), // Up
            "" + column + (row - 1), // Down
            "" + (char) (column - 1) + row, // Left
            "" + (char) (column + 1) + row, // Right
            "" + (char) (column - 1) + (row + 1), // Up-Left
            "" + (char) (column - 1) + (row - 1), // Down-Left
            "" + (char) (column + 1) + (row + 1), // Up-Right
            "" + (char) (column + 1) + (row - 1) // Down-Right
        };
    }
}