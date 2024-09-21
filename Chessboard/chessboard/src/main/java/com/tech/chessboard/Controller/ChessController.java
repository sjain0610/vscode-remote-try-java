package com.tech.chessboard.Controller;

import com.tech.chessboard.Service.ChessService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chess")
public class ChessController{

    ChessService chessService=new ChessService();
    
    @GetMapping("/moves")
    public List<String> getMoves(String type,String position){
        return chessService.getPossibleMoves(type, position);
    }

    @GetMapping("/board")
    public void displayBoard() {
        chessService.printChessBoard();
    }
}