package efs.task.oop;

public class Main
{
    public static void main(String[] args)
    {
        Villager[] tab = new Villager[6];
        tab[0] = new Villager("Kashya", 30 );
        tab[1] = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        tab[2] = new Villager("Gheed", 50 );
        tab[3] = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        tab[4] = new Villager("Warriv", 35 );
        tab[5] = new Villager("Flawia", 25 );

        for(int i = 0; i < 6; i++)
        {
            tab[i].sayHello();
        }

        Object objectDeckardCain = tab[3];
        Object objectAkara = tab[1];

//        ((ExtraordinaryVillager) objectDeckardCain).sayHello();
//        ((ExtraordinaryVillager) objectAkara).sayHello();

//        System.out.println("START Potwory posiadają " + Monsters.monstersHealth + " punkty zycia");

        int i = 0;
        while(Monsters.monstersHealth > 0)
        {
            if(i > 5)
                i = 0;
            while(tab[i].getHealth() <= 0)
                i++;
            System.out.println("Aktualnie walczacy osadnik to " + tab[i].getName());
            if(Monsters.andariel.getHealth() > 0)
            {
//                System.out.println("andariel ma " + Monsters.andariel.getHealth() + " hp i przyjmuje obrażenia ");
                tab[i].attack(Monsters.andariel);
            }
            else
            {
//                System.out.println("blacksmith ma " + Monsters.blacksmith.getHealth() + " hp i przyjmuje obrażenia ");
                tab[i].attack(Monsters.blacksmith);
                if(Monsters.monstersHealth <= 0)
                {
                    break;
                }
            }

            if(Monsters.andariel.getHealth() > 0)
            {
//                System.out.println("andariel ma " + Monsters.andariel.getHealth() + " hp i atakuje ");

                Monsters.andariel.attack(tab[i]);
            }
            else
            {
//                System.out.println("blacksmith ma " + Monsters.blacksmith.getHealth() + " hp i atakuje ");
                Monsters.blacksmith.attack(tab[i]);
            }

            System.out.println("Potwory posiadaja jeszcze" + " " + Monsters.monstersHealth + " punkty zycia");
        }
        System.out.println("Obozowisko ocalone!");

        tab[3] = (ExtraordinaryVillager) objectDeckardCain;
        tab[1] = (ExtraordinaryVillager) objectAkara;


    }
}
