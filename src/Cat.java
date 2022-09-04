public class Cat extends Persons implements Actions {

    private String name;
    private int catRunDistance;
    private int catJumpDistance;

    public Cat(String name, int runDistance, int jumpDistance) {
        this.name = name;
        this.catRunDistance = runDistance;
        this.catJumpDistance = jumpDistance;
    }

    public void info() {
        System.out.println(name + " is Cat and can run " + catRunDistance + " meters and jump on " +
                catJumpDistance + " meters");
    }

    public String getName() {
        return name;
    }

    public int getCatRunDistance() {
        return catRunDistance;
    }

    public int getCatJumpDistance() {
        return catJumpDistance;
    }

    @Override
    public void run(int runDistance, int treadmillLength) {
        if (runDistance <= treadmillLength) {
            System.out.println(name + " ran " + treadmillLength + " meters");
        } else {
            System.out.println(name + " can't ran " + treadmillLength + " meters");
        }
    }
    @Override
    public void jump(int jumpDistance, int wallHeight) {
        if (wallHeight <= jumpDistance) {
            System.out.println(name + " overcame an obstacle " + jumpDistance + " meters");
        } else {
            System.out.println(name + " can't overcame an obstacle");
        }
    }
}
