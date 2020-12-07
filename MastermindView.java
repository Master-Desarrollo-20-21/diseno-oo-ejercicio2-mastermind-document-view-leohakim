package mastermindModelViewVersion;

public class MastermindView {

    private final String TITLE = "-----MASTERMIND-----";
    private final String RESUME_ANSWER = "¿RESUME? (y/n): ";

    public void printTitle() {

        IO.getInstance().printText(TITLE);

    }

    public boolean askResumeGame() {

        YesNoAnswer answer;
        do {
            String answerInput = IO.getInstance().readText(RESUME_ANSWER);
            answer = YesNoAnswer.valueOf(answerInput.charAt(0));
        } while (answer != YesNoAnswer.YES && answer != YesNoAnswer.NO);
        return answer == YesNoAnswer.YES;
    }
}
