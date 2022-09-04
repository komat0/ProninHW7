public interface Actions {

    default void run(int runDistance, int treadmillLength) {

    }
    void jump(int jumpDistance, int wallHeight);
}
