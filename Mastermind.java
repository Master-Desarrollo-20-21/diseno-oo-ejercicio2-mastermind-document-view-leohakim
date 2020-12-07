package mastermindModelViewVersion;

public class Mastermind {

    private Game game;

    public void play() {
        MastermindView mastermindView = new MastermindView();
        mastermindView.printTitle();
        do {
            this.game = new Game();
            this.game.play();
        } while (mastermindView.askResumeGame());
    }


    public static void main(String[] args) {
        new Mastermind().play();
    }
}
