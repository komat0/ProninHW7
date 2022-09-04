public class Treadmill implements Obstacles {

    private int treadmillLength;

    public Treadmill(int treadmillLength) {
        this.treadmillLength = treadmillLength;
    }

    @Override
    public int getTreadmillLength() {
        return treadmillLength;
    }

    @Override
    public int getWallHeight() {
        return 0;
    }
}
