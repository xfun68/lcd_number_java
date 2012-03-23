public class LCDNumber {

    private final String number;
    private final String[] digits = {
        " - \n| |\n   \n| |\n - \n",
        "   \n  |\n   \n  |\n   \n",
        " - \n  |\n - \n|  \n - \n",
        " - \n  |\n - \n  |\n - \n",
        "   \n| |\n - \n  |\n   \n",
        " - \n|  \n - \n  |\n - \n",
        " - \n|  \n - \n| |\n - \n",
        " - \n  |\n   \n  |\n   \n",
        " - \n| |\n - \n| |\n - \n",
        " - \n| |\n - \n  |\n - \n"
    };

    public LCDNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return digits[Integer.parseInt(number)];
    }
}
