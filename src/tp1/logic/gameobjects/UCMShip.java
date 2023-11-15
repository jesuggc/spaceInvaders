package tp1.logic.gameobjects;

import tp1.logic.Position;
import tp1.logic.Game;
import tp1.logic.Move;

public class UCMShip {
    private int health = 3;
    private int damage = 1;
    private Position position;
    private Game game;

    public UCMShip(Game game, Position position) {
        this.position = position;
        this.game = game;
    }

    public String toString() {
        return "O__O";
    }

    public Position getPosition() {
        return this.position;
    }

    public boolean move(Move toDirection) {
        Position position = new Position(this.position.getRow() + toDirection.getX(), this.position.getCol() + toDirection.getY());
        if (canMove(position)) {
            this.position = position; 
            return true;
        }
        return false;
    }

    public boolean shootLaser() {
        return false;
    }

    public boolean canMove(Position position) {
        return (position.getCol() >= 0 && position.getCol() <= this.game.DIM_X) && (position.getRow() >= 0 && position.getRow() <= this.game.DIM_Y);
    }
}
