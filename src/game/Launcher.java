package game;

public class Launcher {
    public static void main(String[] args) {
        Game game = new Game("Tetris");
        game.start();

        Game game2 = new Game("Tetris2");
        game2.start();
    }
}
