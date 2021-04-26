package chess;

import java.util.List;

import chess.Player.Player;

public class Game {
    private Player[] players;
    private Board board;
    private Player currentTurn;
    private GameStatus status;
    private List<Move> movesPlayed;

    public Game(Player p1, Player p2){
        players[0] = p1;
        players[1] = p2;

        if(p1.isWhiteSide()){
            currentTurn = p1;
        } else {
            currentTurn = p2;
        }

        board = new Board();

        movesPlayed.clear();

        status = GameStatus.ACTIVE;
    }

    public Board getBoard() {
        return board;
    }
    public Player getCurrentTurn() {
        return currentTurn;
    }
    public GameStatus getStatus() {
        return status;
    }

}