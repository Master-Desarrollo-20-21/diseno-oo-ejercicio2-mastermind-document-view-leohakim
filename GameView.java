package mastermindModelViewVersion;

public class GameView {


    private static final int ATTEMPTS = 10;
    private static final String TEXT_ATTEMPTS = " attempt(s)";
    private static final String TEXT_WIN = "You've won!!! ;-)";
    private static final String TEXT_LOSE = "You've lose :(";


    public void printNumberOfAttempts( int attemptListSize ){
        IO.getInstance().printText(attemptListSize + TEXT_ATTEMPTS );
    }

    public void printSecretCombination( int colorsListLength ){
        new SecretCombinationView().printSecretCombinationAsterisk( colorsListLength );
    }

    public void printIsWinner(){
        IO.getInstance().printText(TEXT_WIN);

    }

    public void printLose(){
        IO.getInstance().printText(TEXT_LOSE);

    }
}