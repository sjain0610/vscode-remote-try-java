package com.tech.chessboard.Service;

import com.tech.chessboard.Model.ChessPiece;
import com.tech.chessboard.Model.King;
import com.tech.chessboard.Model.Pawn;
import com.tech.chessboard.Model.Queen;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChessService{
    public List<String> getPossibleMoves(String type, String position){
        
        ChessPiece piece;
        switch(type.toLowerCase()){
            case "pawn":
                piece= new Pawn(position);
                break;
            case "king":
                piece = new King(position);
                break;
            case "queen":
                piece = new Queen(position);
                break;
            default:
                return new ArrayList<>();
        }
        List<String> possibleMoves=new ArrayList<>();
        boolean hasValidMove = false; // Flag to check if any valid move exists

        for (char col = 'A'; col <= 'H'; col++) { 
            for (int row = 1; row <= 8; row++) {
                String newPosition = col + "" + row;
                if (piece.canMove(newPosition)) {
                    possibleMoves.add(newPosition);
                    hasValidMove=true;
                }
            }
        }
        if (!hasValidMove) {
            possibleMoves.add("Invalid move.");
        }
        return possibleMoves;
    }

    public void printChessBoard() {
        for (int row = 8; row >= 1; row--) {
            for (char column = 'A'; column <= 'H'; column++) {
                System.out.print(column + "" + row + " ");
            }
            System.out.println();
        }
    } 
}