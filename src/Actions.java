public interface Actions {

    void run(int runDistance, int treadmillLength);
    void jump(int jumpDistance, int wallHeight);

    int getRunDistance();

    int getJumpDistance();
}
