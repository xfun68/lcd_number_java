import java.util.ArrayList;

public class LCDNumber {

    private final String numbers;
    private int size;

    public LCDNumber(String numbers) {
        this(numbers, 1);
    }

    public LCDNumber(String numbers, int size) {
        this.numbers = numbers;
        this.size = size;
    }

    public String print() {
        String result = "";
        String[] lines = new Scaler(this.size).scale(lines_for_digits());
        for (String line : lines) result += line + "\n";
        return result;
    }

    private String[] lines_for_digits() {
        ArrayList<String> lines = new ArrayList<String>();
        for (int line_index = 0; line_index < Digit.COUNT_OF_LINES; line_index++) {
            lines.add(join_lines_of_each_digits(line_index));
        }
        return lines.toArray(new String[0]);
    }

    private String join_lines_of_each_digits(int line_index) {
        String line = "";
        for (int i = 0; i < this.numbers.length(); i++) {
            String current_number = this.numbers.substring(i, i + 1);
            line += new Digit(current_number).line_at(line_index);
        }
        return line;
    }
}
