public class YoutubeVideo implements Video {
    private VideoProcessor processor;

    public YoutubeVideo(VideoProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void play(String video) {
        this.processor.process(video);
    }
}
