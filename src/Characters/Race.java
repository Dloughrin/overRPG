package Characters;

import Main.Parameters.*;

public class Race
{
    private String raceName;
    private RaceType raceTag;
    private int AbilityScores[];

    public Race(String name, RaceType tag, int abilities[])
    {
        raceName = name;
        raceTag = tag;

        AbilityScores = new int[Abilities.values().length];

        for(int i = 0; i < Abilities.values().length; i++)
        {
            AbilityScores[i] = abilities[i];
        }
    }

    public RaceType getRaceTag() { return raceTag; }
    public String getRaceName() { return raceName; }
    public int[] getAbilityBonus() { return AbilityScores; }
}
