package mastermindModelViewVersion;

public class ProposedCombination extends Combination {

    private String proposedInput;

    public ProposedCombination() {

        super();
    }

    public void read() {
        proposedInput = new ProposedCombinationView().read();
        for (int i = 0; i < this.colors.length; i++) {
            this.colors[i] = Color.valueOf(proposedInput.charAt(i));
        }
    }

    public String getProposedInput(){
        return this.proposedInput;
    }
}
