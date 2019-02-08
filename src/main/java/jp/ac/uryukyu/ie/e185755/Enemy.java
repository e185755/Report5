package jp.ac.uryukyu.ie.e185755;

public class Enemy extends Livingthing{

    public Enemy (String name, int hitPoint, int attack) {
        super(name,hitPoint,attack);
    }

    public void wounded(int damage) {
        int hitpoint = getHitPoint();
        String name = getname();

        hitpoint -= damage;
        setHitPoint(hitpoint);
        if (hitpoint < 0) {
            setdead(true);
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
}