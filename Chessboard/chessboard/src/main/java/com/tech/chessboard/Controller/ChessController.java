package com.tech.chessboard.Controller;

import com.tech.chessboard.Chessboard;
import com.tech.chessboard.Service.ChessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chess")
public class ChessController{

    @Autowired
    public ChessService chessService;
    
    @GetMapping("/moves")
    public List<String> getMoves(@RequestParam String type,@RequestParam String position){
        return chessService.getPossibleMoves(type, position);
    }

    @GetMapping("/board")
    public void displayBoard() {
        Chessboard chessboard = new Chessboard();
        chessboard.printChessBoard();
    }
}