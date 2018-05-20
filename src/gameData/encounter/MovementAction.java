package gameData.encounter;

import gameData.encounter.enums.ActionType;
import gameData.encounter.enums.MovementType;

public class MovementAction extends Action{
    private int distance;
    private MovementType movementType;

    public MovementAction(String description, int distance, MovementType movementType) {
        super(ActionType.MOVE, description);
        this.distance = distance;
        this.movementType = movementType;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public MovementType getMovementType() {
        return movementType;
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }
}
