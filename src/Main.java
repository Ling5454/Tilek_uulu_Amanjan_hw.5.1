import kg.geeks.hw5.Boss;
import kg.geeks.hw5.Hero;

public class Main {
    public static void main(String[] args) {  Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        System.out.println("information about the boss");
        System.out.println("health: " + boss.getHealth());
        System.out.println("damage: " + boss.getDamage());
        System.out.println("type of protection: " + boss.getDefenseType());


        Hero[] heroes = createHeroes();

        for (Hero hero:heroes
             ) {
            System.out.println("Hero's health: " + hero.getHealth());
            System.out.println("Hero's damage: "+hero.getDamage());
            System.out.println("Hero's superpower:"+hero.getSuperpower());
        }
    }
    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(275,70,"rasengan");
        Hero hero2 = new Hero(275,70,"rasengan");
        Hero hero3 = new Hero(275,70);

        Hero[] heroes = {hero1,hero2,hero3};
        return heroes;
    }
}
