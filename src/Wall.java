public class Wall implements Obstacles {

    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public int getWallHeight() {
        return wallHeight;
    }

    @Override
    public void treadmillOn(int runDistance, int treadmillLength) {

    }

    @Override
    public void jumpOnWall(int jumpDistance, int wallHeight) {

    }
}
