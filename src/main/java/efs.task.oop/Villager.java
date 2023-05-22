package efs.task.oop;

public class Villager implements Fighter
{
    private String name;
    private int age;
    private int health = 100;
    public Villager(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public void sayHello()
    {
        System.out.println("Greetings traveler... I'm " + this.name + " and I'm " + this.age + " years old");
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void attack(Fighter victim)
    {
        victim.takeHit((int)((100 - age * 0.5) / 10));
    }

    @Override
    public void takeHit(int damage)
    {
        this.setHealth(this.getHealth() - damage);
    }
}
