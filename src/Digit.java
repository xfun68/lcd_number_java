public class Digit {
    private final String[][] digits = {
        {" - ", "| |", "   ", "| |", " - "},
        {"   ", "  |", "   ", "  |", "   "},
        {" - ", "  |", " - ", "|  ", " - "},
        {" - ", "  |", " - ", "  |", " - "},
        {"   ", "| |", " - ", "  |", "   "},
        {" - ", "|  ", " - ", "  |", " - "},
        {" - ", "|  ", " - ", "| |", " - "},
        {" - ", "  |", "   ", "  |", "   "},
        {" - ", "| |", " - ", "| |", " - "},
        {" - ", "| |", " - ", "  |", " - "}
    };

    public static final int COUNT_OF_LINES = 5;

    private String[] lines;

    public Digit(String number) {
        this.lines = digits[Integer.parseInt(number)];
    }

    public String line_at(int line_index) {
        return this.lines[line_index];
    }
}
