public class Player2 extends Player1{

    private int Health;
    private boolean Armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        Health = health;
        Armour = armour;
    }

    @Override
    public int getHealth() {
        return Health;
    }

    @Override
    public void setHealth(int health) {
        Health = health;
    }

    public boolean isArmour() {
        return Armour;
    }

    public void setArmour(boolean armour) {
        Armour = armour;
    }

    @Override
    public void damageByGun1() {
        if (Armour) {
            Health -= 20;
            if (Health <= 0) {
                Health = 0;
            }
            System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 20" + ". New health is " + Health);
        }
        if (!Armour){
            Health -= 40;
            if (Health <= 0) {
                Health = 0;
            }
            System.out.println("Armour is off. Got hit by gun 1. Health is reduced by 40" + ". New health is" + Health);
        }
        if (Health == 0) {
            System.out.println(getName() + " is dead");
        }
    }

    @Override
    public void damageByGun2() {
        if (Armour) {
            Health -= 40;
            if (Health <= 0) {
                Health = 0;
            }
            System.out.println("Armour is on. Got hit by gun 2. Health is reduced by 40" + ". New health is" + Health);
        }
        if (!Armour){
            Health -= 50;
            if (Health <= 0) {
                Health = 0;
            }
            System.out.println("Armour is off. Got hit by gun 2. Health is reduced by 50" + ". New health is " + Health);
        }
        if (Health == 0) {
            System.out.println(getName() + " is dead");
        }
    }

    @Override
    public void heal() {
        super.heal();
    }
}
