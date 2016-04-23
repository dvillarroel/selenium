package task1;

/**
 * Created by Administrator on 4/21/2016.
 */
public class Printer {

    String result;

    public Printer() {
        result = "Report: " + "\n";
    }

    public void addResult(String comment) {
        result += comment;
    }

    public String getResult() {
        return result;
    }

}
