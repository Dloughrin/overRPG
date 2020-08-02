package Database;

public class RequirementsList
{
    private int JobID;
    private RequirementObject requirements[];
    private int currentReqs;

    public RequirementsList(int id)
    {
        JobID = id;
        requirements = new RequirementObject[10];
        currentReqs = 0;
    }

    public void addRequirement(int reqID, int levels)
    {
        if(currentReqs < 10)
        {
            requirements[currentReqs].ReqJobID = reqID;
            requirements[currentReqs].LevelNum = levels;
            currentReqs++;
        }
        else
        {
            System.out.println("Too many class requirements.");
        }
    }

    public int getJobID() { return JobID; }
    public int getCurrentReqs() { return currentReqs; }
    public RequirementObject[] getRequirements() { return requirements; }
}
