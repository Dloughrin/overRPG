package Characters;

import Main.Parameters.*;

public class StatBlock
{
    private int[] AbilityScores;
    private int[] AbilityScoreMax;

    private String charName;
    private Race charRace;
    private int level;
    private int experience;
    private String[] jobLevels;
    private Job[] jobList;

    public StatBlock(String name, Race race, Job job)
    {
        charName = name;
        charRace = race;
        experience = 0;
        level = 1;

        jobList = new Job[20];
        jobList[0] = job;
        jobLevels = new String[100];
        jobLevels[0] = job.getJobName();
        for(int i = 1; i < 20; i++) { jobList[i] = null; }
        for(int i = 1; i < 100; i++) { jobLevels[i] = "-"; }

        int abilityL = Abilities.values().length;
        AbilityScores = new int[abilityL];
        AbilityScoreMax = new int[abilityL];

        int[] raceBonus = race.getAbilityBonus();
        int[] classBonus = job.getAbilityBonus();

        for(int i = 0; i < abilityL; i++)
        {
            AbilityScores[i] = 0;
            AbilityScores[i] = AbilityScores[i] + raceBonus[i] + classBonus[i];
            AbilityScoreMax[i] = 100;
        }
        AbilitySanityCheck();
    }

    private void AbilitySanityCheck()
    {
        for(int i = 0; i < AbilityScores.length; i++)
        {
            if(AbilityScores[i] > AbilityScoreMax[i])
                AbilityScores[i] = AbilityScoreMax[i];
        }
    }
}
