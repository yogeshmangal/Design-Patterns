public class Test {
    public static void main(String[] args) {
        GameTemplate cricket = new CricketGame();
        cricket.play();

        GameTemplate football = new FootballGame();
        football.play();
    }
}
