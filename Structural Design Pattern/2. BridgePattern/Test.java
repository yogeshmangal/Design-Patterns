public class Test {
    public static void main(String[] args) {
        Video youtubeVideo = new YoutubeVideo(new HDRVideoProcessor());
        youtubeVideo.play("test.mp4");

        Video netflixVideo = new NetflixVideo(new UHD4KVideoProcessor());
        netflixVideo.play("file.mp4");
    }
}
