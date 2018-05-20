package gameData.encounter.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Status {
    NORMAL,
    BLINDED,
    CHARMED,
    DEAFENED,
    FATIGUED,
    FRIGHTENED,
    GRAPPLED,
    INCAPACITATED,
    INVISIBLE,
    PARALYZED,
    POISONED,
    PRONE,
    RESTRAINED,
    STUNNED,
    UNCONSCIOUS,
    EXHAUSTION1,
    EXHAUSTION2,
    EXHAUSTION3,
    EXHAUSTION4,
    EXHAUSTION5,
    DEAD;

    public List<Status> nextExhaustion(List<Status> status)
    {
        if (status.contains(EXHAUSTION1))
        {
            status.remove(Status.EXHAUSTION1);
            status.add(Status.EXHAUSTION2);
            return status;
        }
        if (status.contains(EXHAUSTION2))
        {
            status.remove(Status.EXHAUSTION2);
            status.add(Status.EXHAUSTION3);
            return status;
        }
        if (status.contains(EXHAUSTION3))
        {
            status.remove(Status.EXHAUSTION3);
            status.add(Status.EXHAUSTION4);
            return status;
        }
        if (status.contains(EXHAUSTION4))
        {
            status.remove(Status.EXHAUSTION4);
            status.add(Status.EXHAUSTION5);
            return status;
        }
        if (status.contains(EXHAUSTION5))
        {
            status = Collections.singletonList(Status.DEAD);
            return status;
        }
        if(status.contains(NORMAL))
        {
            status.remove(NORMAL);
        }
        status.add(Status.EXHAUSTION1);
        return status;
    }
}
