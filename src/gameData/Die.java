package gameData;

public enum Die {
    D4, D6, D8, D10, D12, D20;

    public int roll(Die die, int num)
    {
        int result = 0;
        switch (die)
        {
            case D4:
            {
                for(int i=0; i<num; i++)
                {
                    result += Math.random()*4;
                }
            }
            case D6:
            {
                for(int i=0; i<num; i++)
                {
                    result += Math.random()*6;
                }
            }
            case D8:
            {
                for(int i=0; i<num; i++)
                {
                    result += Math.random()*8;
                }
            }
            case D10:
            {
                for(int i=0; i<num; i++)
                {
                    result += Math.random()*10;
                }
            }
            case D12:
            {
                for(int i=0; i<num; i++)
                {
                    result += Math.random()*12;
                }
            }
            case D20:
            {
                for(int i=0; i<num; i++)
                {
                    result += Math.random()*20;
                }
            }
            default:
                return result;
        }
    }
}
