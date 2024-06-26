public abstract class GameTemplate {
    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
