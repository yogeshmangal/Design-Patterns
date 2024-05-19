public class NetflixVideo implements Video {
    private VideoProcessor processor;

    public NetflixVideo(VideoProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void play(String video) {
        this.processor.process(video);
    }
}
