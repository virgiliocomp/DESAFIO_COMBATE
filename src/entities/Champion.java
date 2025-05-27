package entities;

public class Champion   {

    private final String name;
    private int life;
    private final int attack;
    private final int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }


    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }


    public int getArmor() {
        return armor;
    }


    public void takeDamage(Champion other){
        int otherAttack;
        int damageTaken;
        int currentHealth;

        otherAttack = other.getAttack();
        damageTaken = otherAttack - getArmor();

        if (damageTaken <= 0){
            damageTaken = 1;
        }


        currentHealth = getLife() - damageTaken;

        if (currentHealth < 0){
            setLife(0);
        } else {
            setLife(currentHealth);
        }
    }

    public String status(){
        if (getLife() <= 0){
            return getName() + ": " + getLife() + " de vida (morreu)";
        }
        return getName() + ": " + getLife() + " de vida";
    }

}
