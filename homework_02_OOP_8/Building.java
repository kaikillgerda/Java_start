public class Building implements HealthPoints {
    private int healthPoints;
    private int maxHealthPoint;

    public Building(int healthPoints) {
        this.healthPoints = healthPoints;
        this.maxHealthPoint = healthPoints;
    }

    public Building(){
        this(1000);
    }

    @Override
    public int getHealthPoints() {
        return this.healthPoints;
    }

    @Override
    public int getMaxHealthPoints() {
        return this.maxHealthPoint;
    }
    
    public void setHealthPoints(int healthPoints) {
        if (healthPoints > this.maxHealthPoint) {
            this.healthPoints = this.maxHealthPoint;
        } else this.healthPoints = healthPoints;
    }
}