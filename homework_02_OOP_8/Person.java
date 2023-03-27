public class Person implements HealthPoints, TirednessPoints {
    private int healthPoints;
    private int maxHealthPoints;
    private int tirednessPoints;
    private int maxTirednessPoints;

    public Person(int healthPoints, int tirednessLevel) {
        this.healthPoints = healthPoints;
        this.maxHealthPoints = healthPoints;
        this.tirednessPoints = tirednessLevel;
        this.maxTirednessPoints = tirednessLevel;
    }

    public Person(){
        this(100, 200);
    }

    @Override
    public int getHealthPoints() {
        return this.healthPoints;
    }

    @Override
    public int getMaxHealthPoints() {
        return this.maxHealthPoints;
    }

    @Override
    public int getTirednessPoints() {
        return this.tirednessPoints;
    }

    @Override
    public int getMaxTirednessPoints() {
        return this.maxTirednessPoints;
    }

    public void setHealthPoints(int healthPoints) {
        if (healthPoints > this.maxHealthPoints) {
            this.healthPoints = this.maxHealthPoints;
        } else this.healthPoints = healthPoints;
    }

    public void setTirednessPoints(int tirednessPoints) {
        if (tirednessPoints > this.maxTirednessPoints) {
            this.tirednessPoints = this.maxTirednessPoints;
        } else this.tirednessPoints = tirednessPoints;
    }

}