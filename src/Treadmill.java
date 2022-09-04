public class Treadmill implements Obstacles {

    private int treadmillLength;

    public Treadmill(int treadmillLength) {
        this.treadmillLength = treadmillLength;
    }

    public int getTreadmillLength() {
        return treadmillLength;
    }

    @Override
    public void treadmillOn(int runDistance, int treadmillLength) {
    }

    @Override
    public void jumpOnWall(int jumpDistance, int wallHeight) {
    }
}
