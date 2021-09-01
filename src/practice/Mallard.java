package practice;

public class Mallard extends Duck{
    private int flyspeed;


    public Mallard(String name, int age, int flyspeed) {
        super(name, age);
        this.flyspeed = flyspeed;
    }

    public int getFlyspeed() {
        return flyspeed;
    }

    public void setFlyspeed(int flyspeed) {
        this.flyspeed = flyspeed;
    }
}
