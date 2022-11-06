package baseball;

public class Application {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        try {
            baseballGame.playGame();
        } catch (IllegalArgumentException e) {
            System.out.println("예외발생 main");
        }
    }
}
