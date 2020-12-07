package mastermindModelViewVersion;

public class SecretCombinationView {

    public void printSecretCombinationAsterisk(int colorsLength){

        StringBuilder asterisks = new StringBuilder();
        for (int i = 0; i < colorsLength; i++) {
            asterisks.append("x");
        }
        IO.getInstance().printText(asterisks.toString());
    }
}
