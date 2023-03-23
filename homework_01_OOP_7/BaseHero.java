package homework_01_OOP_7;

import java.util.Random;

public abstract class BaseHero {
    private static int num;
    private int id;
    protected String name;
    protected double hp;
    protected double maxHp;
    protected double mp;
    protected double def;
    protected int dodge;
    protected double dmg;
    Random rand = new Random();
    

    BaseHero(String name, double hp, double mp, double def, int dodge, double dmg){
        this.id = ++num;
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mp = mp;
        this.def = def;
        this.dodge = dodge;
        this.dmg = dmg;
    }

    @Override
    public String toString() {
        return String.format("%s-%d, hp: %.0f, mp: %.0f", this.name, this.id, this.hp, this.mp);
    }

    protected void damage(double dmg){
        this.hp -= dmg; 
    }

    protected void healing(double hlg){
        if (isAlive()) {
            if (this.hp + hlg >= this.maxHp) this.hp = this.maxHp;
            else this.hp += hlg;
        }
    }

    protected boolean cast(double mana){
        if (this.mp >= mana) {
            this.mp -= mana;
            return true;
        }
        return false;
    }

    protected int getId() {
        return this.id;
    }

    protected boolean isAlive(){
        if (this.hp <= 0) return false;
        return true;
    }
   
    public void toAttack(BaseHero target){
        if (this.getId() != target.getId() && target.isAlive()){
            if (target.dodge <= rand.nextInt(100)) {
                target.damage(rand.nextInt((int)this.dmg - 3, (int)this.dmg + 4) * (1 - target.def));
            } else System.out.println("Мимо!!");
        }
    }

    public static boolean isPartyAlive(BaseHero[] heroes) {
        for (BaseHero hero : heroes) {
            if (hero.isAlive()) return true;
        }
        return false;
    }

    public static boolean isAllPartyAlive(BaseHero[] heroes) {
        for (BaseHero hero : heroes) {
            if (!hero.isAlive()) return false;
        }
        return true;
    }

    public static int getMinHpIndex(BaseHero[] heroes) {
        int min = 0;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].isAlive() && heroes[i].hp < heroes[min].hp) min = i;
        }
        return min;
    }

    public static int getMaxMpIndex(BaseHero[] heroes) {
        int max = 0;
        for (int i = 1; i < heroes.length; i++) {
            if (heroes[i].isAlive() && heroes[i].mp > heroes[max].mp) max = i;
        }
        return max;
    }

    public static boolean isGetDmg(BaseHero hero) {
        if (hero.hp < hero.maxHp) return true;
        return false;
    }

    public abstract void fight(BaseHero[] enemies, BaseHero[] friends);
}