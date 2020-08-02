package Database;

import Characters.Job;
import Characters.Race;

public class InformationManager
{
    private static Job[] JOB_LIST;
    private static Race[] RACE_LIST;

    public static void loadInformation()
    {
        //TODO: .txt file save/load
        LevelingSystem.loadJobRequirements();
    }
    public static void saveInformation()
    {
        //TODO: .txt file save/load
        LevelingSystem.saveJobRequirements();
    }
}
