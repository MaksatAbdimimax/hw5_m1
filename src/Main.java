public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(120);
        boss.setTypeOfDefence("Magic");

        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getTypeOfDefence());

        createHeroes();

        for (Hero hero : createHeroes()) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: " + hero.getDamage() + ", Super Ability: " + hero.getSuperPower());
        }
    }
    public static Hero[]     createHeroes (){

        Hero voin = new Hero(200,80,"Physical");
        Hero mag = new Hero(150, 100);
        Hero kinetik = new Hero(180, 70);
        Hero[] heroes= {voin,mag,kinetik};
        return heroes;
    }

}