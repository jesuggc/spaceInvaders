package tp1.logic.gameobjects;

import tp1.logic.Position;

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
}
