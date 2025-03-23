public class King extends Character {
    public King() {
        weaponBehavior = new Sword();
        moveBehavior = new ChestWalk();
    }
    public void display() {
        System.out.println("Soy un Rey");
    }
}