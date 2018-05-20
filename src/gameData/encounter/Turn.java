package gameData.encounter;

public class Turn {
    private Action action;
    private Action bonusAction;
    private Action movement;
    private Action attack;
    private int numAttacksLeft;

    public Turn(Action action, Action bonusAction, Action movement, Action attack, int numAttacksLeft) {
        this.action = action;
        this.bonusAction = bonusAction;
        this.movement = movement;
        this.attack = attack;
        this.numAttacksLeft = numAttacksLeft;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Action getBonusAction() {
        return bonusAction;
    }

    public void setBonusAction(Action bonusAction) {
        this.bonusAction = bonusAction;
    }

    public Action getMovement() {
        return movement;
    }

    public void setMovement(Action movement) {
        this.movement = movement;
    }

    public Action getAttack() {
        return attack;
    }

    public void setAttack(Action attack) {
        this.attack = attack;
    }

    public int getNumAttacksLeft() {
        return numAttacksLeft;
    }

    public void setNumAttacksLeft(int numAttacksLeft) {
        this.numAttacksLeft = numAttacksLeft;
    }
}
