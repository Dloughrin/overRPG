package Database;

public class LevelingSystem
{
    private static int[] EXPERIENCE_REQUIREMENTS;
    private static RequirementsList JobRequirements;

    public static void loadJobRequirements() {} //TODO: .txt file save/load
    public static void saveJobRequirements() {} //TODO: .txt file save/load

    public static void buildLevelCurve()
    {
        double exponent = 1.3;
        double baseEXP = 300;

        EXPERIENCE_REQUIREMENTS = new int[100];

        //int total = 0;
        for(int i = 0; i < 100; i++)
        {
            EXPERIENCE_REQUIREMENTS[i] = (int)Math.floor(baseEXP * (Math.pow((double)i, exponent)));
            /*total += EXPERIENCE_REQUIREMENTS[i];
            System.out.println("Level " + (i+1) + ": " + EXPERIENCE_REQUIREMENTS[i] + " exp; total exp: " + total);*/
        }
    }

    public static boolean levelUpCheck(int exp, int level)
    {
        if(level >= 100) return false;

        if(exp >= EXPERIENCE_REQUIREMENTS[level])
        {
            return true;
        }
        else
            return false;
    }
}
