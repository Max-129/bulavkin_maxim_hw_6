public class Main {
    public static void main(String[] args) {
        Boss myBoss = new Boss();


        myBoss.setHealthPointBoss(600);
        myBoss.setDamageBoss(100);
        myBoss.setDefenseBoss("Defense Strong ");
        myBoss.getbossWeapon(WeaponType.WEAPON_DARKNESS);
        System.out.println("Boss HP: " + myBoss.getHealthPointBoss() + " Boss Damage: " +
                myBoss.getDamageBoss() + " Boss Defense: " + myBoss.getDefenseBoss() + " Boss Weapon: " +
                WeaponType.WEAPON_DARKNESS);
        System.out.println(myBoss.printInfo());

        Skeleton Sans = new Skeleton(120);  //First Skeleton
        Sans.printInfo();
        Sans.setHealthPointBoss(500);
        Sans.setDamageBoss(40);
        Sans.setDefenseBoss("Защита от Магических атак ");
        System.out.println(Sans.printInfo());

        Skeleton Papyrus = new Skeleton(80);
        Papyrus.setHealthPointBoss(250);
        Papyrus.setDamageBoss(80);
        Papyrus.setDefenseBoss("Защита от Физических атак ");
        System.out.println(Papyrus.printInfo2());
    }
}