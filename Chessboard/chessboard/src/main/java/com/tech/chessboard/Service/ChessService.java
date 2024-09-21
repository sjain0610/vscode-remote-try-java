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

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                String newPosition = String.valueOf((char) ('A' + i)) + (j + 1);
                if (piece.canMove(newPosition)) {
                    possibleMoves.add(newPosition);
                }
            }
        }
        return possibleMoves;
    } 
}