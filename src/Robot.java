public class Robot extends Persons implements Actions {

    private String name;
    private int robotRunDistance;
    private int robotJumpDistance;

    public Robot(String name, int robotRunDistance, int robotJumpDistande) {
        this.name = name;
        this.robotRunDistance = robotRunDistance;
        this.robotJumpDistance = robotJumpDistande;
    }

    public void info() {
        System.out.println(name + " is Robot and can run " + robotRunDistance + " meters and jump on " +
                robotJumpDistance + " meters");
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
