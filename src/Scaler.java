import java.util.ArrayList;

public class Scaler {

    private static final int DEFAULT_SIZE = 1;
    private static final int VERTICAL_SCALE_INTERVAL = 2;
    private static final int HORIZONTAL_SCALE_INTERVAL = 3;

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
        for (String line : lines) result.add(scale(line));
        return result.toArray(new String[0]);
    }

    private String scale(String line) {
        StringBuffer result = new StringBuffer();
        char[] chars = line.toCharArray();
        for (int column = 0; column < chars.length; column++) {
            result.append(duplicate_columns(column, chars[column]));
        }
        return result.toString();
    }

    private String duplicate_columns(int column, char aChar) {
        StringBuffer result = new StringBuffer();
        int scale = get_scale_for(column, HORIZONTAL_SCALE_INTERVAL);
        for (int times = 0; times < scale; times++) result.append(aChar);
        return result.toString();
    }

    private String[] scale_vertically(String[] lines) {
        ArrayList<String> result = new ArrayList<String>();
        for (int line_number = 0;  line_number < lines.length; line_number++) {
            int scale = get_scale_for(line_number, VERTICAL_SCALE_INTERVAL);
            for (int times = 0; times < scale; times++) result.add(lines[line_number]);
        }
        return result.toArray(new String[0]);
    }

    private int get_scale_for(int index, int interval) {
        return ((index % interval) == 1) ? this.size : DEFAULT_SIZE;
    }
}
