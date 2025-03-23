public abstract class Character {
    WeaponBehavior weaponBehavior;
    MoveBehavior moveBehavior;

    public abstract void display();

    public void performMove() {
        moveBehavior.move();
    }
    public void performAttack() {
        weaponBehavior.attack();
    }
    
    
    public void setWeapon(WeaponBehavior weapon) {
        this.weaponBehavior = weapon;
    }
    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }
    

    public void showCharacter(){
        display();
        performMove();
        performAttack();
        
    }
}
