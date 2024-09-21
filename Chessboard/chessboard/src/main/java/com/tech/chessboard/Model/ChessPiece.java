package com.tech.chessboard.Model;

public abstract class ChessPiece {
    protected String position;

    public ChessPiece(String position) {
        this.position = position;
    }

    public abstract boolean canMove(String newPosition);
    
    public void move(String newPosition) {
        if (canMove(newPosition)) {
            this.position = newPosition;
        } else {
            throw new IllegalArgumentException("Invalid move");
        }
    }

    public String getPosition() {
        return position;
    }
}