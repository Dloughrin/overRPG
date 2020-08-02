package Characters;

import Main.Parameters.*;

public class Job
{
    private String jobName;
    private ClassRarity rarityTag;
    private JobClassification classificationTag;
    private int maxLevel;
    private int AbilityScores[];

    private static int REFERENCE_ID;

    public Job(String name, ClassRarity rarity, JobClassification classif, int abilities[])
    {
        jobName = name;
        rarityTag = rarity;
        classificationTag = classif;
        setMax();


        AbilityScores = new int[Abilities.values().length];

        for(int i = 0; i < Abilities.values().length; i++)
        {
            AbilityScores[i] = abilities[i];
        }

    }

    private void setMax()
    {
        if(rarityTag == ClassRarity.Common)
            maxLevel = 15;
        else if(rarityTag == ClassRarity.Uncommon)
            maxLevel = 10;
        else if(rarityTag == ClassRarity.Rare)
            maxLevel = 5;
        else if(rarityTag == ClassRarity.Unique)
            maxLevel = 5;
        else
            maxLevel = 1;
    }

    public int getMaxLevel() { return maxLevel; }
    public String getJobName() { return jobName; }
    public ClassRarity getJobRarity() { return rarityTag; }
    public JobClassification getJobClassification() { return classificationTag; }
    public int[] getAbilityBonus() { return AbilityScores; }
}
