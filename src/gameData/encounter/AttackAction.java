package gameData.encounter;

import gameData.Die;
import gameData.encounter.enums.ActionType;
import gameData.encounter.enums.AttackType;

public class AttackAction extends Action {
    private int numDamage;
    private Die damageDie;
    private int numSubDamage;
    private Die subDamageDie;
    private AttackType attackType;

    public AttackAction(ActionType actionType, String description, int numDamage, Die damageDie, int numSubDamage, Die subDamageDie, AttackType attackType) {
        super(actionType, description);
        this.numDamage = numDamage;
        this.damageDie = damageDie;
        this.numSubDamage = numSubDamage;
        this.subDamageDie = subDamageDie;
        this.attackType = attackType;
    }

    public int getNumDamage() {
        return numDamage;
    }

    public void setNumDamage(int numDamage) {
        this.numDamage = numDamage;
    }

    public Die getDamageDie() {
        return damageDie;
    }

    public void setDamageDie(Die damageDie) {
        this.damageDie = damageDie;
    }

    public int getNumSubDamage() {
        return numSubDamage;
    }

    public void setNumSubDamage(int numSubDamage) {
        this.numSubDamage = numSubDamage;
    }

    public Die getSubDamageDie() {
        return subDamageDie;
    }

    public void setSubDamageDie(Die subDamageDie) {
        this.subDamageDie = subDamageDie;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }
}
