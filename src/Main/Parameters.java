package Main;

public class Parameters
{
    public static int MAXLEVEL = 100;

    // Basically equivalent of Ability Scores from D&D -- Resist and Special's specific use are TBD.
    public enum Abilities
    {
        HP,
        MP,
        PhysAtk,
        PhysDef,
        Agility,
        MagAtk,
        MagDef,
        Resist,
        Special
    }

    // Mostly will determine the level cap of a class, but may also be used to determine whether or not the class requirements are shown (specifically for Unique)
    public enum ClassRarity
    {
        Common,             // 15 level cap, typically little to no requirements
        Uncommon,           /* 10 level cap, typically mid level requirements (40-50 levels) or a
                             specific other requirement [most racial classes are in this category after their base] */
        Rare,               /* 5 level cap, typically only able to be acquired after high level with specific
                               classes or races*/
        Unique              // 5 level cap, hidden classes with complicated requirements
    }

    // The types of race a character has - mostly a tag for spell/skill affects, as well as class availability
    public enum RaceType
    {
        Humanoid,           // No racial classes, small base benefits from race
        Demihuman,          // Up to 30 racial levels, medium racial benefits (these races will typically have little to no magic scaling in their racial classes)
        Heteromorphic       // Racial levels available up to high level, high benefits from race
    }

    public enum JobClassification
    {
        Racial,                 // Not sure if needed yet -- can just ignore racial classes for this
        NonCombat,
        Martial,                // Includes all combat jobs that don't have spell casting. Might split later into more categories
        Arcane,
        Divine,
        Occult,
        Primal
    }
}
