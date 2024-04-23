import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Weapon weapon = new Weapon();
        Weapon rpg = new RPG();
        Weapon pistol = new Pistol();
        Weapon machine = new Machine();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount());
        int slot = scanner.nextInt();
        if( slot == 1){
            machine.shot();
        }
        if (slot == 0){
            rpg.shot();
        }
        if (slot == 2){
            pistol.shot();
        }
        if (slot == -1){
            System.out.println("End Game");;
        }
        System.out.println("Game over!");
    }
}