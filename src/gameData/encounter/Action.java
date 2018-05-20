package gameData.encounter;

import gameData.encounter.enums.ActionType;

public class Action {
    private ActionType actionType;
    private String description;

    public Action() {
    }

    public Action(ActionType actionType, String description) {
        this.actionType = actionType;
        this.description = description;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
