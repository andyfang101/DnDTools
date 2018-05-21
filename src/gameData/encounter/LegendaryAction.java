package gameData.encounter;

import gameData.enums.ActionType;

public class LegendaryAction extends Action {
    private int cooldown;
    private AttackAction attackAction;

    public LegendaryAction(ActionType actionType, String description, int cooldown) {
        super(ActionType.LEGENDARY, description);
        this.cooldown = cooldown;
    }

    public LegendaryAction(ActionType actionType, String description, int cooldown, AttackAction attackAction) {
        super(ActionType.LEGENDARY, description);
        this.cooldown = cooldown;
        this.attackAction = attackAction;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public AttackAction getAttackAction() {
        return attackAction;
    }

    public void setAttackAction(AttackAction attackAction) {
        this.attackAction = attackAction;
    }
}
