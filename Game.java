package mastermindModelViewVersion;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Attempt> attemptList;
    private SecretCombination secretCombination;
    private static final int ATTEMPTS = 10;

    public Game() {
        attemptList = new ArrayList<Attempt>();
        secretCombination = new SecretCombination();
    }

    public void play() {
        Attempt attempt;
        GameView gameView = new GameView();
        do {
            gameView.printNumberOfAttempts( attemptList.size() );
            gameView.printSecretCombination( secretCombination.getColorsLength() );
            attempt = new Attempt();
            attempt.read( secretCombination );
            attemptList.add( attempt );
            this.showAllResults();
        } while ( !isFinished() );
        if ( attempt.isWinner() ) {
            gameView.printIsWinner();
        } else {
            gameView.printLose();
        }
    }

    private void showAllResults() {
        attemptList.forEach( Attempt::print );

    }

    private boolean isFinished() {
        return attemptList.size() == ATTEMPTS || attemptList.get(attemptList.size() - 1).isWinner();
    }
}