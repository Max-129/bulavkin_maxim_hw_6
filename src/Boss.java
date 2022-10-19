public class Boss extends GameEntity {
    Weapon bossWeapon = new Weapon();

    public void setbossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public Weapon getbossWeapon(WeaponType weaponOfDarkness) {
        return bossWeapon;
    }

    public String printInfo() {
        return "Boss hp: " + getHealthPointBoss() + " Boss damage: " + getDamageBoss() +
                " Boss defense: " + getDefenseBoss() + " Boss weapons: " + WeaponType.WEAPON_DARKNESS;
    }
}
