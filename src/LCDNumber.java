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
        for (String line : lines_for_digits()) {
            result += line + "\n";
        }
        return result;
    }

    private ArrayList<String> lines_for_digits() {
        ArrayList<String> lines = new ArrayList<String>();
        for (int i = 0; i < new Digit("0", this.size).count_of_lines(); i++) {
            lines.add(join_line_for_each_number(i));
        }
        return lines;
    }

    private String join_line_for_each_number(int i) {
        String line = "";
        for (int j = 0; j < this.numbers.length(); j++) {
            line += new Digit(this.numbers.substring(j, j+1), this.size).line_at(i);
        }
        return line;
    }
}
