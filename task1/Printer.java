package task;

/**
 * Created by Administrator on 4/21/2016.
 */
public class Printer {

    String result;
    public Printer() {
        result = "Report: " + "\n";
    }

    public String getResult() {
        return result;
    }

    public void addResult(String comment) {
        result += comment;
    }


}
