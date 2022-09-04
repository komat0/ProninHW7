public class Human implements Actions {

    private String name;
    private int humanRunDistance;
    private int humanJumpDistance;

    public Human(String name, int humanRunDistance, int humanJumpDistance) {
        this.name = name;
        this.humanRunDistance = humanRunDistance;
        this.humanJumpDistance = humanJumpDistance;
    }

    public void info() {
        System.out.println(name + " is Human and can run " + humanRunDistance + " meters and jump on " +
                humanJumpDistance + " meters");
    }

    public int getRunDistance() {
        return humanRunDistance;
    }

    public int getJumpDistance() {
        return humanJumpDistance;
    }

    @Override
    public void run(int runDistance, int treadmillLength) {
        if (treadmillLength <= runDistance) {
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
