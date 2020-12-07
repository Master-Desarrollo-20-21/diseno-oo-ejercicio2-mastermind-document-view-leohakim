package mastermindModelViewVersion;

public class ProposedCombinationView {

    private String proposedInput;
    private static final int MAX_SIZE_PROPOSED_COMBINATION = 4;
    private static final String TEXT_PROPOSE = "Propose a combination: ";
    private static final String TEXT_WRONG_PROPOSE_LENGTH = "Wrong proposed combination length";
    private static final String TEXT_WRONG_PROPOSE_COLORS = "Wrong colors, they must be: rbygop";
    private static final String TEXT_WRONG_PROPOSE_REPEATED_COLORS = "Repeated colors not allowed";

    public String read(){

        do {
            proposedInput = IO.getInstance().readText(TEXT_PROPOSE);
        } while (!isValid());
        return proposedInput;
    }

    private boolean isValidLength() {
        if (proposedInput.length() != MAX_SIZE_PROPOSED_COMBINATION) {
            IO.getInstance().printText(TEXT_WRONG_PROPOSE_LENGTH);
            return false;
        }
        return true;
    }

    public boolean isValid() {
        return isValidLength() && isValidColors() && repeatedColoredChars();
    }

    private boolean isValidColors() {
        if (proposedInput.chars().filter(c -> Color.isValidColor((char) c)).count() != MAX_SIZE_PROPOSED_COMBINATION) {
            IO.getInstance().printText(TEXT_WRONG_PROPOSE_COLORS);
            return false;
        }
        return true;
    }

    private boolean repeatedColoredChars() {
        if (proposedInput.chars().distinct().count() != MAX_SIZE_PROPOSED_COMBINATION) {
            IO.getInstance().printText(TEXT_WRONG_PROPOSE_REPEATED_COLORS);
            return false;
        }
        return true;
    }
}
