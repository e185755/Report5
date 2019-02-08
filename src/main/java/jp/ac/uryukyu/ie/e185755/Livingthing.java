package jp.ac.uryukyu.ie.e185755;

public class Livingthing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public boolean getdead(){
        return this.dead;
    }
    public void setdead(boolean n){
        this.dead = n;
    }
    public int getHitPoint(){
        return this.hitPoint;
    }
    public void setHitPoint(int n){
        this.hitPoint = n;
    }
    public String getname(){
        return this.name;
    }



    public Livingthing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    public void attack(Livingthing opponent) {
        if (dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
