package efs.task.oop;

public class Monsters
{
    public static final Monster andariel = new Monster(10, 70)
    {
        public void takeHit(int damage)
        {
            andariel.setHealth(andariel.getHealth() - damage);
            monstersHealth = monstersHealth - damage;
        }
    };

    public static final Monster blacksmith = new Monster(100, 25)
    {
        public void takeHit(int damage)
        {
            blacksmith.setHealth(blacksmith.getHealth() - 5 - damage);
            monstersHealth = monstersHealth - 5 - damage;
        }
    };

    public static int monstersHealth = blacksmith.getHealth() + andariel.getHealth();

}
