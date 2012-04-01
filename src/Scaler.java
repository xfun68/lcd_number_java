import java.util.ArrayList;

public class Scaler {

    private int size;

    public Scaler(int size) {
        this.size = size;
    }

    public String[] scale(String[] lines) {
        String[] result = scale_horizontally(lines);
        result = scale_vertically(result);
        return result;
    }

    private String[] scale_horizontally(String[] lines) {
        ArrayList<String> result = new ArrayList<String>();
        for (String line : lines) result.add(scale_line(line));
        return result.toArray(new String[0]);
    }

    private String scale_line(String line) {
        StringBuffer result = new StringBuffer();
        char[] chars = line.toCharArray();
        for (int column = 0; column < chars.length; column++) {
            result.append(duplicate_columns(chars[column]));
        }
        return result.toString();
    }

    private String duplicate_columns(char aChar) {
        StringBuffer result = new StringBuffer();
        for (int times = 0; times < this.size; times++) result.append(aChar);
        return result.toString();
    }

    private String[] scale_vertically(String[] lines) {
        ArrayList<String> result = new ArrayList<String>();
        for (int line_number = 0;  line_number < lines.length; line_number++) {
            for (int times = 0; times < this.size; times++) result.add(lines[line_number]);
        }
        return result.toArray(new String[0]);
    }

}
