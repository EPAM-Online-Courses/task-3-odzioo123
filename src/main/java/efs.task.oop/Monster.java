package efs.task.oop;

public class Monster implements Fighter
{
    private int health;
    private int damage;

    public Monster(int health, int damage)
    {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth()
    {
        return health;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }
    public int getDamage()
    {
        return damage;
    }

    @Override
    public void attack(Fighter victim)
    {
        victim.takeHit(this.damage);
    }

    @Override
    public void takeHit(int damage)
    {
        this.setHealth(this.getHealth() - damage);
    }
}
