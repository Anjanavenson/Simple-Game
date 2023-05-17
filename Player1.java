public class Player1 {
    private String Name;
    private String Weapon;
    private int Health;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public Player1(String name, String weapon, int health) {
        Name = name;
        Weapon = weapon;
        Health = health;
        if (health < 0 || health > 100){
            Health = 100;
        }else{
            Health = health;
        }
    }
    public void damageByGun1(){
        Health -=30;
        if (Health<=0){
            Health=0;
        }
        System.out.println("Got hit by gun 1. Health is reduced by 30" + ". New health is" + Health);
        if (Health == 0){
            System.out.println(getName() + " is dead");
        }
    }

    public void damageByGun2(){
        Health -=50;
        if (Health<=0){
            Health=0;
        }
        System.out.println("Got hit by gun 2. Health is reduced by 50" + ". New health is" + Health);
        if (Health == 0){
            System.out.println(getName() + " is dead");
        }
    }
    public void heal(){
        if (Health <= 0){
            System.out.println("Player is dead. Heal is not possible");
        }else {
            Health = 100;
            System.out.println("Player is healed " + Health);
        }
    }
}
