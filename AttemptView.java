package mastermindModelViewVersion;

public class AttemptView {

    public AttemptView(String proposedInput, int piecesBlack, int piecesWhite){

        IO.getInstance().printText( proposedInput + " --> " + piecesBlack + " blacks and " + piecesWhite + " whites");
    }
}
