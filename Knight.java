public class Knight extends Character {
    public Knight() {
        weaponBehavior = new Sword();
        moveBehavior = new Run();
    }
    public void display() {
        System.out.println("Soy un Caballero");
    }
}