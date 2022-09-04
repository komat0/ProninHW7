public class Human extends Persons implements Actions {

    private String name;
    private int humanRunDistance;
    private int humanJumpDistance;

    public Human(String name, int humanRunDistance, int humanJumpDistande) {
        this.name = name;
        this.humanRunDistance = humanRunDistance;
        this.humanJumpDistance = humanJumpDistande;
    }

    public void info() {
        System.out.println(name + " is Human and can run " + humanRunDistance + " meters and jump on " +
                humanJumpDistance + " meters");
    }

    public String getName() {
        return name;
    }

    public int getHumanRunDistance() {
        return humanRunDistance;
    }

    public int getHumanJumpDistance() {
        return humanJumpDistance;
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
