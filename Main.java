public class Main {
    public static void main(String[] args) {
        Player1 p1 = new Player1("Anju", "sword", 100);
//        System.out.println(p1.getName());
//        System.out.println(p1.getWeapon());
//        System.out.println(p1.getHealth());

//        p1.damageByGun1();
//        p1.damageByGun2();
//        p1.heal();



        Player2 p2 = new Player2("Swass", "machine gun", 100, true);
        p2.damageByGun1();
        p2.damageByGun2();
        p2.heal();
    }
}
