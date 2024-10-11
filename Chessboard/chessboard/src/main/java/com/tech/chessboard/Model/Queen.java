package com.tech.chessboard.Model;

public class Queen extends ChessPiece{
    public Queen(String position){
        super(position);
    }

    @Override
    public boolean canMove(String newPosition) {
        return isSameColumn(newPosition) || isSameRow(newPosition) || isDiagonalMove(newPosition);
    }

    private boolean isSameColumn(String newPosition) {
        return position.charAt(0) == newPosition.charAt(0); // Same column check
    }

    private boolean isSameRow(String newPosition) {
        return position.charAt(1) == newPosition.charAt(1); // Same row check
    }

    private boolean isDiagonalMove(String newPosition) {
        int col = position.charAt(0) - 'A';
        int row = Character.getNumericValue(position.charAt(1));
        
        int newColumn = newPosition.charAt(0) - 'A';
        int newRow = Character.getNumericValue(newPosition.charAt(1));
        
        return Math.abs(row - newRow) == Math.abs(column - newColumn); // Diagonal move check
    }
}
