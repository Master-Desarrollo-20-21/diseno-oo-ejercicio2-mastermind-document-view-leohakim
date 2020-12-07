package mastermindModelViewVersion;

public enum YesNoAnswer {
    YES('y'),
    NO('n');
    private char value;

    YesNoAnswer(char value) {
        this.value = value;
    }

    public static YesNoAnswer valueOf(char character) {
        for (YesNoAnswer value : values()) {
            if (value.value == character) {
                return value;
            }
        }
        return null;
    }
}
