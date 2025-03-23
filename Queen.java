public class Queen extends Character {
    public Queen() {
        weaponBehavior = new Knife();
        moveBehavior = new ChestWalk();
    }
    public void display() {
        System.out.println("Soy una Reina");
    }
}