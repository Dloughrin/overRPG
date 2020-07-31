package Main;

import Main.Parameters.*;
import Characters.*;

// "Temporary" class to make outputting things easier in a text based format
public class CharacterSheet
{
    public StatBlock MainCharacter;

    public CharacterSheet()
    {
        int skeleton[] = {1,1,1,0,0,1,1,2,1};
        int human[] = {1,1,1,1,1,1,1,0,0};
        int fighter[] = {1,0,1,1,1,0,0,0,0};
        int wizard[] = {1,1,0,0,0,1,1,0,0};

        Job Fighter = new Job("Wizard", ClassRarity.Common, JobClassification.Arcane, wizard);
        Race Human = new Race("Human", RaceType.Humanoid,human);
        Race Skeleton = new Race("Skeleton", RaceType.Heteromorphic, skeleton);

        MainCharacter = new StatBlock("Momonga", Skeleton, Fighter);
    }

    public void OutputSheet()
    {
        System.out.println("Name: " + MainCharacter.getCharName());
        System.out.println("Race: " + MainCharacter.getRaceName() + " [" + MainCharacter.getRaceType() + "]\n");

        System.out.println("Job Levels: ");
        for(int i = 1; i <= MainCharacter.getTotalLevel(); i++)
        {
            System.out.println("  Level " + i + ": " + MainCharacter.getJobAtLevel(i));
        }

        System.out.println("\nABILITIES ");
        for(int i = 0; i < Abilities.values().length; i++)
        {
            System.out.println(Abilities.values()[i].toString() + "  -  " + MainCharacter.getAbilityScore(i) + " / " + MainCharacter.getMaxAbilityScore(i));
        }
    }
}
