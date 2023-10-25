package tp1.logic.gameobjects;

import tp1.logic.Position;
import tp1.logic.Move;

public class UCMShip {
    private int health = 3;
    private int damage = 1;
    private Position position;

    public UCMShip (Position position) {
        this.position = position;
    }
    
    public String toString() {
        return "O__O";
    }   

    public Position getPosition() {
        return this.position;
    }

    public boolean move(Move toDirection) {
        if(canMove(toDirection)) {
            this.position = new Position(this.position.getRow() + toDirection.getX(),this.position.getCol()+ toDirection.getY() );
            return true;
        }
        return false;
    }

    public boolean canMove(Move toDirection) {
        return true;
    }
}
