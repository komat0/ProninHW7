public interface Obstacles {
    int treadmillLength = 0;
    int wallHeight = 0;

    void treadmillOn(int runDistance, int treadmillLength);
    void jumpOnWall(int jumpDistance, int wallHeight);

}
