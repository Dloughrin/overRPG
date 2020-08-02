package Main;

import Database.LevelingSystem;
import Main.Parameters.*;

public class Main
{
    public static void main(String[] args)
    {
        //System.out.println(RaceType.Demihuman.toString());

        CharacterSheet characterSheet = new CharacterSheet();
        characterSheet.OutputSheet();

        LevelingSystem.buildLevelCurve();
        characterSheet.MainCharacter.giveExperience(150);
        characterSheet.MainCharacter.giveExperience(150);
        characterSheet.MainCharacter.giveExperience(150);
        characterSheet.MainCharacter.giveExperience(150);
    }
}
