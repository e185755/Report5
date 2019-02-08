package jp.ac.uryukyu.ie.e185755;

public class Hero extends Livingthing{


    public Hero (String name, int hitPoint, int attack) {
        super(name,hitPoint,attack);
    }
    @Override
    public void wounded(int damage) {
        int hitpoint = getHitPoint();
        String name = getname();

        hitpoint -= damage;
        setHitPoint(hitpoint);
        if (hitpoint < 0) {
            setdead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

}
