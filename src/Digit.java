import java.util.ArrayList;

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

    private int size;
    private ArrayList<String> extended_lines = new ArrayList<String>();

    public Digit(String number) {
        this(number, 1);
    }

    public Digit(String number, int size) {
        this.size = size;
        init_strokes(number);
    }

    private void init_strokes(String number) {
        String[] lines = digits[Integer.parseInt(number)];
        for (int line_number = 0; line_number < lines.length; line_number++) {
            extended_lines.add(lines[line_number]);
            if (is_vertical_line(line_number)) {
                for (int i = 1; i < this.size; i++) {
                    extended_lines.add(lines[line_number]);
                }
            }
        }
    }

    private boolean is_vertical_line(int line_number) {
        return line_number % 2 != 0;
    }

    public int count_of_lines() {
        return 3 + (2 * this.size);
    }

    public String line_at(int line_index) {
        return extend_line_horizontally(extended_lines.get(line_index));
    }

    private String extend_line_horizontally(String line) {
        String middle = "";
        for (int i = 0; i < this.size; i++) {
            middle += line.substring(1, 2);
        }
        return line.substring(0, 1) + middle + line.substring(2);
    }
}
