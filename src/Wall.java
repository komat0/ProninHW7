public class Wall implements Obstacles {

    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public int getTreadmillLength() {
        return 0;
    }

    @Override
    public int getWallHeight() {
        return wallHeight;
    }
}
