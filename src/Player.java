public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[3];{
            weaponSlots[0] = new RPG();
            weaponSlots[1] = new Machine();
            weaponSlots[2] = new Pistol();
        }
    }
    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
        Weapon rpg = weaponSlots[0];
        rpg.shot();
        Weapon pistol = weaponSlots[2];
        pistol.shot();
        Weapon machine = weaponSlots[1];
        machine.shot();
    }
}
